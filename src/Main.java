import java.util.Scanner;
public class Main {

    static boolean Prime(int n, int i) {
        if (i == 1)
            return true;
        if (n % i == 0)
            return false;
        return Prime(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = scan.nextInt();

        if (n < 2) {
            System.out.println(n + " is not a prime number");
        } else {
            if (Prime(n, n - 1)) {
                System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
}
