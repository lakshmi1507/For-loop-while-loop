import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int n, rev = 0, temp, rem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        n = sc.nextInt();
        temp = n;
        for (; n != 0; n /= 10) {
            rem = n % 10;
            rev = rev * 10 + rem;
        }
        if (temp == rev) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("It is not a palindrome");
        }

    }
}