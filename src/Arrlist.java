import java.util.Arrays;
import java.util.Scanner;

public class Arrlist {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
/*            int[] arr = new int[n];
            for(int i = 0; i<arr.length; i++){
                arr[i] = sc.nextInt();
            }
        for(int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print(Arrays.toString(arr));*/
        String[] arr = new String[n];
        for (int i = 0;i<arr.length; i++ ){
            arr[i] = sc.next();
        }
        for(String str: arr){
            System.out.print(str+" ");
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(arr));
    }
}