package sem3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class task {
    public static void main(String[] args) {
        ArrayList<Integer> integers1 = new ArrayList<>();
        ArrayList<Integer> integers2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers1.add(new Random().nextInt(50) + 1);
            integers2.add(new Random().nextInt(3) + 1);
        }
        System.out.println(integers1);
        System.out.println(integers2);
        System.out.println("-".repeat(20));

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (integers1.get(i) % integers2.get(i) == 0) {
                temp.add(integers1.get(i));
            }
        }
        integers1.removeAll(temp);
        System.out.println(integers1);
    }

}