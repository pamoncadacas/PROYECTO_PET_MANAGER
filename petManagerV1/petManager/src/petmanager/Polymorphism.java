/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petmanager;

import clases.*;

/**
 *
 * @author 57315
 */
public class Polymorphism {
    public static void main(String[] args) {
        // instancias de las clases hijas 
        clsDog dog  = new clsDog("criollo", false,  "001", "Firulais", 2013, " Negro", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Minino", 2013, "Blanco y Negro", "Enfermo");
        
        // instancia de veterinaria y de doctor
        clsDoctor doctor = new clsDoctor("Maria Fernandez", "L12345");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UDC", "036 078 15 00", "calle 65 N 26-10", doctor);
        
        String careDog = veterinary.PetCare(dog);
        System.out.println("El estado de salud de " + dog.getName() + " es: " + careDog);
        
        String careCat = veterinary.PetCare(cat);
        System.out.println("El estado de salud de " + cat.getName() + " es: " + careCat);
    }
}
