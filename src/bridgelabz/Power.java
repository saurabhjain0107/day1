package bridgelabz;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        int n, p;
        int result = 1;
        System.out.println("enter number");
        Scanner r = new Scanner(System.in);
        n = r.nextInt();
        System.out.println("enter power");
        p = r.nextInt();
        for (int i = 1; i <= p; i++)
        {
        result = n * result;
        }
        System.out.println("power "+result);
    }
}
