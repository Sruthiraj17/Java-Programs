import java.util.*;
public class convert2base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        String result = "";
        while (n > 0) {
            result = (n % base) + result;
            n = n/base;
        }
        System.out.println(result);
        sc.close();
    }
}