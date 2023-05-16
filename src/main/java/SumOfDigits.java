public class SumOfDigits {
    public static int sum(int n) {
        int number = n;
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
            if(number == 0 && sum >= 10) {
                number = sum;
                sum = 0;
            }
        }
        return sum;
    }
}