import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        int[] costAmountWeek = {3_000, 5_000, 2_000, 4_000, 1_000};
        int sum = 0;
        for (int index : costAmountWeek) {
            sum += index;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Task 2");
        int maxSum = 0;
        int minSum = Integer.MAX_VALUE;
        for (int element : costAmountWeek) {
            if (element > maxSum) {
                maxSum = element;
            }
            if (element < minSum) {
                minSum = element;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSum + " рублей");
        System.out.println("Минимальная сумма трат за неделю составила " + minSum + " рублей");

        System.out.println("Task 3");
        sum = 0;
        for (int cos = 0; cos < costAmountWeek.length; cos++) {
            sum += costAmountWeek[cos];
        }
        double sumFraction = (double) sum / costAmountWeek.length;
        System.out.printf("Средняя сумма трат за месяц составила %.3f рублей%n", sumFraction);

        System.out.println("Task 4-1");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int number = reverseFullName.length-1; number >= 0; number--) {
            System.out.print(reverseFullName[number]);
        }
        System.out.println();
        System.out.println("Task 4-2");
        char[] reverseFullName2 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i != reverseFullName2.length - (1 + i); i++) {
            char symbolBehindI = reverseFullName2[i];
            reverseFullName2[i] = reverseFullName2[reverseFullName2.length - (1 + i)];
            reverseFullName2[reverseFullName2.length - (1 + i)] = symbolBehindI;
        }
        System.out.println(Arrays.toString(reverseFullName2));
        System.out.println("Task 4-3");
        char[] reverseFullName3 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char temp = 0; //дополнительная перменная для временного хранения значения
        int leftOrder = 0;
        int rightOrder = reverseFullName3.length - 1;
        while (leftOrder < rightOrder) {
            temp = reverseFullName3[leftOrder];
            reverseFullName3[leftOrder] = reverseFullName3[rightOrder];
            reverseFullName3[rightOrder] = temp;
            leftOrder++;
            rightOrder--;
        }
        System.out.println(reverseFullName3);
    }

}
