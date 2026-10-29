
public class AddNumbers {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add four integers
    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        AddNumbers obj = new AddNumbers();

        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30));
        System.out.println("Sum of four integers: " + obj.add(10, 20, 30, 40));
    }
}

