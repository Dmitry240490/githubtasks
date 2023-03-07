package coding.algorithm_12;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Написать метод, на вход которого подается число, нужно:
// # если число четное, вывести на экран сообщение, что это четное число
// # если число делится на 10, вывести одну десятую числа
// # если число делится на 3, вывести факториал этого числа
// # если выполняется несколько условий, выводим все соответствующие варианты
 */
public class Algorithm {

    public static void main(String[] args) {
        int inputNumber;
        long result;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число:");
            inputNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не целое число!");
            return;
        }

        for (int i = 1; i <= inputNumber; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    counter = counter + 1;
                }
            }
        }

        if (inputNumber < 0)
            System.out.println("Отрицательное число! Невозможно вывести факториал данного числа!");
        if (inputNumber == 0)
            System.out.println("Ноль!");
        if (inputNumber % 2 == 0)
            System.out.println("Четное число");
        if (!(inputNumber % 2 == 0))
            System.out.println("Нечетное число");
        if (inputNumber % 10 == 0)
            System.out.println("Число делится на 10! " + "Вывод 1/10 данного числа: " + (inputNumber / 10));
        if (inputNumber % 3 == 0) {
            result = getFactorial(inputNumber);
            System.out.println("Число делится на 3, факториал данного числа " + inputNumber + " is " + result + ".");
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