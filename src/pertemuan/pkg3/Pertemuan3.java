/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan.pkg3;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class Pertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kondisi;
        kondisi = "Biodata"  ;
        kondisi = "Kalkulator" ;
        JOptionPane.showInputDialog(null," Silahka Pilih Kondisi : [Biodata, Kalkulator] ");
        Pertemuan3 per = new Pertemuan3();
        if ("Biodata".equals(kondisi)){
            per.biodata();
        } else if ("Kalkulator".equals(kondisi)){
            per.kalkulator();
        }
    }
   void biodata(){
      
       String nd, nb, tem, tgl_lhr, alamat, mk;
        int nohp, nilai;
        
        nd = JOptionPane.showInputDialog(null, "Masukkan Nama Depan Anda : ");
        nb = JOptionPane.showInputDialog(null, "Masukkan Nama Belakang Anda : ");
        tem = JOptionPane.showInputDialog(null, "Masukkan Tempat Lahir Anda : ");
        tgl_lhr = JOptionPane.showInputDialog(null, "Masukkan Tanggal Lahir Anda : ");
        nohp = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan nomor HP Anda : "));
        mk = JOptionPane.showInputDialog(null, "Masukkan Nama Mata Kuliah Anda Hari Ini : ");
        nilai = Integer.parseInt(JOptionPane.showInputDialog(null, "Maukkan Nilai Mata Kuliah Anda : "));
        alamat = JOptionPane.showInputDialog(null, "Masukkan Alamat anda : ");
        
        JOptionPane.showMessageDialog(null, "=====================Biodata=====================\n" + 
        "Nama                                   : " + nd + " " + nb + "\n" + 
        "Tempat/Tanggal Lahir                   : " + tem + " " + tgl_lhr + "\n" +
        "No. Hp                                 : " + nohp + "\n" +
        "Nama Mata Kuliah Saat Ini              : " + mk + "\n" +
        "Masukkan Nilai Mata Kuliah Anda        : " + nilai + "\n" +
        "Nilai Huruf                            : ?" + "\n" +
        "Alamat                                 : " + alamat );
        
   } 
   void kalkulator(){
      
       String a,b;
        int nilai1, nilai2, tambah, kurang, kali, bagi;

            a = JOptionPane.showInputDialog(null, "Masukan Bilangan Pertama (Harus Angka) : ");
            b = JOptionPane.showInputDialog(null, "Masukan Bilangan Kedua (Harus Angka) : ");
             
            nilai1 = Integer.parseInt(a);
            nilai2 = Integer.parseInt(b);
             
            tambah = nilai1 + nilai2;
            kurang = nilai1 - nilai2;
            kali = nilai1 * nilai2;
            bagi = nilai1 / nilai2;
             
JOptionPane.showMessageDialog(null,
        "Bilangan 1 : " + nilai1 + "\n" +
        "Bilangan 2 : " + nilai2 + "\n" +
        "Tambah     : " + nilai1 + " + " + nilai2 + " Adalah " + tambah + "\n" +
        "Kurang     : " + nilai1 + " - " + nilai2 + " Adalah " + kurang + "\n" +
        "Kali       : " + nilai1 + " * " + nilai2 + " Adalah " + kali + "\n" +
        "Bagi       : " + nilai1 + " / " + nilai2 + " Adalah " + bagi + "\n");
   }
}
