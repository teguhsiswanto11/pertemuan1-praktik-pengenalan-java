package pbo2.pkg10117065.latihan14.bit;

/**
 * @author 
 * NAMA     : Teguh Siswanto
 * KELAS    : IF-2
 * NIM      : 10117065
 * Deskripsi Program : Menggunakan operasi bit(operator bitwise) memanipulasi 
 * bit-bit dari nilai data yang ada di memori.
 */
public class PBO210117065Latihan14Bit {

    public static void main(String[] args) {
        // deklarasi variabel
        int a = 60; // 60 = 0011 1100
        int b = 13; // 60 = 0000 1101
        int c = 0;
                
        c = a & b;
        // 12 = 0000 1100 || Manipulasi bit dengan logika AND
        System.out.println("a & b = " + c);
        
        c = a | b;
        // 61 = 0011 1101 ||  	Manipulasi bit dengan logika OR
        System.out.println("a | b = " + c);
        
        c = a ^ b;
        // 49 = 0011 0001 || Manipulasi bit dengan logika XOR
        System.out.println("a ^ b = " + c);
        
        c = ~a;
        // -61 = 1100 0011 ||  	Manipulasi bit dengan logika NOT
        System.out.println("~a = " + c);
        // ~(n) = – (n+1), contoh: ~(60) = -61
        
        c = a;
        // -61 = 1100 0011
        System.out.println("a = " + c);
        
        c = a << 2;
        // -61 = 1100 0011 || Pergeseran bit ke kiri
        System.out.println("a << 2 = " + c);
        
        c = a >> 2;
        // -61 = 1100 0011 || Pergeseran bit ke kanan
        System.out.println("a >> 2 = " + c);
    }
    
}
