package NIX.excemple_12;
//Напишите программу, которая отсортирует массив по возрастанию. Проверьте работу программы на нескольких массивах
//Ввод: [24, 13, -1, 2, 4, 70, 44]
//Вывод: [-1, 2, 4, 13, 24, 44, 70]

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = new int[] {24, 13, -1, 2, 4, 70, 44};
        Arrays.sort(array);
        String s = "";
        for (int i : array) {
            s = (s + i) + ",";
        }
        System.out.print(s.substring(0, s.length() - 1));
    }
}
