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
public class Pajaro2 {
    private float peso;
    private static final String tipo="plumas";//Static hace que el atributo se comparta no se cree uno cada vez que se crea un objeto
    public Pajaro2() {
        System.out.println("2-y soy un pajaro ");
    }

    public static String getTipo() {
        return tipo;
    }
    //Este metododo que es igual a de la clase y los dos ser estatic oculta el de la clase superior
    public static void probaMetodoStatic(){
        System.out.println("Esto es en la clase pajaro metodo static");
    }
}
