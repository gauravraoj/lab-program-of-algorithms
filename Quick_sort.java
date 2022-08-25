package lab_prgram;
import java.util.Scanner;
import java.util.Random;
class QuickSort1
{
    int partition(int a[],int low,int high)
    {
        int p,i,j,temp;
        p=a[low];
        i=low+1;
        j=high;
        while(low<high)
        {
            while(a[i]<=p && i<high)
                i++;
            while(a[j]>p)
                j--;
            if(i<j)
            {
                temp=a[j];
                a[i]=a[j];
                a[j]=temp;

            }
            else
            {
                temp=a[low];
                a[low]=a[j];
                a[j]=temp;
                return j;
            }
        }
        return j;
    }
   public void sort(int a[],int low,int high)
    {
        if(low<high)
        {
            int pos=partition(a,low,high);
            sort(a,0,pos-1);
            sort(a,pos+1,high);
        }
    }
}
public class Quick_sort {
    public static void main(String[] args) {
        int i,n=0;
        Scanner in=new Scanner(System.in);
        int a[]=new int[1000];
        QuickSort1 obj =new  QuickSort1();
        System.out.println("Press1 to read numbers from the keyboard\n Press 2 to generate random numbers \nEnter your choice ");
        int choice=in.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("Enter the number of elements to be sorted");
                n= in.nextInt();
                System.out.println("Enter "+n+"numbers");
                for(i=0;i<n;i++)
                {
                    a[i]=in.nextInt();
                }
                break;
            case 2: System.out.println("Enter the number of elements to be sorted");
                n= in.nextInt();
                Random rand=new Random();
                for(i=0;i<n;i++)
                {
                    a[i]=rand.nextInt(1000);
                }
                break;
            default:System.out.println("wrong choice");
            System.exit(0);

        }
        System.out.println("\nArrray elements to be sorted are");
        for(i=0;i<n;i++)
            System.out.println(a[i]+" ");
        long start=System.nanoTime();
        obj.sort(a,0,n-1);
        long end=System.nanoTime();
        System.out.println("\nThe sorted elements are");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        System.out.println("\nThe time taken to sort elements by quick sort method"+(end-start)+"nano seconds");
    }


}
