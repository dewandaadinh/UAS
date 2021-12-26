/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uaspegawai;
import pegawai.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import Pegawai.pagawai;
import java.util.Scanner;

/**
 *
 * @author DEWA
 */
public class UASPegawai {
    private ArrayList<pagawai> datap = new ArrayList<pagawai>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TampilData td = new TampilData();
        
        
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        
        
        while(loop == true){   
            System.out.println();
            System.out.println("============ Menu Utama============  ");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Menu pilihan: ");
            String m = input.nextLine();
            switch(m){
                case "1" :
                  
                    boolean a = true;
                    while(a == true){
                        
                        System.out.println("==================== Tambah Karyawan =========================");
                        System.out.print("Masukkan kode karyawan: ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan nama karyawan: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan alamat: ");
                        String alamat = input.nextLine();
                        System.out.println("Data berhasil disimpan!");
                        System.out.println();
                    }
                 
                    loop = true;
                    break;
                case "2":
                    boolean b = true;
                    while(b == true){
                        
                        System.out.println();
                        System.out.println("=================== Hapus Karyawan ================");
                        System.out.print("Masukkan Kode Karyawan : ");
                        String i = input.nextLine();
                        td.hapus(i);
                        System.out.println();
                    }
                    break;
                case "3":
                    boolean c = true;
                    while(c == true){
                        System.out.println();
                        System.out.println("=================== Cari Karyawan ================");
                        System.out.print("Masukkan Kode Karyawan : ");
                        String h = input.nextLine();
                        td.cari(h);
                        System.out.println();
                    }
                    break;
                case "4":
                    System.out.println();
                    td.tampil();
                    System.out.println();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default :
                    loop = true;
                    break;
            }
            
        }
        

    }
    
}
