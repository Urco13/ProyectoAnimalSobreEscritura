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
public class Perro2 extends Animal2{
    String raza;

    public Perro2() {//si queremos haceder a variables privadas aunque se herede no se puede acceder
//        this(0,"sin dato");llama al constructor dentro de la misma clase
        this.setNombre("2-Perro sin nombre "+this.getNombre());
    }
    public Perro2(int edad, String nombre){
        super(edad,nombre);//con super llamamos a un constructor de la clase superior superclase
        System.out.println("Creando perro "+this.getEdad());
//        this.setEdad(edad);
//        this.setNombre(nombre);
    }
   
    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public String getRaza() {
        return raza;
    }
    
     static void verDatos(Perro2 dogo){//Creamos un metodo que recibe como parametro el objeto perro;
        System.out.println("datos: "+dogo.raza);
    }
    
    ////////////////importante//////////////
//    @Override/////Sobre escribimos el metodo toString
//    public String toString(){
//        return  "Perro{"+ "raza="+this.raza+"}";
//    }
   
    /////////importante/////////////////
    @Override //sobreescribir equals
     public boolean equals(Object obj){
        if (obj==null) {
            return false;
        }
        if (this.getClass() !=obj.getClass()) {
            return false;
        }
        //convertimos
        final Perro2 otro = (Perro2) obj;
        
        return otro.getRaza().equalsIgnoreCase(this.raza);
    }//fin sobre escribir
     
  
}//fin class
