/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cac_poo_u2;

/**
 *
 * @author arpon
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private int edad;
    private String hobbie;
    private String editor;
    private String so;
    
    public Usuario(){}
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void setHobbie(String hobbie){
        this.hobbie = hobbie;
    }
    
    public void setEditor(String editor){
        this.editor = editor;
    }
    
    public void setSO(String so){
        this.so = so;
    }
    
    public void imprimir(){
        System.out.println("nombre: "+this.nombre);
        System.out.println("apellido: "+this.apellido);
        System.out.println("edad: "+this.edad);
        System.out.println("hobbie: "+this.hobbie);
        System.out.println("editor preferido: "+this.editor);
        System.out.println("sistema operativo: "+this.so);
    }
}
