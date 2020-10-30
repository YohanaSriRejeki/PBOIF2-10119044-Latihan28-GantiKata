/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan kalimat yang katanya telah diganti
 * sesuai permintaan user
 */

public class PBOIF210119044Latihan28GantiKata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("Masukkan kalimat : ");
        String kalimat = input.nextLine();
        System.out.print("Ganti Kata : ");
        String kata1 = input.next();
        System.out.print("Menjadi Kata : ");
        String kata2 = input.next();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        String diganti = kalimat.replace(kata1,kata2);
        System.out.println("Kalimat awal : " +kalimat);
        System.out.println("Kalimat baru : " +diganti);
    }
    
}
