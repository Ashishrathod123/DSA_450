// 3. To find the Kth smallest and largest element in the array  
import java.util.*;
public class KthElement {
    public static void main(String args[]) {
        int a[] = {8,4,23,58,99,65,74,53,58,6};
        int k =6;
        System.out.println("The original series of array:");
        for(int i = 0; i < a.length ; i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
        System.out.println("The Array which we want to sort: ");
        for(int i = 0 ; i < a.length - 1 ; i++)
        {
            for(int j=i+1 ; j < a.length ; j++ )
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                
            }
            if(i==k-1)
            {
                System.out.println(k+" largest element of the array :"+ a[i]);//This is for the largest value of K
                break;//This will sort upto 2 element.or the kth element
            }
            
            
        }
        System.out.println("The sorted array for the smallest array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);     
            }
            
        System.out.println();
        for(int i = 0 ; i < a.length - 1 ; i++)
        {
            for(int j=i+1 ; j < a.length ; j++ )
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                
            }
            if(i==k-1)
            {
                System.out.println(k+" smllest element of the array :"+ a[i]);//This is for the largest value of K
                break;
            }
        }
        System.out.println("The sorted array for the smallest array: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);     
            }
        
        
    }
}
