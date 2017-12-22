import pkasanki.*;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Calc calc = new Calc();

        System.out.println("1: 2進数で入力してください");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String[] ArrStr = str.split("");
        int[] ArrInt = new int[ArrStr.length];
        for (int i = 0; i < ArrStr.length; i++) {
            ArrInt[i] = Integer.parseInt(ArrStr[i]);
        }
        System.out.println(Arrays.toString(ArrInt));
        System.out.println("2: 1と同じ桁数の2進数で入力してください");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan2.next();

        String[] ArrStr2 = str2.split("");
        int[] ArrInt2 = new int[ArrStr2.length];
        for (int i = 0; i < ArrStr2.length; i++) {
            ArrInt2[i] = Integer.parseInt(ArrStr2[i]);


        }

        Hankasanki hankasanki = new Hankasanki();
        int hankasanresult = hankasanki.HankasankiS(ArrInt[ArrInt.length - 1]
                        , ArrInt2[ArrInt2.length - 1]);//S
        int[] result = new int[str.length() + 1];//答えを入れる配列 入力値＋１
        result[result.length - 1] = hankasanresult;
        System.out.println("半加算");
        Zenkasanki zenkasanki = new Zenkasanki();
        int c = hankasanki.HankasankiC(ArrInt[ArrInt.length - 1]
                , ArrInt2[ArrInt2.length - 1]);
        int cbox = c;
        int j=0;
        System.out.println("繰り上がり : "+cbox);
        for(j = 1; j < str.length();j++){
            System.out.println("全加算"+j+"回目");

            result[result.length - j-1] = zenkasanki.
                    zenkasankiS(ArrInt[ArrInt.length - j-1],ArrInt2[ArrInt2.length -j-1],cbox);
            cbox = zenkasanki.
                    zenkasankiC(ArrInt[ArrInt.length -j-1],ArrInt2[ArrInt2.length -j-1],cbox);
            System.out.println("繰り上がり : "+cbox);

        }
        result[result.length - j-1]=cbox;

        System.out.println("結果"+Arrays.toString(result));

    }
}
