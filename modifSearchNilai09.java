import java.util.Scanner;
/**
 * ArrayRataNilai09
 */
public class modifSearchNilai09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key=0;
      
        int hasil=0;
        System.out.print("Masukkan banyaknya nilai yang diinput: "  );
        int nilai = sc.nextInt();
        int[] arrNilai = new int[nilai];
        for(int i=0; i < nilai; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : " );
            arrNilai[i] = sc.nextInt();
        } 

        System.out.print("Masukkan nilai yang ingin dicari: "  );
         key = sc.nextInt();
        for(int i=0;i<nilai;i++){
            if (key == arrNilai[i]){
                hasil=i+1;
                System.out.println();
        System.out.println("Nilai " + key + " ketemu, merupakan mahasiswa ke-"+hasil);
        
                break;
            }else{
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan" );
                break;
            }
        }
        
    }
}
