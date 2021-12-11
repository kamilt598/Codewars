import java.util.*;

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {
        Set<String> r = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int i1 = 0; i1 < array2.length; i1++) {
                if (array2[i1].contains(array1[i])) {
                    r.add(array1[i]);
                }
            }
        }
        ArrayList<String> r1 = new ArrayList<>(r);
        Collections.sort(r1);
        return r1.toArray(new String[r.size()]);
    }
}
