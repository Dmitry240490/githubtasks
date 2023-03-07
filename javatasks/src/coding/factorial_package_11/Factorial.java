package coding.factorial_package_11;

import java.util.Scanner;

// TODO: Задание. Вычислить факториал
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int inputNumber = scanner.nextInt();
        scanner.close();
        long result;

        for (int i = 1; i <= inputNumber; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }
        }

        if (inputNumber < 0) {
            System.out.println("Некорректное число для вывода факториала.");
        } else {
            result = getFactorial(inputNumber);
            System.out.println("Факториал для " + inputNumber + " равен " + result + ".");
        }
    }

    public static long getFactorial(int inputNumber) {
        long result = 1;
        for (int i = 1; i <= inputNumber; i++) {
            result *= i;
        }
        return result;
    }
}