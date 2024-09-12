/* Программа для упрощения решения биологических задач */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Открываем поток входа

        System.out.print("Введите строку: "); // запрашиваем у пользователя ввод
        String str = input.nextLine();
        System.out.println(str);

        StringBuilder out1 = new StringBuilder(str); // Создаём объект-строку, которую можно будет нормально изменять
        out1.reverse(); // Переворачиваем (принцип антипараллельности)
        System.out.println(out1);

        input.close(); // Закрываем поток входа
    }
}