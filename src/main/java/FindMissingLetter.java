public class FindMissingLetter {
    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((int) array[i] != (int) array[i + 1] - 1) {
                return (char) ((int) array[i] + 1);
            }
        }
        return ' ';
    }
}
