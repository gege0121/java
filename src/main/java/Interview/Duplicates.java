package Interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Duplicates {
    public String findDuplicates(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Character[] res = new Character[s.length()];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            Character c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(s.charAt(i)) != 1) {
                res[j] = s.charAt(i);
                j++;
            }
            Character[] r1 = Arrays.copyOf(res, i);
            String string = String.valueOf(r1);
            return string;
        }
        return "no duplicates";
    }

    public static void main(String[] args) {
        Duplicates a = new Duplicates();
        String s1 = a.findDuplicates("fdgdfgff");
        System.out.println(s1);
    }
}
