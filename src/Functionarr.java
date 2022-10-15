import java.util.Arrays;

public class Functionarr {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        change(arr);
        System.out.print(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void change(int[] diff){
        diff[0] = 55;
    }
}
