class Shape{ 

   public void area()
   {
    System.out.println("Displays area");
   }
}

class Triangle extends Shape{

    public void area(int b,int h){
        System.out.println(0.5*b*h);
    }

}
class EquilateralTriangle extends Triangle{

    public void area(int b,int h)
    {
        System.out.println(0.5*b*h);
    }
}
public class MultilevelInheritance{

    public static void main(String args[]){
         EquilateralTriangle e=new EquilateralTriangle();
         e.area();
         e.area(2,3);
         e.area(2,4);
    }
}