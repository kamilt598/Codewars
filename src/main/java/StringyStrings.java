public class StringyStrings {

    public static String stringy(int size) {
        String numbers = "";
        for (int i = 1; i <= size; i++) {
            if (i % 2 == 0) {
                numbers += "0";
            } else {
                numbers += "1";
            }
        }
        System.out.println(numbers);
        return numbers;
    }
}
