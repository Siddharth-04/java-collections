package bridgelabz.mapInterface;

import java.util.HashMap;
import java.util.Map;

class MaxValueFinder {
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 10);
        inputMap.put("B", 20);
        inputMap.put("C", 15);

        System.out.println("Key with max value: " + findMaxValueKey(inputMap)); // Output: B
    }

    public static String findMaxValueKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (String key : map.keySet()) {
            int value = map.get(key);
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        return maxKey;
    }
}
//Key with max value: B
