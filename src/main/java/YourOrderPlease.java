public class YourOrderPlease {
    public static String order(String words) {
        final String[] strings = words.split(" ");
        StringBuilder order = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            for (String string : strings) {
                if (string.contains(String.valueOf(i + 1))) {
                    order.append(string).append(" ");
                }
            }
        }
        return order.toString().trim();
    }
}