

public class Ele_in_last {
    ListNode head;
    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(String data){
        ListNode MyListNode  = new ListNode(data);
        if(head == null){
            head = MyListNode;
            return ;
        }
        ListNode currListNode = head;
        while(currListNode != null){
            currListNode = currListNode.next;
        }
        currListNode.next = MyListNode;
    }
    public static void main(String[] args){
        Ele_in_last eil = new Ele_in_last();

    }
}
