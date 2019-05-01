package fr.benzoogataga.goldenparticles;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class GoldenParticles extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Plugin activated (GoldenParticles)");
		PluginManager pm = getServer().getPluginManager();
		pm.registerEvents(new BloodParticle(this), this);
	}
	
	@Override
	public void onDisable() {
		System.out.println("Plugin desactivated (GoldenParticles)");
	}

}