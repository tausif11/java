
 public class Swap {
        public static void main(String[] args) {
            int a = 10 , b = 20;

            // using third variable

           System.out.println("Value before swapping "+ a +" "+b);

           /*  Logic - 1.
            int temp = a;
                 a = b;
                 n = temp;
            */
          

           /* Logic - 2.
           a = a+b;
           b = a-b;
           a = a-b;
           */

         // b = a+b - (a=b);  Logic - 3.
          

           System.out.println("Value after swapping "+ a +" "+ b);
        }
    }
    