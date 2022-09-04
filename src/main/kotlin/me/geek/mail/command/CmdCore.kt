package me.geek.mail.command



import me.geek.mail.command.admin.*
import me.geek.mail.command.player.*
import taboolib.common.platform.command.CommandBody
import taboolib.common.platform.command.CommandHeader
import taboolib.common.platform.command.PermissionDefault
import taboolib.common.platform.command.mainCommand
import taboolib.expansion.createHelper

@CommandHeader(name = "GeekMail", aliases = ["gkm"], permissionDefault = PermissionDefault.TRUE )
object CmdCore {


    @CommandBody(permission = "mail.command.admin", optional = true)
    val send = CmdSend.command

    @CommandBody(permission = "mail.command.admin")
    val reload = CmdReload.command

    @CommandBody(permission = "mail.command.admin")
    val setblock = CmdSetBlock.command


    @CommandBody(permission = "mail.command.pack")
    val pack = CmdPack.command

    @CommandBody(permissionDefault = PermissionDefault.TRUE)
    val mail = CmdMail.command


    @CommandBody
    val main = mainCommand {
        createHelper()
    }
}