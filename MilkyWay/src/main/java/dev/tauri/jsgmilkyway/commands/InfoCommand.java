package dev.tauri.jsgmilkyway.commands;

import net.minecraft.network.chat.Component;

public class InfoCommand {
    public boolean broadcastToAdmins(){ return false; }
    public int getMinPerms(){ return 0; }
    public String getCommandName(){ return "mw"; }

    public Component getSuccessMess(){
        return Component.translatable(
                "Command in MilkyWay addon");
    }
}
