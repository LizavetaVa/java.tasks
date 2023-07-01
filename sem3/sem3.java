package sem3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Iterator;


public class sem3 {

    Object object = new Object();
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list.add("Hi");
        list.add(0, "Good");

        list2.addAll(list);
        // list2.addAll(4, list);

        list.size();


         ArrayList<Integer> listint = new ArrayList<>();
         ArrayList<Integer> listint2 = new ArrayList<>();
         ArrayList<Integer> temp = new ArrayList<>();

         for (int i = 0; i < 10; i++) {
            listint.add(new Random().nextInt(50)+1);
            listint2.add(new Random().nextInt(50)+1);
            if(listint(i)%listint(i) == 0)
                temp.add(listint(i));

         }
         System.out.println(listint);
         System.out.println(listint2);
         System.out.println("-".repeat(20));
         System.out.println(listint);
         System.out.println(temp);
        
    }
    private static int listint(int i) {
        return 0;
    }

}
