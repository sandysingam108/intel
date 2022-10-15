import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        int Marks = sn.nextInt();
        String Grade;
        if(Marks>=90){
            Grade = "A";
        }
        else if(Marks>79){
            Grade = "B";
        }
        else if(Marks>69){
            Grade = "C";
        }
        else if(Marks>59){
            Grade = "D";
        }
        else if(Marks>58){
            Grade= "E";
        }
        else{
            Grade = "F";
        }
        System.out.print("Grade = "+Grade);
    }
}
