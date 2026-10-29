
class Parent {
    int number = 10;

    void display() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    final int value = 100;

    void show() {
        System.out.println("Parent number: " + super.number);
        super.display();
        System.out.println("Final value: " + value);
    }
}

public class FinalSuperExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

