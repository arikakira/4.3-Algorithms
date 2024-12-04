import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    private static File f;
    private static Scanner s;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        System.out.println(twoLetter);
        s.close();
    }

    public static int twoLetter() throws FileNotFoundException {
        s = new Scanner(f);
        int twoLetter = 0;
        while(s.hasNext()) {
            if()
        }
        return twoLetter;
    }
}