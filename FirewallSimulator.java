import java.util.*;

public class FirewallSimulator {

    public static void main(String[] args) {

        // Allowed IP addresses (trusted)
        List<String> allowedIPs = Arrays.asList(
                "192.168.1.1",
                "10.0.0.2",
                "127.0.0.1"
        );

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Firewall Simulator ===");
        System.out.print("Enter IP address to check: ");

        String ip = scanner.nextLine();

        if (allowedIPs.contains(ip)) {
            System.out.println("ACCESS GRANTED - IP is trusted");
        } else {
            System.out.println("ACCESS DENIED - IP blocked by firewall");
        }

        scanner.close();
    }
}
