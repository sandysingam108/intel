import java.util.Scanner;

public class natural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        /*
        for (int num=1; num<=number; num++){
            System.out.print(num+" ");
        }
        System.out.println("\nend");
        */
        int limit = sc.nextInt();
        /*while(number<limit){
            System.out.print(number+" ");
            number++;
        }*/
        do{
            System.out.print(number+" ");
            number++;
        }while(number<limit);
    }
}