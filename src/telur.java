import java.util.Scanner;

public class telur {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        double hargaPerKg = 28000;

        System.out.print("Jumlah telur (kg): ");
        double jumlahTelur = inputan.nextDouble();

        System.out.print("Uang yang dibayar: ");
        int uangDibayar = inputan.nextInt();

        double totalHarga = jumlahTelur * hargaPerKg;
        int kembalian = uangDibayar - (int) totalHarga;

        System.out.println("Jumlah Telur: " + jumlahTelur + " kg");
        System.out.println("Total Harga: Rp " + (int) totalHarga);
        System.out.println("Uang Kembalian: Rp " + kembalian);

        inputan.close();
    }
}
