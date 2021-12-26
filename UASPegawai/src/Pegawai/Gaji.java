/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pegawai;

/**
 *
 * @author DEWA
 */
public class Gaji extends pagawai {
    int gapok;
    double tunjnikah, tunjanak, tunjPegawai, total, potongan;
    int anak,umur,nikah;
    private double tunjpeg;

    public Gaji(String kode, String nama, String alamat, String gol, int usia, int nikah, int anak) {
        super(kode, nama, alamat, gol, usia, nikah, anak);
    }
    

    
    long hitungGajibersih(){
        String gol = null;
        switch(gol){
            case "A":
                this.gapok = 5000000;
                break;
            case "B":
                this.gapok = 6000000;
                break;
            case "C" :
                this.gapok = 7000000;
                break;
        }
        return gapok;
        
  }
    
    long hitungTunjNikah(){
        long tnnikah;
        if (nikah == 1){
            tunjnikah = gapok*0.1;
        }else{
            tunjnikah = 0;
        }
         
        return (long) tunjnikah;
    }
    
    long hitungTunjPegawai(){
        long tunjpeg;
        if (umur < 40){
            tunjPegawai = gapok*0.15;
        }else{
            tunjPegawai = 0;
        }
         
        return (long) tunjPegawai;
    }
    
    long hitungTunjAnak(){
        long tnanak;
        tunjanak = anak *(gapok*0.05);
        return (long) tunjanak;
    }
    
    long hitungTotalGaji(){
        long total = (long) (this.gapok+ this.tunjnikah + this.tunjanak + this.tunjPegawai);
        return total;
    }
    
    long hitungPotongan(){
        long potongan = (long) (total*0.025);
        return potongan;
    }
    long hitunggaji(){
        long gaji = (long) (this.total-this.potongan);
        return gaji;
    }
    
    
    
    
    
     public void printpagawai(){
        
        System.out.println();
        System.out.println("-----------------------------------");
        System.out.println("Gaji Pokok : "+this.hitungGajibersih());
        System.out.println("Tunjangan Nikah : "+this.hitungTunjNikah());
        System.out.println("Tunjangan Pegawai : "+this.hitungTunjPegawai());
        System.out.println("Tunjangan Anak : "+this.hitungTunjAnak());
        System.out.println("----------------------------------------------- +");
        System.out.println("Gaji Kotor : "+this.hitunggaji());
        System.out.println("Potongan : "+this.hitungPotongan());
    }

    
}


