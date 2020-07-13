package me.zenisbestwolf.ChuckyGrief.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import me.zenisbestwolf.ChuckyGrief.Main;

public class Place implements Listener {
    private static Main plugin;
    public Place(Main plugin) {
        this.plugin = plugin;
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
    
    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        String[] triggeredBlocks = {"TNT"};
        for (int i = 0; i < triggeredBlocks.length; i++) {
            if (e.getBlock().getType().toString() == triggeredBlocks[i])
            Bukkit.broadcast("The user " + e.getPlayer().getName() + " placed a triggered block: " + e.getBlock().getType().toString(), "chuckygrief.receive");
        }
    }
}