package leetCodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _387_FirstUniqueCharacter {
    public int firstUniqueCharacter(String s) {
        Map<Character, Integer> maps =  new HashMap<Character, Integer>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(!maps.containsKey(c)) {
                maps.put(c, 1);
            }else {
                maps.put(c, maps.get(c) + 1);
            }
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(maps.get(c) == 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> maps =  new HashMap<Integer, Integer>();

        maps.put(1, 1);
        maps.put(7, 1);
        maps.put(6, 1);
        maps.put(4, 1);
        maps.put(5, 1);
        maps.put(4, 2);
        for(Map.Entry<Integer, Integer> entry : maps.entrySet()) {
            System.out.println("key: "+ entry.getKey()+" value: "+ entry.getValue());
        }
    }
}
