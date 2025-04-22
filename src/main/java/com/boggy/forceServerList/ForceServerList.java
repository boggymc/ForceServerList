package com.boggy.forceServerList;

import com.boggy.forceServerList.listener.JoinListener;
import com.boggy.forceServerList.listener.PingListener;
import com.boggy.forceServerList.manager.PlayerManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class ForceServerList extends JavaPlugin {

    PlayerManager playerManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        this.playerManager = new PlayerManager();

        Bukkit.getPluginManager().registerEvents(new PingListener(this), this);
        Bukkit.getPluginManager().registerEvents(new JoinListener(this), this);
    }

    public PlayerManager getPlayerManager() {
        return playerManager;
    }
}
