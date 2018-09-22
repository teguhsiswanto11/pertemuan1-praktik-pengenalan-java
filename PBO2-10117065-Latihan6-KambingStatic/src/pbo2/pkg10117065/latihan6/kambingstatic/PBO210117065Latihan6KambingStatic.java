package pbo2.pkg10117065.latihan6.kambingstatic;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menggunakan variabel dari class lain yang berbeda file 
 * dan mengisikan nilai dari variabelnya
 */
public class PBO210117065Latihan6KambingStatic {
    
     // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
         /* mengakses  variabel jumlahKambing lalu memberikan nilai 
        (dari class Mamalia) */
        Mamalia.jumlahKambing = 485000;
        // manampilkan hasil dari pengaksesan 2 class
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
                + Mamalia.jumlahKambing);
    }
    
}
