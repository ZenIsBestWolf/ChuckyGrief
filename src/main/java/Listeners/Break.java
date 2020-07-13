package me.zenisbestwolf.ChuckyGrief.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import me.zenisbestwolf.ChuckyGrief.Main;

public class Break implements Listener {
    private static Main plugin;
    public Break(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    
    @EventHandler
    public void onBreak(BlockBreakEvent e) {
        String[] triggeredBlocks = {"DIAMOND_ORE", "ANCIENT_DEBRIS"};
        for (int i = 0; i < triggeredBlocks.length; i++) {
            if (e.getBlock().getType().toString() == triggeredBlocks[i])
            Bukkit.broadcast("The user " + e.getPlayer().getName() + " broke a triggered block: " + e.getBlock().getType().toString(), "chuckygrief.receive");
        }
    }
}