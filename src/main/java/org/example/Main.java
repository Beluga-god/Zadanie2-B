package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Таблица умножения
        TaskB.printMultiplicationTable();

        // 2. Массив и вывод в обратном порядке
        System.out.println("\nВведите размер массива:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        TaskB.printArrayInReverse(array);

        // 3. Проверка принадлежности k интервалам
        System.out.println("\nВведите k, n, m для проверки интервалов:");
        double k = scanner.nextDouble();
        double n1 = scanner.nextDouble();
        double m = scanner.nextDouble();
        TaskB.checkInterval(k, n1, m);

        // 4. Числа от 1 до 100, делящиеся на 3
        TaskB.printNumbersDivisibleBy3();

        // 5. Значащие нули в двоичной записи числа
        System.out.println("\nВведите число для подсчета значащих нулей:");
        int num = scanner.nextInt();
        System.out.println("Значащие нули в двоичной записи числа " + num + ": " + TaskB.countSignificantZeros(num));

        // 6. Найти основание системы счисления
        System.out.println("\nВведите число и его представление в другой системе (например, 81 и 100):");
        int number = scanner.nextInt();
        String representation = scanner.next();
        System.out.println("Основание системы счисления: " + TaskB.findBase(number, representation));

        // 7. Перевод числа из десятичной системы в любую другую
        System.out.println("\nВведите число и основание системы счисления для перевода:");
        int decimal = scanner.nextInt();
        int base = scanner.nextInt();
        System.out.println("Число в системе счисления с основанием " + base + ": " + TaskB.convertDecimalToBase(decimal, base));

        // 8. Перевод числа из одной системы счисления в другую
        System.out.println("\nВведите число, основание исходной и нужной системы:");
        String numberInBase = scanner.next();
        int fromBase = scanner.nextInt();
        int toBase = scanner.nextInt();
        System.out.println("Число в системе счисления с основанием " + toBase + ": " + TaskB.convertBaseToBase(numberInBase, fromBase, toBase));

        // 9. Ввод месяца
        System.out.println("\nВведите число месяца от 1 до 12:");
        int month = scanner.nextInt();
        TaskB.printMonthName(month);
    }
}
