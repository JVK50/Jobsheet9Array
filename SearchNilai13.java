package Jobsheet9Array;
import java.util.Scanner;

public class SearchNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrNilai[];
        int key;
        int hasil = -1;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        arrNilai = new int[sc.nextInt()];

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (hasil == -1) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        } else {
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        }
        sc.close();
    }
}
