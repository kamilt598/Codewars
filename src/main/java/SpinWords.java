public class SpinWords {
    public String spinWords(String sentence) {
        String[] tab = sentence.split(" ");
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            if (i > 0) {
                words.append(" ");
            }
            if (tab[i].length() >= 5) {
                words.append(new StringBuilder(tab[i]).reverse());
            } else {
                words.append(tab[i]);
            }
        }
        return words.toString();
    }
}
