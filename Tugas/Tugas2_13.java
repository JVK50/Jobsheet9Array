package Jobsheet9Array.Tugas;
import java.util.Scanner;

public class Tugas2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("== Pengelola Pesanan Kafe ==");
        System.out.print("Jumlah pesanan: ");
        int[] pesanan = new int[sc.nextInt()];
        
        String[] menu = new String[pesanan.length];
        double[] harga = new double[pesanan.length];
        sc.nextLine();

        // Input data pesanan
        System.out.println("\n--- INPUT DATA PESANAN ---");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.print("Masukkan pesanan ke-" + (i+1) + ": ");
            menu[i] = sc.nextLine();

            System.out.print("Masukkan harga pesanan ke-" + (i+1) + ": Rp ");
            harga[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Hitung total biaya
        double totalBiaya = 0;
        for (int i = 0; i < harga.length; i++) {
            totalBiaya += harga[i];
        }

        // Tampilkan daftar pesanan
        System.out.println("\n--- DAFTAR PESANAN ---");
        System.out.println("No. \t Nama Pesanan \t\t Harga");
        System.out.println("--- \t ------------- \t\t -----");
        
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%d \t %-20s Rp %,.0f\n", (i+1), menu[i], harga[i]);
        }
        
        System.out.println("--- \t ------------- \t\t -----");
        System.out.printf("TOTAL BIAYA \t\t\t Rp %,.0f\n", totalBiaya);
        
        sc.close();
    }
}
