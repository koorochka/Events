package intel.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

public class Handler implements Listener{

    @EventHandler
    public void join(PlayerJoinEvent e){
        Player p = e.getPlayer();
        String[] mesages = new String[3];
        mesages[2] = "Hello!";
        mesages[1] = "Your meage";
        mesages[0] = "Zashell na servser";
        p.sendMessage(mesages);
    }

    @EventHandler
    public void block(BlockBreakEvent e){
        Block b = e.getBlock();
        Player p = e.getPlayer();
        String[] meages = new String[4];
        meages[3] = "Блок сломан, координаты:";
        meages[2] = "x: " + b.getX();
        meages[1] = "y: " + b.getY();
        meages[0] = "z: " + b.getZ();
        p.sendMessage(meages);
    }

    @EventHandler
    public void interact(PlayerInteractEvent e){
        Action a = e.getAction();
        if(a!= Action.RIGHT_CLICK_BLOCK){
            return;
        }

        Player p = e.getPlayer();

        if(p.getItemInHand().getType() == Material.AIR){
            return;
        }

        if(e.getClickedBlock().getType() == Material.CHEST){
            e.setCancelled(true);
            p.sendMessage(ChatColor.GREEN + "Убери предмет из руки");
            p.playSound(p.getLocation(), Sound.BLAZE_HIT, 1,1);
        }



    }
}
