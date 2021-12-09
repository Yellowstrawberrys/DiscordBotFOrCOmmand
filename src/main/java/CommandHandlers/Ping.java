package CommandHandlers;

import cf.ystapi.jda.Handlers.CommandHandler;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Ping implements CommandHandler {
    @Override
    public String name() {
        return "ping";
    }

    @Override
    public String helpMessages() {
        return null;
    }

    @Override
    public void onCalled(MessageReceivedEvent messageReceivedEvent, String[] args, MessageChannel Channel) {
        long t = System.currentTimeMillis();
        Channel.sendMessage("Pong!").queue(s -> {
            s.editMessageFormat("Pong! \n time: %d", System.currentTimeMillis()-t).queue();
        });
    }
}
