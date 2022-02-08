package NIX.excemple_13;
//Напишите программу, которая посчитает среднее значение в массиве положительных чисел. Проверьте работу программы на нескольких массивах
//Ввод: [1, 2, 7, 30, 5, 70, 44]
//Вывод: 22.714

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 7, 30, 5, 70, 44};
        double middle = 0;
        for (int i : array) {
            middle += i;
        }
        System.out.println(middle/array.length);
    }
}
