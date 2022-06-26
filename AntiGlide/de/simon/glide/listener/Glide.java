/*    */ package de.simon.glide.listener;
/*    */ 
/*    */ import org.bukkit.Material;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerMoveEvent;
/*    */ 
/*    */ public class Glide
/*    */   implements Listener
/*    */ {
/*    */   @EventHandler
/*    */   public void onMove(PlayerMoveEvent e) {
/* 13 */     if (e.getTo().getY() - e.getFrom().getY() == -0.125D) {
/* 14 */       e.getTo().clone().subtract(0.0D, 1.0D, 0.0D).getBlock().getType().equals(Material.AIR);
/* 15 */       e.setCancelled(true);
/* 16 */       e.getPlayer().sendMessage("§cBitte deaktiviere deinen client!");
/* 17 */       e.getPlayer().kickPlayer("§cDu wurdest vom Server gekickt!\n§7Grund: §eGlide");
/*    */     } 
/*    */   }
/*    */ }