package NIX.excemple_10;
//Напишите генератор случайных чисел (от 1 до 7), выведите день недели соответствующий числу
// 	Вывод:
//1 - Понедельник
//3 - Среда

public class Solution {
    public static void main(String[] args) {
        int a = 1 + (int) (Math.random() * 7);
        switch (a) {
            case 1: {
                System.out.println(a + " - Понедельник");
                break;
            }
            case 2: {
                System.out.println(a + " - Вторник");
                break;
            }
            case 3: {
                System.out.println(a + " - Среда");
                break;
            }
            case 4: {
                System.out.println(a + " - Четверг");
                break;
            }
            case 5: {
                System.out.println(a + " - Пятница");
                break;
            }
            case 6: {
                System.out.println(a + " - Суббота");
                break;
            }
            case 7: {
                System.out.println(a + " - Воскресенье");
                break;
            }
        }
    }
}
