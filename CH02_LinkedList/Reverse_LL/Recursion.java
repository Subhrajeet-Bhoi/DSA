package Reverse_LL;

public class Recursion {
    static ListNode head;
    static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
       public static void add(int data){
        ListNode myNode = new ListNode(data);
        if(head == null){
            head = myNode;
            return;
        }
        ListNode currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = myNode;
    }
    public static void main(String[] args){

    }
}