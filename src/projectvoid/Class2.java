/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectvoid;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Class2 {
    String nama, kelas, judul;
    int NIS, kembali;
    String tempat = "Selamat Datang di Perpustakaan Online";
    String tempat(){
        return tempat;
    }
    String isi = "Isi identitas dibawah ini dengan benar";
    String isi(){
        return isi;
    }
    void data(){
        //identitas
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama = ");
        nama = input.nextLine();
        System.out.println("Masukkan asal kelas = ");
        kelas = input.nextLine();
        System.out.println("Masukkan NIS = ");
        NIS = input.nextInt();
    }
     String nama(){
        return nama;
    }
     String kelas(){
        return kelas;
     }
     int NIS(){
        return NIS;
     }
     String pilih = "Pilih buku yang akan dipinjam!";
    String pilih(){
        return pilih;
    }
    void buku(){
        //daftar buku
        Scanner input = new Scanner(System.in);
        String[]judul = {"Bumi by Tereliye","Antares by Rweinda","Hans by Risa Saraswati"};
        
        for (int i = 0; i <judul.length; i++)
            System.out.println(i+". "+judul[i]);
       
        System.out.println("Silahkan masukkan nomor judul buku = ");
        int pilihan = input.nextInt();
        
        System.out.println("Buku yang dipilih : "+judul[pilihan]);
    }
    String pinjam = "Pilih berapa lama memimjam buku!";
    String pinjam(){
        return pinjam;
    }
    void meminjam(){
        //peminjaman
        Scanner input = new Scanner(System.in);
        
        String[]lama = {"3 hari","5 hari","8 hari"};
        int [] harga = {20000, 40000 , 60000};
        
        for (int i = 0; i <lama.length; i++)
            System.out.println(i+". "+lama[i]+" -> "+harga[i]);
        
        System.out.println("Silahkan masukkan nomor lama meminjam = ");
        int pilihan = input.nextInt();
        System.out.println("Lama peminjaman : "+lama[pilihan]+" -> "+harga[pilihan]);
        System.out.println("");
        
        //pembayaran
        boolean c = true;
        while(c){
            System.out.println("Silahkan masukkan uang anda");
        int uang = input.nextInt();
            if(uang==harga[pilihan]){
                System.out.println("*********************************************");
                System.out.println("Uang anda pas, JANGAN LUPA KEMBALIKAN BUKU TEPAT WAKTU");
                c = false;
            }else if(uang>harga[pilihan]){
                kembali = uang-harga[pilihan];
                System.out.println("Kembalian Sebesar "+kembali+"-"+"JANGAN LUPA KEMBALIKAN BUKU TEPAT WAKTU");
                c = false;
            }else if(uang<harga[pilihan]){
                System.out.println("UANG ANDA KURANG, SILAHKAN MASUKKAN ULANG UANG ANDA");
                c = true;}
            System.out.println("====================================================");
        }
    }
    }

