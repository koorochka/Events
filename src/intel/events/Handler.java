package intel.events;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;

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

    }

}
