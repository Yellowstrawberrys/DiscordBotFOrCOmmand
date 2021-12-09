package ButtonHandlers;

import cf.ystapi.jda.Handlers.ButtonHandler;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.interaction.ButtonClickEvent;
import net.dv8tion.jda.api.interactions.components.Button;

public class Role implements ButtonHandler {
    @Override
    public String id() {
        return "role";
    }

    @Override
    public void onCalled(ButtonClickEvent buttonClickEvent, User user, Button button, MessageChannel messageChannel) {
        buttonClickEvent.deferEdit().queue();
        net.dv8tion.jda.api.entities.Role r = buttonClickEvent.getGuild().getRoleById("904992643715575859");
        buttonClickEvent.getGuild().addRoleToMember(user.getId(), r).queue();
        buttonClickEvent.getMessage().editMessage("wow").queue();
    }
}
