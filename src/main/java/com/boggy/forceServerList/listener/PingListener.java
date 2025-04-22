package com.boggy.forceServerList.listener;

import com.boggy.forceServerList.ForceServerList;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.Arrays;

public class PingListener implements Listener {

    ForceServerList plugin;

    public PingListener(ForceServerList plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onServerListPing(ServerListPingEvent e) {
        plugin.getPlayerManager().addAddress(e.getAddress().getHostAddress());
    }

}
