import java.util.*;
public class alternatedigitswap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] arr = n.toCharArray();
        for (int i = 0; i < arr.length - 1; i += 2) {
            char temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.print(new String(arr));
        sc.close();
    }
}