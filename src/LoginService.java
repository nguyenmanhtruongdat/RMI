import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginService extends Remote {
    boolean login(String username, String password) throws RemoteException;
}
