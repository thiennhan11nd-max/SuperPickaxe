package com.pickaxe;

import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class PickaxeCommand implements CommandExecutor {
    @Override public boolean onCommand(CommandSender s, Command cmd, String l, String[] a) {
        if (!(s instanceof Player p)) return true;
        if (cmd.getName().equals("cuplist")) {
            p.sendMessage("§6=== DANH SACH CUP - TU KIM CUONG TRO LEN ===");
            p.sendMessage("§b1. /cup kimcuong - Cup Kim Cuong (Fortune III)");
            p.sendMessage("§42. /cup netherite - Cup Netherite (Fortune III)");
            p.sendMessage("§a3. /cup lucbao - Cup Luc Bao (Fortune IV)");
            p.sendMessage("§d4. /cup tim - Cup Tim (Fortune IV)");
            p.sendMessage("§c5. /cup lua - Cup Lua (Fortune IV)");
            p.sendMessage("§b6. /cup bang - Cup Bang (Fortune IV)");
            p.sendMessage("§57. /cup huvo - Cup Hu Vo (Fortune V)");
            p.sendMessage("§e8. /cup loi - Cup Loi Than (Fortune V)");
            p.sendMessage("§59. /cup rong - Cup Rong (Fortune V)");
            p.sendMessage("§610. /cup than - Cup Than (Fortune V MAX)");
            p.sendMessage("§a⭐ /cup memmai - Cup Mem Mai (Silk Touch, Khong Fortune)");
            return true;
        }
        if (cmd.getName().equals("cup")) {
            if (a.length == 0) { p.sendMessage("§e/cup <kimcuong|netherite|lucbao|tim|lua|bang|huvo|loi|rong|than|memmai>"); return true; }
            String t = a[0].toLowerCase();
            if (t.equals("1")) t = "kimcuong";
            if (t.equals("2")) t = "netherite";
            if (t.equals("3")) t = "lucbao";
            if (t.equals("4")) t = "tim";
            if (t.equals("5")) t = "lua";
            if (t.equals("6")) t = "bang";
            if (t.equals("7")) t = "huvo";
            if (t.equals("8")) t = "loi";
            if (t.equals("9")) t = "rong";
            if (t.equals("10")) t = "than";
            p.getInventory().addItem(PickaxeGear.makePickaxe(t));
            p.sendMessage("§aDa nhan cup: " + t);
            return true;
        }
        return true;
    }
}
