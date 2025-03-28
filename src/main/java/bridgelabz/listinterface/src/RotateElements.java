package bridgelabz.listinterface.src;

import java.util.ArrayList;
import java.util.Collections;

public class RotateElements {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 1; i<=5; i++){
            arrayList.add(i*10);
        }

        Collections.rotate(arrayList, 2);
        System.out.println("ArrayList : " + arrayList);
    }
}
//ArrayList : [40, 50, 10, 20, 30]