import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer A: ");
        int A = scanner.nextInt();

        System.out.print("Enter an integer B: ");
        int B = scanner.nextInt();

        double result = Math.pow(A, B);

        System.out.println("The value of is:  " + result);

    }
}
