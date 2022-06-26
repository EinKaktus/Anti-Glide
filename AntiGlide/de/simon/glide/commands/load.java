/*    */ package de.simon.glide.commands;
/*    */ 
/*    */ import de.simon.glide.Main;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ 
/*    */ public class load
/*    */   implements CommandExecutor {
/*    */   public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
/* 12 */     if (s instanceof Player) {
/* 13 */       Player p = (Player)s;
/* 14 */       p.sendMessage(Main.pre + "§aDu nutzt die AntiGlide Version 1.0!\n§aAlle Einstellungen wurden erfolgreich geladen!");
/*    */     } else {
/*    */       
/* 17 */       s.sendMessage("§cDu musst ein Spieler sein!");
/*    */     } 
/* 19 */     return false;
/*    */   }
/*    */ }