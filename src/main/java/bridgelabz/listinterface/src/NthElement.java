package bridgelabz.listinterface.src;

import java.util.LinkedList;

public class NthElement {
    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList();
        list.add('A');
        list.add('B');
        list.add('C');
        list.add('D');
        list.add('E');

        int n = list.size();
        int nthIndex = 2;

        int slow = 0;
        int fast = 0;

        for(int i=0 ; i<nthIndex ; i++){
            fast++;
        }

        for(int i=fast ; i<n ; i++){
            slow++;
        }

        System.out.println("Nth Index Element : " + list.get(slow));
    }
}
