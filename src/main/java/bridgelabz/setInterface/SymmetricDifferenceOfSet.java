package bridgelabz.setInterface;

import java.util.HashSet;

public class SymmetricDifferenceOfSet {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        HashSet<Integer> symmetricDifference = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        for(Integer i : set1){
            if(!set2.contains(i)){
                symmetricDifference.add(i);
            }
        }

        for(Integer i : set2){
            if(!set1.contains(i)){
                symmetricDifference.add(i);
            }
        }

        System.out.println(symmetricDifference);

    }
}
//[1, 2, 4, 5]