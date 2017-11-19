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

        String[] ArrStr = str.split("");
        int[] ArrInt = new int[ArrStr.length];
        for (int i = 0; i < ArrStr.length; i++) {
            ArrInt[i] = Integer.parseInt(ArrStr[i]);

        }
        System.out.println(Arrays.toString(ArrInt));
        System.out.println("二進数で入力してください");
        Scanner scan2 = new Scanner(System.in);
        String str2 = scan2.next();

        int input2 = Integer.parseInt(str2);
        String[] ArrStr2 = str2.split("");
        int[] ArrInt2 = new int[ArrStr2.length];
        for (int i = 0; i < ArrStr2.length; i++) {
            ArrInt2[i] = Integer.parseInt(ArrStr2[i]);
        }
        System.out.println(Arrays.toString(ArrInt2));

        Hankasanki hankasanki = new Hankasanki();
        int hankasanresult = hankasanki.HankasankiS(ArrInt[ArrInt.length - 1]
                        , ArrInt2[ArrInt2.length - 1]);//S
        int[] result = new int[str.length() + 1];//答えを入れる配列を作る 入力値＋１
        result[result.length - 1] = hankasanresult;
        System.out.println(hankasanresult);
        System.out.println("result.length : "+result.length);

        Zenkasanki zenkasanki = new Zenkasanki();
        int c = hankasanki.HankasankiC(ArrInt[ArrInt.length - 1]
                , ArrInt[ArrInt2.length - 1]);
        int cbox = c;
        System.out.println("cbox繰り上がり : "+cbox);
        for(int j = 1; j < str.length();j++){
            result[result.length - j-1] = zenkasanki.
                    zenkasankiS(ArrInt[ArrInt.length - j],ArrInt2[ArrInt2.length -j],cbox);
//            result[result.length - 2] = zenkasanki.
//                    zenkasankiS(ArrInt[ArrInt.length-2],ArrInt2[ArrInt2.length-2],c)
            cbox = zenkasanki.
                    zenkasankiC(ArrInt[ArrInt.length -j],ArrInt2[ArrInt2.length -j],cbox);
            System.out.println("result[result.length - j-1] :"+result[result.length - j-1]);
            System.out.println("cbox繰り上がり :" +cbox+" "+(int)(ArrInt.length-j));

        }

        System.out.println(Arrays.toString(result));

    }
}
