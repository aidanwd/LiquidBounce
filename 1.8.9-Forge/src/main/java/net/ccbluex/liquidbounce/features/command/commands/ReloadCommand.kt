package net.ccbluex.liquidbounce.features.command.commands

import net.ccbluex.liquidbounce.LiquidBounce
import net.ccbluex.liquidbounce.features.command.Command
import net.ccbluex.liquidbounce.ui.client.clickgui.ClickGui
import net.ccbluex.liquidbounce.ui.font.Fonts

/**
 * LiquidBounce Hacked Client
 * A minecraft forge injection client using Mixin
 *
 * @game Minecraft
 * @author CCBlueX
 */
class ReloadCommand : Command("reload", arrayOf("configreload")) {

    override fun execute(args: Array<String>) {
        chat("Reloading...")
        chat("§c§lReloading scripts...")
        LiquidBounce.scriptManager.reloadScripts()
        chat("§c§lReloading fonts...")
        Fonts.loadFonts()
        chat("§c§lReloading modules...")
        LiquidBounce.fileManager.loadConfig(LiquidBounce.fileManager.modulesConfig)
        chat("§c§lReloading values...")
        LiquidBounce.fileManager.loadConfig(LiquidBounce.fileManager.valuesConfig)
        chat("§c§lReloading accounts...")
        LiquidBounce.fileManager.loadConfig(LiquidBounce.fileManager.accountsConfig)
        chat("§c§lReloading friends...")
        LiquidBounce.fileManager.loadConfig(LiquidBounce.fileManager.friendsConfig)
        chat("§c§lReloading xray...")
        LiquidBounce.fileManager.loadConfig(LiquidBounce.fileManager.xrayConfig)
        chat("§c§lReloading HUD...")
        LiquidBounce.fileManager.loadConfig(LiquidBounce.fileManager.hudConfig)
        chat("§c§lReloading ClickGUI...")
        LiquidBounce.clickGui = ClickGui()
        LiquidBounce.fileManager.loadConfig(LiquidBounce.fileManager.clickGuiConfig)
        chat("Reloaded.")
    }

}