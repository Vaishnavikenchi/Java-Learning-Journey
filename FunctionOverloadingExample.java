class Student {

    String name;
    int age;

    
    public void printInfo(String name) {
        System.out.println(name);
    }

    
    public void printInfo(int age) {
        System.out.println(age);
    }

    
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class FunctionOverloadingExample {

    public static void main(String args[]) {

        Student s = new Student();
        s.name = "Vaishnavi";
        s.age = 19;

        s.printInfo(s.name);
        s.printInfo(s.age);
        s.printInfo(s.name, s.age);
    }
}