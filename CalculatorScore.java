public class CalculatorScore {
    public static void main(String[] args) {
        int[] scores = {85, 90, 78, 92, 88}; // Sample array of scores
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        double average = (double) sum / scores.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
