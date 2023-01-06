//配列の要素に足し算

public class Various {
    public static void main(String[] args) {
        int [] number = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        for (int i = 0; i < number[11]; i++) {
            number[i] += 5;
            if (number[i] % 2 != 0) {

                System.out.println(number[i] + ",");

            }
        }
        for (int i = 11; i < number.length; i++) {
            number[i] += 5;
            if(number[i] % 2 == 0) {
                System.out.println(number[i] + ",");
            }
        }
    }
}
