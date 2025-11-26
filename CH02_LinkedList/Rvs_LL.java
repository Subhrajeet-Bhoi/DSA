// package CH02_LinkedList;
// import java.util.LinkedList;
// public class Rvs_LL {
//     public static void rvsIterate(LinkedList<Integer>list){
//         if(head.next ==null && head == null){
//             return;
//         }
//         Node prevNode = head;
//         Node currNode = head.next;

//         while(currNode != null){
//             Node nextNode = currNode.next;
//             currNode = prevNode;

//             //update 
//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         head.next = null;
//         head = prevNode;
//     }
//     public static void main(String[] args){
//         LinkedList<Integer> list = new LinkedList<Integer>();
//         list.addLast(7); 
//         list.addLast(8); 
//         list.addLast(3); 
//         list.addLast(2); 
//         list.addLast(1); 
//         System.out.println(list);
//     }
// }
