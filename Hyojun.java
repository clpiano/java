//標準入力 importでデータを受け取る機能を簡単に扱えるようにする
//scan.next()で文字列の入力データを読み込む
//scan.nextInt();で数値の入力データを読み込む

import java.util.*;

public class Hyojun {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String text = scan.next();
      //String message = scan.next(); //2つ目を受け取るとき
      System.out.println(text);
      //System.out.println(message); //2つ目
      int number = scan.nextInt(); //数値を受け取る時
      System.out.println(number); //数値
      //System.out.println(number * 10); //標準入力された値と計算することもできる(+で文字列との連結も可能)
    }
}
