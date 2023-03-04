import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import java.net.*;


public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        HttpRequest request = HttpRequest.newBuilder().uri(new URI("https://users.roblox.com/docs/index.html")).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        System.out.println(new App().getGreeting());
    }
}
