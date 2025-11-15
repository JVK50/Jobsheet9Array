package Jobsheet9Array;
import java.util.Scanner;

public class ArrayRataNilai13 {
    public static void main(String[] args) {
        Scanner yesking = new Scanner(System.in);
        
        int[] nmhs;
        double total1 = 0;
        double total = 0;
        double rata, rata1;
        double iya = 0;
        double tdk = 0;

        System.out.print("Masukkan jumalah mahasiswa: ");
        nmhs = new int[yesking.nextInt()];

        for (int i = 0; i < nmhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +": ");
            nmhs[i] = yesking.nextInt();
        }
        for (int i = 0; i < nmhs.length; i++) {
            if (nmhs[i] > 70) {
                total1 += nmhs[i];
                iya++;
            } else {
                total += nmhs[i];
                tdk++;
            }
        }
        rata1 = total1 / iya;
        rata = total / tdk;
        System.out.println("Rata-rata nilai mahasiswa yang lulus adalah: " + rata1);
        System.out.println("Rata-rata nilai mahasiswa yang tidak lulus adalah: " + rata);
        


        // for (int i = 0; i < nmhs.length; i++) {
        //     System.out.print("Masukkan nilai mahasiswa ke-"+ (i+1) +": ");
        //     nmhs[i] = yesking.nextInt();
        // }
        // for (int i = 0; i < nmhs.length; i++) {
        //     if (nmhs[i] > 70) {
        //         System.out.println("Mahasiswa ke-"+ (i+1) +" lulus.");
        // }
        //     total += nmhs[i];
        // }
        // rata = total / nmhs.length;
        // System.out.println("Rata-rata nilai mahasiswa adalah: " + rata);

        yesking.close();
    }
}
