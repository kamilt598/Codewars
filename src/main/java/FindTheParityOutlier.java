import java.util.ArrayList;
import java.util.List;

public class FindTheParityOutlier {

    static int find(int[] integers) {
        final List<Integer> even = new ArrayList<>();
        final List<Integer> odd = new ArrayList<>();
        for (int integer : integers) {
            if (integer % 2 == 0) {
                even.add(integer);
            } else {
                odd.add(integer);
            }
        }
        return even.size() > odd.size() ? odd.get(0) : even.get(0);
    }
}
