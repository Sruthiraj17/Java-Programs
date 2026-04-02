import java.util.*;
public class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num;
        int sum = 0;
        num = sc.nextInt();
        int min = num;
        int max = num;
        sum = num;
        for (int i = 2; i <= n; i++) {
            num = sc.nextInt();
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        double avg = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + avg);
        sc.close();
    }
}
