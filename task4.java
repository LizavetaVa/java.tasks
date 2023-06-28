// 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

public class task4 {

      public static int pow(int value, int powValue) {

   return (int) Math.pow(value, powValue);

}
    public static void main(String[] args) {
       
        int i = (int) (Math.random() * 2001);
        System.out.println("Рандомно выпавшее число: " + i);

        String binary = Integer.toBinaryString(i);
        System.out.println("Бинарное число со знаком: " + binary);

        String binary2 = (binary.substring(1)); 
        System.out.println("Бинарное число: " + binary2);

        int index = binary2.indexOf("1");
        System.out.println("Обратный индекс старшего старшего бита: " + index);

        int j = binary2.length();
        int n = pow(2, j);
        System.out.println("Номер старшего значащего бита: " + n);

        int count = 0;

        for (int m = i; m > Short.MIN_VALUE; m--) {
                if (m % n == 0) {
                count++;
            }
        }

        int[] m2 = new int[count];
        int k = 0;

        for (int m = i; m > Short.MIN_VALUE; m--) {
            if (m % n == 0) {
                m2[k] = m;
                k++;
                count++;
            }
        }

        for (int l = 0; l < m2.length; l++)
    {
        System.out.print(m2[l] + " ");
    }

    }
    
    
}