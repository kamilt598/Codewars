public class MultiplicationTable {
    public static int[][] multiplicationTable(int n) {
        final int[][] table = new int[n][n];
        for (int i = 0; i < n; i++) {
            final int[] innerTable = new int[n];
            for (int j = 0; j < n; j++) {
                innerTable[j] = (i + 1) * (j + 1);
            }
            table[i] = innerTable;
        }
        return table;
    }
}