import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        int n =0, rem, result = 0, o;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        o = sc.nextInt();
        o = n;
        for(o != 0; o/= 10, ++n) {
            o = n;
        }
        for (; o != 0; o/=10) {
            rem = o % 10;
            result += Math.pow(rem, n);
        }
        if (result == n) {
            System.out.println(n + " This is an Armstrong no");

        } else {
            System.out.println(n + "This is not an Armstrong no");
        }
    }
}
