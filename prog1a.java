package lab_prgram;
import java.util.Scanner;
class Student {
    String name;
    String usn;
    String branch;
    String phone;



    public void getInfo()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the USN");
        usn=in.next();
        System.out.println("Enter the name");
        name=in.next();
        System.out.println("Enter the branch");
        branch=in.next();
        System.out.println("Enter the phone");
        phone=in.next();
    }
    public void display()
    {
        System.out.println("USN\tNAME\tBRANCH\tPHONE");
        System.out.println(usn+"\t"+name+"\t"+branch+"\t"+phone);
    }
}
public class prog1a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i;
        Student a[] = new Student[1000];
        System.out.println("Enter the number of students");
        int n = in.nextInt();
        System.out.println("Enter the students details");
        for (i = 0; i < n; i++) {
            a[i] = new Student();
            a[i].getInfo();
        }
        System.out.println("+++++++++++");
        for (i = 0; i < n; i++) {
            a[i].display();
        }
    }}