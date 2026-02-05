import java.util.Scanner;
class LibraryMember {
    private int issuedBooks;
    public void setIssuedBooks(int count) {
        issuedBooks = count;
    }
    public void issueBook() {
        if (issuedBooks < 3) {
            issuedBooks++;
            System.out.println("Book issued successfully");
        } else {
            System.out.println("Book issue limit exceeded");
        }
    }
}
public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int booksIssued = sc.nextInt();
        LibraryMember member = new LibraryMember();
        member.setIssuedBooks(booksIssued);
        member.issueBook();
    }
}
