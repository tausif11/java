import java.util.Arrays;

//import javax.lang.model.util.ElementScanner14;

public class IntersectionArray {
    public static void printArray(int arr1[],int arr2[]) {
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1);
        }
        System.out.println();

        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2);
        }
       
       
    }
    public static void interSection(int arr1[],int arr2[])
    {
        int len1 = arr1.length;
        int len2 = arr2.length;
     
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i=0;
        int j=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]==arr2[j])
            {
                System.out.print(arr1[i]+" ");
                //arr2[j] = Integer.MIN_VALUE;
                
                i++;
                j++;
               // break;
            }
            else if(arr1[i]>arr2[j])
            {
                j++;
            }
            else 
            {
                 i++;
            }
        }
    }

    public static void main(String[] args)
     {
        int arr1[] = {6,9,8,5};
        int arr2[] = {9,2,4,8,5};
        interSection(arr1, arr2);
       // printArray(arr1, arr2);
    }
}
