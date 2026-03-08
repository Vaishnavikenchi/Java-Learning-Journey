import java.util.ArrayList;
class ArrayListExample{
   
    public static void main(String args[]){
       
       ArrayList<Integer> a=new ArrayList<Integer>();

        a.add(1);
        a.add(2);
        a.add(3);

        System.out.println("Original List:"+a);

        //Adding Elements for specific Index
        a.add(1,5);

        System.out.println("After Adding element at index 1:"+a);

        //removing Element using index
        a.remove(0);

        System.out.println("Element removed from index 0:"+a);

        //Updating value at index 3
        a.set(1,101);

        System.out.println("ArryaList After Updating value at index 3"+ a);

         //clone
        a.clone();
        
        System.out.println("Array List AFter clone:"+a);
        
        //clear ArrayList
        a.clear();

        System.out.println("Array List After Clear:"+a);
    }
}
