import java.util.Scanner;
class User {
    String username;
    User(String username) {
        this.username = username;
    }
}
class Admin extends User {
    Admin(String username) {
        super(username);
    }
    void checkAccess() {
        if (username.equals("admin")) {
            System.out.println("Admin Access Granted");
        } else {
            System.out.println("Admin Access Denied");
        }
    }
}
public class Inherit9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.nextLine();
        Admin admin = new Admin(username);
        admin.checkAccess();
    }
}
