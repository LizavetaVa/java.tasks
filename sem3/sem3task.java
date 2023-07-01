// Формат сдачи: ссылка на подписанный git-проект.
// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package sem3;

import java.util.ArrayList;
import java.util.Random;

public class sem3task {
    public static void main(String[] args) {
        
        ArrayList<Integer> randomList = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            randomList.add(new Random().nextInt(50));
        }
        System.out.printf("Начальный список: ");
        System.out.println(randomList);

        for(int i = 0; i < randomList.size(); i++){
            if (randomList.get(i) % 2 != 0){
                odd.add(randomList.get(i));
            }
        }
        System.out.printf("Список с нечетными значениями: ");
        System.out.println(odd);

        int min = randomList.get(0);
        for(int i = 1; i < randomList.size(); i++){
            if (randomList.get(i) < min){
                min = randomList.get(i);
            }
        }
        System.out.printf("Минимальное значение: ");
        System.out.println(min);

        int max = randomList.get(0);
        for(int i = 1; i < randomList.size(); i++){
            if (randomList.get(i) > max){
                max = randomList.get(i);
            }
        }
        System.out.printf("Максимальное значение: ");
        System.out.println(max);

        float average = 0;
        int sum = 0;

        for(int i = 0; i < randomList.size(); i++){
                sum += randomList.get(i);
        }
        average = sum/randomList.size();
        System.out.printf("Среднее значение: ");
        System.out.println(average);


}
}
