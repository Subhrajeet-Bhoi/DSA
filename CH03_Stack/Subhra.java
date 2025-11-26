class ListNode {
    int data;
    ListNode next;

    ListNode(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack {
    ListNode head;

    public void push(int data){
        ListNode myNode = new ListNode(data);
        myNode.next = head;
        head = myNode;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        int value = head.data;
        head = head.next;
        return value;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}

public class Subhra {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
