package commands

import BotConfig
import Command
import commands

val helpCommand: Command = Command(
    names = listOf("help"),
    hasGlobalCooldown = false,
    handler = {
        chat.sendMessage(BotConfig.channel, "Available commands: ${commands.joinToString("; ") { command -> command.names.joinToString("|") { "${BotConfig.commandPrefix}${it}" } }}.")
    }
)