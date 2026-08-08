package net.dracus.daotsyringes.config;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;

public class ModGameRules {
    public static final GameRules.Key<GameRules.BooleanRule> ANNOUNCE_SYRINGE_USE =
            GameRuleRegistry.register(
                    "announceSyringeUse",
                    GameRules.Category.MISC,
                    GameRuleFactory.createBooleanRule(false) //default value
            );

    public static void register() {

    }
}
