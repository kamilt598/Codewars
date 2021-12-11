public class MultiplesOf3And5 {
    public int solution(int number) {
        if (number < 0) {
            return 0;
        } else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        }
    }
}
