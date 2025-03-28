package bridgelabz.setInterface;

import java.util.HashSet;

public class UnionAndIntersectionOfSet {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        HashSet<Integer> union = new HashSet<Integer>();
        HashSet<Integer> intersection = new HashSet<Integer>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        //union
        for (Integer i : set1) {
            if(set2.contains(i)){
                intersection.add(i);
            }
            union.add(i);
        }
        for (Integer i : set2) {
            union.add(i);
        }

        System.out.println("Intersection : "+intersection);
        System.out.println("Union : " + union);
    }
}
