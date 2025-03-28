package bridgelabz.listinterface.src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(i);
            list.add(i);
        }

        Collections.reverse(arr);
        Collections.reverse(list);

        System.out.println("Linked List : " + list);
        System.out.println("ArrayList : " + arr);
    }
}

//Linked List : [5, 4, 3, 2, 1]
//ArrayList : [5, 4, 3, 2, 1]
