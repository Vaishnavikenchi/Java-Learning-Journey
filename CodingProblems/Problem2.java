package CodingProblems;

import java.util.ArrayList;
import java.util.Collections;

public class Problem2 {
    
    public static void main(String args[]){

        ArrayList<Integer> list=new ArrayList<>();

        list.add(101);
        list.add(102);
        list.add(103);
        list.add(104);
        list.add(105);

        System.out.println("Original List:"+list);

        Collections.reverse(list);

        System.out.println("List After reverse:"+list);


    }
}
