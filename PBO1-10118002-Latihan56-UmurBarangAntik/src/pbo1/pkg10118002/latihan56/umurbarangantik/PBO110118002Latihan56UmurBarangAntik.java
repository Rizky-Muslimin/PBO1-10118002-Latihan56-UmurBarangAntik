
package pbo1.pkg10118002.latihan56.umurbarangantik;

/**
 *
 * @author 
 * NAMA  : Rizky Muslimin
 * KELAS : IF 1
 * NIM   : 10118002
 * Deskripsi Program : Program ini untuk membuat tampilan umur barang antik.
 */
public class PBO110118002Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Radio radio = new Radio(234);
        radio.setName("Radio");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
        
    }
    
}
