//10までの数字のうち偶数を降順で表示

public class Gusu {
    public static void main(String[] args) {
        for (int i = 10; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
