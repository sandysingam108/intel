import java.util.Arrays;

public class Overloading {
    public static void main(String[] args){
        func(6652);
        func("Bring me Thanos");
        int ans = sum(22,35);
        System.out.println("Final answer : "+ans);
        takarr(22,33,56,5,85,89,65);
    }

    static void takarr(int ...v) {
        System.out.print(Arrays.toString(v));
    }

    static int sum(int a, int b){
        return a+b;
    }
    static void func(int a){
        System.out.println("Printing integer here");
        System.out.println(a);
    }
    static void func(String a){
        System.out.println("Printing String here");
        System.out.println(a);
    }
}