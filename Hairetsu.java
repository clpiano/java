//配列
//配列を宣言するとき　データ型[] 配列名 = {要素}
//配列の要素として変数を指定することも可能
//配列の要素を出力するときは(team[要素の])

public class Hairetsu {
  public static void main(String[] args) {
      String player_1 = "僧侶";
      
      String[] team = {"戦士", "魔法使い", player_1};
      System.out.println(team[0]);
      System.out.println(team[1]);
      System.out.println(team[2]);
  }
}
