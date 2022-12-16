//標準入力 if文

import java.util.*;

public class If {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();

      if (number == 10) { //標準入力された数値が10ならwelcomeを表示する
          System.out.println("welcome");
      } else if (number > 10) { //10より大きい場合
          System.out.println("Good morning");
      } else { //上記の条件以外(10未満)
          System.out.println("Goodbye");
      }
    }
}
