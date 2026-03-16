package CodingProblems;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Problem1 {
    
    public static void main(String args[]){
    
    ArrayList<Integer> a=new ArrayList<>();

    a.add(10);
    a.add(10);
    a.add(20);
    a.add(30);
    a.add(40);
    a.add(50);

    System.out.println("Original ArrayList:"+a);

    Set<Integer> set=new LinkedHashSet<>(a);
    
    ArrayList<Integer> list=new ArrayList<>(set);

    System.out.println("ArrayList After removing duplicates:"+list);
  }
}
