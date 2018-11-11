import java.io.*;
public class Main {
    public static void main (String args[]) throws Exception {
        NewScanner scanner = new NewScanner(new FileInputStream("input.txt"));
        System.out.println (scanner.nextString());
        System.out.println(scanner.nextDouble());
        System.out.println (scanner.nextInt());
    }
}
