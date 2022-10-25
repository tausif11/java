import java.util.Arrays;

//import java.util.Scanner;

public class SelectionSort
 {
    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr);
        }
        System.out.println();
    }
public static void selectSort(int arr[])
 {
      
     int n=arr.length;
    Arrays.sort(arr); 
    for(int i=0;i<n-1;i++)
    {
        int cur_min = i;

        for(int j=i+1;j<n;j++)
        {
                if(arr[j]<arr[cur_min])
                {
                    cur_min=j;
                }
          }
            int temp = arr[cur_min];
              arr[cur_min] = arr[i];
                  arr[i] = temp;
                  //System.out.print(arr);         
    }
    
}
public static void main(String[] args) {
    int arr[] = {2,13,4,1,3,6,28};
    selectSort(arr);
    printArray(arr);
}
}
