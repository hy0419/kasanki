package pkasanki;

public class Calc {
    public int and(int input1, int input2) {
        int x = 0;
        if (input1 == 0 && input2 == 0) {
            x = 0;
        }

        if (input1 == 0 && input2 == 1) {
            x = 0;
        }
        if (input1 == 1 && input2 == 0) {
            x = 0;
        }
        if (input1 == 1 && input2 == 1) {
            x = 1;
        }
        return x;
    }
    public int or(int input1, int input2) {
            int x = 0;
            if (input1 == 0 && input2 == 0) {
                x = 0;
            }

            if (input1 == 0 && input2 == 1) {
                x = 1;
            }
            if (input1 == 1 && input2 == 0) {
                x = 1;
            }
            if (input1 == 1 && input2 == 1) {
                x = 1;
            }
            return x;
        }
        public int not(int input1) {
            int x = 0;
            if (input1 == 0) {
                x = 1;
            }
            if (input1 == 1 ) {
                x = 0;
            }
            return x;
        }
        public int xor(int input1,int input2){
            int x = 0;
            x = or(and(input1,not(input2)),
                    and(not(input1),input2));
            return  x;
    }

}