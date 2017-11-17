package pkasanki;

public class test {
    public static void main(String[] args){
//        Calc calc = new Calc();
//        int r = calc.xor(1,0);
//        System.out.println(r);

        Hankasanki hankasanki = new Hankasanki();
        int r = hankasanki.HankasankiC(0,1);
        int rS = hankasanki.HankasankiS(0,1);
        System.out.println(r+" "+rS);
        Zenkasanki zenkasanki = new Zenkasanki();
        int a = zenkasanki.zenkasankiC(0,1,0);
        int b = zenkasanki.zenkasankiS(0,1,0);
        System.out.println(a+ " "+b);


    }
}

