import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int maxValue = MIN_VALUE;
        int minValue = MAX_VALUE;
        for (int i : arr) {
            if (i > maxValue) {
                maxValue = i;
            }

            if (i < minValue) {
                minValue = i;
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + minValue
                + " рублей. Максимальная сумма трат за день составила " + maxValue
                + " рублей");
    }
}