import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        int a, b, i, max, lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        a = sc.nextInt();
        b = sc.nextInt();

        max = a > b ? a : b;
        for (i = 0; i < max; i++) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max++;
        }
        
    }
}
