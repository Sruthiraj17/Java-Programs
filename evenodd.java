import java.util.*;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            int last = n % 10;
            if (last % 2 == 0)
                System.out.println(last + " is even");
            else
                System.out.println(last + " is odd");

            n = n/10;
        }
        sc.close();
    }
}
