package net.tridentsdk;

import net.tridentsdk.event.EventHandler;
import net.tridentsdk.plugin.TridentPluginHandler;
import net.tridentsdk.plugin.channel.ChannelHandler;
import net.tridentsdk.plugin.cmd.CommandHandler;
import net.tridentsdk.service.ChatHandler;
import net.tridentsdk.service.TransactionHandler;
import net.tridentsdk.window.WindowHandler;

/**
 * Contains the singleton instances for all the Trident handlers
 *
 * @author The TridentSDK Team
 */
public final class Handler {
    private static final AccessBridge BRIDGE = AccessBridge.open();

    private static final EventHandler EVENT_HANDLER = EventHandler.create();
    private static final TridentPluginHandler PLUGIN_HANDLER = new TridentPluginHandler();
    private static final CommandHandler COMMAND_HANDLER = new CommandHandler();
    private static final ChatHandler CHAT_HANDLER = new ChatHandler();
    private static final TransactionHandler TRANSACTION_HANDLER = new TransactionHandler();

    private Handler() {
    }

    public static EventHandler forEvents() {
        return EVENT_HANDLER;
    }

    public static TridentPluginHandler forPlugins() {
        return PLUGIN_HANDLER;
    }

    public static CommandHandler forCommands() {
        return COMMAND_HANDLER;
    }

    public static ChatHandler forChat() {
        return CHAT_HANDLER;
    }

    public static TransactionHandler forTransactions() {
        return TRANSACTION_HANDLER;
    }

    /**
     * Obtains the static instance of the channel handler
     *
     * @return the channel handler instance
     */
    public static ChannelHandler forChannels() {
        return BRIDGE.demand(ChannelHandler.class);
    }

    public static WindowHandler forWindows() {
        return BRIDGE.demand(WindowHandler.class);
    }
}
