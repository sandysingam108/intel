import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        int value = sk.nextInt();
        int count = 2;
        int i1=0;
        int i2=1;
        while(count<=value){
            int temp=i2;
            i2 = i2+i1;
            i1=temp;
            count++;
        }
        System.out.print(i2);
    }
}