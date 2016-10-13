/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorectangulo1;

/**
 *
 * @author otorradomiguez
 */
public class Rectangulo {
    
    //declaro atributos
    private float base,altura;
    
    //constructor valores predefinidos
    public Rectangulo(){
        base=0;
        altura=0;
    }
    //constructor con parametros para asignar a los valores
    public Rectangulo(float ba, float al){
        base=ba;
        altura=al;
    }
    //Metodos
    public void ver(){
        System.out.println("La base es "+base+" y la altura "+altura);
    }
    
    public float area(){
        System.out.println("El area es "+base*altura);
        return base*altura;
    }
    //metodos de acceso
    //set/get de la base
    public void set_base(float b){
        base = b;
    }
    
    public float get_base(){
        return base;       
    }
    //set/get de la altura
    public void set_altura(float h){
        altura = h;
    }
    
    public float get_altura(){
        return altura;
    }
}
