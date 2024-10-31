import java.util.Scanner;

public class modifArrayRataNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total=0, totalp=0;
        int lulus = 0, tdkLulus=0;
        double rata2lulus, rata2Tdklulus;
        System.out.print("Masukkan jumlah mahasiswa : "  );
        int jmlhMH = sc.nextInt();
        for(int i=0; i < jmlhMH; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : " );
            nilaiMhs[i] = sc.nextInt();
        } 
        int x = 0;
        for(int i = 0; i < jmlhMH; i++){
             
            if (nilaiMhs[i] > 70) {
                lulus+=1;
                total+=nilaiMhs[i];
                
u
                
            }   else{
                totalp+=nilaiMhs[i];
                tdkLulus+=1;
            }
             
        } 
        rata2lulus = total/lulus;
        rata2Tdklulus = totalp/tdkLulus;
        System.out.println("Rata-rata nilai lulus= "+rata2lulus);
        System.out.println("Rata-rata nilai tidak lulus= "+rata2Tdklulus);
        
    }
}