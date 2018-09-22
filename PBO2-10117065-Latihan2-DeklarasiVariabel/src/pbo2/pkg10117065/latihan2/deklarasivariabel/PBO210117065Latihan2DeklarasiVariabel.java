package pbo2.pkg10117065.latihan2.deklarasivariabel;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Mendeklarasikan nilai variabel dan konstanta lalu
 * manmpilkannya
 * 
 */
public class PBO210117065Latihan2DeklarasiVariabel {

    public static void main(String[] args) {
        // deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; // konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        // memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        // menampilkan hasil
        System.out.println();
        System.out.println("Isi variabel nilai\t = " + nilaiInt);
        System.out.println("Isi variabel PHI\t = " + PHI);
        System.out.println("Isi variabel logika\t = " + nilaiLogika);
        System.out.println("Isi variabel karakter\t = " + nilaiKarakter);
    }
    
}
