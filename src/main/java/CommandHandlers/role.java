package CommandHandlers;

import cf.ystapi.jda.Handlers.CommandHandler;
import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.Button;

import java.awt.*;

public class role implements CommandHandler {
    @Override
    public String name() {
        return "role";
    }

    @Override
    public String helpMessages() {
        return null;
    }

    @Override
    public void onCalled(MessageReceivedEvent messageReceivedEvent, String[] strings, MessageChannel messageChannel) {
        EmbedBuilder em = new EmbedBuilder().setTitle("역할");
        em.setColor(Color.YELLOW);
        em.addField("역할을 받을려면 밑에있는 버튼을 클릭해주세요!", "버튼을 클릭시, USER 권한이 자동적으로 부여됩니다!", false);
        messageChannel.sendMessageEmbeds(em.build()).setActionRows(ActionRow.of(Button.primary("role","클릭!"))).queue();
    }
}
