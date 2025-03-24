package com.jinchanc.evryday;

/**
 * @author 475636591@qq.com
 * @since 2025/3/24 10:39
 */
public class Test {

    /**
     * 2025/3/24
     * <a href="https://leetcode.cn/problems/count-prefixes-of-a-given-string/description/?envType=daily-question&envId=Invalid%20Date">2255. 统计是给定字符串前缀的字符串数目</a>
     *
     * @param words
     * @param s
     * @return int
     */
    public int countPrefixes(String[] words, String s) {
        // 缓存不同长度的前缀
        int count = 0;
        String[] prefixArray = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            prefixArray[i] = s.substring(0, i + 1);
        }

        // 注意words[i].length <= s.length，words[i] = wab, s = "w";这周情况不算
        for (String word : words) {
            if (word.length() <= s.length() && word.startsWith(prefixArray[word.length()-1])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Test().countPrefixes(new String[]{"aaaaaaaa", "a"}, "aa"));
    }
}
