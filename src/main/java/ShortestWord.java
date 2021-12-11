public class ShortestWord {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        String shortest = words[0];
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }
        return shortest.length();
    }
}
