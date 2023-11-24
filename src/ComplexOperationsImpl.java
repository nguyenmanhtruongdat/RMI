import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ComplexOperationsImpl extends UnicastRemoteObject implements ComplexOperations {
    protected ComplexOperationsImpl() throws RemoteException {
        super();
    }

    @Override
    public Complex add(Complex a, Complex b) throws RemoteException {
        return new Complex(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    @Override
    public Complex subtract(Complex a, Complex b) throws RemoteException {
        return new Complex(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }

    @Override
    public Complex multiply(Complex a, Complex b) throws RemoteException {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new Complex(real, imaginary);
    }
}
