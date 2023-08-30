import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value ");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

}
