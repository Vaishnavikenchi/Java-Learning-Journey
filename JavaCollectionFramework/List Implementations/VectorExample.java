import java.util.*;

public class VectorExample {
    public static void main(String args[]){
        
        Vector<Comparable> v1 = new Vector();

        v1.add(101);
        v1.add(102);
        v1.add("Java");
        v1.add("Vector");
        v1.add(105);

        System.out.println("Vector v1:"+v1);
        
        Vector<Integer> v2=new Vector<Integer>();

        v2.add(1);
        v2.add(2);
        v2.add(3);

        System.out.println("Vector v2:"+v2);
        
        System.out.println("The object that is replaced is :"+v1.set(0,110));

        System.out.println("Vector After Updating:"+v1);

        for(int i=0;i<v2.size();i++)
        {
            System.out.println(v2.get(i));
        }
    }
}
