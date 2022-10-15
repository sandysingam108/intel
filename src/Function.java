import java.util.Scanner;

public class Function {
    public static void main(String[] args){
        greetings();
    }
    static void greetings(){
        System.out.println("You are greeted");
        Scanner sk = new Scanner(System.in);
        int b = sk.nextInt();
        int a = sk.nextInt();
        int ans = sum(a,b);
        System.out.print(ans);
    }
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
