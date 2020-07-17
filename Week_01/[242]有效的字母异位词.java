//给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。 
//
// 示例 1: 
//
// 输入: s = "anagram", t = "nagaram"
//输出: true
// 
//
// 示例 2: 
//
// 输入: s = "rat", t = "car"
//输出: false 
//
// 说明: 
//你可以假设字符串只包含小写字母。 
//
// 进阶: 
//如果输入字符串包含 unicode 字符怎么办？你能否调整你的解法来应对这种情况？ 
// Related Topics 排序 哈希表 
// 👍 217 👎 0


import java.util.HashMap;
import java.util.HashSet;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {

//        return method1(s, t);
        return method2(s, t);

    }

    // leetCode 上的一种方法，采用数组计数，时空：O(n), O(n)
    private boolean method2(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] c = new int[26];
        for (char c1 : s.toCharArray()) {
            c[c1 - 'a']++;
        }
        for (char c1 : t.toCharArray()) {
            c[c1 - 'a']--;
        }
        for (int i : c) {
            if (i != 0) return false;
        }
        return true;
    }

    // 可能下午没睡醒，用了两个 HashMap 实现。时间复杂度为 O(n)， 但是效率底下！
    private boolean method1(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map_s.containsKey(c)) {
                map_s.put(c, map_s.get(c) + 1);
            } else {
                map_s.put(c, 1);
            }
        }
        for (char c : t.toCharArray()) {
            if (map_s.containsKey(c)) {
                if (map_t.containsKey(c)) {
                    map_t.put(c, map_t.get(c) + 1);
                } else {
                    map_t.put(c, 1);
                }
            } else return false;
        }

        for (Character i : map_s.keySet()) {
            if (!map_t.containsKey(i)) return false;
            if (map_s.get(i).intValue() != map_t.get(i).intValue()) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
