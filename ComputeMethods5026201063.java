import java.util.Random;

public class ComputeMethods5026201063 {

    public double fToC (double degreeF){
        double degreeC = 5.0/9*(degreeF-32);
        return degreeC;
    }

    public double hypotenuse(int a, int b){
        double hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        return hypo;
    }

    public int roll(){
        Random rn = new Random();
        int dice1 = rn.nextInt(6) + 1;
        int dice2 = rn.nextInt(6) + 1;
        int total = dice1 + dice2;
        return total;
    }
}
