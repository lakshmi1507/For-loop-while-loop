import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        int i = 1, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        System.out.println("The numbers are   ");
        while (i <= n) {
            System.out.println(i);
            i = i + 2;
        }

    }

}
