package org.example;

public class TaskB {

    // 1. Вывести на экран таблицу умножения
    public static void printMultiplicationTable() {
        System.out.println("Таблица умножения:");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%3d ", i * j);
            }
            System.out.println();
        }
    }

    // 2. Вывести элементы массива в обратном порядке
    public static void printArrayInReverse(int[] array) {
        System.out.println("Массив в обратном порядке:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 3. Определить принадлежность k интервалам
    public static void checkInterval(double k, double n, double m) {
        System.out.println("Проверка принадлежности чисел интервалам:");
        System.out.println("k = " + k + ", n = " + n + ", m = " + m);

        System.out.println("k принадлежит интервалу (n, m]: " + (k > n && k <= m));
        System.out.println("k принадлежит интервалу [n, m): " + (k >= n && k < m));
        System.out.println("k принадлежит интервалу (n, m): " + (k > n && k < m));
        System.out.println("k принадлежит интервалу [n, m]: " + (k >= n && k <= m));
    }

    // 4. Вывести все числа от 1 до 100, которые делятся на 3 без остатка
    public static void printNumbersDivisibleBy3() {
        System.out.println("Числа от 1 до 100, которые делятся на 3 без остатка:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // 5. Сколько значащих нулей в двоичной записи числа 129
    public static int countSignificantZeros(int num) {
        String binary = Integer.toBinaryString(num);
        int count = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '0') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    // 6. Найти основание системы счисления, если 81 в десятичной системе записано как 100
    public static int findBase(int number, String representation) {
        int base = 2;
        while (true) {
            try {
                int converted = Integer.parseInt(representation, base);
                if (converted == number) {
                    return base;
                }
            } catch (NumberFormatException e) {
                // Если возникла ошибка преобразования, пробуем следующее основание
            }
            base++;
        }
    }

    // 7. Перевести число из десятичной системы в любую другую
    public static String convertDecimalToBase(int number, int base) {
        if (base < 2 || base > 36) {
            throw new IllegalArgumentException("Основание системы счисления должно быть от 2 до 36.");
        }
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            int remainder = number % base;
            result.insert(0, Character.forDigit(remainder, base));
            number /= base;
        }
        return result.toString();
    }

    // 8. Перевести число из одной системы счисления в другую
    public static String convertBaseToBase(String number, int fromBase, int toBase) {
        int decimal = Integer.parseInt(number, fromBase);
        return convertDecimalToBase(decimal, toBase);
    }

    // 9. Ввести число от 1 до 12 и вывести название месяца
    public static void printMonthName(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Некорректный ввод. Введите число от 1 до 12.");
            return;
        }
        String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        System.out.println("Месяц: " + months[month - 1]);
    }
}
