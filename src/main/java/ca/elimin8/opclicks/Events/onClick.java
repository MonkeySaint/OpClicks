package ca.elimin8.opclicks.Events;

import ca.elimin8.opclicks.commands.toggleopclicks;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public class onClick implements Listener {
    public static Map<UUID, Integer> clicks = new HashMap<UUID, Integer>();
    @EventHandler
    public void onClick (PlayerInteractEvent e) {
        if (toggleopclicks.enabled) {
            Player p = e.getPlayer();
            if (e.getAction().equals(Action.LEFT_CLICK_AIR) || e.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
                clicks.put(p.getUniqueId(), clicks.get(p.getUniqueId()) + 1);
                if (clicks.get(p.getUniqueId()) == 1) {
                    p.sendTitle("§bTIER UPGRADED", "You are now in Tier I");
                }
                if (clicks.get(p.getUniqueId()) == 101) {
                    p.sendTitle("§bTIER UPGRADED", "You are now in Tier II");
                }
                if (clicks.get(p.getUniqueId()) == 301) {
                    p.sendTitle("§bTIER UPGRADED", "You are now in Tier III");
                }
                if (clicks.get(p.getUniqueId()) == 801) {
                    p.sendTitle("§bTIER UPGRADED", "You are now in Tier IV");
                }
                if (clicks.get(p.getUniqueId()) > 0 & clicks.get(p.getUniqueId()) < 101) {
                    int rand = new Random().nextInt((25 - 1) + 1) + 1;
                    switch (rand) {
                        case 1:
                            giveItem(isgen(Material.HOPPER), p, 1);
                            break;
                        case 2:
                            giveItem(isgen(Material.WOODEN_SWORD), p, 1);
                            break;
                        case 3:
                            giveItem(isgen(Material.WOODEN_AXE), p, 1);
                            break;
                        case 4:
                            giveItem(isgen(Material.WOODEN_SHOVEL), p, 1);
                            break;
                        case 5:
                            giveItem(isgen(Material.WOODEN_PICKAXE), p, 1);
                            break;
                        case 6:
                            giveItem(isgen(Material.STONE_SWORD, 1, Enchantment.BINDING_CURSE), p, 1);
                            break;
                        case 7:
                            giveItem(isgen(Material.STICK), p, 1);
                            break;
                        case 8:
                            giveItem(isgen(Material.DEAD_BUSH), p, 1);
                            break;
                        case 9:
                            giveItem(isgen(Material.COAL), p, 1);
                            break;
                        case 10:
                            giveItem(isgen(Material.IRON_INGOT), p, 1);
                            break;
                        case 11:
                            giveItem(isgen(Material.COMMAND_BLOCK), p, 1);
                            break;
                        case 12:
                            giveItem(isgen(Material.WATER_BUCKET), p, 1);
                            break;
                        case 13:
                            giveItem(isgen(Material.BUCKET), p, 1);
                            break;
                        case 14:
                            giveItem(isgen(Material.APPLE), p, 1);
                            break;
                        case 15:
                            giveItem(isgen(Material.CAKE), p, 1);
                            break;
                        case 16:
                            giveItem(isgen(Material.FLOWER_POT), p, 1);
                            break;
                        case 17:
                            giveItem(isgen(Material.CRAFTING_TABLE), p, 1);
                            break;
                        case 18:
                            giveItem(isgen(Material.FURNACE), p, 1);
                            break;
                        case 19:
                            giveItem(isgen(Material.OAK_LOG), p, 1);
                            break;
                        case 20:
                            giveItem(isgen(Material.BIRCH_LOG), p, 1);
                            break;
                        case 21:
                            giveItem(isgen(Material.DANDELION), p, 1);
                            break;
                        case 22:
                            giveItem(isgen(Material.PINK_TULIP), p, 1);
                            break;
                        case 23:
                            giveItem(isgen(Material.WHITE_TULIP), p, 1);
                            break;
                        case 24:
                            giveItem(isgen(Material.POPPY), p, 1);
                            break;
                        case 25:
                            giveItem(isgen(Material.WITHER_ROSE), p, 1);
                            break;
                    }
                    return;
                }
                if (clicks.get(p.getUniqueId()) > 100 & clicks.get(p.getUniqueId()) < 301) {
                    int rand = new Random().nextInt((24 - 1) + 1) + 1;
                    switch (rand) {
                        case 1:
                            giveItem(isgen(Material.EMERALD), p, 1);
                            break;
                        case 2:
                            giveItem(isgen(Material.REDSTONE), p, 1);
                            break;
                        case 3:
                            giveItem(isgen(Material.GOLD_INGOT), p, 1);
                            break;
                        case 4:
                            giveItem(isgen(Material.GOLDEN_APPLE), p, 1);
                            break;
                        case 5:
                            giveItem(isgen(Material.LAVA_BUCKET), p, 1);
                            break;
                        case 6:
                            giveItem(isgen(Material.BUCKET), p, 1);
                            break;
                        case 7:
                            giveItem(isgen(Material.DIAMOND), p, 1);
                            break;
                        case 8:
                            giveItem(isgen(Material.NETHERRACK), p, 1);
                            break;
                        case 9:
                            giveItem(isgen(Material.END_STONE), p, 1);
                            break;
                        case 10:
                            giveItem(isgen(Material.CLAY), p, 1);
                            break;
                        case 11:
                            giveItem(isgen(Material.MELON_SLICE), p, 1);
                            break;
                        case 12:
                            giveItem(isgen(Material.COOKIE), p, 1);
                            break;
                        case 14:
                            giveItem(isgen(Material.DIAMOND_PICKAXE), p, 1);
                            break;
                        case 15:
                            giveItem(isgen(Material.DIAMOND_HOE), p, 1);
                            break;
                        case 16:
                            giveItem(isgen(Material.NETHERITE_HOE), p, 1);
                            break;
                        case 17:
                            giveItem(isgen(Material.WOODEN_HOE), p, 1);
                            break;
                        case 18:
                            giveItem(isgen(Material.IRON_SHOVEL), p, 1);
                            break;
                        case 19:
                            giveItem(isgen(Material.IRON_INGOT), p, 1);
                            break;
                        case 20:
                            giveItem(isgen(Material.OBSIDIAN), p, 1);
                            break;
                        case 21:
                            giveItem(isgen(Material.RED_WOOL), p, 1);
                            break;
                        case 22:
                            giveItem(isgen(Material.ORANGE_WOOL), p, 1);
                            break;
                        case 23:
                            giveItem(isgen(Material.BLUE_WOOL), p, 1);
                            break;
                        case 24:
                            giveItem(isgen(Material.LIME_WOOL), p, 1);
                            break;
                    }
                }
                if (clicks.get(p.getUniqueId()) > 300 & clicks.get(p.getUniqueId()) < 801) {
                    int rand = new Random().nextInt((11 - 1) + 1) + 1;
                    switch (rand) {
                        case 1:
                            giveItem(isgen(Material.DIAMOND_SHOVEL), p, 1);
                            break;
                        case 2:
                            giveItem(isgen(Material.DIAMOND_PICKAXE), p, 1);
                            break;
                        case 3:
                            giveItem(isgen(Material.DIAMOND_SWORD, 3, Enchantment.DAMAGE_ALL), p, 1);
                            break;
                        case 4:
                            giveItem(isgen(Material.STICK, 4, Enchantment.KNOCKBACK), p, 1);
                            break;
                        case 5:
                            giveItem(isgen(Material.DIAMOND), p, 1);
                            break;
                        case 6:
                            giveItem(isgen(Material.EMERALD), p, 1);
                            break;
                        case 7:
                            giveItem(isgen(Material.NETHERITE_SCRAP), p, 1);
                            break;
                        case 8:
                            giveItem(isgen(Material.ENCHANTING_TABLE), p, 1);
                            break;
                        case 9:
                            giveItem(isgen(Material.BOW), p, 1);
                            break;
                        case 10:
                            giveItem(isgen(Material.ARROW), p, 1);
                            break;
                        case 11:
                            giveItem(isgen(Material.FIRE_CHARGE, 4, Enchantment.FIRE_ASPECT), p, 1);
                            break;
                    }
                }
                if (clicks.get(p.getUniqueId()) > 800) {
                    int rand = new Random().nextInt((10 - 1) + 1) + 1;
                    switch (rand) {
                        case 1:
                            giveItem(NSSMF(), p, 1);
                            break;
                        case 2:
                            giveItem(isgen(Material.DIAMOND_PICKAXE, 10, Enchantment.DIG_SPEED, Enchantment.MENDING, Enchantment.DURABILITY), p, 1);
                            break;
                        case 3:
                            giveItem(isgen(Material.EXPERIENCE_BOTTLE), p, 1);
                            break;
                        case 4:
                            giveItem(isgen(Material.DIAMOND_HELMET, 4, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_FIRE), p, 1);
                            break;
                        case 5:
                            giveItem(isgen(Material.DIAMOND_CHESTPLATE, 4, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_FIRE), p, 1);
                            break;
                        case 6:
                            giveItem(isgen(Material.DIAMOND_LEGGINGS, 4, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_FIRE), p, 1);
                            break;
                        case 7:
                            giveItem(isgen(Material.DIAMOND_BOOTS, 4, Enchantment.PROTECTION_ENVIRONMENTAL, Enchantment.PROTECTION_FIRE), p, 1);
                            break;
                        case 8:
                            giveItem(isgen(Material.ENCHANTED_GOLDEN_APPLE), p, 1);
                            break;
                        case 9:
                            giveItem(isgen(Material.GOLDEN_APPLE), p, 1);
                            break;
                        case 10:
                            giveItem(isgen(Material.BEDROCK), p, 1);
                            break;
                    }
                }
            }
        }
    }
    public void giveItem(ItemStack item, Player p, int amount) {
        if (p.getInventory().firstEmpty() == -1) {
            Location loc = p.getLocation();
            World world = p.getWorld();
            for (int i = 0; i < amount; i++) {
                world.dropItemNaturally(loc, item);
            }
            return;
        }
        for (int i = 0; i < amount; i++) {
            p.getInventory().addItem(item);
        }
    }
    public ItemStack isgen(Material mat) {
        ItemStack item = new ItemStack(mat);
        return item;
    }
    public ItemStack isgen(Material mat, int Level, Enchantment... ench) {
        ItemStack itemStack = new ItemStack(mat);
        ItemMeta meta = itemStack.getItemMeta();
        for (Enchantment enchantment : ench) {
            meta.addEnchant(enchantment, Level, true);
        }
        itemStack.setItemMeta(meta);
        return itemStack;
    }
    public ItemStack NSSMF() {
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
        meta.addEnchant(Enchantment.MENDING, 1, true);
        meta.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
        item.setItemMeta(meta);
        return item;
    }
}
