// 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int i = new Random().nextInt(2000);
        System.out.println(i);
    }
}
