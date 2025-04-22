package com.boggy.forceServerList.listener;

import com.boggy.forceServerList.ForceServerList;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import java.util.Objects;

public class JoinListener implements Listener {

    ForceServerList plugin;

    public JoinListener(ForceServerList plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onJoin(AsyncPlayerPreLoginEvent e) {
        if (e.getAddress().getHostAddress() == null) return;
        String address = e.getAddress().getHostAddress();

        if (plugin.getPlayerManager().isAddedToServerList(address)) return;

        e.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, Component.text(ChatColor.translateAlternateColorCodes('&',
                Objects.requireNonNull(plugin.getConfig().getString("kick-message")))));
    }

}
