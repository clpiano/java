//繰り返し処理
//while (条件式) {
  //ブロック (繰り返し処理)
//}

public class While {
    public static void main(String[] args) {
        int number = 1;
        //numberが50未満の場合、ブロック処理をの処理を行う
        while (number < 50) {
            //ブロック：
            //numberにnumber * 2を代入して、numberを出力
            number *= 2;
            System.out.println("While = " + number);
        }
    }
}
