/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan48.kalkulator;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program kalkulator dengan menggunakan 2 nilai yang telah ditentukan.
 *                      Dengan hasil perhitungan Add, Minus, Multiple dan Division.
 * 
 */
public class MainProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Inisialisasi
        Kalkulator kalkulator = new Kalkulator();
        
        // Input nilai
        kalkulator.setValue1(7);
        kalkulator.setValue2(5);
        
        // Output
        System.out.println("VALUE 1 = " + kalkulator.getValue1());
        System.out.println("VALUE 2 = " + kalkulator.getValue2());
        kalkulator.setNameProject();
        kalkulator.setNoteProject();
        
        // Output hasil penghitungan
        System.out.println("Result Add is      = " + kalkulator.add(0, 0));
        System.out.println("Result Minus is    = " + kalkulator.minus(0, 0));
        System.out.println("Result Multiple is = " + kalkulator.multiplication(0, 0));
        System.out.println("Result Division is = " + kalkulator.division(0, 0));
        
    }
    
}
