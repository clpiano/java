//値を

public class Mondai {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        int t = x;
        
        t = x;
        x = y;
        y = t;
        System.out.println("x=" + x + ",y=" + y);
    }    
}
