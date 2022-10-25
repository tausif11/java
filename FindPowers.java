import java.util.Scanner;
public class FindPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res=1;
        int x = sc.nextInt();
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
             res = res*x;
        }
        System.out.println(res);
        sc.close();
    }
}
