package mage.abilities.effects;

import mage.MageIdentifier;
import mage.abilities.Ability;
import mage.abilities.ActivatedAbility;
import mage.cards.Card;
import mage.cards.ModalDoubleFacedCard;
import mage.cards.SplitCard;
import mage.cards.CardWithSpellOption;
import mage.constants.*;
import mage.game.Game;
import mage.players.Player;

import java.util.UUID;

/**
 * @author BetaSteward_at_googlemail.com
 */
public abstract class AsThoughEffectImpl extends ContinuousEffectImpl implements AsThoughEffect {

    protected AsThoughEffectType type;

    public AsThoughEffectImpl(AsThoughEffectType type, Duration duration, Outcome outcome) {
        super(duration, outcome);
        this.type = type;
        this.effectType = EffectType.ASTHOUGH;
    }

    protected AsThoughEffectImpl(final AsThoughEffectImpl effect) {
        super(effect);
        this.type = effect.type;
    }

    @Override
    public boolean applies(UUID objectId, Ability affectedAbility, Ability source, Game game, UUID playerId) {
        // affectedControllerId = player to check (example: you can activate ability from opponent's card)
        // by default it applies to full object
        // if your AsThough effect type needs affected ability then override that method
        return applies(objectId, source, playerId, game);
    }

    @Override
    public AsThoughEffectType getAsThoughEffectType() {
        return type;
    }

    /**
     * Helper to check that affectedAbility is compatible for alternative cast
     * modifications by setCastSourceIdWithAlternateMana
     *
     * @param cardToCheck
     * @param affectedAbilityToCheck
     * @param playerToCheck
     * @param source
     * @return
     */
    public boolean isAbilityAppliedForAlternateCast(Card cardToCheck, Ability affectedAbilityToCheck, UUID playerToCheck, Ability source) {
        return cardToCheck != null
                && playerToCheck.equals(source.getControllerId())
                && cardToCheck.isOwnedBy(source.getControllerId())
                && affectedAbilityToCheck instanceof ActivatedAbility
                && (affectedAbilityToCheck.getAbilityType() == AbilityType.SPELL
                || affectedAbilityToCheck.getAbilityType() == AbilityType.PLAY_LAND);
    }

    /**
     * Internal method to do the necessary to allow the card from objectId to be
     * cast or played (if it's a land) without paying any mana. Additional costs
     * (like sacrificing or discarding) have still to be payed. Checks if the
     * card is of the correct type or in the correct zone have to be done
     * before.
     *
     * @param objectId             sourceId of the card to play
     * @param source               source ability that allows this effect
     * @param affectedControllerId player allowed to play the card
     * @param game
     * @return
     */
    protected boolean allowCardToPlayWithoutMana(UUID objectId, Ability source, UUID affectedControllerId, Game game) {
        return allowCardToPlayWithoutMana(objectId, source, affectedControllerId, MageIdentifier.Default, game);
    }

    protected boolean allowCardToPlayWithoutMana(UUID objectId, Ability source, UUID affectedControllerId, MageIdentifier identifier, Game game){
        Player player = game.getPlayer(affectedControllerId);
        Card card = game.getCard(objectId);
        if (card == null || player == null) {
            return false;
        }
        if (!card.isLand(game)) {
            if (card instanceof SplitCard) {
                Card leftCard = ((SplitCard) card).getLeftHalfCard();
                player.setCastSourceIdWithAlternateMana(leftCard.getId(), null, leftCard.getSpellAbility().getCosts(), identifier);
                Card rightCard = ((SplitCard) card).getRightHalfCard();
                player.setCastSourceIdWithAlternateMana(rightCard.getId(), null, rightCard.getSpellAbility().getCosts(), identifier);
            } else if (card instanceof ModalDoubleFacedCard) {
                Card leftCard = ((ModalDoubleFacedCard) card).getLeftHalfCard();
                Card rightCard = ((ModalDoubleFacedCard) card).getRightHalfCard();
                // some MDFC's are land.  IE: sea gate restoration
                if (!leftCard.isLand(game)) {
                    player.setCastSourceIdWithAlternateMana(leftCard.getId(), null, leftCard.getSpellAbility().getCosts(), identifier);
                }
                if (!rightCard.isLand(game)) {
                    player.setCastSourceIdWithAlternateMana(rightCard.getId(), null, rightCard.getSpellAbility().getCosts(), identifier);
                }
            } else if (card instanceof CardWithSpellOption) {
                Card creatureCard = card.getMainCard();
                Card spellCard = ((CardWithSpellOption) card).getSpellCard();
                player.setCastSourceIdWithAlternateMana(creatureCard.getId(), null, creatureCard.getSpellAbility().getCosts(), identifier);
                player.setCastSourceIdWithAlternateMana(spellCard.getId(), null, spellCard.getSpellAbility().getCosts(), identifier);
            }
            player.setCastSourceIdWithAlternateMana(objectId, null, card.getSpellAbility().getCosts(), identifier);
        }
        return true;
    }
}
