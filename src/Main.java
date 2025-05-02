import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] costAmountWeek = {3_000, 5_000, 2_000, 4_000, 1_000};
        int sum = 0;
        for (int j : costAmountWeek) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task 2");
        int maxSum = 0;
        int minSum = 6000;
        for (int i : costAmountWeek) {
            if (i > maxSum) {
                maxSum = i;
            }
            if (i < minSum) {
                minSum = i;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSum + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей");

        System.out.println("Task 3");
        sum = 0;
        int dayOfMonth = 31;
        for (int i = 0; i < costAmountWeek.length; i++) {
            sum += costAmountWeek[i];
        }
        double sumFraction = sum;
        sumFraction = (double) sum / dayOfMonth;
        System.out.printf("Средняя сумма трат за месяц составила %.3f рублей%n", sumFraction);

        System.out.println("Task 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}