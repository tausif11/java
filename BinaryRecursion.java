//import javax.lang.model.util.ElementScanner14;
import java.util.Scanner;
public class BinaryRecursion {
    public static int BinarySearch(int arr[],int s, int e, int x) {
        
       /// int n = arr.length;
       
          

       while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]<x)
            {
                return BinarySearch(arr,s, mid-1, x);
            }
            else
            {
                return BinarySearch(arr,s, mid+1, x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in); 
       int n = s.nextInt();
       int arr[] = new int[n];
       for(int i=0;i<n;i++)
       {
         arr[i] = s.nextInt(); 
       }
       int x = s.nextInt();
       int start = 0;
       int e = arr.length;
       System.out.println(BinarySearch(arr, start, e, x));
       

       s.close();
    }
}
