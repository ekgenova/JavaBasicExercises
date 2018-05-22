public class factorial {

    private int factorialCalc(int a){

        return (a==1)?1: a*factorialCalc(a - 1);

    }
}
