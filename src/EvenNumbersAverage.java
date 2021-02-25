public class EvenNumbersAverage {
    private static double getEvenNumbersAverage(int[] array) {
        int sum = 0;
        int count = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                sum += e;
                count++;
            }
        }

        return sum / (double) count;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        System.out.println("The average of even numbers: " + getEvenNumbersAverage(array));
    }
}
