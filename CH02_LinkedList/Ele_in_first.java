
public class Ele_in_first {
        ListNode head;
    class ListNode{
        String data;
        ListNode next;
        ListNode(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data){
        ListNode MyListNode = new ListNode(data);
        if(head == null){
            head = MyListNode;
            return ;
        }
        MyListNode.next = head;
        head = MyListNode;
    }
    public static void main(String[] args){
        Ele_in_first eif = new Ele_in_first();
        eif.addFirst("Subhra");
        eif.addFirst("Rahul");
        eif.addFirst("Rohan");
    }
}
