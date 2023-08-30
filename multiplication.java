import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        int i = 1, n, mul;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        while (n > 11) {
            i = i + 1;
            System.out.println("%d * %d = %d ", n, i, n * i);

        }
    }
}