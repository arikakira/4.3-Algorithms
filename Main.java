import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    private static File f;
    private static Scanner s;
    private static Scanner l;
    private static Scanner p;

    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetter = twoLetter();
        int longestWords = longestWords();
        int palindromes = palindromes();
        System.out.println(twoLetter);
        s.close();
        System.out.println(longestWords);
        l.close();
        System.out.println(palindromes);
        p.close();
    }

    public static int twoLetter() throws FileNotFoundException {
        s = new Scanner(f);
        int twoLetter = 0;
        while(s.hasNext()) {
            if(s.next().length()==2) {
                twoLetter++;
            }
        }
        return twoLetter;
    }

    public static int longestWords() throws FileNotFoundException {
        l = new Scanner(f);
        int longestWords = 0;
        int length = 0;
        int longest = 14;
        /*while(l.hasNext()) {
            length = l.next().length();
            if(length>longest) {
                longest = length;
            }
        }*/
        while(l.hasNext()) {
            if(l.next().length()==longest) {
                longestWords++;
            }
        }
        System.out.println(longest);
        System.out.println(length);
        return longestWords;
    }

    public static int palindromes() throws FileNotFoundException {
        p = new Scanner(f);
        int palindromes = 0;
        int length = 0;
        int half = 0;
        String backwards = "";
        while(p.hasNext()) {
            length = p.next().length();
            half = length / 2;
            for(int i=length-1; i>=length-half; i--) {
                backwards += p.next().charAt(i);
            }
            if(p.next().substring(0, half).equals(backwards)) {
                palindromes++;
            }
        }
        return palindromes;
    }
}