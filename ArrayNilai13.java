package Jobsheet9Array;
import java.util.Scanner;

public class ArrayNilai13 {
    public static void main(String[] args) {
        Scanner ahh = new Scanner(System.in);
        
        int[] na = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+": ");
            na[i] = ahh.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (na[i] > 70) {
                System.out.println("Mahasiswa ke-"+i+" dinyatakan LULUS dengan nilai "+na[i]);
            } else {
                System.out.println("Mahasiswa ke-"+i+" dinyatakan TIDAK LULUS dengan nilai "+na[i]);
            }
        }
        ahh.close();
    }
}
