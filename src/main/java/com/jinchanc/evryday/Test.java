package com.jinchanc.evryday;

import java.math.BigDecimal;
import java.util.*;

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

    /**
     * 2025/3/24=8
     * <a href="https://leetcode.cn/problems/minimize-string-length/?envType=daily-question&envId=2025-03-28">2716. 最小化字符串长度</a>
     * @param s
     */
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }

    /**
     * 2025/3/31
     * <a href="https://leetcode.cn/problems/percentage-of-letter-in-string/?envType=daily-question&envId=2025-03-31">2278. 字母在字符串中的百分比</a>
     */
    public static int percentageLetter(String s, char letter) {
        if (!s.contains(String.valueOf(letter)))
            return 0;
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == letter)
                count++;
        }
        System.out.println(count + " " + s.length());
        BigDecimal b1 = new BigDecimal(String.valueOf(count));
        BigDecimal b2 = new BigDecimal(String.valueOf(s.length()));
        BigDecimal b3 = new BigDecimal(String.valueOf(100));
        return (b1.divide(b2)).multiply(b3).intValue();
    }

    public static void main(String[] args) {

        System.out.println(percentageLetter("vmvvvvvzrvvpvdvvvvyfvdvvvvpkvvbvvkvvfkvvvkvbvvnvvomvzvvvdvvvkvvvvvvvvvlvcvilaqvvhoevvlmvhvkvtgwfvvzy", 'v'));
        BigDecimal b1 = new BigDecimal(String.valueOf(59));
        BigDecimal b2 = new BigDecimal(String.valueOf(100));
        BigDecimal b3 = new BigDecimal(String.valueOf(100));


        System.out.println((b1.divide(b2)).multiply(b3).intValue());
    }
}
