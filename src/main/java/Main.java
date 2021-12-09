import CommandHandlers.Ping;
import cf.ystapi.jda.YSTBuilder;
import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder jdaBuilder = JDABuilder.createDefault("Token");
        YSTBuilder ystBuilder = new YSTBuilder(jdaBuilder.build());
        ystBuilder.setOwner("ur id")
                .setPrefix("y!");

        //Commands
        ystBuilder.addCommand(new Ping());
        ystBuilder.addCommand(new CommandHandlers.role()).addButton(new ButtonHandlers.Role());

        //Build
        ystBuilder.build();
    }
}
