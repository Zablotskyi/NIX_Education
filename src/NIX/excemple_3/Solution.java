package NIX.excemple_3;
//Создайте программу, которая выводит введенные имя и фамилию на экран в разных строках. Имя и фамилия должны приходить в аргументах
//        Ввод: Ivan Ivanov
//        Вывод:
//        Ivan
//        Ivanov

public class Solution {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
    }
}
