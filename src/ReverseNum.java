import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        Scanner ks = new Scanner(System.in);
        int num = ks.nextInt();
        int dig = 0;
        int ans = 0;
        while (num>0){
            int rem = num%10;
            num/=10;
            ans = ans*10+rem;
        }
        System.out.print(ans);
    }
}
