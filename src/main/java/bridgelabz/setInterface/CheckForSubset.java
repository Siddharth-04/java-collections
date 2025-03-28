package bridgelabz.setInterface;

import java.util.HashSet;

public class CheckForSubset {

    public static boolean checkSubset(HashSet<Integer> set1,HashSet<Integer> set2){
        for(Integer i:set1){
            if(!set2.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        if(checkSubset(set1,set2) || checkSubset(set2,set1)){
            System.out.println("One set is subset of another");
        }
        else{
            System.out.println("Both sets are not subset of each another");
        }
    }
}
//One set is subset of another