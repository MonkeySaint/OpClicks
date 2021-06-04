package ca.elimin8.opclicks.Events;

import ca.elimin8.opclicks.Opclicks;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class onJoinOrLeave implements Listener {

    public static Map<UUID, Integer> taskID = new HashMap<UUID, Integer>();
    Opclicks plugin;
    public onJoinOrLeave(Opclicks opclicks) {
        plugin = opclicks;
    }
    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        if (!(onClick.clicks.containsKey(p.getUniqueId()))){
            onClick.clicks.put(p.getUniqueId(), 0);
        }
        taskID.put(p.getUniqueId(), Bukkit.getScheduler().scheduleSyncRepeatingTask(plugin, new Runnable() {
            @Override
            public void run() {
                p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(String.valueOf(onClick.clicks.get(p.getUniqueId()))));
            }
        }, 0, 1));
    }
    @EventHandler
    public void onLeave(PlayerQuitEvent e) {
        Bukkit.getScheduler().cancelTask(taskID.get(e.getPlayer().getUniqueId()));
    }
}
