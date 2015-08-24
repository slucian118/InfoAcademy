/**
 * Created by lucians on 18/08/15.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int x = 2;
        int y = 2;
        int z = (((x++) + (++y)) >5 && ((++x)+y)<10)?1:0;
        System.out.println (x);
        System.out.println (y);
        System.out.println (z);
    }
}
