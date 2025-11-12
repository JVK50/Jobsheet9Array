package Jobsheet9Array;
import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner yesking = new Scanner(System.in);
        
        int[] nmhs = new int[10];
        double total = 0;
        double rata;

        for (int i = 0; i < nmhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +": ");
            nmhs[i] = yesking.nextInt();
        }
        for (int i = 0; i < nmhs.length; i++) {
            if (nmhs[i] > 70) {
                System.out.println("Mahasiswa ke-"+ (i+1) +" lulus.");
        }
            total += nmhs[i];
        }
        rata = total / nmhs.length;
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rata);

        yesking.close();
    }
}
