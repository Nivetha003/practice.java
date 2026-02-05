import java.util.Scanner;
class Student{
    private int m1,m2,m3;
    
    public void setmarks(int a,int b,int c){
        m1=a;
        m2=b;
        m3=c;
    }
    public void calculatemark(){
         int average = (m1+m2+m3)/3;
        System.out.println("Average: "+average);
        if(average>=75){
            System.out.println("Grade: Distinction");
        }
        else if(average>=60){
            System.out.println("Grade: First Class");
        }
        else if(average>=50){
            System.out.println("Grade: Second Class");
        }
        else{
            System.out.println("Grade: Fail");
        }
    }
}
public class Grade{
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        System.out.println("Marks: "+m1+" "+m2+" "+m3);
        Student st = new Student();
        st.setmarks(m1,m2,m3);
        st.calculatemark();
    }
}