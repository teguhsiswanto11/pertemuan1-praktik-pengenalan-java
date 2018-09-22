package pbo2.pkg10117065.latihan4.kambing;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Membuat method khusus untuk menjumlahkan kambing lalu 
 * dipanggil ke method utama
 */
public class PBO210117065Latihan4Kambing {
    
    // menambah method 'tambahKambing'
    public void tambahKambing(){
        // deklarasi variabel lokal
        int jumlahKambing = 0;
        
        // operasi aritmetika
        jumlahKambing = jumlahKambing + 5;
        // menampilkan hasil dari penjumlahan
        System.out.println("Jumlah kambing setelah ditambah : " + jumlahKambing);
    }
    
    // method utama
    public static void main(String[] args) {
        // inisialisasi method
        PBO210117065Latihan4Kambing kambingJantan = 
                new PBO210117065Latihan4Kambing();
        // memanggil method 'tambahKambing'
        kambingJantan.tambahKambing();
    }
    
}
