import java.util.*;

public class Equals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);

        if (name.equals("Java")) {
            System.out.println("Welcome");
        } else if (name.equals("JAVA")) {
            System.out.println("Good morning");
        } else {
            System.out.println("Goodbye");
        }
    }
}
