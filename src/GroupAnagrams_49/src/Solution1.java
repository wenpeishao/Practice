import java.util.*;

class Solution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for (String s: strs) {
            char [] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(s);

        }
        return new ArrayList<>(map.values());
    }
}
