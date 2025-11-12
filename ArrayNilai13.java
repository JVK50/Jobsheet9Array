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
            System.out.println("Nilai akhir ke-" + i + " adalah " + na[i]);
        }
        ahh.close();
    }
}
