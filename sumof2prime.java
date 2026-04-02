import java.util.*;
public class sumof2prime{
    public static boolean Prime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for (int i = 2; i <= target / 2; i++) {
            if (Prime(i) && Prime(target - i)) {
                System.out.println(i+ " + " +(target - i));
                sc.close();
            }
        }
    }
}