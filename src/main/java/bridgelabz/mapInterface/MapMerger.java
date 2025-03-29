package bridgelabz.mapInterface;

import java.util.*;

class MapMerger {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);
        System.out.println(mergedMap); // Output: {A=1, B=5, C=4}
    }

    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> mergedMap = new HashMap<>();

        for (String key : map1.keySet()) {
            mergedMap.put(key, map1.get(key));
        }

        for (String key : map2.keySet()) {
            if (mergedMap.containsKey(key)) {
                mergedMap.put(key, mergedMap.get(key) + map2.get(key));
            } else {
                mergedMap.put(key, map2.get(key));
            }
        }

        return mergedMap;
    }
}

//{A=1, B=5, C=4}