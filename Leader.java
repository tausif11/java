 ///import java.util.Scanner;
 public class Leader {
  public static void LeaderInArray(int arr[] , int n)
  {
     int max_size = arr[n-1];
     System.out.print(max_size+" ");
     for(int i=n-2; i>=0;i--)
     {
      if(arr[i]>max_size)
      {
        max_size = arr[i];
        System.out.print(max_size+" ");
      }
     }
  }
  public static void main(String[] args) {
    int arr[] = new int[] {16,17,4,5,2};
    int n = arr.length;
    LeaderInArray(arr,n);
      
  }
 
 }