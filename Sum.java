//標準入力した数値の合計値と平均値を求める
//sumメソッドは合計値を求めることができる

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        for (int i = 0; i < 10; i++) { //10回繰り返し
            sum += scan.nextInt();  //数値を入力し、sumメソッドに代入していく
        }
        System.out.println("合計値＝ " + sum);
        System.out.println("平均値＝ " + (double)sum/10);
    }
}
