package com.pickaxe;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class PickaxeCraft {
    public static void registerRecipes(JavaPlugin plugin) {
        add(plugin, "kimcuong", PickaxeGear.makePickaxe("kimcuong"), Material.DIAMOND);
        add(plugin, "netherite", PickaxeGear.makePickaxe("netherite"), Material.NETHERITE_INGOT);
        add(plugin, "lucbao", PickaxeGear.makePickaxe("lucbao"), Material.EMERALD);
        add(plugin, "tim", PickaxeGear.makePickaxe("tim"), Material.AMETHYST_BLOCK);
        add(plugin, "lua", PickaxeGear.makePickaxe("lua"), Material.BLAZE_ROD);
        add(plugin, "bang", PickaxeGear.makePickaxe("bang"), Material.PACKED_ICE);
        add(plugin, "huvo", PickaxeGear.makePickaxe("huvo"), Material.ENDER_PEARL);
        add(plugin, "loi", PickaxeGear.makePickaxe("loi"), Material.LIGHTNING_ROD);
        add(plugin, "rong", PickaxeGear.makePickaxe("rong"), Material.DRAGON_BREATH);
        add(plugin, "than", PickaxeGear.makePickaxe("than"), Material.NETHER_STAR);
        add(plugin, "memmai", PickaxeGear.makePickaxe("memmai"), Material.AMETHYST_SHARD);
    }

    private static void add(JavaPlugin p, String key, org.bukkit.inventory.ItemStack res, Material mat) {
        ShapedRecipe r = new ShapedRecipe(new NamespacedKey(p, "cup_" + key), res);
        r.shape("MMM", " S ", " S ");
        r.setIngredient('M', mat);
        r.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(r);
    }
}
