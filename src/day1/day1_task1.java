package day1;

/**
 * Описать разницу между i++ и ++i, привести пример.
 */

public class day1_task1 {
    public static void main(String[] args) {
        int i = 0;
        int x = i++;
        System.out.println("Пост-инкремент i++ возвращает значение переменной i до выполнения этого инкремента," +
                "\nт.е. при i=0 после x=i++: x=" + x + ", i=" + i + ".");
        i = 0;
        x = ++i;
        System.out.print("\nПрефикс-инкремент ++i возвращает значение уже измененной переменной," +
                "\nт.е. при i=0 после x=++i: x=" + x + ", i=" + i + ".");
    }
}