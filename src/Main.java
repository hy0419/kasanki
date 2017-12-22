import pkasanki.*;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        Calc calc = new Calc();

        System.out.println("二進数で入力してください");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(str);
        String[] ArrStr = str.split("");
        int[] ArrInt = new int[ArrStr.length];
        for (int i = 0; i < ArrStr.length; i++) {
            ArrInt[i] = Integer.parseInt(ArrStr[i]);
System.out.println(ArrInt[i]);
        }
        System.out.println(Arrays.toString(ArrInt));
        System.out.println("二進数で入力してください");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan2.next();
        System.out.println(str2);

        String[] ArrStr2 = str2.split("");
        int[] ArrInt2 = new int[ArrStr2.length];
        for (int i = 0; i < ArrStr2.length; i++) {
            ArrInt2[i] = Integer.parseInt(ArrStr2[i]);
            System.out.println(ArrInt2[i]);

        }

        Hankasanki hankasanki = new Hankasanki();
        int hankasanresult = hankasanki.HankasankiS(ArrInt[ArrInt.length - 1]
                        , ArrInt2[ArrInt2.length - 1]);//S
        int[] result = new int[str.length() + 1];//答えを入れる配列 入力値＋１
        result[result.length - 1] = hankasanresult;

        Zenkasanki zenkasanki = new Zenkasanki();
        int c = hankasanki.HankasankiC(ArrInt[ArrInt.length - 1]
                , ArrInt2[ArrInt2.length - 1]);
        int cbox = c;
        int j=0;
        System.out.println("cbox : "+cbox);
        for(j = 1; j < str.length();j++){
            System.out.println("j : "+j);

            result[result.length - j-1] = zenkasanki.
                    zenkasankiS(ArrInt[ArrInt.length - j-1],ArrInt2[ArrInt2.length -j-1],cbox);
            System.out.println("result[result.length - j-1] : "+result[result.length - j-1]);
            cbox = zenkasanki.
                    zenkasankiC(ArrInt[ArrInt.length -j-1],ArrInt2[ArrInt2.length -j-1],cbox);
            System.out.println("cbox : "+cbox);

        }
        result[result.length - j-1]=cbox;
        System.out.println("str.length() : "+str.length());

        System.out.println(Arrays.toString(result));

    }
}
