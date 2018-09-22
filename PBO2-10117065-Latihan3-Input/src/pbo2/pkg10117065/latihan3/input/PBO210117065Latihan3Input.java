package pbo2.pkg10117065.latihan3.input;

import java.util.Scanner;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menampilkan data dari data yang telah kita 
 * masukkan(ketik)
 */
public class PBO210117065Latihan3Input {
    
    public static void main(String[] args) {
        // menampilkan teks 
        System.out.print("Masukkan Nama Anda : ");
        //inisialisasi scanner
        Scanner scanner = new Scanner( System.in );
        
        // deklarasi variabel
        String nama = scanner.next();
        // menampilkan hasil yang terlah diinputkan
        System.out.println("Nama Anda Adalah : " + nama);
    }
    
}
