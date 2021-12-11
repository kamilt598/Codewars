import java.util.Arrays;

public class MaxDiffLength {
    public static int mxdiflg(String[] a1, String[] a2) {
        if (Arrays.asList(a1).isEmpty() || Arrays.asList(a2).isEmpty()) {
            return -1;
        } else {
            String maxA1 = a1[0];
            String maxA2 = a2[0];
            String minA1 = a1[0];
            String minA2 = a2[0];
            for (int i = 0; i < a1.length; i++) {
                if (a1[i].length() < minA1.length()) {
                    minA1 = a1[i];
                }
                if (a1[i].length() > maxA1.length()) {
                    maxA1 = a1[i];
                }
            }
            for (int i = 0; i < a2.length; i++) {
                if (a2[i].length() < minA2.length()) {
                    minA2 = a2[i];
                }
                if (a2[i].length() > maxA2.length()) {
                    maxA2 = a2[i];
                }
            }
            if (Math.abs(maxA1.length() - minA2.length()) > Math.abs(maxA2.length() - minA1.length())) {
                return Math.abs(maxA1.length() - minA2.length());
            } else {
                return Math.abs(maxA2.length() - minA1.length());
            }
        }
    }
}
