public class Function1swap {
    public static void main(String[] args){
        int a = 15;
        int b = 25;
        System.out.println(a+" "+b);
        swap(15,25);
    }
    static void swap(int  a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.print(a+" "+b);
    }
}