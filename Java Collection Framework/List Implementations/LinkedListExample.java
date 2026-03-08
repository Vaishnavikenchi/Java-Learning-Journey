import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String args[]){

        LinkedList<String> l=new LinkedList<String>();

        //Adding Elements
        l.add("One");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");

        System.out.println(l);

        //Updating Elements
        l.set(2, "Six");
        System.out.println("LinkedList After Updation:"+l);

        //Removing Element by Index
        l.remove(1);
        
        System.out.println("ArrayList AFter removing element at index 1:"+l);

        //Removing Elements 
        l.remove("Six");

        System.out.println("ArrayList After removing Six:"+l);

        //Iterating a LinkedList
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
