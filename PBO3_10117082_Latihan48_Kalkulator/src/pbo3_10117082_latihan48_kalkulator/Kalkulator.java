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
public class Kalkulator {
    private double value1;
    private double value2;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
    
    public void setNameProject(){
        System.out.println("Project Calculator"); 
    }
    public void setNoteProject(String note){
        System.out.println("This project shown you how to manage method in java");
    }
    public double add(double val1, double val2){
        return value1+value2;
        
    }
    public double minus(double val1, double val2){
        return value1-value2;
        
    }
    public double multipilication(double val1, double val2){
        return value1*value2;
        
    }
    public double division(double val1, double val2){
        return value1/value2;
        
    }
    
}
