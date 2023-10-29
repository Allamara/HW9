import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        tasks();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] accountingBook = new int[30];
        for (int i = 0; i < accountingBook.length; i++) {
            accountingBook[i] = random.nextInt(100_000) + 100_000;
        }
        return accountingBook;
    }

    public static void tasks() {
        int[] accountingBook = generateRandomArray();

        //TASK_1
        {
            int sum = 0;
            System.out.println("ЗАДАЧА_1");
            for (int current : accountingBook) {
                sum += current;
            }
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        }
        //TASK_2
        {
            int minCurrent = accountingBook[0];
            int maxCurrent = -1;
            System.out.println("ЗАДАЧА_2");
            for (int current : accountingBook) {
                if (current > maxCurrent) {
                    maxCurrent = current;
                }
                if (current < minCurrent) {
                    minCurrent = current;
                }
            }
            System.out.println("Минимальная сумма трат за день составила " + minCurrent + " рублей.");
            System.out.println("Максимальная сумма трат за день составила " + maxCurrent + " рублей.");
        }
        //TASK_3
        {
            int sum = 0;
            double averageValue;
            System.out.println("ЗАДАЧА_3");
            for (int current : accountingBook) {
                sum += current;
            }
            averageValue = (double) sum / accountingBook.length;
            System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            System.out.println("Средняя сумма трат за месяц составила " + averageValue + " рублей");
        }
        //TASK_4
        {
            System.out.println("ЗАДАЧА_3");
            char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length - 1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);
            }
        }

    }
}

