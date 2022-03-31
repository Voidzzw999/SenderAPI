package vhabilities.me.github;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

import static your.package.com.MsgAPI.*;

public final class Main extends JavaPlugin {

	
	
    private static Logger logger;

  
    @Override
    public void onEnable() {
        // REQUIRED
        logger = getLogger();
	
    }

    @Override
    public void onDisable() {
        
        log("Plugin desabilitado");
       
    }
    public static Logger getPluginLogger() {
        return logger;
	    // THIS METHOD IS 100% REQUIRED IN YOUR MAIN CLASS.
    }


   
}
