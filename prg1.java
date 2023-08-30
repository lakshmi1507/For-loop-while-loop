import java.util.Scanner;

public class prg1 {
    public static void main(String[] args) {
        int n, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        n = sc.nextInt();
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0 && n != 1) {
            System.out.println(n + " YES");
        } else {
            System.out.println(n + " NO");

        }
    }
}