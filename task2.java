// 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

public class task2 {

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
        System.out.println("Индекс старшего старшего бита: " + index);

        int j = binary2.length();
        int n = pow(2, j);
        System.out.println("Номер старшего значащего бита: " + n);


    }
    
    
}
