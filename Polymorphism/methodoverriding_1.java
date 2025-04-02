class Chatbot {
    void reply(String message) {
        System.out.println("Chatbot: Processing message...");
    }
}

class WeatherBot extends Chatbot {
    @Override
    void reply(String message) {
        System.out.println("WeatherBot: The current temperature is 30°C.");
    }
}

class SupportBot extends Chatbot {
    @Override
    void reply(String message) {
        System.out.println("SupportBot: How can I assist you with your issue?");
    }
}

public class methodoverriding_1 {
    public static void main(String[] args) {
        Chatbot bot1 = new WeatherBot();
        Chatbot bot2 = new SupportBot();
        
        bot1.reply("What's the weather?");
        bot2.reply("I need help with my order.");
    }
}
