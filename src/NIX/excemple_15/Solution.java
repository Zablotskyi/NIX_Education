package NIX.excemple_15;
//Напишите программу, которая инвертирует массив (значения должны идти в обратном порядке). Проверьте работу программы на нескольких массивах
//Ввод: [1, 2, 7, 30, 5, 70, 44]
//Вывод: [44, 70, 5, 30, 7, 2, 1]

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 7, 30, 5, 70, 44};
        int [] copyArray = new int[array.length];

        int count = 0;
        for (int i = array.length - 1; i >= 0; i --) {
            copyArray[count] = array[i];
            count ++;
        }
        System.out.println(Arrays.toString(copyArray));
    }
}
