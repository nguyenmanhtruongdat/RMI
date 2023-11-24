import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ComplexOperations extends Remote {
    Complex add(Complex a, Complex b) throws RemoteException;
    Complex subtract(Complex a, Complex b) throws RemoteException;
    Complex multiply(Complex a, Complex b) throws RemoteException;
}