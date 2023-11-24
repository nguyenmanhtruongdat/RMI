import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LoginServiceImpl extends UnicastRemoteObject implements LoginService {
    // Mô phỏng cơ sở dữ liệu người dùng

    protected LoginServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public boolean login(String username, String password) throws RemoteException {
        // Mã hóa mật khẩu trước khi so sánh
        // Trong thực tế, bạn nên sử dụng thuật toán mã hóa mạnh hơn
        String encodedPassword = encryptPassword(password);

        return true;
    }

    private String encryptPassword(String password) {
        // Mã hóa mật khẩu, ví dụ đơn giản chỉ là chuyển đổi sang chữ hoa
        return password.toUpperCase();
    }
}
