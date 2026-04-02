import java.util.*;
public class sumoffactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        System.out.print("Sum of the factors of the given number are: "+sum);
        sc.close();
    }
}

