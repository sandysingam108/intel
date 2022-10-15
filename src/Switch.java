import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sk = new Scanner(System.in);
        String option = sk.nextLine();
        switch(option){
/*            case "Captain":
                System.out.print("The First Avenger");
                break;
            case "Tony":
                System.out.print("IronMan");
                break;
            case "Bruce Banner":
                System.out.print("Welcome Strongest Avenger");
                break;
            case "Black Widow":
                System.out.print("Spy");
                break;
            case "Clint Barton":
                System.out.print("Hawkeye");
                break;
            case "Thor":
                System.out.print("Point Break");
                break;
            default:
                System.out.print("Please Enter a valid Avenger");*/
            case "Captain America" -> System.out.print("The First Avenger");
            case "Tony" -> System.out.print("IronMan");
            case "Bruce Banner" -> System.out.print("Welcome Strongest Avenger");
            case "Black Widow" -> System.out.print("Spy");
            case "Clint Barton" ->System.out.print("Hawkeye");
            case "Thor" -> System.out.print("Point Break");
            default -> System.out.print("please enter a valid Avenger");
        }
    }
}