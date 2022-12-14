//標準入力 importでデータを受け取る機能を簡単に扱えるようにする
//scan.next()で入力データを読み込む

import java.util.*;

public class Hyojun {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String text = scan.next();
      String message = scan.next(); //2つ目を受け取るとき
      System.out.println(text);
      System.out.println(message); //2つ目
    }
}
