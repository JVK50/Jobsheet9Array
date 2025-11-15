package Jobsheet9Array.Tugas;
import java.util.Scanner;

public class Tugas1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jml[];
        int total = 0;
        int rata, i;

        System.out.println("== Program Menghitung dan Menyimpan Nilai Mahasiswa ==");
        System.out.print("Masukkan jumlah nilai yang akan diinput: ");
        jml = new int[sc.nextInt()];

        for (i = 0; i < jml.length; i++) {
            System.out.print("Masukkan Nilai Mahsiswa ke-" + (i+1) +" : ");
            jml[i] = sc.nextInt();            
        }
        for (i = 0; i < jml.length; i++) {
            System.out.println("Nilai Mahasiswa ke-" + (i+1) + " adalah " + jml[i]);   
        }
        for (i = 0; i < jml.length; i++) {
        total += jml[i];
        }
    
        rata = total / jml.length;

        int nilaiTertinggi = jml[0];
        for (i = 0; i < jml.length; i++) {
            if (jml[i] > nilaiTertinggi) {
                nilaiTertinggi = jml[i];
            }
        }
        int nilaiTerendah = jml[0];
        for (i = 0; i < jml.length; i++) {
            if (jml[i] < nilaiTerendah) {
                nilaiTerendah = jml[i];
            }
        }
        System.out.println("== Hasil Analisis ==");
        System.out.println("Rata-rata nilai mahasiswa adalah " + rata);
        System.out.println("Nilai tertinggi adalah: " + nilaiTertinggi);
        System.out.println("Nilai terendah adalah: " + nilaiTerendah);
        sc.close();        
    }
        
}    

