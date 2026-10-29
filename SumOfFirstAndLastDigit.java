
import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = Math.abs(sc.nextInt());

        int lastDigit = n % 10;
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int sum = firstDigit + lastDigit;

        System.out.println("Sum of first and last digit = " + sum);

        sc.close();
    }
}
