//標準入力 equals

import java.util.*;

public class Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);

        if (name.equals("Java")) {  //標準入力された文字列がJavaと一致すればwelcomeを表示
            System.out.println("Welcome");
        } else if (name.equals("JAVA")) {  //JAVAと一致すれば
            System.out.println("Good morning");
        } else {  //上記以外
            System.out.println("Goodbye");
        }
    }
}
