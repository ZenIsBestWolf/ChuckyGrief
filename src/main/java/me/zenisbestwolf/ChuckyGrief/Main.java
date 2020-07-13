package me.zenisbestwolf.ChuckyGrief;

import org.bukkit.plugin.java.JavaPlugin;

import me.zenisbestwolf.ChuckyGrief.Listeners.*;

public class Main extends JavaPlugin{
	public void onEnable() {
		new Place(this);
		new Break(this);
	}
}