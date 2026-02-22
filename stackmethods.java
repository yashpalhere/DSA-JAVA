import java.util.Stack;
public class stackmethods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        s.ensureCapacity(5);
        stack.push(5);
        stack.push(65);
        System.out.println(stack.peek());
        System.out.println(stack);
        stack.pop();
//        stack.pop();
        if(stack.isEmpty()){
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println(stack);
        }
        System.out.println(stack.search(55));


    }
}
