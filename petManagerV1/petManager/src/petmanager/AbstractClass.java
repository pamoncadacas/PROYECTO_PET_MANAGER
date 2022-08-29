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
public class AbstractClass {
    public static void main(String[] args) {
          // instancia de veterinaria y de doctor
        clsDoctor doctor = new clsDoctor("Maria Fernandez", "L12345");
        clsVeterinary veterinary = new clsVeterinary("Veterinaria UDC", "036 078 15 00", "calle 65 N 26-10", doctor);
        
        veterinary.setData(veterinary.getName() + " - " + veterinary.getAddress());
        
        String data = veterinary.getHospitalInformation();
        String type = veterinary.getPatientType();
        String surgery = veterinary.Surgery();
        
          
        System.out.println("Data: " + data);
        System.out.println("Type: " + type);
        System.out.println("Surgery: " + surgery);
    }
}
