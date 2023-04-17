import java.util.Scanner;

public class PrimeFactorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        System.out.print(n + ":");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(" " + i);
                n /= i;
            }
        }
        System.out.println();
    }
}
