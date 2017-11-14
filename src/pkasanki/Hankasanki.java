package pkasanki;

public class Hankasanki {
    public int HankasankiS(int input1,int input2){
       Calc calc=new Calc();
       int wa = calc.xor(input1,input2);
       return wa;
    }
    public int HankasankiC(int input1,int input2){
        Calc calc=new Calc();
        int kuriagari = calc.and(input1,input2);
        return kuriagari;
    }

}
