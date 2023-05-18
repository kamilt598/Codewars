import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        final List<String> list = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
        return "(" + list.get(0) + list.get(1) + list.get(2) + ") "
                + list.get(3) + list.get(4) + list.get(5) + "-"
                + list.get(6) + list.get(7) + list.get(8) + list.get(9);
    }
}
