package mage.game.command.emblems;

import mage.abilities.LoyaltyAbility;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.common.continuous.ActivateAbilitiesAnyTimeYouCouldCastInstantEffect;
import mage.constants.Zone;
import mage.game.command.Emblem;

/**
 * @author spjspj
 */
public final class TeferiTemporalArchmageEmblem extends Emblem {
    // "You may activate loyalty abilities of planeswalkers you control on any player's turn any time you could cast an instant."

    public TeferiTemporalArchmageEmblem() {
        super("Emblem Teferi");
        this.getAbilities().add(new SimpleStaticAbility(Zone.COMMAND, new ActivateAbilitiesAnyTimeYouCouldCastInstantEffect(LoyaltyAbility.class, "loyalty abilities of planeswalkers you control on any player's turn")));
    }

    private TeferiTemporalArchmageEmblem(final TeferiTemporalArchmageEmblem card) {
        super(card);
    }

    @Override
    public TeferiTemporalArchmageEmblem copy() {
        return new TeferiTemporalArchmageEmblem(this);
    }
}
