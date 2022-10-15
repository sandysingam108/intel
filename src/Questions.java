import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        //int n = sk.nextInt();
        for (int i = 100 ; i<1000; i++) {
            if(arm(i)) {
                System.out.print(i+" ");
            }
        }
        //System.out.print(isPrime(n));
    }
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }

    static boolean arm(int n){
        int original = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            n/=10;
            sum = sum + rem*rem*rem;
        }
        return sum==original;
    }
}
