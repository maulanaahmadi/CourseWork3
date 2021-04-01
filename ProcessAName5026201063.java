import java.util.Scanner;

    public class ProcessAName5026201063 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Sebutkan nama anda: ");
            String name = sc.nextLine();
            int spcIndex = name.indexOf(" ");
            String namadepan = name.substring(0, spcIndex);
            String namabelakang = name.substring((spcIndex), name.length());

            System.out.println("Nama anda adalah: " + namabelakang + ", " + namadepan.substring(0,1));
        }
    }