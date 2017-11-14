import pkasanki.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("hello world");
        Calc calc=new Calc();

        System.out.println("二進数で入力してください");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
//
        String[] ArrStr = str.split("");
        int[] ArrInt = new int[ArrStr.length];
        for(int i = 0;i<ArrStr.length;i++){
            ArrInt[i]=Integer.parseInt(ArrStr[i]);
        }
        System.out.println("二進数で入力してください");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan.next();
        int input2=Integer.parseInt(str2);


    }
}
