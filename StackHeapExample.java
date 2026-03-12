class Student {
    int id;
    String name;
}

public class StackHeapExample {

    public static void main(String[] args) {

        int a = 10;          // stored in Stack
        int b = 20;          // stored in Stack

        Student s1 = new Student();   // object created in Heap

        s1.id = 101;
        s1.name = "Akshata";

        int sum = a + b;    // stored in Stack

        System.out.println("Sum: " + sum);
        System.out.println("Student ID: " + s1.id);
        System.out.println("Student Name: " + s1.name);
    }
}