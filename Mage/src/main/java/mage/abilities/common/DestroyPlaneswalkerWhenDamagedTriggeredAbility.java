package mage.abilities.common;

import mage.abilities.TriggeredAbilityImpl;
import mage.abilities.effects.Effect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.constants.Zone;
import mage.filter.FilterPermanent;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;
import mage.target.targetpointer.FixedTarget;

public class DestroyPlaneswalkerWhenDamagedTriggeredAbility extends TriggeredAbilityImpl {

    private final FilterPermanent filter;

    public DestroyPlaneswalkerWhenDamagedTriggeredAbility() {
        this((FilterPermanent) null);
    }

    public DestroyPlaneswalkerWhenDamagedTriggeredAbility(FilterPermanent filter) {
        super(Zone.BATTLEFIELD, null);
        this.filter = filter;
    }

    private DestroyPlaneswalkerWhenDamagedTriggeredAbility(final DestroyPlaneswalkerWhenDamagedTriggeredAbility effect) {
        super(effect);
        this.filter = effect.filter;
    }

    @Override
    public DestroyPlaneswalkerWhenDamagedTriggeredAbility copy() {
        return new DestroyPlaneswalkerWhenDamagedTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.DAMAGED_PERMANENT;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        Permanent sourcePermanent = getSourcePermanentIfItStillExists(game);
        if (sourcePermanent == null) {
            return false;
        }
        Permanent damagedPermanent = game.getPermanent(event.getTargetId());
        if (damagedPermanent == null) {
            return false;
        }
        boolean targetsPlaneswalker = damagedPermanent.isPlaneswalker(game);
        boolean filterMatch = filter != null ? filter.match(sourcePermanent, game) : event.getSourceId().equals(getSourceId());
        if (targetsPlaneswalker && filterMatch) {
            Effect effect = new DestroyTargetEffect();
            effect.setTargetPointer(new FixedTarget(event.getTargetId(), game));
            this.getEffects().clear();
            this.addEffect(effect);
            return true;
        }
        return false;
    }

    @Override
    public String getRule() {
        return "Whenever " + (filter != null ? filter.getMessage() : "this creature") + " deals damage to a planeswalker, destroy that planeswalker.";
    }
}
