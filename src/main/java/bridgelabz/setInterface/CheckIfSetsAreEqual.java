package bridgelabz.setInterface;

import java.util.HashSet;

public class CheckIfSetsAreEqual {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        for(int i=1;i<=10;i++){
            set1.add(i);
            set2.add(i);
        }

        System.out.println(set1.equals(set2));
    }
}
