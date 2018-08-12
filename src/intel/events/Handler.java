package intel.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Handler implements Listener{

    @EventHandler
    public void j(PlayerJoinEvent e){
        Player p = e.getPlayer();
        String[] mesages = new String[3];
        mesages[2] = "Hello!";
        mesages[1] = "Your meage";
        mesages[0] = "Zashell na servser";
        p.sendMessage(mesages);
    }

}
