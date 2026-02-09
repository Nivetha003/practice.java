import java.util.Scanner;
class Student{
    protected String name;
    protected int rollno;
    Student(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
}
class Result extends Student{
    int m1, m2, m3;
    Result(String name, int rollno, int m1, int m2, int m3){
       super(name, rollno);
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
        
        int totalmark(){
            return m1+m2+m3;
        }
}
public class Inherit2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll No: ");
        int rollno = sc.nextInt();
        System.out.println("Marks: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        Result r = new Result(name, rollno, m1, m2, m3);
        System.out.print("Total Marks: "+ r.totalmark());
    }
}
