package 力扣;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 字母异位分组 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        return new ArrayList<>(Arrays.stream(strs)
                .collect(Collectors.groupingBy(str -> {
                    int[] counter = new int[26];
                    for (int i = 0; i < str.length(); i++) {
                        counter[str.charAt(i) - 'a']++;
                    }
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < 26; i++) {
                        // 这里的 if 是可省略的，但是加上 if 以后，生成的 sb 更短，后续 groupingBy 会更快。
                        if (counter[i] != 0) {
                            sb.append((char) ('a' + i));
                            sb.append(counter[i]);
                        }
                    }
                    return sb.toString();
                })).values());
    }

    public static void main(String[] args) {
        String []strs={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list=groupAnagrams(strs);
        System.out.println(list);
    }
}