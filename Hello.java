 /**
  * Hello
  */
import java.util.Scanner;
 public class Hello {
 
    public static void main(String[] args) {
        // System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
        sc.close();
    }
 }