/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cac_poo_u2;

import java.util.*;
/**
 *
 * @author arpon
 */
public class Cac_poo_u2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        String apellido;
        int edad;
        String hobbie;
        String editor;
        String so;
        
        Usuario u1 = new Usuario();
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = sc.nextLine();
        u1.setNombre(nombre);
        System.out.println("Ingrese su apellido: ");
        apellido = sc.nextLine();
        u1.setApellido(apellido);
        System.out.print("Ingrese su edad ");  
        edad = Integer.parseInt(sc.nextLine());
        u1.setEdad(edad);
        System.out.println("Ingrese un hobbie: ");
        hobbie = sc.nextLine();
        u1.setHobbie(hobbie);
        System.out.println("Ingrese su editor preferido: ");
        editor = sc.nextLine();
        u1.setEditor(editor);
        System.out.println("Ingrese su sistema operativo: ");
        so = sc.nextLine();
        u1.setSO(so);
        System.out.println("Datos ingresados:");
        u1.imprimir();
    }
    
}
