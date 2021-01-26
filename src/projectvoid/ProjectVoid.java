/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectvoid;

/**
 *
 * @author MOKLET-2
 */
public class ProjectVoid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Class2 buku = new Class2();
        System.out.println(buku.tempat());
        System.out.println("=====================================");
        
        System.out.println(buku.isi());
       buku.data();
        System.out.println("-------------------------------------");
        
       System.out.println("Nama peminjam = "+buku.nama());
        System.out.println("Kelas peminjam = "+buku.kelas());
        System.out.println("NIS peminjam = "+buku.NIS);
        System.out.println("======================================");
        
        System.out.println(buku.pilih());
       buku.buku();
        System.out.println("======================================");
        
        System.out.println(buku.pinjam());
       buku.meminjam();
    }   
}
