//標準入力した数値の合計値と平均値を求める
//sumメソッドは合計値を求めることができる

import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt(); //繰り返す回数を標準入力
        int sum = 0;
        for (int i = 0; i < count; i++) { //count回繰り返し
            sum += scan.nextInt();  //数値を入力し、sumメソッドに代入していく
        }
        System.out.println("合計値＝ " + sum);
        System.out.println("平均値＝ " + (double)sum/ count);  //doubleは小数点も含まれるデータ型
    }
}
