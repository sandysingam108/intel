import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExam {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i=0; i<3; i++){
            list.add(new ArrayList<>());
        }
        for (int i =0 ;i<list.size(); i++){
            for(int j = 0; j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
//        System.out.println(list.contains(32));
//        list.set(0,225);
//        list.remove(1);
    }
}