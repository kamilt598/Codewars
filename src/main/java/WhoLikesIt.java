public class WhoLikesIt {
    public static String whoLikesIt(String... names) {
        final String text;
        if (names.length == 1) {
            text = names[0] + " likes this";
        } else if (names.length == 2) {
            text = names[0] + " and " + names[1] + " like this";
        } else if (names.length == 3) {
            text = names[0] + ", " + names[1] + " and " + names[2] + " like this";
        } else if (names.length > 3) {
            text = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
        } else {
            text = "no one likes this";
        }
        return text;
    }
}
