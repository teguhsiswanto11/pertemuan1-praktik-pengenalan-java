package pbo2.pkg10117065.latihan7.integer;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Mendeklarasikan variabel dengan jenis-jenis tipe data 
 * angka, memberikan nilai yang sesuai dengan aturan setiap tipe data, dan 
 * menampilkannya
 */
public class PBO210117065Latihan7Integer {

    public static void main(String[] args) {
         //deklarasi variabel
        byte b;
        short s;
        int i;
        long l;
        b = 120;
        s = 32767;
        i = 1_000_000_000;
        l = 90000000000L;
        
        //menampilkan hasil
        System.out.println("btye : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
    }
    
}
