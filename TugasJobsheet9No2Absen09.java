import java.util.Scanner;
/**
 * TugasJobsheet9No2Absen09
 */
public class TugasJobsheet9No2Absen09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = sc.nextInt();
        sc.nextLine(); 
        
        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];
        

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama makanan atau minuman ke-" + (i + 1) + " : ");
            namaPesanan[i] = sc.nextLine();
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + " : ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine(); 
        }
        
       
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }
        
        System.out.println();
        System.out.println("Daftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println(namaPesanan[i] + " - Harga: Rp" + hargaPesanan[i]);
        }
        
        System.out.println("Total Biaya: Rp" + totalBiaya);
        
        
    }
}
    