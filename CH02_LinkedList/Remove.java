
import java.util.Scanner;
import java.util.LinkedList;

public class Remove {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<String>();
        System.out.println("Enter the Size:");
        int size = sc.nextInt();
        System.out.println("Enter all The Elements :");
        for(int i=0;i<size;i++){
            list.add(sc.nextLine());
        }
        sc.close();
        //Print it all
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" ");
        }

    }
}