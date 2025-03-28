package bridgelabz.listinterface.src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfElements {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<String,Integer>();
        ArrayList<String> arr = new ArrayList<>();
        arr.add("apple");
        arr.add("banana");
        arr.add("orange");
        arr.add("apple");

        for(String str : arr){
            m.put(str,m.getOrDefault(str,0)+1);
        }

        System.out.println("HashMap : " + m);
    }
}
//HashMap : {banana=1, orange=1, apple=2}