package com.pickaxe;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import java.util.*;

public class PickaxeGear {
    public static ItemStack makePickaxe(String type) {
        if (type.equals("memmai")) {
            ItemStack it = new ItemStack(Material.DIAMOND_PICKAXE);
            ItemMeta meta = it.getItemMeta();
            meta.setDisplayName("§a§lCUP MEM MAI");
            meta.setLore(Arrays.asList(
                "§7Cup dac biet!",
                "§aCo Mem Mai (Silk Touch)",
                "§cKHONG co Gia Tai (Fortune)",
                "§eDao block nguyen ven!",
                "§6Cam len de chay nhanh!"
            ));
            meta.setUnbreakable(true);
            meta.addEnchant(Enchantment.EFFICIENCY, 8, true);
            meta.addEnchant(Enchantment.SILK_TOUCH, 1, true);
            meta.addEnchant(Enchantment.UNBREAKING, 5, true);
            meta.addEnchant(Enchantment.MENDING, 1, true);
            it.setItemMeta(meta);
            return it;
        }

        Material m = Material.DIAMOND_PICKAXE;
        String name = "§b§lCUP KIM CUONG";
        int eff = 5, fortune = 3, unb = 3;
        String loreFortune = "§aGia Tai III";
        if (type.equals("netherite")) { m = Material.NETHERITE_PICKAXE; name = "§4§lCUP NETHERITE"; eff = 6; fortune = 3; unb = 5; loreFortune = "§aGia Tai III"; }
        if (type.equals("lucbao")) { m = Material.DIAMOND_PICKAXE; name = "§a§lCUP LUC BAO"; eff = 6; fortune = 4; unb = 5; loreFortune = "§aGia Tai IV"; }
        if (type.equals("tim")) { m = Material.DIAMOND_PICKAXE; name = "§d§lCUP TIM"; eff = 7; fortune = 4; unb = 5; loreFortune = "§aGia Tai IV"; }
        if (type.equals("lua")) { m = Material.NETHERITE_PICKAXE; name = "§c§lCUP LUA"; eff = 7; fortune = 4; unb = 5; loreFortune = "§aGia Tai IV"; }
        if (type.equals("bang")) { m = Material.NETHERITE_PICKAXE; name = "§b§lCUP BANG"; eff = 7; fortune = 4; unb = 5; loreFortune = "§aGia Tai IV"; }
        if (type.equals("huvo")) { m = Material.NETHERITE_PICKAXE; name = "§5§lCUP HU VO"; eff = 8; fortune = 5; unb = 5; loreFortune = "§aGia Tai V"; }
        if (type.equals("loi")) { m = Material.NETHERITE_PICKAXE; name = "§e§lCUP LOI THAN"; eff = 8; fortune = 5; unb = 5; loreFortune = "§aGia Tai V"; }
        if (type.equals("rong")) { m = Material.NETHERITE_PICKAXE; name = "§5§lCUP RONG"; eff = 9; fortune = 5; unb = 10; loreFortune = "§aGia Tai V"; }
        if (type.equals("than")) { m = Material.NETHERITE_PICKAXE; name = "§6§lCUP THAN"; eff = 10; fortune = 5; unb = 10; loreFortune = "§aGia Tai V - MAX"; }

        ItemStack it = new ItemStack(m);
        ItemMeta meta = it.getItemMeta();
        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(
            "§7Cup cap: " + type,
            "§eHieu suat: " + eff,
            loreFortune,
            "§cKhong co Mem Mai",
            "§6Cam len de chay nhanh!"
        ));
        meta.setUnbreakable(true);
        meta.addEnchant(Enchantment.EFFICIENCY, eff, true);
        meta.addEnchant(Enchantment.FORTUNE, fortune, true);
        meta.addEnchant(Enchantment.UNBREAKING, unb, true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        if (type.equals("lua")) meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        it.setItemMeta(meta);
        return it;
    }
}
