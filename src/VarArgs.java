import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args){
            cole(22,35,26,58,54,84);
            multiple(32,42,"Kabali","Daggariki ra");
    }

    static void multiple(int a, int b, String...v) {
        System.out.print(Arrays.toString(v));
    }

    static void cole(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}