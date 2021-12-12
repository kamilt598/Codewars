import java.util.Locale;

public class CamelCase {
    public static String camelCase(String str) {
        String[] tab = str.split("");
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].isBlank()) {
                continue;
            } else if (i == 0) {
                s.append(tab[i].toUpperCase(Locale.ROOT));
            } else if (tab[i - 1].isBlank()) {
                s.append(tab[i].toUpperCase(Locale.ROOT));
            } else {
                s.append(tab[i]);
            }
            System.out.println(s);
        }
        return s.toString();
    }

}
