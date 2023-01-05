import java.util.*;

public class Mondai {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for (int i = 2; i <= 7; i++) {
            number *= i;
            System.out.println(number);
        }
    }
}
