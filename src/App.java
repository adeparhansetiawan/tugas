import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner inputan = new Scanner(System.in);
    int yangdibeli = 7;
    int harga = 24000;
    int yangharusdibayar = yangdibeli*harga;
    int yangdiberikan = 200000;
    int uangkembalian = yangdiberikan-yangharusdibayar;
    System.out.println("yang dibeli" +yangdibeli+ "KG");
    System.out.println("total uang yang harus dibayar" + yangharusdibayar);
    System.out.println("uang yang diberikan" + yangdiberikan);
    System.out.println("uang kembalian" + uangkembalian);
    inputan.close();
    }
    }
    