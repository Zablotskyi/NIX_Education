package NIX.excemple_16;
//Напишите программу, которая найдет дубликаты в массиве чисел. Проверьте работу программы на нескольких массивах
//Ввод: [1, 2, 2, 30, 5, 70, 44, 30]
//Вывод: [2, 30]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 2, 30, 5, 70, 44, 30};
        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < array.length; i ++) {
            for (int j = i + 1; j < array.length; j ++) {
                if (array[i] == array[j]) {
                    duplicate.add(array[i]);
                }
            }
        }
        System.out.println(duplicate);
    }
}
