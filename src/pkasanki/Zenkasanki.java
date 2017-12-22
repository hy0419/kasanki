package pkasanki;

public class Zenkasanki {

    public int wa1(int input1,int input2){
        Hankasanki hankasanki=new Hankasanki();
        int wa1 = hankasanki.HankasankiS(input1,input2);
        return wa1;
    }

    public int zenkasankiS(int input1,int input2,int input3){
        Hankasanki hankasanki=new Hankasanki();
        int wa2 = hankasanki.
                HankasankiS(wa1(input1,input2),input3);
        return wa2;
    }
    public int kuriagari1(int input1,int input2){
        Hankasanki hankasanki = new Hankasanki();
        int kuriagari1 = hankasanki.HankasankiC(input1,input2);
        return kuriagari1;
    }

    public int kuriagari2(int input1,int input2,int input3){
        Hankasanki hankasanki =new Hankasanki();
        int kuriagari2 = hankasanki.
                HankasankiC(wa1(input1,input2),input3);
        return kuriagari2;
    }
    public int zenkasankiC(int input1,int input2,int input3){
        Calc clac= new Calc();
        int zenkasankiC = clac.or(kuriagari1(input1,input2),kuriagari2(input1,input2,input3));
        return zenkasankiC;
    }
}
