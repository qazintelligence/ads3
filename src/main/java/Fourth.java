import java.util.*;
public class Fourth {
    public static void reverse(Stack<Integer> st) {
//base condition
        if(st.isEmpty())
            return;
        int temp = st.pop();
        reverse(st);
        insertAtLast(st, temp);
    }
    public static void insertAtLast(Stack<Integer> stack, int elem){
//push the elem in a stack if it is empty
        if(stack.isEmpty()){
            stack.push(elem);
            return;
        }
//popping elements from stack and keeping them in a function call
        int topElem = stack.pop();
//pushes elem at last
        insertAtLast(stack, elem);
//pushes all popped elements in stack
        stack.push(topElem);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(4);
        st.add(3);
        st.add(2);
        st.add(1);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}