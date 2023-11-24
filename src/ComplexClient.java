import java.rmi.Naming;

public class ComplexClient {
    public static void main(String[] args) {
        try {
            ComplexOperations complexOperations = (ComplexOperations) Naming.lookup("rmi://localhost/ComplexOperations");

            Complex a = new Complex(2, 3);
            Complex b = new Complex(1, 2);

            System.out.println("Addition: " + complexOperations.add(a, b));
            System.out.println("Subtraction: " + complexOperations.subtract(a, b));
            System.out.println("Multiplication: " + complexOperations.multiply(a, b));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
