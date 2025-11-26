public class Palindrome{
    static ListNode head;
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void addLast(int data){
        ListNode myNode = new ListNode(data);
        if(head == null){
            head = myNode;
            return ;
        }
        ListNode currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = myNode;
    }
    public static void printVal(){
        if(head == null){
            System.out.println("The List is Empty...");
            return ;
        }
        printRecursively(head);
        System.out.println("null");
    }
    public static void printRecursively(ListNode node){
        if(node == null){
            return ;
        }
        System.out.print(node.data+"-> ");
        printRecursively(node.next);
    }
    public static boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        ListNode middle = findMiddle(head);
        ListNode secondHalfStart = reverse(middle.next);

        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            if(firstHalfStart.data != secondHalfStart.data){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev =null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }
    public static ListNode findMiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        
        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }
        return turtle;
    }
    public static void main(String[] args){
        addLast(10);
        addLast(20);
        addLast(10);
        // addLast(40);
        // addLast(50);
         printVal();
       System.out.println(isPalindrome());
    }
}