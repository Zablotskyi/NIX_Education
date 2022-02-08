package NIX.excemple_9;
//Создайте программу, которая выведет на экран числа фибоначи до указанного числа. Число должно приходить в аргументах
//Ввод: 50
//Вывод: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class Solution {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z;
        System.out.print(x + " " + y + " ");
        for (int i = 3; i <= Integer.parseInt(args[0]); i ++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
        System.out.println();
    }
}
