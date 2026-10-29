
class Student {
    int rollNo;
    String name;

    void display() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class ClassesObjects {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.rollNo = 101;
        s1.name = "Abhishek";

        s1.display();
    }
}

