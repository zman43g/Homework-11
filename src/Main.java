//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] moneySpent = {570, 30, 233, 679, 2};
        int sum = 0;
        for (int current : moneySpent) {
            sum += current;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println("Задача 2");
        int[] spentPerDay = {10, 30, 50, 22, 84};
        int maxSpent = -1;
        int minSpent = 50000;
        for (int current : spentPerDay) {
            if (current > maxSpent) {
                maxSpent = current;
            }
            if (current < minSpent) {
                minSpent = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minSpent + " рублей. Максимальная сумма трат за неделю составила " + maxSpent + " рублей.");

        System.out.println("Задача 3");
        int[] moneySpent2 = {890, 9300, 1233, 1679, 9822};
        double avg = 0;
        for (int current : moneySpent2) {
            avg += current;
        }
        avg = avg / moneySpent2.length;
        System.out.println("Сумма трат за месяц составила " + avg + " рублей");

        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char aux;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            aux = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - i - 1] = aux;
        }
        for (char c : reverseFullName) {
            System.out.print(c);
        }

    }
}