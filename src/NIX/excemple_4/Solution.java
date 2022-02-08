package NIX.excemple_4;
//Создайте программу, которая складывает / перемножает / вычитает / делит два числа и выводит на экран результат.
//Оба числа и желаемая операция должны приходить в аргументах
//Ввод: 12 40 sum
//Вывод: 52

public class Solution {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if (args[2].equals("sum")) {
            System.out.println(addition(a, b));
        }
        else if (args[2].equals("mul")) {
            System.out.println(multiplication(a, b));
        }
        else if (args[2].equals("sub")) {
            System.out.println(subtraction(a, b));
        }
        else if (args[2].equals("div")) {
            System.out.println(division(a, b));
        }
    }
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int subtraction(int a, int b) {
        return a - b;
    }
    public static float division(int a, int b) {
        float c = a / b;
        return c;
    }
}
