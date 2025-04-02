package systeminfo.demo;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.security.SecureRandom;

public class SystemInfo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();
            System.out.println("Your IP Address: " + ip.getHostAddress());


            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            System.out.println("Current Date & Time: " + now.format(format));

            SecureRandom random = new SecureRandom();
            int randomNumber = random.nextInt(1000); 
            System.out.println("Secure Random Number: " + randomNumber);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
