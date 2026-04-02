import java.util.*;
public class smoothnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int k = sc.nextInt(); 
        int temp = n;
        boolean isSmooth = true;
        for (int i = 2; i <= temp; i++) {
            while (n % i == 0) {
                if (i > k) {
                    isSmooth = false;
                }
                n = n/i;
            }
        }
        if (isSmooth)
            System.out.println("Smooth number");
        else
            System.out.println("Not Smooth number ");
        sc.close();
    }
}
