public class Shadowing {
    static int x = 84;
    public static void main(String[] args){
        System.out.println(x);
        int x = 52;
        System.out.println(x);
        take();
    }
    static void take(){
        System.out.println(x);
        int x = 25;
        System.out.println(x);
    }
}
