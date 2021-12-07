import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        /*List<Integer> c = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (b.length == 0) {
                c.add(a[i]);
            }
            for (int j = 0; j < b.length; j++) {
                if (a.length == 0) {
                    c.add(b[i]);
                } else if (a[i] != b[j]) {
                    c.add(a[i]);
                }
            }
        }
        int[] d = new int[c.size()];
        for (int i = 0; i < c.size(); i++) {
            d[i] = c.get(i);
        }
        return d;*/
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            c.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            d.add(a[i]);
        }

        int[] e = new int[c.size()];
        for (int i = 0; i < c.size(); i++) {
            e[i] = c.get(i);
        }
        return e;

    }
}