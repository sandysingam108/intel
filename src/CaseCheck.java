import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        char ch = sk.next().trim().charAt(0);
        String word = "Hello";
        System.out.println(ch);
        System.out.println(word.charAt(2));
    }
}
