package bridgelabz.listinterface.src;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();

        list.add(3);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        for(Integer i : list){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i=list.size()-1;i>=0;i--){
            int num = list.get(i);
            int value = map.get(num);

            if(value > 1){
                list.remove(i);
                map.put(num,value-1);
            }
        }

        System.out.println("List after removing duplicates while maintaining order : " + list);
    }
}
