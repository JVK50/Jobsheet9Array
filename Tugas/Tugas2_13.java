package Jobsheet9Array.Tugas;
import java.util.Scanner;

public class Tugas2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String key;
        int index = 0;
        boolean find = false;
        
        // Menampilkan isi menu
        System.out.println("== Cafe Pak Garou ==");
        System.out.println("Daftar Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("- " + menu[i]);
        }

        // Input pesanan dan kata kunci
        
        while (!find) {
            System.out.println("\nIngin pesan apa? ");
            System.out.print("- ");
            key = sc.nextLine();
            
            for (int i = 0; i < menu.length; i++) {
                if (key.equalsIgnoreCase(menu[i])) {
                    index = i;
                    find = true;
                    System.out.println("Menu Tersedia!");
                    break;
                }
            }

            if (!find) {
                System.out.println("");
                System.out.println("Menu Tidak Tersedia!");
                System.out.println("Masukkan Pesanan Lagi!");
                System.out.println("");
            }

        }
        

        // Tampilkan daftar pesanan
        System.out.println("\n--- DAFTAR PESANAN ---");
        System.out.println("Nama Pesanan");
        System.out.println("-------------");
        System.out.println("- " + menu[index]);
                
        sc.close();
    }
}
