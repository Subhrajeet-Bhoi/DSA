import java.util.Stack;
public class Question3 {
    public static void main(String[] args) {
        String str = "HelloWorld";
       Stack<Character> myStack = new Stack<>();

        int i = 0;
        while(i<str.length()){
            myStack.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder("");

        while(!myStack.isEmpty()){
            result.append(myStack.pop());
        }
        str = result.toString();
        System.out.println(str);
    }
}
