//1～10までの数字で偶数がいくつあるか
//1～10までの数字で偶数を全て足すといくつになるか

public class Gusu2 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
                count += 1;
            }
        }
        System.out.println(count);
        System.out.println(sum);
    }
}
