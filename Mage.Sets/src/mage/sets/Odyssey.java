package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;
import mage.collation.BoosterCollator;
import mage.collation.BoosterStructure;
import mage.collation.CardRun;
import mage.collation.RarityConfiguration;
import mage.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author North
 */
public final class Odyssey extends ExpansionSet {

    private static final Odyssey instance = new Odyssey();

    public static Odyssey getInstance() {
        return instance;
    }

    private Odyssey() {
        super("Odyssey", "ODY", ExpansionSet.buildDate(2001, 9, 22), SetType.EXPANSION);
        this.blockName = "Odyssey";
        this.hasBoosters = true;
        this.rotationSet = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 0;

        cards.add(new SetCardInfo("Abandoned Outpost", 312, Rarity.COMMON, mage.cards.a.AbandonedOutpost.class, RETRO_ART));
        cards.add(new SetCardInfo("Aboshan's Desire", 59, Rarity.COMMON, mage.cards.a.AboshansDesire.class, RETRO_ART));
        cards.add(new SetCardInfo("Aboshan, Cephalid Emperor", 58, Rarity.RARE, mage.cards.a.AboshanCephalidEmperor.class, RETRO_ART));
        cards.add(new SetCardInfo("Acceptable Losses", 172, Rarity.COMMON, mage.cards.a.AcceptableLosses.class, RETRO_ART));
        cards.add(new SetCardInfo("Aegis of Honor", 1, Rarity.RARE, mage.cards.a.AegisOfHonor.class, RETRO_ART));
        cards.add(new SetCardInfo("Aether Burst", 60, Rarity.COMMON, mage.cards.a.AetherBurst.class, RETRO_ART));
        cards.add(new SetCardInfo("Afflict", 115, Rarity.COMMON, mage.cards.a.Afflict.class, RETRO_ART));
        cards.add(new SetCardInfo("Amugaba", 61, Rarity.RARE, mage.cards.a.Amugaba.class, RETRO_ART));
        cards.add(new SetCardInfo("Anarchist", 173, Rarity.COMMON, mage.cards.a.Anarchist.class, RETRO_ART));
        cards.add(new SetCardInfo("Ancestral Tribute", 2, Rarity.RARE, mage.cards.a.AncestralTribute.class, RETRO_ART));
        cards.add(new SetCardInfo("Angelic Wall", 3, Rarity.COMMON, mage.cards.a.AngelicWall.class, RETRO_ART));
        cards.add(new SetCardInfo("Animal Boneyard", 4, Rarity.UNCOMMON, mage.cards.a.AnimalBoneyard.class, RETRO_ART));
        cards.add(new SetCardInfo("Ashen Firebeast", 174, Rarity.RARE, mage.cards.a.AshenFirebeast.class, RETRO_ART));
        cards.add(new SetCardInfo("Atogatog", 286, Rarity.RARE, mage.cards.a.Atogatog.class, RETRO_ART));
        cards.add(new SetCardInfo("Aura Graft", 62, Rarity.UNCOMMON, mage.cards.a.AuraGraft.class, RETRO_ART));
        cards.add(new SetCardInfo("Auramancer", 5, Rarity.COMMON, mage.cards.a.Auramancer.class, RETRO_ART));
        cards.add(new SetCardInfo("Aven Archer", 6, Rarity.UNCOMMON, mage.cards.a.AvenArcher.class, RETRO_ART));
        cards.add(new SetCardInfo("Aven Cloudchaser", 7, Rarity.COMMON, mage.cards.a.AvenCloudchaser.class, RETRO_ART));
        cards.add(new SetCardInfo("Aven Fisher", 63, Rarity.COMMON, mage.cards.a.AvenFisher.class, RETRO_ART));
        cards.add(new SetCardInfo("Aven Flock", 8, Rarity.COMMON, mage.cards.a.AvenFlock.class, RETRO_ART));
        cards.add(new SetCardInfo("Aven Shrine", 9, Rarity.RARE, mage.cards.a.AvenShrine.class, RETRO_ART));
        cards.add(new SetCardInfo("Aven Smokeweaver", 64, Rarity.UNCOMMON, mage.cards.a.AvenSmokeweaver.class, RETRO_ART));
        cards.add(new SetCardInfo("Aven Windreader", 65, Rarity.COMMON, mage.cards.a.AvenWindreader.class, RETRO_ART));
        cards.add(new SetCardInfo("Balancing Act", 10, Rarity.RARE, mage.cards.b.BalancingAct.class, RETRO_ART));
        cards.add(new SetCardInfo("Balshan Beguiler", 66, Rarity.UNCOMMON, mage.cards.b.BalshanBeguiler.class, RETRO_ART));
        cards.add(new SetCardInfo("Balshan Griffin", 67, Rarity.UNCOMMON, mage.cards.b.BalshanGriffin.class, RETRO_ART));
        cards.add(new SetCardInfo("Bamboozle", 68, Rarity.UNCOMMON, mage.cards.b.Bamboozle.class, RETRO_ART));
        cards.add(new SetCardInfo("Barbarian Lunatic", 175, Rarity.COMMON, mage.cards.b.BarbarianLunatic.class, RETRO_ART));
        cards.add(new SetCardInfo("Barbarian Ring", 313, Rarity.UNCOMMON, mage.cards.b.BarbarianRing.class, RETRO_ART));
        cards.add(new SetCardInfo("Bash to Bits", 176, Rarity.UNCOMMON, mage.cards.b.BashToBits.class, RETRO_ART));
        cards.add(new SetCardInfo("Battle of Wits", 69, Rarity.RARE, mage.cards.b.BattleOfWits.class, RETRO_ART));
        cards.add(new SetCardInfo("Battle Strain", 177, Rarity.UNCOMMON, mage.cards.b.BattleStrain.class, RETRO_ART));
        cards.add(new SetCardInfo("Bearscape", 229, Rarity.RARE, mage.cards.b.Bearscape.class, RETRO_ART));
        cards.add(new SetCardInfo("Beast Attack", 230, Rarity.UNCOMMON, mage.cards.b.BeastAttack.class, RETRO_ART));
        cards.add(new SetCardInfo("Beloved Chaplain", 11, Rarity.UNCOMMON, mage.cards.b.BelovedChaplain.class, RETRO_ART));
        cards.add(new SetCardInfo("Blazing Salvo", 178, Rarity.COMMON, mage.cards.b.BlazingSalvo.class, RETRO_ART));
        cards.add(new SetCardInfo("Blessed Orator", 12, Rarity.UNCOMMON, mage.cards.b.BlessedOrator.class, RETRO_ART));
        cards.add(new SetCardInfo("Bloodcurdler", 116, Rarity.RARE, mage.cards.b.Bloodcurdler.class, RETRO_ART));
        cards.add(new SetCardInfo("Bog Wreckage", 314, Rarity.COMMON, mage.cards.b.BogWreckage.class, RETRO_ART));
        cards.add(new SetCardInfo("Bomb Squad", 179, Rarity.RARE, mage.cards.b.BombSquad.class, RETRO_ART));
        cards.add(new SetCardInfo("Braids, Cabal Minion", 117, Rarity.RARE, mage.cards.b.BraidsCabalMinion.class, RETRO_ART));
        cards.add(new SetCardInfo("Buried Alive", 118, Rarity.UNCOMMON, mage.cards.b.BuriedAlive.class, RETRO_ART));
        cards.add(new SetCardInfo("Burning Sands", 180, Rarity.RARE, mage.cards.b.BurningSands.class, RETRO_ART));
        cards.add(new SetCardInfo("Cabal Inquisitor", 119, Rarity.COMMON, mage.cards.c.CabalInquisitor.class, RETRO_ART));
        cards.add(new SetCardInfo("Cabal Patriarch", 120, Rarity.RARE, mage.cards.c.CabalPatriarch.class, RETRO_ART));
        cards.add(new SetCardInfo("Cabal Pit", 315, Rarity.UNCOMMON, mage.cards.c.CabalPit.class, RETRO_ART));
        cards.add(new SetCardInfo("Cabal Shrine", 121, Rarity.RARE, mage.cards.c.CabalShrine.class, RETRO_ART));
        cards.add(new SetCardInfo("Call of the Herd", 231, Rarity.RARE, mage.cards.c.CallOfTheHerd.class, RETRO_ART));
        cards.add(new SetCardInfo("Cantivore", 13, Rarity.RARE, mage.cards.c.Cantivore.class, RETRO_ART));
        cards.add(new SetCardInfo("Careful Study", 70, Rarity.COMMON, mage.cards.c.CarefulStudy.class, RETRO_ART));
        cards.add(new SetCardInfo("Cartographer", 232, Rarity.COMMON, mage.cards.c.Cartographer.class, RETRO_ART));
        cards.add(new SetCardInfo("Catalyst Stone", 297, Rarity.RARE, mage.cards.c.CatalystStone.class, RETRO_ART));
        cards.add(new SetCardInfo("Caustic Tar", 122, Rarity.UNCOMMON, mage.cards.c.CausticTar.class, RETRO_ART));
        cards.add(new SetCardInfo("Cease-Fire", 14, Rarity.COMMON, mage.cards.c.CeaseFire.class, RETRO_ART));
        cards.add(new SetCardInfo("Centaur Garden", 316, Rarity.UNCOMMON, mage.cards.c.CentaurGarden.class, RETRO_ART));
        cards.add(new SetCardInfo("Cephalid Broker", 71, Rarity.UNCOMMON, mage.cards.c.CephalidBroker.class, RETRO_ART));
        cards.add(new SetCardInfo("Cephalid Coliseum", 317, Rarity.UNCOMMON, mage.cards.c.CephalidColiseum.class, RETRO_ART));
        cards.add(new SetCardInfo("Cephalid Looter", 72, Rarity.COMMON, mage.cards.c.CephalidLooter.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Cephalid Looter", "72+", Rarity.COMMON, mage.cards.c.CephalidLooter.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Cephalid Retainer", 73, Rarity.RARE, mage.cards.c.CephalidRetainer.class, RETRO_ART));
        cards.add(new SetCardInfo("Cephalid Scout", 74, Rarity.COMMON, mage.cards.c.CephalidScout.class, RETRO_ART));
        cards.add(new SetCardInfo("Cephalid Shrine", 75, Rarity.RARE, mage.cards.c.CephalidShrine.class, RETRO_ART));
        cards.add(new SetCardInfo("Chainflinger", 181, Rarity.COMMON, mage.cards.c.Chainflinger.class, RETRO_ART));
        cards.add(new SetCardInfo("Chamber of Manipulation", 76, Rarity.UNCOMMON, mage.cards.c.ChamberOfManipulation.class, RETRO_ART));
        cards.add(new SetCardInfo("Chance Encounter", 182, Rarity.RARE, mage.cards.c.ChanceEncounter.class, RETRO_ART));
        cards.add(new SetCardInfo("Charmed Pendant", 298, Rarity.RARE, mage.cards.c.CharmedPendant.class, RETRO_ART));
        cards.add(new SetCardInfo("Chatter of the Squirrel", 233, Rarity.COMMON, mage.cards.c.ChatterOfTheSquirrel.class, RETRO_ART));
        cards.add(new SetCardInfo("Childhood Horror", 123, Rarity.UNCOMMON, mage.cards.c.ChildhoodHorror.class, RETRO_ART));
        cards.add(new SetCardInfo("Chlorophant", 234, Rarity.RARE, mage.cards.c.Chlorophant.class, RETRO_ART));
        cards.add(new SetCardInfo("Coffin Purge", 124, Rarity.COMMON, mage.cards.c.CoffinPurge.class, RETRO_ART));
        cards.add(new SetCardInfo("Cognivore", 77, Rarity.RARE, mage.cards.c.Cognivore.class, RETRO_ART));
        cards.add(new SetCardInfo("Concentrate", 78, Rarity.UNCOMMON, mage.cards.c.Concentrate.class, RETRO_ART));
        cards.add(new SetCardInfo("Confessor", 15, Rarity.COMMON, mage.cards.c.Confessor.class, RETRO_ART));
        cards.add(new SetCardInfo("Crashing Centaur", 235, Rarity.UNCOMMON, mage.cards.c.CrashingCentaur.class, RETRO_ART));
        cards.add(new SetCardInfo("Crypt Creeper", 125, Rarity.COMMON, mage.cards.c.CryptCreeper.class, RETRO_ART));
        cards.add(new SetCardInfo("Crystal Quarry", 318, Rarity.RARE, mage.cards.c.CrystalQuarry.class, RETRO_ART));
        cards.add(new SetCardInfo("Cultural Exchange", 79, Rarity.RARE, mage.cards.c.CulturalExchange.class, RETRO_ART));
        cards.add(new SetCardInfo("Cursed Monstrosity", 126, Rarity.RARE, mage.cards.c.CursedMonstrosity.class, RETRO_ART));
        cards.add(new SetCardInfo("Darkwater Catacombs", 319, Rarity.RARE, mage.cards.d.DarkwaterCatacombs.class, RETRO_ART));
        cards.add(new SetCardInfo("Darkwater Egg", 299, Rarity.UNCOMMON, mage.cards.d.DarkwaterEgg.class, RETRO_ART));
        cards.add(new SetCardInfo("Decaying Soil", 127, Rarity.RARE, mage.cards.d.DecayingSoil.class, RETRO_ART));
        cards.add(new SetCardInfo("Decimate", 287, Rarity.RARE, mage.cards.d.Decimate.class, RETRO_ART));
        cards.add(new SetCardInfo("Decompose", 128, Rarity.UNCOMMON, mage.cards.d.Decompose.class, RETRO_ART));
        cards.add(new SetCardInfo("Dedicated Martyr", 16, Rarity.COMMON, mage.cards.d.DedicatedMartyr.class, RETRO_ART));
        cards.add(new SetCardInfo("Deep Reconnaissance", 236, Rarity.UNCOMMON, mage.cards.d.DeepReconnaissance.class, RETRO_ART));
        cards.add(new SetCardInfo("Delaying Shield", 17, Rarity.RARE, mage.cards.d.DelayingShield.class, RETRO_ART));
        cards.add(new SetCardInfo("Deluge", 80, Rarity.UNCOMMON, mage.cards.d.Deluge.class, RETRO_ART));
        cards.add(new SetCardInfo("Dematerialize", 81, Rarity.COMMON, mage.cards.d.Dematerialize.class, RETRO_ART));
        cards.add(new SetCardInfo("Demolish", 183, Rarity.UNCOMMON, mage.cards.d.Demolish.class, RETRO_ART));
        cards.add(new SetCardInfo("Demoralize", 184, Rarity.COMMON, mage.cards.d.Demoralize.class, RETRO_ART));
        cards.add(new SetCardInfo("Deserted Temple", 320, Rarity.RARE, mage.cards.d.DesertedTemple.class, RETRO_ART));
        cards.add(new SetCardInfo("Devoted Caretaker", 18, Rarity.RARE, mage.cards.d.DevotedCaretaker.class, RETRO_ART));
        cards.add(new SetCardInfo("Diabolic Tutor", 129, Rarity.UNCOMMON, mage.cards.d.DiabolicTutor.class, RETRO_ART));
        cards.add(new SetCardInfo("Diligent Farmhand", 237, Rarity.COMMON, mage.cards.d.DiligentFarmhand.class, RETRO_ART));
        cards.add(new SetCardInfo("Dirty Wererat", 130, Rarity.COMMON, mage.cards.d.DirtyWererat.class, RETRO_ART));
        cards.add(new SetCardInfo("Divert", 82, Rarity.RARE, mage.cards.d.Divert.class, RETRO_ART));
        cards.add(new SetCardInfo("Divine Sacrament", 19, Rarity.RARE, mage.cards.d.DivineSacrament.class, RETRO_ART));
        cards.add(new SetCardInfo("Dogged Hunter", 20, Rarity.RARE, mage.cards.d.DoggedHunter.class, RETRO_ART));
        cards.add(new SetCardInfo("Dreamwinder", 83, Rarity.COMMON, mage.cards.d.Dreamwinder.class, RETRO_ART));
        cards.add(new SetCardInfo("Druid Lyrist", 238, Rarity.COMMON, mage.cards.d.DruidLyrist.class, RETRO_ART));
        cards.add(new SetCardInfo("Druid's Call", 239, Rarity.UNCOMMON, mage.cards.d.DruidsCall.class, RETRO_ART));
        cards.add(new SetCardInfo("Dusk Imp", 131, Rarity.COMMON, mage.cards.d.DuskImp.class, RETRO_ART));
        cards.add(new SetCardInfo("Dwarven Grunt", 185, Rarity.COMMON, mage.cards.d.DwarvenGrunt.class, RETRO_ART));
        cards.add(new SetCardInfo("Dwarven Recruiter", 186, Rarity.UNCOMMON, mage.cards.d.DwarvenRecruiter.class, RETRO_ART));
        cards.add(new SetCardInfo("Dwarven Shrine", 187, Rarity.RARE, mage.cards.d.DwarvenShrine.class, RETRO_ART));
        cards.add(new SetCardInfo("Dwarven Strike Force", 188, Rarity.UNCOMMON, mage.cards.d.DwarvenStrikeForce.class, RETRO_ART));
        cards.add(new SetCardInfo("Earnest Fellowship", 21, Rarity.RARE, mage.cards.e.EarnestFellowship.class, RETRO_ART));
        cards.add(new SetCardInfo("Earth Rift", 189, Rarity.COMMON, mage.cards.e.EarthRift.class, RETRO_ART));
        cards.add(new SetCardInfo("Elephant Ambush", 240, Rarity.COMMON, mage.cards.e.ElephantAmbush.class, RETRO_ART));
        cards.add(new SetCardInfo("Ember Beast", 190, Rarity.COMMON, mage.cards.e.EmberBeast.class, RETRO_ART));
        cards.add(new SetCardInfo("Embolden", 22, Rarity.COMMON, mage.cards.e.Embolden.class, RETRO_ART));
        cards.add(new SetCardInfo("Engulfing Flames", 191, Rarity.UNCOMMON, mage.cards.e.EngulfingFlames.class, RETRO_ART));
        cards.add(new SetCardInfo("Entomb", 132, Rarity.RARE, mage.cards.e.Entomb.class, RETRO_ART));
        cards.add(new SetCardInfo("Epicenter", 192, Rarity.RARE, mage.cards.e.Epicenter.class, RETRO_ART));
        cards.add(new SetCardInfo("Escape Artist", 84, Rarity.COMMON, mage.cards.e.EscapeArtist.class, RETRO_ART));
        cards.add(new SetCardInfo("Execute", 133, Rarity.UNCOMMON, mage.cards.e.Execute.class, RETRO_ART));
        cards.add(new SetCardInfo("Extract", 85, Rarity.RARE, mage.cards.e.Extract.class, RETRO_ART));
        cards.add(new SetCardInfo("Face of Fear", 134, Rarity.UNCOMMON, mage.cards.f.FaceOfFear.class, RETRO_ART));
        cards.add(new SetCardInfo("Famished Ghoul", 135, Rarity.UNCOMMON, mage.cards.f.FamishedGhoul.class, RETRO_ART));
        cards.add(new SetCardInfo("Fervent Denial", 86, Rarity.UNCOMMON, mage.cards.f.FerventDenial.class, RETRO_ART));
        cards.add(new SetCardInfo("Filthy Cur", 136, Rarity.COMMON, mage.cards.f.FilthyCur.class, RETRO_ART));
        cards.add(new SetCardInfo("Firebolt", 193, Rarity.COMMON, mage.cards.f.Firebolt.class, RETRO_ART));
        cards.add(new SetCardInfo("Flame Burst", 194, Rarity.COMMON, mage.cards.f.FlameBurst.class, RETRO_ART));
        cards.add(new SetCardInfo("Fledgling Imp", 137, Rarity.COMMON, mage.cards.f.FledglingImp.class, RETRO_ART));
        cards.add(new SetCardInfo("Forest", 347, Rarity.LAND, mage.cards.basiclands.Forest.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 348, Rarity.LAND, mage.cards.basiclands.Forest.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 349, Rarity.LAND, mage.cards.basiclands.Forest.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Forest", 350, Rarity.LAND, mage.cards.basiclands.Forest.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Frenetic Ogre", 195, Rarity.UNCOMMON, mage.cards.f.FreneticOgre.class, RETRO_ART));
        cards.add(new SetCardInfo("Frightcrawler", 138, Rarity.COMMON, mage.cards.f.Frightcrawler.class, RETRO_ART));
        cards.add(new SetCardInfo("Gallantry", 23, Rarity.UNCOMMON, mage.cards.g.Gallantry.class, RETRO_ART));
        cards.add(new SetCardInfo("Ghastly Demise", 139, Rarity.COMMON, mage.cards.g.GhastlyDemise.class, RETRO_ART));
        cards.add(new SetCardInfo("Gorilla Titan", 241, Rarity.UNCOMMON, mage.cards.g.GorillaTitan.class, RETRO_ART));
        cards.add(new SetCardInfo("Graceful Antelope", 24, Rarity.RARE, mage.cards.g.GracefulAntelope.class, RETRO_ART));
        cards.add(new SetCardInfo("Gravedigger", 140, Rarity.COMMON, mage.cards.g.Gravedigger.class, RETRO_ART));
        cards.add(new SetCardInfo("Gravestorm", 141, Rarity.RARE, mage.cards.g.Gravestorm.class, RETRO_ART));
        cards.add(new SetCardInfo("Ground Seal", 242, Rarity.RARE, mage.cards.g.GroundSeal.class, RETRO_ART));
        cards.add(new SetCardInfo("Halberdier", 196, Rarity.COMMON, mage.cards.h.Halberdier.class, RETRO_ART));
        cards.add(new SetCardInfo("Hallowed Healer", 25, Rarity.COMMON, mage.cards.h.HallowedHealer.class, RETRO_ART));
        cards.add(new SetCardInfo("Haunting Echoes", 142, Rarity.RARE, mage.cards.h.HauntingEchoes.class, RETRO_ART));
        cards.add(new SetCardInfo("Hint of Insanity", 143, Rarity.RARE, mage.cards.h.HintOfInsanity.class, RETRO_ART));
        cards.add(new SetCardInfo("Holistic Wisdom", 243, Rarity.RARE, mage.cards.h.HolisticWisdom.class, RETRO_ART));
        cards.add(new SetCardInfo("Howling Gale", 244, Rarity.UNCOMMON, mage.cards.h.HowlingGale.class, RETRO_ART));
        cards.add(new SetCardInfo("Immobilizing Ink", 87, Rarity.COMMON, mage.cards.i.ImmobilizingInk.class, RETRO_ART));
        cards.add(new SetCardInfo("Impulsive Maneuvers", 197, Rarity.RARE, mage.cards.i.ImpulsiveManeuvers.class, RETRO_ART));
        cards.add(new SetCardInfo("Infected Vermin", 144, Rarity.UNCOMMON, mage.cards.i.InfectedVermin.class, RETRO_ART));
        cards.add(new SetCardInfo("Innocent Blood", 145, Rarity.COMMON, mage.cards.i.InnocentBlood.class, RETRO_ART));
        cards.add(new SetCardInfo("Iridescent Angel", 288, Rarity.RARE, mage.cards.i.IridescentAngel.class, RETRO_ART));
        cards.add(new SetCardInfo("Island", 335, Rarity.LAND, mage.cards.basiclands.Island.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 336, Rarity.LAND, mage.cards.basiclands.Island.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 337, Rarity.LAND, mage.cards.basiclands.Island.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Island", 338, Rarity.LAND, mage.cards.basiclands.Island.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Ivy Elemental", 245, Rarity.RARE, mage.cards.i.IvyElemental.class, RETRO_ART));
        cards.add(new SetCardInfo("Junk Golem", 300, Rarity.RARE, mage.cards.j.JunkGolem.class, RETRO_ART));
        cards.add(new SetCardInfo("Kamahl's Desire", 199, Rarity.COMMON, mage.cards.k.KamahlsDesire.class, RETRO_ART));
        cards.add(new SetCardInfo("Kamahl, Pit Fighter", 198, Rarity.RARE, mage.cards.k.KamahlPitFighter.class, RETRO_ART));
        cards.add(new SetCardInfo("Karmic Justice", 26, Rarity.RARE, mage.cards.k.KarmicJustice.class, RETRO_ART));
        cards.add(new SetCardInfo("Kirtar's Desire", 27, Rarity.COMMON, mage.cards.k.KirtarsDesire.class, RETRO_ART));
        cards.add(new SetCardInfo("Kirtar's Wrath", 28, Rarity.RARE, mage.cards.k.KirtarsWrath.class, RETRO_ART));
        cards.add(new SetCardInfo("Krosan Archer", 246, Rarity.COMMON, mage.cards.k.KrosanArcher.class, RETRO_ART));
        cards.add(new SetCardInfo("Krosan Avenger", 247, Rarity.COMMON, mage.cards.k.KrosanAvenger.class, RETRO_ART));
        cards.add(new SetCardInfo("Krosan Beast", 248, Rarity.RARE, mage.cards.k.KrosanBeast.class, RETRO_ART));
        cards.add(new SetCardInfo("Laquatus's Creativity", 88, Rarity.UNCOMMON, mage.cards.l.LaquatussCreativity.class, RETRO_ART));
        cards.add(new SetCardInfo("Last Rites", 146, Rarity.COMMON, mage.cards.l.LastRites.class, RETRO_ART));
        cards.add(new SetCardInfo("Lava Blister", 200, Rarity.UNCOMMON, mage.cards.l.LavaBlister.class, RETRO_ART));
        cards.add(new SetCardInfo("Leaf Dancer", 249, Rarity.COMMON, mage.cards.l.LeafDancer.class, RETRO_ART));
        cards.add(new SetCardInfo("Lieutenant Kirtar", 29, Rarity.RARE, mage.cards.l.LieutenantKirtar.class, RETRO_ART));
        cards.add(new SetCardInfo("Life Burst", 30, Rarity.COMMON, mage.cards.l.LifeBurst.class, RETRO_ART));
        cards.add(new SetCardInfo("Limestone Golem", 301, Rarity.UNCOMMON, mage.cards.l.LimestoneGolem.class, RETRO_ART));
        cards.add(new SetCardInfo("Liquid Fire", 201, Rarity.UNCOMMON, mage.cards.l.LiquidFire.class, RETRO_ART));
        cards.add(new SetCardInfo("Lithatog", 289, Rarity.UNCOMMON, mage.cards.l.Lithatog.class, RETRO_ART));
        cards.add(new SetCardInfo("Luminous Guardian", 31, Rarity.UNCOMMON, mage.cards.l.LuminousGuardian.class, RETRO_ART));
        cards.add(new SetCardInfo("Mad Dog", 202, Rarity.COMMON, mage.cards.m.MadDog.class, RETRO_ART));
        cards.add(new SetCardInfo("Magma Vein", 203, Rarity.UNCOMMON, mage.cards.m.MagmaVein.class, RETRO_ART));
        cards.add(new SetCardInfo("Magnivore", 204, Rarity.RARE, mage.cards.m.Magnivore.class, RETRO_ART));
        cards.add(new SetCardInfo("Malevolent Awakening", 147, Rarity.UNCOMMON, mage.cards.m.MalevolentAwakening.class, RETRO_ART));
        cards.add(new SetCardInfo("Master Apothecary", 32, Rarity.RARE, mage.cards.m.MasterApothecary.class, RETRO_ART));
        cards.add(new SetCardInfo("Metamorphic Wurm", 250, Rarity.UNCOMMON, mage.cards.m.MetamorphicWurm.class, RETRO_ART));
        cards.add(new SetCardInfo("Millikin", 302, Rarity.UNCOMMON, mage.cards.m.Millikin.class, RETRO_ART));
        cards.add(new SetCardInfo("Mind Burst", 148, Rarity.COMMON, mage.cards.m.MindBurst.class, RETRO_ART));
        cards.add(new SetCardInfo("Mindslicer", 149, Rarity.RARE, mage.cards.m.Mindslicer.class, RETRO_ART));
        cards.add(new SetCardInfo("Mine Layer", 205, Rarity.RARE, mage.cards.m.MineLayer.class, RETRO_ART));
        cards.add(new SetCardInfo("Minotaur Explorer", 206, Rarity.UNCOMMON, mage.cards.m.MinotaurExplorer.class, RETRO_ART));
        cards.add(new SetCardInfo("Mirari", 303, Rarity.RARE, mage.cards.m.Mirari.class, RETRO_ART));
        cards.add(new SetCardInfo("Molten Influence", 207, Rarity.RARE, mage.cards.m.MoltenInfluence.class, RETRO_ART));
        cards.add(new SetCardInfo("Moment's Peace", 251, Rarity.COMMON, mage.cards.m.MomentsPeace.class, RETRO_ART));
        cards.add(new SetCardInfo("Morbid Hunger", 150, Rarity.COMMON, mage.cards.m.MorbidHunger.class, RETRO_ART));
        cards.add(new SetCardInfo("Morgue Theft", 151, Rarity.COMMON, mage.cards.m.MorgueTheft.class, RETRO_ART));
        cards.add(new SetCardInfo("Mortivore", 152, Rarity.RARE, mage.cards.m.Mortivore.class, RETRO_ART));
        cards.add(new SetCardInfo("Mossfire Egg", 304, Rarity.UNCOMMON, mage.cards.m.MossfireEgg.class, RETRO_ART));
        cards.add(new SetCardInfo("Mossfire Valley", 321, Rarity.RARE, mage.cards.m.MossfireValley.class, RETRO_ART));
        cards.add(new SetCardInfo("Mountain", 343, Rarity.LAND, mage.cards.basiclands.Mountain.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 344, Rarity.LAND, mage.cards.basiclands.Mountain.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 345, Rarity.LAND, mage.cards.basiclands.Mountain.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Mountain", 346, Rarity.LAND, mage.cards.basiclands.Mountain.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Mudhole", 208, Rarity.RARE, mage.cards.m.Mudhole.class, RETRO_ART));
        cards.add(new SetCardInfo("Muscle Burst", 252, Rarity.COMMON, mage.cards.m.MuscleBurst.class, RETRO_ART));
        cards.add(new SetCardInfo("Mystic Crusader", 33, Rarity.RARE, mage.cards.m.MysticCrusader.class, RETRO_ART));
        cards.add(new SetCardInfo("Mystic Enforcer", 290, Rarity.RARE, mage.cards.m.MysticEnforcer.class, RETRO_ART));
        cards.add(new SetCardInfo("Mystic Penitent", 34, Rarity.UNCOMMON, mage.cards.m.MysticPenitent.class, RETRO_ART));
        cards.add(new SetCardInfo("Mystic Visionary", 35, Rarity.COMMON, mage.cards.m.MysticVisionary.class, RETRO_ART));
        cards.add(new SetCardInfo("Mystic Zealot", 36, Rarity.COMMON, mage.cards.m.MysticZealot.class, RETRO_ART));
        cards.add(new SetCardInfo("Nantuko Disciple", 253, Rarity.COMMON, mage.cards.n.NantukoDisciple.class, RETRO_ART));
        cards.add(new SetCardInfo("Nantuko Elder", 254, Rarity.UNCOMMON, mage.cards.n.NantukoElder.class, RETRO_ART));
        cards.add(new SetCardInfo("Nantuko Mentor", 255, Rarity.RARE, mage.cards.n.NantukoMentor.class, RETRO_ART));
        cards.add(new SetCardInfo("Nantuko Shrine", 256, Rarity.RARE, mage.cards.n.NantukoShrine.class, RETRO_ART));
        cards.add(new SetCardInfo("Need for Speed", 209, Rarity.RARE, mage.cards.n.NeedForSpeed.class, RETRO_ART));
        cards.add(new SetCardInfo("Nefarious Lich", 153, Rarity.RARE, mage.cards.n.NefariousLich.class, RETRO_ART));
        cards.add(new SetCardInfo("New Frontiers", 257, Rarity.RARE, mage.cards.n.NewFrontiers.class, RETRO_ART));
        cards.add(new SetCardInfo("Nimble Mongoose", 258, Rarity.UNCOMMON, mage.cards.n.NimbleMongoose.class, RETRO_ART));
        cards.add(new SetCardInfo("Nomad Decoy", 37, Rarity.UNCOMMON, mage.cards.n.NomadDecoy.class, RETRO_ART));
        cards.add(new SetCardInfo("Nomad Stadium", 322, Rarity.UNCOMMON, mage.cards.n.NomadStadium.class, RETRO_ART));
        cards.add(new SetCardInfo("Nut Collector", 259, Rarity.RARE, mage.cards.n.NutCollector.class, RETRO_ART));
        cards.add(new SetCardInfo("Obstinate Familiar", 210, Rarity.RARE, mage.cards.o.ObstinateFamiliar.class, RETRO_ART));
        cards.add(new SetCardInfo("Otarian Juggernaut", 305, Rarity.RARE, mage.cards.o.OtarianJuggernaut.class, RETRO_ART));
        cards.add(new SetCardInfo("Overeager Apprentice", 154, Rarity.COMMON, mage.cards.o.OvereagerApprentice.class, RETRO_ART));
        cards.add(new SetCardInfo("Overrun", 260, Rarity.UNCOMMON, mage.cards.o.Overrun.class, RETRO_ART));
        cards.add(new SetCardInfo("Painbringer", 155, Rarity.UNCOMMON, mage.cards.p.Painbringer.class, RETRO_ART));
        cards.add(new SetCardInfo("Pardic Firecat", 211, Rarity.COMMON, mage.cards.p.PardicFirecat.class, RETRO_ART));
        cards.add(new SetCardInfo("Pardic Miner", 212, Rarity.RARE, mage.cards.p.PardicMiner.class, RETRO_ART));
        cards.add(new SetCardInfo("Pardic Swordsmith", 213, Rarity.COMMON, mage.cards.p.PardicSwordsmith.class, RETRO_ART));
        cards.add(new SetCardInfo("Patchwork Gnomes", 306, Rarity.UNCOMMON, mage.cards.p.PatchworkGnomes.class, RETRO_ART));
        cards.add(new SetCardInfo("Patriarch's Desire", 156, Rarity.COMMON, mage.cards.p.PatriarchsDesire.class, RETRO_ART));
        cards.add(new SetCardInfo("Patrol Hound", 38, Rarity.COMMON, mage.cards.p.PatrolHound.class, RETRO_ART));
        cards.add(new SetCardInfo("Patron Wizard", 89, Rarity.RARE, mage.cards.p.PatronWizard.class, RETRO_ART));
        cards.add(new SetCardInfo("Pedantic Learning", 90, Rarity.RARE, mage.cards.p.PedanticLearning.class, RETRO_ART));
        cards.add(new SetCardInfo("Peek", 91, Rarity.COMMON, mage.cards.p.Peek.class, RETRO_ART));
        cards.add(new SetCardInfo("Persuasion", 92, Rarity.RARE, mage.cards.p.Persuasion.class, RETRO_ART));
        cards.add(new SetCardInfo("Petrified Field", 323, Rarity.RARE, mage.cards.p.PetrifiedField.class, RETRO_ART));
        cards.add(new SetCardInfo("Phantatog", 291, Rarity.UNCOMMON, mage.cards.p.Phantatog.class, RETRO_ART));
        cards.add(new SetCardInfo("Phantom Whelp", 93, Rarity.COMMON, mage.cards.p.PhantomWhelp.class, RETRO_ART));
        cards.add(new SetCardInfo("Pianna, Nomad Captain", 39, Rarity.RARE, mage.cards.p.PiannaNomadCaptain.class, RETRO_ART));
        cards.add(new SetCardInfo("Pilgrim of Justice", 40, Rarity.COMMON, mage.cards.p.PilgrimOfJustice.class, RETRO_ART));
        cards.add(new SetCardInfo("Pilgrim of Virtue", 41, Rarity.COMMON, mage.cards.p.PilgrimOfVirtue.class, RETRO_ART));
        cards.add(new SetCardInfo("Piper's Melody", 261, Rarity.UNCOMMON, mage.cards.p.PipersMelody.class, RETRO_ART));
        cards.add(new SetCardInfo("Plains", 331, Rarity.LAND, mage.cards.basiclands.Plains.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 332, Rarity.LAND, mage.cards.basiclands.Plains.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 333, Rarity.LAND, mage.cards.basiclands.Plains.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Plains", 334, Rarity.LAND, mage.cards.basiclands.Plains.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Predict", 94, Rarity.UNCOMMON, mage.cards.p.Predict.class, RETRO_ART));
        cards.add(new SetCardInfo("Price of Glory", 214, Rarity.UNCOMMON, mage.cards.p.PriceOfGlory.class, RETRO_ART));
        cards.add(new SetCardInfo("Primal Frenzy", 262, Rarity.COMMON, mage.cards.p.PrimalFrenzy.class, RETRO_ART));
        cards.add(new SetCardInfo("Psionic Gift", 95, Rarity.COMMON, mage.cards.p.PsionicGift.class, RETRO_ART));
        cards.add(new SetCardInfo("Psychatog", 292, Rarity.UNCOMMON, mage.cards.p.Psychatog.class, RETRO_ART));
        cards.add(new SetCardInfo("Pulsating Illusion", 96, Rarity.UNCOMMON, mage.cards.p.PulsatingIllusion.class, RETRO_ART));
        cards.add(new SetCardInfo("Puppeteer", 97, Rarity.UNCOMMON, mage.cards.p.Puppeteer.class, RETRO_ART));
        cards.add(new SetCardInfo("Rabid Elephant", 263, Rarity.COMMON, mage.cards.r.RabidElephant.class, RETRO_ART));
        cards.add(new SetCardInfo("Ravaged Highlands", 324, Rarity.COMMON, mage.cards.r.RavagedHighlands.class, RETRO_ART));
        cards.add(new SetCardInfo("Ray of Distortion", 42, Rarity.COMMON, mage.cards.r.RayOfDistortion.class, RETRO_ART));
        cards.add(new SetCardInfo("Reckless Charge", 215, Rarity.COMMON, mage.cards.r.RecklessCharge.class, RETRO_ART));
        cards.add(new SetCardInfo("Recoup", 216, Rarity.UNCOMMON, mage.cards.r.Recoup.class, RETRO_ART));
        cards.add(new SetCardInfo("Refresh", 264, Rarity.COMMON, mage.cards.r.Refresh.class, RETRO_ART));
        cards.add(new SetCardInfo("Repel", 98, Rarity.COMMON, mage.cards.r.Repel.class, RETRO_ART));
        cards.add(new SetCardInfo("Repentant Vampire", 157, Rarity.RARE, mage.cards.r.RepentantVampire.class, RETRO_ART));
        cards.add(new SetCardInfo("Resilient Wanderer", 43, Rarity.UNCOMMON, mage.cards.r.ResilientWanderer.class, RETRO_ART));
        cards.add(new SetCardInfo("Rites of Initiation", 217, Rarity.COMMON, mage.cards.r.RitesOfInitiation.class, RETRO_ART));
        cards.add(new SetCardInfo("Rites of Refusal", 99, Rarity.COMMON, mage.cards.r.RitesOfRefusal.class, RETRO_ART));
        cards.add(new SetCardInfo("Rites of Spring", 265, Rarity.COMMON, mage.cards.r.RitesOfSpring.class, RETRO_ART));
        cards.add(new SetCardInfo("Roar of the Wurm", 266, Rarity.UNCOMMON, mage.cards.r.RoarOfTheWurm.class, RETRO_ART));
        cards.add(new SetCardInfo("Rotting Giant", 158, Rarity.UNCOMMON, mage.cards.r.RottingGiant.class, RETRO_ART));
        cards.add(new SetCardInfo("Sacred Rites", 44, Rarity.COMMON, mage.cards.s.SacredRites.class, RETRO_ART));
        cards.add(new SetCardInfo("Sadistic Hypnotist", 159, Rarity.UNCOMMON, mage.cards.s.SadisticHypnotist.class, RETRO_ART));
        cards.add(new SetCardInfo("Sandstone Deadfall", 307, Rarity.UNCOMMON, mage.cards.s.SandstoneDeadfall.class, RETRO_ART));
        cards.add(new SetCardInfo("Sarcatog", 293, Rarity.UNCOMMON, mage.cards.s.Sarcatog.class, RETRO_ART));
        cards.add(new SetCardInfo("Savage Firecat", 218, Rarity.RARE, mage.cards.s.SavageFirecat.class, RETRO_ART));
        cards.add(new SetCardInfo("Scorching Missile", 219, Rarity.COMMON, mage.cards.s.ScorchingMissile.class, RETRO_ART));
        cards.add(new SetCardInfo("Screams of the Damned", 160, Rarity.UNCOMMON, mage.cards.s.ScreamsOfTheDamned.class, RETRO_ART));
        cards.add(new SetCardInfo("Scrivener", 100, Rarity.COMMON, mage.cards.s.Scrivener.class, RETRO_ART));
        cards.add(new SetCardInfo("Seafloor Debris", 325, Rarity.COMMON, mage.cards.s.SeafloorDebris.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Seafloor Debris", "325+", Rarity.COMMON, mage.cards.s.SeafloorDebris.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Second Thoughts", 45, Rarity.COMMON, mage.cards.s.SecondThoughts.class, RETRO_ART));
        cards.add(new SetCardInfo("Seize the Day", 220, Rarity.RARE, mage.cards.s.SeizeTheDay.class, RETRO_ART));
        cards.add(new SetCardInfo("Seton's Desire", 268, Rarity.COMMON, mage.cards.s.SetonsDesire.class, RETRO_ART));
        cards.add(new SetCardInfo("Seton, Krosan Protector", 267, Rarity.RARE, mage.cards.s.SetonKrosanProtector.class, RETRO_ART));
        cards.add(new SetCardInfo("Shadowblood Egg", 308, Rarity.UNCOMMON, mage.cards.s.ShadowbloodEgg.class, RETRO_ART));
        cards.add(new SetCardInfo("Shadowblood Ridge", 326, Rarity.RARE, mage.cards.s.ShadowbloodRidge.class, RETRO_ART));
        cards.add(new SetCardInfo("Shadowmage Infiltrator", 294, Rarity.RARE, mage.cards.s.ShadowmageInfiltrator.class, RETRO_ART));
        cards.add(new SetCardInfo("Shelter", 46, Rarity.COMMON, mage.cards.s.Shelter.class, RETRO_ART));
        cards.add(new SetCardInfo("Shifty Doppelganger", 101, Rarity.RARE, mage.cards.s.ShiftyDoppelganger.class, RETRO_ART));
        cards.add(new SetCardInfo("Shower of Coals", 221, Rarity.UNCOMMON, mage.cards.s.ShowerOfCoals.class, RETRO_ART));
        cards.add(new SetCardInfo("Simplify", 269, Rarity.COMMON, mage.cards.s.Simplify.class, RETRO_ART));
        cards.add(new SetCardInfo("Skeletal Scrying", 161, Rarity.UNCOMMON, mage.cards.s.SkeletalScrying.class, RETRO_ART));
        cards.add(new SetCardInfo("Skull Fracture", 162, Rarity.UNCOMMON, mage.cards.s.SkullFracture.class, RETRO_ART));
        cards.add(new SetCardInfo("Skycloud Egg", 309, Rarity.UNCOMMON, mage.cards.s.SkycloudEgg.class, RETRO_ART));
        cards.add(new SetCardInfo("Skycloud Expanse", 327, Rarity.RARE, mage.cards.s.SkycloudExpanse.class, RETRO_ART));
        cards.add(new SetCardInfo("Skyshooter", 270, Rarity.UNCOMMON, mage.cards.s.Skyshooter.class, RETRO_ART));
        cards.add(new SetCardInfo("Soulcatcher", 47, Rarity.UNCOMMON, mage.cards.s.Soulcatcher.class, RETRO_ART));
        cards.add(new SetCardInfo("Spark Mage", 222, Rarity.UNCOMMON, mage.cards.s.SparkMage.class, RETRO_ART));
        cards.add(new SetCardInfo("Spellbane Centaur", 271, Rarity.RARE, mage.cards.s.SpellbaneCentaur.class, RETRO_ART));
        cards.add(new SetCardInfo("Sphere of Duty", 48, Rarity.UNCOMMON, mage.cards.s.SphereOfDuty.class, RETRO_ART));
        cards.add(new SetCardInfo("Sphere of Grace", 49, Rarity.UNCOMMON, mage.cards.s.SphereOfGrace.class, RETRO_ART));
        cards.add(new SetCardInfo("Sphere of Law", 50, Rarity.UNCOMMON, mage.cards.s.SphereOfLaw.class, RETRO_ART));
        cards.add(new SetCardInfo("Sphere of Reason", 51, Rarity.UNCOMMON, mage.cards.s.SphereOfReason.class, RETRO_ART));
        cards.add(new SetCardInfo("Sphere of Truth", 52, Rarity.UNCOMMON, mage.cards.s.SphereOfTruth.class, RETRO_ART));
        cards.add(new SetCardInfo("Spiritualize", 53, Rarity.UNCOMMON, mage.cards.s.Spiritualize.class, RETRO_ART));
        cards.add(new SetCardInfo("Springing Tiger", 272, Rarity.COMMON, mage.cards.s.SpringingTiger.class, RETRO_ART));
        cards.add(new SetCardInfo("Squirrel Mob", 273, Rarity.RARE, mage.cards.s.SquirrelMob.class, RETRO_ART));
        cards.add(new SetCardInfo("Squirrel Nest", 274, Rarity.UNCOMMON, mage.cards.s.SquirrelNest.class, RETRO_ART));
        cards.add(new SetCardInfo("Stalking Bloodsucker", 163, Rarity.RARE, mage.cards.s.StalkingBloodsucker.class, RETRO_ART));
        cards.add(new SetCardInfo("Standstill", 102, Rarity.UNCOMMON, mage.cards.s.Standstill.class, RETRO_ART));
        cards.add(new SetCardInfo("Steam Vines", 223, Rarity.UNCOMMON, mage.cards.s.SteamVines.class, RETRO_ART));
        cards.add(new SetCardInfo("Steamclaw", 310, Rarity.UNCOMMON, mage.cards.s.Steamclaw.class, RETRO_ART));
        cards.add(new SetCardInfo("Still Life", 275, Rarity.UNCOMMON, mage.cards.s.StillLife.class, RETRO_ART));
        cards.add(new SetCardInfo("Stone-Tongue Basilisk", 276, Rarity.RARE, mage.cards.s.StoneTongueBasilisk.class, RETRO_ART));
        cards.add(new SetCardInfo("Sungrass Egg", 311, Rarity.UNCOMMON, mage.cards.s.SungrassEgg.class, RETRO_ART));
        cards.add(new SetCardInfo("Sungrass Prairie", 328, Rarity.RARE, mage.cards.s.SungrassPrairie.class, RETRO_ART));
        cards.add(new SetCardInfo("Swamp", 339, Rarity.LAND, mage.cards.basiclands.Swamp.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 340, Rarity.LAND, mage.cards.basiclands.Swamp.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 341, Rarity.LAND, mage.cards.basiclands.Swamp.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Swamp", 342, Rarity.LAND, mage.cards.basiclands.Swamp.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Sylvan Might", 277, Rarity.UNCOMMON, mage.cards.s.SylvanMight.class, RETRO_ART));
        cards.add(new SetCardInfo("Syncopate", 103, Rarity.COMMON, mage.cards.s.Syncopate.class, RETRO_ART));
        cards.add(new SetCardInfo("Tainted Pact", 164, Rarity.RARE, mage.cards.t.TaintedPact.class, RETRO_ART));
        cards.add(new SetCardInfo("Tarnished Citadel", 329, Rarity.RARE, mage.cards.t.TarnishedCitadel.class, RETRO_ART));
        cards.add(new SetCardInfo("Tattoo Ward", 54, Rarity.UNCOMMON, mage.cards.t.TattooWard.class, RETRO_ART));
        cards.add(new SetCardInfo("Terravore", 278, Rarity.RARE, mage.cards.t.Terravore.class, RETRO_ART));
        cards.add(new SetCardInfo("Testament of Faith", 55, Rarity.UNCOMMON, mage.cards.t.TestamentOfFaith.class, RETRO_ART));
        cards.add(new SetCardInfo("Thaumatog", 295, Rarity.UNCOMMON, mage.cards.t.Thaumatog.class, RETRO_ART));
        cards.add(new SetCardInfo("Thermal Blast", 224, Rarity.COMMON, mage.cards.t.ThermalBlast.class, RETRO_ART));
        cards.add(new SetCardInfo("Think Tank", 104, Rarity.UNCOMMON, mage.cards.t.ThinkTank.class, RETRO_ART));
        cards.add(new SetCardInfo("Thought Devourer", 105, Rarity.RARE, mage.cards.t.ThoughtDevourer.class, RETRO_ART));
        cards.add(new SetCardInfo("Thought Eater", 106, Rarity.UNCOMMON, mage.cards.t.ThoughtEater.class, RETRO_ART));
        cards.add(new SetCardInfo("Thought Nibbler", 107, Rarity.COMMON, mage.cards.t.ThoughtNibbler.class, RETRO_ART));
        cards.add(new SetCardInfo("Timberland Ruins", 330, Rarity.COMMON, mage.cards.t.TimberlandRuins.class, RETRO_ART));
        cards.add(new SetCardInfo("Time Stretch", 108, Rarity.RARE, mage.cards.t.TimeStretch.class, RETRO_ART));
        cards.add(new SetCardInfo("Tireless Tribe", 56, Rarity.COMMON, mage.cards.t.TirelessTribe.class, RETRO_ART));
        cards.add(new SetCardInfo("Tombfire", 165, Rarity.RARE, mage.cards.t.Tombfire.class, RETRO_ART));
        cards.add(new SetCardInfo("Touch of Invisibility", 109, Rarity.COMMON, mage.cards.t.TouchOfInvisibility.class, RETRO_ART));
        cards.add(new SetCardInfo("Traumatize", 110, Rarity.RARE, mage.cards.t.Traumatize.class, RETRO_ART));
        cards.add(new SetCardInfo("Traveling Plague", 166, Rarity.RARE, mage.cards.t.TravelingPlague.class, RETRO_ART));
        cards.add(new SetCardInfo("Treetop Sentinel", 111, Rarity.UNCOMMON, mage.cards.t.TreetopSentinel.class, RETRO_ART));
        cards.add(new SetCardInfo("Tremble", 225, Rarity.COMMON, mage.cards.t.Tremble.class, RETRO_ART));
        cards.add(new SetCardInfo("Twigwalker", 279, Rarity.UNCOMMON, mage.cards.t.Twigwalker.class, RETRO_ART));
        cards.add(new SetCardInfo("Unifying Theory", 112, Rarity.RARE, mage.cards.u.UnifyingTheory.class, RETRO_ART));
        cards.add(new SetCardInfo("Upheaval", 113, Rarity.RARE, mage.cards.u.Upheaval.class, RETRO_ART));
        cards.add(new SetCardInfo("Vampiric Dragon", 296, Rarity.RARE, mage.cards.v.VampiricDragon.class, RETRO_ART));
        cards.add(new SetCardInfo("Verdant Succession", 280, Rarity.RARE, mage.cards.v.VerdantSuccession.class, RETRO_ART));
        cards.add(new SetCardInfo("Vivify", 281, Rarity.UNCOMMON, mage.cards.v.Vivify.class, RETRO_ART));
        cards.add(new SetCardInfo("Volcanic Spray", 226, Rarity.UNCOMMON, mage.cards.v.VolcanicSpray.class, RETRO_ART));
        cards.add(new SetCardInfo("Volley of Boulders", 227, Rarity.RARE, mage.cards.v.VolleyOfBoulders.class, RETRO_ART));
        cards.add(new SetCardInfo("Wayward Angel", 57, Rarity.RARE, mage.cards.w.WaywardAngel.class, RETRO_ART));
        cards.add(new SetCardInfo("Werebear", 282, Rarity.COMMON, mage.cards.w.Werebear.class, RETRO_ART));
        cards.add(new SetCardInfo("Whipkeeper", 228, Rarity.UNCOMMON, mage.cards.w.Whipkeeper.class, RETRO_ART));
        cards.add(new SetCardInfo("Whispering Shade", 167, Rarity.COMMON, mage.cards.w.WhisperingShade.class, RETRO_ART));
        cards.add(new SetCardInfo("Wild Mongrel", 283, Rarity.COMMON, mage.cards.w.WildMongrel.class, RETRO_ART));
        cards.add(new SetCardInfo("Woodland Druid", 284, Rarity.COMMON, mage.cards.w.WoodlandDruid.class, RETRO_ART));
        cards.add(new SetCardInfo("Words of Wisdom", 114, Rarity.COMMON, mage.cards.w.WordsOfWisdom.class, RETRO_ART));
        cards.add(new SetCardInfo("Zombie Assassin", 168, Rarity.COMMON, mage.cards.z.ZombieAssassin.class, RETRO_ART));
        cards.add(new SetCardInfo("Zombie Cannibal", 169, Rarity.COMMON, mage.cards.z.ZombieCannibal.class, RETRO_ART));
        cards.add(new SetCardInfo("Zombie Infestation", 170, Rarity.UNCOMMON, mage.cards.z.ZombieInfestation.class, RETRO_ART));
        cards.add(new SetCardInfo("Zombify", 171, Rarity.UNCOMMON, mage.cards.z.Zombify.class, RETRO_ART_USE_VARIOUS));
        cards.add(new SetCardInfo("Zombify", "171+", Rarity.UNCOMMON, mage.cards.z.Zombify.class, NON_FULL_USE_VARIOUS));
        cards.add(new SetCardInfo("Zoologist", 285, Rarity.RARE, mage.cards.z.Zoologist.class, RETRO_ART));
    }

    @Override
    public BoosterCollator createCollator() {
        return new OdysseyCollator();
    }
}

// Booster collation info from https://www.lethe.xyz/mtg/collation/ody.html
// Using US collation - commons only
class OdysseyCollator implements BoosterCollator {

    private final CardRun commonA = new CardRun(true, "189", "93", "269", "136", "44", "199", "59", "233", "119", "14", "213", "109", "262", "145", "30", "185", "93", "268", "148", "56", "189", "109", "284", "136", "14", "199", "99", "269", "154", "44", "185", "87", "284", "145", "56", "225", "99", "262", "154", "16", "213", "59", "268", "119", "30", "225", "87", "233", "148", "16");
    private final CardRun commonB = new CardRun(true, "184", "312", "251", "150", "38", "172", "330", "247", "115", "7", "324", "95", "272", "151", "3", "314", "83", "251", "167", "312", "172", "103", "272", "115", "314", "190", "70", "246", "324", "27", "196", "103", "247", "325", "38", "184", "95", "246", "151", "7", "196", "70", "325", "150", "27", "190", "83", "330", "167", "3");
    private final CardRun commonC = new CardRun(true, "45", "140", "194", "63", "237", "8", "138", "224", "72", "253", "46", "139", "175", "98", "237", "45", "131", "181", "63", "263", "22", "125", "215", "65", "283", "25", "131", "193", "74", "253", "22", "138", "194", "98", "263", "36", "140", "181", "65", "282", "8", "139", "215", "74", "240", "25", "156", "193", "91", "282", "46", "125", "175", "72", "283", "36", "156", "224", "91", "240");
    private final CardRun commonD = new CardRun(true, "60", "232", "168", "42", "202", "114", "265", "130", "41", "173", "84", "252", "169", "40", "219", "60", "249", "124", "15", "202", "107", "252", "146", "41", "211", "114", "232", "124", "35", "217", "107", "238", "130", "15", "178", "100", "264", "137", "42", "217", "84", "238", "168", "5", "178", "81", "249", "146", "40", "211", "100", "265", "137", "5", "219", "81", "264", "169", "35", "173");
    private final CardRun uncommon = new CardRun(false, "4", "62", "6", "64", "66", "67", "68", "313", "176", "177", "230", "11", "12", "118", "315", "122", "316", "71", "317", "76", "123", "78", "235", "299", "128", "236", "80", "183", "129", "239", "186", "188", "191", "133", "134", "135", "86", "195", "23", "241", "244", "144", "88", "200", "301", "201", "289", "31", "203", "147", "250", "302", "206", "304", "34", "254", "258", "37", "322", "260", "155", "306", "291", "261", "94", "214", "292", "96", "97", "216", "43", "266", "158", "159", "307", "293", "160", "308", "221", "161", "162", "309", "270", "47", "222", "48", "49", "50", "51", "52", "53", "274", "102", "310", "223", "275", "311", "277", "54", "55", "295", "104", "106", "111", "279", "281", "226", "228", "170", "171");
    private final CardRun rare = new CardRun(false, "58", "1", "61", "2", "174", "286", "9", "10", "69", "229", "116", "179", "117", "180", "120", "121", "231", "13", "297", "73", "75", "182", "298", "234", "77", "318", "79", "126", "319", "127", "287", "17", "320", "18", "82", "19", "20", "187", "21", "132", "192", "85", "24", "141", "242", "142", "143", "243", "197", "288", "245", "300", "198", "26", "28", "248", "29", "204", "32", "149", "205", "303", "207", "152", "321", "208", "33", "290", "255", "256", "209", "153", "257", "259", "210", "305", "212", "89", "90", "92", "323", "39", "157", "218", "220", "267", "326", "294", "101", "327", "271", "273", "163", "276", "328", "164", "329", "278", "105", "108", "165", "110", "166", "112", "113", "296", "280", "227", "57", "285");

    // either A then B, or B then A
    private final BoosterStructure AAABB = new BoosterStructure(
            commonA, commonA, commonA,
            commonB, commonB
    );
    private final BoosterStructure AABBB = new BoosterStructure(
            commonA, commonA,
            commonB, commonB, commonB
    );
    private final BoosterStructure AAAAB = new BoosterStructure(
            commonA, commonA, commonA, commonA,
            commonB
    );
    private final BoosterStructure ABBBB = new BoosterStructure(
            commonA,
            commonB, commonB, commonB, commonB
    );
    private final BoosterStructure BBBAA = new BoosterStructure(
            commonB, commonB, commonB,
            commonA, commonA
    );
    private final BoosterStructure BBAAA = new BoosterStructure(
            commonB, commonB,
            commonA, commonA, commonA
    );
    private final BoosterStructure BBBBA = new BoosterStructure(
            commonB, commonB, commonB, commonB,
            commonA
    );
    private final BoosterStructure BAAAA = new BoosterStructure(
            commonB,
            commonA, commonA, commonA, commonA
    );

    // either C then D, or D then C
    private final BoosterStructure CCCDDD = new BoosterStructure(
            commonC, commonC, commonC,
            commonD, commonD, commonD
    );
    private final BoosterStructure CCCCDD = new BoosterStructure(
            commonC, commonC, commonC, commonC,
            commonD, commonD
    );
    private final BoosterStructure CCDDDD = new BoosterStructure(
            commonC, commonC,
            commonD, commonD, commonD, commonD
    );
    private final BoosterStructure DDDCCC = new BoosterStructure(
            commonD, commonD, commonD,
            commonC, commonC, commonC
    );
    private final BoosterStructure DDDDCC = new BoosterStructure(
            commonD, commonD, commonD, commonD,
            commonC, commonC
    );
    private final BoosterStructure DDCCCC = new BoosterStructure(
            commonD, commonD,
            commonC, commonC, commonC, commonC
    );

    private final BoosterStructure U3 = new BoosterStructure(uncommon, uncommon, uncommon);
    private final BoosterStructure R1 = new BoosterStructure(rare);

    // no definitive ratio here, just "most" packs 3-2
    private final RarityConfiguration commonRunsAB = new RarityConfiguration(
        AAAAB,
        AAABB, AAABB, AAABB, AAABB, AAABB, AAABB, AAABB, AAABB, AAABB,
        AABBB, AABBB, AABBB, AABBB, AABBB, AABBB, AABBB, AABBB, AABBB,
        ABBBB,
        BBBBA,
        BBBAA, BBBAA, BBBAA, BBBAA, BBBAA, BBBAA, BBBAA, BBBAA, BBBAA,
        BBAAA, BBAAA, BBAAA, BBAAA, BBAAA, BBAAA, BBAAA, BBAAA, BBAAA,
        BAAAA
    );

    // similar collation structure for INV suggests some evidence for 1/6 packs 4-2
    private final RarityConfiguration commonRunsCD = new RarityConfiguration(
        CCCCDD,
        CCCDDD, CCCDDD, CCCDDD, CCCDDD, CCCDDD,
        CCCDDD, CCCDDD, CCCDDD, CCCDDD, CCCDDD,
        CCDDDD,
        DDDDCC,
        DDDCCC, DDDCCC, DDDCCC, DDDCCC, DDDCCC,
        DDDCCC, DDDCCC, DDDCCC, DDDCCC, DDDCCC,
        DDCCCC
    );

    private final RarityConfiguration uncommonRuns = new RarityConfiguration(U3);
    private final RarityConfiguration rareRuns = new RarityConfiguration(R1);

    @Override
    public List<String> makeBooster() {
        List<String> booster = new ArrayList<>();
        // either A/B or C/D can be first in the pack
        if (RandomUtil.nextBoolean()) {
            booster.addAll(commonRunsAB.getNext().makeRun());
            booster.addAll(commonRunsCD.getNext().makeRun());
        } else {
            booster.addAll(commonRunsCD.getNext().makeRun());
            booster.addAll(commonRunsAB.getNext().makeRun());
        }
        booster.addAll(uncommonRuns.getNext().makeRun());
        booster.addAll(rareRuns.getNext().makeRun());
        return booster;
    }
}
