package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        return functionMap.containsValue(requiredValue);
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> map = new HashMap<>();

        Iterator<Integer> it = sourceList.iterator();
        while(it.hasNext()) {
            int key = it.next();
            int value = ((key * 5) + 2);

            map.put(key,value);
        }

        return map;
    }
}
