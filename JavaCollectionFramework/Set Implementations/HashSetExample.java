import java.util.*;

public class HashSetExample {
    public static void main(String args[]){

        HashSet<String> hs=new HashSet<>();

        hs.add("One");
        hs.add("Two");
        hs.add("Three");

        System.out.println("HashSet Size"+hs.size());
        System.out.println("Elements in HashSet"+hs);

        hs.remove("Two");

        System.out.println("HashSet after removing element:"+hs);
    }
}
