import java.util.HashSet;

class Solution2 {
    public boolean containsDuplicate(int[] nums) {
        HashSet ht = new HashSet<Integer>();
        for (Integer num: nums) {
            if (ht.contains(num)) {
                return true;
            }
            ht.add(num);
        }

        return false;
    }
}