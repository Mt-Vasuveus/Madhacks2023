import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import java.net.*;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        System.out.println(new App().getGreeting());
    }
}
