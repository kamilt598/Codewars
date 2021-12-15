public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        String[] tab = text.split("");
        String newText = "";
        for (int i = 0; i < tab.length; i++) {
            for (int i1 = 0; i1 < commentSymbols.length; i1++) {
                if(tab[i] == " " && tab[i+1] == commentSymbols[i1]) {

                }
            }
        }
        return "";
    }
}
