package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();

        sentence = sentence.replaceAll("[,.:;!-=*/@]", "");
        
        if(!sentence.isEmpty()){
            String[] parts = sentence.toLowerCase().split("\\s+|(?=[,.])");

            for(String s : parts){
                if(!map.containsKey(s)) map.put(s,1);
                else map.put(s, map.get(s) + 1);
            }
        }

        return map;
    }
}
