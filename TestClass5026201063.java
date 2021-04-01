import java.util.Scanner;

public class TestClass5026201063 {

    public static void main(String[] args){
        //Thermal Converter konversi suhu
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan temperatur suhu dalam fahrenheit: ");
        double degreeF = sc.nextDouble();
        ComputeMethods5026201063 cm = new ComputeMethods5026201063();
        double degreeC = cm.fToC(degreeF);
        System.out.println("temperatur suhu dalam celcius adalah " + degreeC);
        System.out.println();

        //hypotenuse machine penghitung sisi miring segitiga
        System.out.print("masukkan panjang sisi segitiga: ");
        int a = sc.nextInt();
        System.out.print("masukkan panjang sisi lainnya: ");
        int b = sc.nextInt();
        double hypo = cm.hypotenuse(a, b);
        System.out.println("panjang sisi miringnya adalah "+ hypo);
        System.out.println();

        //Sum of dice penjumlahan nilai dadu
        int sum = cm.roll();
        System.out.println("penjumlahan nilai dadu adalah "+ sum);


    }

}
