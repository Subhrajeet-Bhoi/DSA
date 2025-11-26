//Reverse a Stack
import java.util.Stack;
public class Question2 {
    public static void pushAtBottom(Stack<Integer> list , int data){
        if(list.isEmpty()){
            list.push(data);
            return ;
        }

        int temp = list.pop();
        pushAtBottom(list, data);
        list.push(temp);
    }
    public static void reverse(Stack<Integer>list){
        if(list.isEmpty()){
            return;
        }
        int top = list.pop();
        reverse(list);
        pushAtBottom(list, top);
    }
        public static void main(String[] args){
            Stack<Integer> myStack = new Stack<>();

            myStack.push(1);
            myStack.push(2);
            myStack.push(3);

           reverse(myStack);
            while(!myStack.isEmpty()){
                System.out.println(myStack.peek());
                myStack.pop();
            }
        }
}