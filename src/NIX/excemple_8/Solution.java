package NIX.excemple_8;
//Создайте программу, которая выведет на экран таблицу умножения

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i ++) {
            for (int j = 1; j < 10; j ++) {
                System.out.print(j * i + " ");
            }
            System.out.println("");
        }

    }
}
