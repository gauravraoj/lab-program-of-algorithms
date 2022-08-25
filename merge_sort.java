package lab_prgram;
import java.util.Scanner;
import java.util.Random;

class Merge
{
    static int max=10000;
    void merge(int a[],int low,int mid ,int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int resarray[]=new int[max];
        while(i<=mid&& j<=high)
        {
            if(a[i]<a[j]) {
                resarray[k++] = a[i++];

            }
            else {
                resarray[k++] = a[j++];

            }
        }
        while(i<=mid)
            resarray[k++]=a[i++];
        while(j<=high)
            resarray[k++]=a[j++];
        for(int m=low;m<=high;m++)
            a[m]=resarray[m];
    }
    void mergeSort(int a[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);

        }
    }
}
public class merge_sort {
    public static void main(String[] args) {
        int i, n = 0;
        Scanner in = new Scanner(System.in);
        Merge obj = new Merge();
        int a[] = new int[10000];
        System.out.println("Press1 to read numbers from the keyboard\n Press 2 to generate random numbers \nEnter your choice ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the number of elements to be sorted");
                n = in.nextInt();
                System.out.println("Enter " + n + "numbers");
                for (i = 0; i < n; i++) {
                    a[i] = in.nextInt();
                }
                break;
            case 2:
                System.out.println("Enter the number of elements to be sorted");
                n = in.nextInt();
                Random rand = new Random();
                for (i = 0; i < n; i++) {
                    a[i] = rand.nextInt(1000);
                }
                break;
            default:
                System.out.println("wrong choice");
                System.exit(0);
        }
                System.out.println("\nArrray elements to be sorted are");
                for (i = 0; i < n; i++)
                    System.out.println(a[i] + " ");
                long start = System.nanoTime();
                obj.mergeSort(a, 0, n - 1);
                long end = System.nanoTime();
                System.out.println("\nThe sorted elements are");
                for (i = 0; i < n; i++) {
                    System.out.println(a[i] + " ");
                }
                System.out.println("\nThe time taken to sort elements by quick sort method" + (end - start) + "nano seconds");
        }


    }

