public class Nth_Element {
     static  ListNode head;
    static class ListNode{
        int data;
         ListNode next ;

         //we are Creating  a constructor 
         ListNode(int data){
            this.data = data;
            this.next = null;
         }
    }
    public static void add(int data){
         ListNode myNode = new  ListNode(data);
         if(head == null){
            head = myNode;
            return;
         }
          ListNode currNode =  head;
          while(currNode.next != null){
            currNode = currNode.next;
          }
          currNode.next = myNode;
    }
    public static void printVal(){
        if(head == null){
            System.out.println("The list is Empty...");
            return;
        }
         ListNode currNode = head;
         while(currNode !=  null){
            System.out.print(currNode.data+"-> ");
            currNode = currNode.next;
         }
         System.out.println("null");
    }
    public static ListNode removeNthElement(int n){
        if(head.next == null){
            return null;
        }
        //Calculating the size of LinkedList 
        int size = 0;
         ListNode dummy = head;
         while(dummy != null){
            dummy = dummy.next;
            size++;
         }
         if(n==size){
            return head.next;
         }
         int ptf = size - n;
          ListNode prev = head;
          int cp = 1;
          while(cp != ptf){
            prev = prev.next;
            cp++;
          }
          prev.next = prev.next.next;
          return head;
    }
    public static void main(String[] args) {
           add(30);
        add(20);
        add(10);
         add(40);
         add(50);
         printVal();
         removeNthElement(1);
         printVal();
    }
}
