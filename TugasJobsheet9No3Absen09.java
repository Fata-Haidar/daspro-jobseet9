import java.util.Scanner;
/**
 * TugasJobsheet9No3Absen09
 */
public class TugasJobsheet9No3Absen09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        
       
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String menuMakanan = sc.nextLine();
        
       
        boolean ditemukan = false;
        

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(menuMakanan)) {
                ditemukan = true;
                break; 
            }
        }
        
        
        if (ditemukan== true) {
            System.out.println(menuMakanan + " tersedia di menu.");
        } else {
            System.out.println(menuMakanan + " tidak ada di menu.");
        }
    }
}