import java.util.*; 

public class AbstractListExample { 
    public static void main(String args[]) 
    { 

        // Creating an empty AbstractList 
        AbstractList<String> list = new LinkedList<String>(); 

        // Using add() method to add elements in the list 
        list.add("Geeks"); 
        list.add("for"); 
        list.add("Geeks"); 
        list.add("10"); 
        list.add("20"); 
 
        System.out.println("AbstractList: " + list); 

        // Remove the head using remove() 
        list.remove(3); 
 
        System.out.println("Final AbstractList: " + list); 

        // getting the index of last occurrence 
        int lastindex = list.lastIndexOf("A"); 

        // printing the Index 
        System.out.println("Last index of A : "+ lastindex); 
    } 
}