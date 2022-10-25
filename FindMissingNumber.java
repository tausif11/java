//import java.util.Arrays;
public class FindMissingNumber
{
      public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,10};
        int n = arr.length;
        int sum1 = (10*11)/2;
        int sum2 = 0;
        for(int i=0;i<n;i++)
        {
            sum2 = sum2 + arr[i];
        }
        System.out.println(sum1-sum2);
      }  
    }
    
