package lab_prgram;
import java.util.Scanner;
class Stack
{
    int stk[];
    int top;
    int max;
    Stack()
    {
        top=-1;
        max=5;
                stk=new int[max];
    }
    public void push()
    {
        int elem;
        if(top==max-1)
            System.out.println("The stack is overflow");
        else {
            System.out.println("Enter the elements");
            Scanner in = new Scanner(System.in);
            elem = in.nextInt();
            top=top+1;
            stk[top] = elem;
        }
    }
    public void pop()
    {
        int a;
        if(top==-1)
            System.out.println("Stack is underflow");
        else {
            a=stk[top];
            top=top-1;
            System.out.println("Popped elemnts is"+a);
        }
    }
    public void display()
    {
        if(top==-1)
            System.out.println("Stack is empty");
        else {
            System.out.println("Stack elements");
            for(int i=top;i>=0;i--)
            {
                System.out.println(stk[i]);
            }
        }
    }
}
public class prog1b {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Stack obj=new Stack();
        while(true)
        {
            System.out.println("------Menu--------");
            System.out.println("1.PUSH\t2.POP\t3.DISPLAY\t4.EXIT");
            System.out.println("Enter your choice");
            int ch=in.nextInt();
            switch(ch)
            {
                case 1:obj.push();
                break;
                case 2:obj.pop();
                break;
                case 3:obj.display();
                break;
                case 4:System.exit(0);
                default:
                    System.out.println("Wrong choice");
                    break;
            }
        }
    }
}
