//複数のデータを受け取る
//最初の標準入力で繰り返し処理をする回数を入力
//その後で回数分のデータを入力
//for分の中にif文をいれることも可能

import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();

        for (int i = 0; i < count; i++) {
            int number = scan.nextInt();
            System.out.println(number);

            //if文を入れることで標準入力された値によって、表示させる文を変えることができる

            if (number == 10) {
                System.out.println(number + "は10に等しい");
            } else if (number > 10) {
                System.out.println(number + "は10より大きい");
            } else {
                System.out.println(number + "は10未満");
            }
        }
    }
}
