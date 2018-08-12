package intel.events;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class IntelEvents extends JavaPlugin{

    @Override
    public void onEnable(){
        // Регистрируем наш класс Handler как обработчик событий
        //Bukkit.getPluginManager().registerEvents(new Handler(), this);
        Bukkit.getPluginManager().registerEvents(new Handler(), this);
    }

}