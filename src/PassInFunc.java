import java.util.Arrays;
import java.util.Scanner;

public class PassInFunc {
    public static void main(String[] args) {
        Scanner sk = new Scanner(System.in);
        //int[][] arr = int int[3][];
/*        int[][] arr={
                {1,2,3}
                {1,2,3}
                {1,2,3}
        };*/
        int[][] arr = new int[3][3];
        for(int i=0; i<arr.length; i++){
            for(int j=0 ;j<arr[i].length; j++) {
                arr[i][j] = sk.nextInt();
            }
        }
/*        for (int row=0; row<arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
            System.out.println();*/
        for(int[] a :arr){
            System.out.println(Arrays.toString(a));
        }
    }
}