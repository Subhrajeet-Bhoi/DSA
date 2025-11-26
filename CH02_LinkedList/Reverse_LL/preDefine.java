package Reverse_LL;
import java.util.LinkedList;
import java.util.Collections;
public class preDefine {
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        System.out.println(list1);
       Collections.reverse(list1);
       System.out.println(list1);
    }
}
