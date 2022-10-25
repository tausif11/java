///import javax.lang.model.util.ElementScanner14;

public class BinarySearch {
        public static int binarySearch(int arr[], int key)
         {
            int s=0,e=arr.length-1;
           // int i=-1;
            
            while (s<=e) {
                int mid = (s+e)/2;
                if(arr[mid]==key)
                {
                  return mid;  
                }
                else if(arr[mid]>key)
                {
                    e = mid - 1;
                }
                else
                {
                    s = mid + 1;
                }
             
            }
            return -1; 
        }
    public static void main(String[] args)
     {
        int arr[] = {1,3,5,7,9,13};
        int index = binarySearch(arr, 13);
        System.out.println("Key is at " + index);
    }
}
