
class Addition {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodExample {
    public static void main(String[] args) {

        // Method Overloading
        Addition obj = new Addition();
        System.out.println("Sum of two numbers: " + obj.add(10, 20));
        System.out.println("Sum of three numbers: " + obj.add(10, 20, 30));

        // Method Overriding
        Dog d = new Dog();
        d.sound();
    }
}

