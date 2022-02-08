package NIX.excemple_5;
//Создайте массив чисел и выведите этот массив на экран
//Вывод: 1,2,3,4,7,15

public class Solution {
    public static void main(String[] args) {
        int [] array = new int[] {1, 2, 3, 4, 7, 15};

        String s = "";
        for (int i : array) {
            s = (s + i) + ",";
        }
        System.out.print(s.substring(0, s.length() - 1));
    }
}
