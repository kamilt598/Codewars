import java.util.ArrayList;
import java.util.List;

public class LongestConsec {
    public static String longestConsec(String[] strarr, int k) {
        if (strarr.length < k || k <= 0) {
            return "";
        }
        String[] concat = new String[strarr.length - k + 1];
        for (int i = 0; i < k; i++) {
            for (int i1 = 0; i1 < concat.length; i1++) {
                if (i == 0) {
                    concat[i1] = strarr[i1];
                } else {
                    concat[i1] = concat[i1] + strarr[i1+i];
                }
            }
        }
        String max = "";
        for (int i = 0; i < concat.length; i++) {
            System.out.println(concat[i]);
            if(concat[i].length() > max.length()) {
                max = concat[i];
            }
        }
        return max;
    }
}
