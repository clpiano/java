//定数
//最初に代入した値を後から変更できない変数のこと
//定数名は全て大文字で記述し、複合語の場合は_で区切る
// final 定数の型 定数名 = 初期値;

public class Final {
    public static void main(String[] args) {
        final int MIN_NUMBER = 10;
        System.out.println(MIN_NUMBER);
        
        //再代入しようとするとエラー
    }
}