/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan48_kalkulator;

/**
 *
 * Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk menampilkan program 
* seperti pada kalkulator
 */
public class PBO3_10117082_Latihan48_Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator kal = new Kalkulator();
        kal.setValue1(7);
        kal.setValue2(5);
       
        System.out.println("VALUE 1 = "+kal.getValue1());
        System.out.println("VALUE 2 = "+kal.getValue2());
        kal.setNameProject();
        kal.setNoteProject(" ");
        System.out.println("Result Add is = "+kal.add(7,5));
        System.out.println("Result Minus is = "+kal.minus(7, 5));
        System.out.println("Result Multiple is = "+kal.multipilication(7, 5));
         System.out.println("Result Division is = "+kal.division(7, 5));
    }
    
}
