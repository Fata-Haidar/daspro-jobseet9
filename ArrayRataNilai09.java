import java.util.Scanner;
/**
 * ArrayRataNilai09
 */
public class ArrayRataNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total=0;
        double rata2;
        System.out.print("Masukkan nilai mahasiswa "  );
        int jmlhMH = sc.nextInt();
        for(int i=0; i < jmlhMH; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : " );
            nilaiMhs[i] = sc.nextInt();
        } 
        int x = 0;
        for(int i = 0; i < 10; i++){
            total+=nilaiMhs[i]; 
            if (nilaiMhs[i] > 70) {
                 x +=1;
            }    
             
        } 
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai= "+rata2);
        System.out.println("total lulus= "+ x);
    }
}