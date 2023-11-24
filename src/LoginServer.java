import java.rmi.Naming;

public class LoginServer {
    public static void main(String[] args) {
        try {
            LoginServiceImpl loginService = new LoginServiceImpl();
            Naming.rebind("LoginService", loginService);
            System.out.println("Login Server is ready.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
