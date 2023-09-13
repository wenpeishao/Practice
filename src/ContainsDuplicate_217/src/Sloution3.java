import java.util.HashMap;

public class Sloution3 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num) & (map.get(num).equals(1))){
                return true;
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return false;
    }

}
