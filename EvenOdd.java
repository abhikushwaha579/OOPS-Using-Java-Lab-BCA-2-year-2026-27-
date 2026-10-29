
import java.io.*;

public class EvenOdd {
    public static void main(String[] args) throws IOException {
        DataInputStream dis = new DataInputStream(System.in);
        BufferedReader br = new BufferedReader(
            new InputStreamReader(dis)
        );

        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}
