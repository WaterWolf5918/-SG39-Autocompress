package tk.waterwolf;

import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {
    static FileConfiguration config = SG30DLL.getPlugin().getConfig();
    public static void loadDefaultConfig(){
        config.addDefault("youAreAwesome1", true);
        config.addDefault("youAreAwesome2", true);
        config.addDefault("youAreAwesome3", true);
        config.addDefault("youAreAwesome4", true);
        config.options().copyDefaults(true);
    }
}
