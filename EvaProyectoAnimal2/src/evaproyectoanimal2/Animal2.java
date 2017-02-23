/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaproyectoanimal2;

/**
 *
 * @author dam115
 */
public class Animal2 {//Si ponemos abstract no se podria instanciar la clase
    private int edad; //protected
    private String nombre="sin nombre ";
    //vamos a calcular el total de animales creados
    private  static int totalAnimales=0;
    public Animal2(int edad, String nombre) {
        this.nace();
        System.out.println("1- Creando "+ nombre);
        this.edad = edad;
        this.nombre=nombre;
        totalAnimales++;
    }

    
    public Animal2() {
        this.nace();
        System.out.println("1-Creando un animal "+nombre);
    }
    public void nace(){
        System.out.println("Hola mundo");
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
    public static void probaMetodoStatic(){
        System.out.println("Metodo estatico clase animal");
    }
    public static void totalAnimales(){
        System.out.println(totalAnimales);
    }
}
