//Program of sorting of an array containing 0's,1's and 2's using method in java (Dutch flag problem)
import java.util.Scanner;
public class SetColor {
    public static void main(String args[]) {
       int n;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the how many element you want to add in Array : ");
       n = sc.nextInt();
       int low = 0;
       int mid = 0;
       int high = n - 1;
       int a[] = new int[100];
       System.out.println();
       System.out.print("Enter the value in array: ");
       for(int i=0;i < n;i++)
       {
           a[i] = sc.nextInt();
       }
       System.out.print("The elements in the array are: ");
       for(int i = 0;i < n ; i++)
       {
           System.out.print(" "+a[i]);
       }
       System.out.println();
       while(mid<=high)
       if(a[mid]==0)
       {
           int temp = a[mid];
           a[mid] = a[low];
           a[low] = temp;
           low = low + 1;
           mid = mid +1;
       }
       else if(a[mid]==1)
       {
           mid = mid + 1;
       }
       else
       {
           int temp = a[mid];
           a[mid] = a[high];
           a[high] = temp;
           high = high - 1;
       }
       System.out.println();
       System.out.println("The Sorted array: ");
       for(int i = 0; i < n ; i++)
       {
           System.out.print(" "+a[i]);
       }
      
       
      
    }
}