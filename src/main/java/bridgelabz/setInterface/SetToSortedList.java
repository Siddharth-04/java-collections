package bridgelabz.setInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SetToSortedList {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        set.add(5);
        set.add(3);
        set.add(9);
        set.add(1);

        for(Integer i : set){
            arrayList.add(i);
        }

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
//[1, 3, 5, 9]