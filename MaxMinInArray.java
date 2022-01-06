//2.Maximum and minimum from the array
public class MaxMinInArray {
    public static void main(String args[]) {
        int a[] = {2,3,4,23,9,8,7,1,6};
        System.out.println("The original array");
        for(int i=0;i<a.length;i++)
        {
        System.out.print(" "+a[i]);
        }
        System.out.println();
        int min = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min > a[i])
            {
              min = a[i];
            }
            
        }
        System.out.println("Minimum value of the array  "+ min);
        System.out.println();
        int max = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Maximum value of the array " + max );
      
    }
}
