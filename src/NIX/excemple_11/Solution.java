package NIX.excemple_11;
//Создайте программу, которая будет выводить числа последовательно в виде треугольника (floyd triangle).
//Число должно приходить в аргументах, пример вывода в следующей колонке
//Ввод: 5
//Вывод:
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15

public class Solution {
    public static void main(String[] args) {
        int step = Integer.parseInt(args[0]);
        int number = 0;
        for (int i = 0; i <= step; i ++) {
            for (int j = i; j > 0; j --) {
                System.out.print(number += 1);
            }
            System.out.println();
        }
    }
}
