package bridgelabz.queueInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();
        ArrayList<String> result = new ArrayList<>();

        queue.add("1");

        for(int i=0 ; i<5 ; i++){
            String binary = queue.poll();
            result.add(binary);

            queue.add(binary + "0");
            queue.add(binary + "1");
        }

        System.out.println(result);
    }
}
//[1, 10, 11, 100, 101]
