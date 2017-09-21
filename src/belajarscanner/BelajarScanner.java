
package belajarscanner;

import java.util.Scanner;

/**
 *
 * @author roby
 */
public class BelajarScanner {

    public static void main(String[] args) {
       
        Scanner inputObjeck = new Scanner(System.in);
        
        System.out.print("masukkan nama anda : ");
        String nama = inputObjeck.nextLine();
        
        System.out.print("masukkan usia anda : ");
        int usia = inputObjeck.nextInt();
        
        System.out.print("masukkan tinggi badan anda : ");
        double tinggi = inputObjeck.nextDouble();
        
        System.out.println(" "); //pembatas supaya lebih rapi
        
        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + usia);
        System.out.println("Tinggi Badan : " + tinggi);
    
    }
    
}
