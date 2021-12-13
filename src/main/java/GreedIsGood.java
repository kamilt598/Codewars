public class GreedIsGood {
    public static int greedy(int[] dice) {
        int[] tab = {0, 0, 0, 0, 0, 0};
        int sum = 0;
        for (int i = 0; i < dice.length; i++) {
            if (dice[i] == 1) {
                tab[0]++;
            } else if (dice[i] == 2) {
                tab[1]++;
            } else if (dice[i] == 3) {
                tab[2]++;
            } else if (dice[i] == 4) {
                tab[3]++;
            } else if (dice[i] == 5) {
                tab[4]++;
            } else if (dice[i] == 6) {
                tab[5]++;
            }
        }
        if (tab[0] == 3) {
            sum = sum + 1000;
        } else if (tab[0] > 3) {
            sum = sum + 1000 + ((tab[0] - 3) * 100);
        } else if (tab[0] > 0) {
            sum = sum + (tab[0] * 100);
        }
        if (tab[1] >= 3) {
            sum = sum + 200;
        }
        if (tab[2] >= 3) {
            sum = sum + 300;
        }
        if (tab[3] >= 3) {
            sum = sum + 400;
        }
        if (tab[4] == 3) {
            sum = sum + 500;
        } else if (tab[4] > 3) {
            sum = sum + 500 + ((tab[4] - 3) * 50);
        } else if (tab[4] > 0) {
            sum = sum + (tab[4] * 50);
        }
        if (tab[5] >= 3) {
            sum = sum + 600;
        }
        return sum;
    }
}
