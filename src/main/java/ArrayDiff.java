import java.util.ArrayList;
import java.util.List;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            c.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            c.add(b[i]);
            d.add(b[i]);
        }
        c.removeAll(d);
        int[] e = new int[c.size()];
        for (int i = 0; i < c.size(); i++) {
            e[i] = c.get(i);
        }
        return e;
    }
}