package ca.elimin8.opclicks;

import ca.elimin8.opclicks.Events.onClick;
import ca.elimin8.opclicks.Events.onJoinOrLeave;
import ca.elimin8.opclicks.commands.toggleopclicks;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


public final class Opclicks extends JavaPlugin {
    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("opclicks").setExecutor(new toggleopclicks());
        getServer().getPluginManager().registerEvents(new onClick(), this);
        getServer().getPluginManager().registerEvents(new onJoinOrLeave(this), this);
        for (Player p : Bukkit.getOnlinePlayers()) {
            onClick.clicks.put(p.getUniqueId(), 0);
            onJoinOrLeave.taskID.put(p.getUniqueId(), Bukkit.getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
                @Override
                public void run() {
                    p.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(String.valueOf(onClick.clicks.get(p.getUniqueId()))));
                }
            }, 0, 1));
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
