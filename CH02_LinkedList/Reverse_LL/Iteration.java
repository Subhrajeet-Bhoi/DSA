package Reverse_LL;

//Reverse trough iteration 
public class Iteration{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void addFirst(int data){
        Node myNode = new Node(data);
        if(head == null){
            head = myNode;
            return;
        }
        myNode.next = head;
        head = myNode;
    }
    public static void addLast(int data){
        Node myNode = new Node(data);
        if(head == null){
            head = myNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = myNode;
    }
    public static void rvsIteration(){
        if(head == null || head.next == null){
            return ;
        }
        Node prevNode = null;
        Node currNode = head;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode =currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }
    public static void printVal(){
        if(head == null){
            System.out.println("The list is empty...");
            return ;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        addLast(20);
        addLast(30);
        addLast(40);
        addLast(50);
        addFirst(10);
        printVal();
        rvsIteration();
        printVal();
    }
}