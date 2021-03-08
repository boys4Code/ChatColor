package com.boys4code.plugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Enabled!");
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onChat(PlayerChatEvent e){
        e.setCancelled(true);
        if(e.getPlayer().hasPermission("*")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.RED + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.black")) {
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.BLACK + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.darkgreen")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.DARK_GREEN + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.darkred")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.DARK_RED + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.gold")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.GOLD + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.darkgray")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.DARK_GRAY + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.green")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.GREEN + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.red")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.RED + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.yellow")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.YELLOW + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.darkblue")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.DARK_BLUE + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.darkaqua")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.DARK_AQUA + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.darkpurple")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.DARK_PURPLE + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.gray")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.GRAY + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.blue")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.BLUE + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.aqua")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.AQUA + e.getMessage());
        }else if(e.getPlayer().hasPermission("chatcolor.lightpurple")){
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.LIGHT_PURPLE + e.getMessage());
        }else{
            Bukkit.broadcastMessage(e.getPlayer().getDisplayName() + ChatColor.WHITE + " » " + ChatColor.WHITE + e.getMessage());
        }
    }

}
