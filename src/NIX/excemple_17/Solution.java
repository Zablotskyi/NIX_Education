package NIX.excemple_17;
//Напишите программу, которая найдет пересечение в двух массивах чисел. Проверьте работу программы на нескольких массивах
//Ввод: [1, 2, 7, 30, 5, 70, 44] , [1, 4, 17, 30, 28, 99]
//Вывод: [1, 30]

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] array1 = new int[] {1, 2, 7, 30, 5, 70, 44};
        int[] array2 = new int[] {1, 4, 17, 30, 28, 99};
        List<Integer> duplicate = new ArrayList<>();

        for (int i = 0; i < array1.length; i++)
        {
            int a = array1[i];
            for (int j = 0; j < array2.length; j++)
            {
                if (a == array2[j])
                {
                    duplicate.add(a);
                    break;
                }
            }
        }
        System.out.println(duplicate);
    }
}
