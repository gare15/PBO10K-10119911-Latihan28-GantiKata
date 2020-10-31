/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pbo10119911;

import java.util.Scanner;

/**
 *
 * @author tegar
 */
public class gantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String txt, ganti_kata, menjadi_kata;
        
        System.out.println("=======Program Ganti Kata=======");
        System.out.println();
        System.out.print(" Masukkan Kalimat : ");
        txt = scan.nextLine();
        System.out.print(" Ganti Kata : ");
        ganti_kata = scan.nextLine();
        System.out.print(" Menjadi Kata : ");
        menjadi_kata = scan.nextLine();
        
            String replaceString =txt.replace(ganti_kata,menjadi_kata);
            System.out.println(replaceString);
    }
    
}
