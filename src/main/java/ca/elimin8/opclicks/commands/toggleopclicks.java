package ca.elimin8.opclicks.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class toggleopclicks implements CommandExecutor {
    public static boolean enabled = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender.hasPermission("opclicks.toggle")) {
            if (enabled) {
                enabled = false;
                sender.sendMessage("§4Disabled OpClicks");
                return true;
            }
                enabled = true;
                sender.sendMessage("§2Enabled OpClicks");
        }
        return false;
    }
}
