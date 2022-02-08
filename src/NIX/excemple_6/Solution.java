package NIX.excemple_6;
//Создайте программу, которая переводит температуру в Фарингейтах в температуру по цельсию
//Ввод: 41
//Вывод: 5

public class Solution {
    public static void main(String[] args) {
        int f = Integer.parseInt(args[0]);
        double c = f / 8.2;

        System.out.println("temp " + c + " C");
    }
}
