package NIX.excemple_14;
//Напишите программу, которая посчитает min и max значение в массиве. Проверьте работу программы на нескольких массивах
//Ввод: [24, 13, -1, 2, 4, 70, 44]
//Вывод: min = -1, max = 70

public class Solution {
    public static void main(String[] args) {
        int [] array = new int[] {24, 13, -1, 2, 4, 70, 44};
        int min = 0;
        int max = 0;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("min=" + min + ", " + "max=" + max);
    }
}
