import java.util.Scanner;

public class Kelulusan {
    public static void main(String[] args) throws Exception {
        Scanner AngkaNilai = new Scanner(System.in);
        System.out.print("Masukan nilai anda: ");
        double nilai = AngkaNilai.nextDouble();

        if (nilai > 75)
        System.out.println("LULUS");

        else 
        System.out.println("TIDAK LULUS");
    }
}
