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
public class Interface {
    public static void main(String[] args) {
         // instancias de las clases hijas 
        clsDog dog  = new clsDog("criollo", false,  "001", "Firulais", 2013, " Negro", "Sano");
        clsCat cat = new clsCat("Angora", "002", "Minino", 2013, "Blanco y Negro", "Enfermo");
        
        System.out.println(dog.getAnimalType());
        System.out.println("" + cat.getAnimalType());
        
        
        System.out.println(dog.getNumberOfBones());
        System.out.println("" + cat.getNumberOfBones());
        
    }
}
