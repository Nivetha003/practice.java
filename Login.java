import java.util.Scanner;
class Systemm {
    private String password = "admin";
    private int attempts = 0;
    public void checkLogin(Scanner sc) {
        for (int i = 0; i < 3; i++) {
            String input = sc.next();
            if (input.equals(password)) {
                System.out.println("Login Successful");
                return;
            } else {
                attempts++;
            }
        }
        System.out.println("Account Locked");
    }
}
public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Systemm login = new Systemm();
        login.checkLogin(sc);
    }
}
