//繰り返し分 for
//カウンタ変数はなんでもいいが、基本的にiを使う
// for (初期化式; 条件式; 変化式) {
  //ブロック(繰り返し処理)
//}

public class For {
  public static void main(String[] args) {
      String greeting = "Hello paiza";

      for (int i = 0; i < 5; i++) {  //iは0から始まり、5より小さいうちは繰り返し処理をする、i++で繰り返し処理をする度に+1をしていく
          System.out.println(greeting);
      }
  }
}
