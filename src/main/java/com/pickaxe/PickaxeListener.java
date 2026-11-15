package com.pickaxe;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class PickaxeListener implements Listener {
    @EventHandler
    public void onHold(PlayerItemHeldEvent e) {
        Player p = e.getPlayer();
        ItemStack it = p.getInventory().getItem(e.getNewSlot());
        if (it == null || it.getItemMeta() == null || it.getItemMeta().getDisplayName() == null) return;
        if (!it.getItemMeta().getDisplayName().contains("CUP")) return;
        String name = it.getItemMeta().getDisplayName();
        int speedLevel = 0;
        if (name.contains("LUC BAO") || name.contains("TIM")) speedLevel = 1;
        if (name.contains("LUA") || name.contains("BANG") || name.contains("MEM MAI")) speedLevel = 1;
        if (name.contains("HU VO") || name.contains("LOI THAN")) speedLevel = 2;
        if (name.contains("RONG") || name.contains("THAN")) speedLevel = 2;
        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 200, speedLevel, false, false));
        p.addPotionEffect(new PotionEffect(PotionEffectType.HASTE, 200, 1, false, false));
        p.sendMessage("§aDa cam " + name + " §a- Toc do tang!");
    }
}
