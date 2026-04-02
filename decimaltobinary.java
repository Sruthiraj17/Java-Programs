import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = "";
        while (n > 0) {
            binary = (n % 2) + binary;
            n=n/2;
        }
        System.out.println(binary);
        sc.close();
    }
}
