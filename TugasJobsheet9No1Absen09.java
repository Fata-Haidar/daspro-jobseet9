import java.util.Scanner;
/**
 * Tugas1Jobsheet9No1Absen09
 */
public class TugasJobsheet9No1Absen09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Masukkan jumlah nilai mahasiswa yang akan diinput: ");
        int jumlahMahasiswa = sc.nextInt();
        
        
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        
       
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt(); 
        }
        
       
        int total = 0;
        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        
        for (int i = 0; i < jumlahMahasiswa; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i]; 
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i]; 
            }
        }
        
        double rataRata = (double) total / jumlahMahasiswa;
        
        
        System.out.println("\nSemua nilai mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMahasiswa[i]);
        }
        
       
        System.out.println("Nilai Rata-rata: " + rataRata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        
       ;
    }
}
    