import java.util.Hashtable;

public class Solution1 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Hashtable<Character ,Integer> map1 = new Hashtable<>();
        Hashtable<Character ,Integer> map2 = new Hashtable<>();
        for(char c: s.toCharArray()){
            map1.put(c, map1.getOrDefault(c, 0)+1);
        }
        for(char c: t.toCharArray()){

            map2.put(c, map2.getOrDefault(c, 0)+1);
        }
        for(char c:map1.keySet()){
            if(!map1.get(c).equals(map2.getOrDefault(c, 0))){
                return false;
            }

        }

        return true;
    }
}
