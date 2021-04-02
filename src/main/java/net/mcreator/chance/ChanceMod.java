/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package net.mcreator.chance;

import org.bukkit.plugin.java.JavaPlugin;

import net.mcreator.chance.procedures.ChanceCommandExecutedProcedure;
import net.mcreator.chance.commands.Chance;

public class ChanceMod extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("Chance").setExecutor(new Chance());
		getServer().getPluginManager().registerEvents(new ChanceCommandExecutedProcedure(), this);
	}

	@Override
	public void onDisable() {
	}
}
