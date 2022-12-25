//do-while文
//do {
  //ブロック(繰り返し処理)
//} while(条件式);
//まずブロックの処理を実行した後、条件式を

public class DoWhile {
    public static void main(String[] args) {
        int number = 1;
        do {
            number *= 2;
            System.out.println(number);
        } while (number < 50);
    }
}
