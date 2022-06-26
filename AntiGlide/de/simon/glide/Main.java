/*    */ package de.simon.glide;
/*    */ import de.simon.glide.commands.load;
/*    */ import org.bukkit.Bukkit;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public class Main extends JavaPlugin {
/* 10 */   public static String pre = "§8[§4AntiGlide§8] ";
/*    */ 
/*    */   
/*    */   public void onEnable() {
/* 14 */     Bukkit.getPluginManager().registerEvents((Listener)new Glide(), (Plugin)this);
/* 15 */     getCommand("antiglide").setExecutor((CommandExecutor)new load());
/*    */   }
/*    */   
/*    */   public void onDisable() {}
/*    */ }