package NIX.excemple_7;
//Создайте программу, которая принимает целое число и суммирует его цифры. Число должно приходить в аргументах
//Ввод: 123
//Вывод: 6

public class Solution {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int sum = 0;

        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
