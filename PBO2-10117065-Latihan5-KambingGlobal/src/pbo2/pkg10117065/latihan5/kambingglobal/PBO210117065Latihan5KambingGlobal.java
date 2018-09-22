package pbo2.pkg10117065.latihan5.kambingglobal;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menggunakan variabel global dan membuat method baru untuk 
 * menjumlahkan kambing yang hasilnya akan tersimpan kembali di variabel global
 * (dengan nilai variabel yang berbada dari sebelumnya)
 */
public class PBO210117065Latihan5KambingGlobal {
    /*
    Deklarasi Variabel
    *Variabel jumlahKambing menjadi variabel instance
     */
    int jumlahKambing = 88;

    // method untuk menampilka jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing : " + jumlahKambing); 
    }
    
    // method untuk menambah jumlah kambing
    public void tambahKambing(){
       jumlahKambing = jumlahKambing + 5;
       System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }
    
     // method utama
    public static void main(String[] args) {
         PBO210117065Latihan5KambingGlobal kambingSusu = 
                 new PBO210117065Latihan5KambingGlobal();
        
        // menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // menambah lima kambing
        kambingSusu.tambahKambing();
        
        // menampilkan jummlah kambing yang ada
        kambingSusu.getJumlahKambing();
    }
    
}
