/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luaskeliling;
import java.util.Scanner;
/**
 *
 * @author LK5_8
 */
public class persegipanjang {
    public static void main (String [] args) {
           Scanner nilai = new Scanner (System.in);
           
           int panjang , lebar ;
           System.out.println("Masukan panjang : ");
           panjang = nilai.nextInt();
           System.out.println("Masukan lebar : ");
           lebar = nilai.nextInt();
           
           int Luas , Keliling ;
           
           Luas = panjang * lebar;
           System.out.println("Luas Persegi Panjang : "+Luas);  
           
           Keliling = 2* (panjang + lebar);
           System.out.println("Keliling Persegi Panjang : "+Keliling);
           
           
    }
}
