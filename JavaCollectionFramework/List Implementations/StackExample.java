import java.util.Stack;

public class StackExample {
    public static void main(String args[]){

        Stack<Integer> s =new Stack<Integer>();

        //Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        //Displaying the stack
        System.out.println(s);

        //Fetching the element at the head of the stack
        System.out.println("The element at the top of the stack is:"+s.peek());

        //Removing elements using pop() method
        System.out.println("Popped element:"+s.pop());
        System.out.println("Popped element:"+s.pop());

        //Displaying stack after the pop operation
        System.out.println("Stack After pop operation"+s);
    }
}
