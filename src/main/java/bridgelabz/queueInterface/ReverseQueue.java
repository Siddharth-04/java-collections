package bridgelabz.queueInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 10; i <=50; i+=10) {
            queue.add(i);
        }

        System.out.println("Queue before reversing : "+queue);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while(!queue.isEmpty()) {
            arrayList.add(queue.poll());
        }

        Collections.reverse(arrayList);

        for(int i : arrayList) {
            queue.add(i);
        }

        System.out.println("Queue after reversing : "+queue.toString());
    }
}
//Queue before reversing : [10, 20, 30, 40, 50]
//Queue after reversing : [50, 40, 30, 20, 10]