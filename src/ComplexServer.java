import java.rmi.Naming;

public class ComplexServer {
    public static void main(String[] args) {
        try {
            ComplexOperationsImpl complexOperations = new ComplexOperationsImpl();
            Naming.rebind("ComplexOperations", complexOperations);
            System.out.println("Complex Server is ready.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
