class Pen{

    String color;
    String type;//ballpoint pen; gel
    
    public void write()
    {
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    Student(){
        
    }
}
public class OOPS{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.name="Vaishnavi";
        s1.age=19;

        Student s2=new Student(s1);

        s1.printInfo();
    }

}
