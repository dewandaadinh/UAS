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
public class pagawai {
    public String kode;
    String nama;
    private String alamat, gol, pernikahan;
    private int umur, nikah, jmlanak;
    Gaji g;

    public pagawai(String kode, String nama, String alamat, String gol,int usia, int nikah, int anak) {
        this.kode = kode;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
        this.gol = gol;
        this.nikah = nikah;
        this.jmlanak= jmlanak;
        
        if(this.nikah == 1){
            this.pernikahan = "Sudah Menikah";
        }else{
            this.pernikahan = "Belum Menikah";
        }
    }
    
    public void printTable(){
        if(this.nikah == 1){
            pernikahan = "Sudah Menikah";
        }else{
            pernikahan = "Belum Menikah";
        }
        System.out.println(this.kode+"         "+this.nama+"       "+this.gol+"     "+this.umur+"     "+this.pernikahan+"              "+this.jmlanak);
    }
    
    public void printpagawai(){
        
        System.out.println();
        System.out.println("================== Data Karyawan ==================");
        System.out.println("Kode Karyawan : "+this.kode);
        System.out.println("Nama Karyawan : "+this.nama);
        System.out.println("Golongan : "+this.gol);
        System.out.println("Usia : "+this.umur);
        System.out.println("Status Menikah : "+this.pernikahan);
        System.out.println("Jumlah Anak : "+this.jmlanak);
    }

}
