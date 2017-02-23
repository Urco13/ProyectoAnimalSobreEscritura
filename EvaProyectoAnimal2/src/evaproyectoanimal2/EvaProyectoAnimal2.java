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
public class EvaProyectoAnimal2 {
  static Animal2 a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      a=new Animal2();
      a.setNombre("Blanco");
      //creamos un objeto tipo perro
      Perro2 blanco = new Perro2();
      
      blanco.setNombre("zar");
      blanco.setRaza("palleiro");
      
      ///Creando otro objeto perro con super
      Perro2 perro1 = new Perro2(2, "Luna");
      Perro2 perro2 = new Perro2(3, "Thor");
      perro2.setRaza("pastor");
        System.out.println(perro2.toString());
      
        System.out.println(Pajaro2.getTipo());
        Animal2.totalAnimales();
    }//fin main
    
}//fin class
