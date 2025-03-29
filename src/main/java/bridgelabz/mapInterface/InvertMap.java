package bridgelabz.mapInterface;

import java.util.*;

class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (K key : map.keySet()) {
            V value = map.get(key);

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }

            invertedMap.get(value).add(key);
        }

        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> inverted = invertMap(inputMap);
        System.out.println(inverted); // Output: {1=[A, C], 2=[B]}
    }
}
//{1=[A, C], 2=[B]}