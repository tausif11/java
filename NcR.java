import java.util.Scanner;
 public class NcR {
    public static int Factorial(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;    
    }

    public static void main(String[] args) {
       try( Scanner s = new Scanner(System.in))
       {
        int n = s.nextInt();
        int r = s.nextInt();

         Factorial(n);
         Factorial(r);
         Factorial(n-r);

        s.close();
       }
    }
    
}
