package com.rydenvr.crowbar;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;

public class CrowbarPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Ryden's Crowbar enabled!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command,
                             String label, String[] args) {

        if (!command.getName().equalsIgnoreCase("crowbar")) {
            return false;
        }

        if (!sender.hasPermission("rydenscrowbar.admin")) {
            sender.sendMessage(ChatColor.RED + "Only admins can use this command!");
            return true;
        }

        if (!(sender instanceof Player)) {
            sender.sendMessage("Players only!");
            return true;
        }

        Player player = (Player) sender;

        ItemStack crowbar = new ItemStack(Material.IRON_HOE);
        ItemMeta meta = crowbar.getItemMeta();

        meta.setDisplayName(ChatColor.GRAY + "" + ChatColor.BOLD + "Crowbar");
        meta.setLore(Arrays.asList(
            ChatColor.DARK_GRAY + "Ryden's Crowbar",
            ChatColor.GRAY + "Admin-only tool"
        ));

        crowbar.setItemMeta(meta);
        player.getInventory().addItem(crowbar);
        player.sendMessage(ChatColor.GREEN + "You received Ryden's Crowbar!");

        return true;
    }
}
