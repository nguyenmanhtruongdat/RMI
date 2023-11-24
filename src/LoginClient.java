import java.rmi.Naming;
import java.util.Scanner;

public class LoginClient {
    public static void main(String[] args) {
        try {
            LoginService loginService = (LoginService) Naming.lookup("rmi://localhost/LoginService");

            String username;
            String password;
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for the username
            System.out.print("Enter username: ");
            username = scanner.nextLine();

            // Prompt the user for the password
            System.out.print("Enter password: ");
            password = scanner.nextLine();

            // Close the scanner
            scanner.close();

            if (loginService.login(username, password)) {
                System.out.println("Login successful.");
            } else {
                System.out.println("Login failed.");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
