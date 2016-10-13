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
    
    public float area(){//devuelve el valor del area pero no lo guarda en ninguna variable local
        System.out.println("El area es "+base*altura);
        return base*altura;    
    }
    // tb lo podemos declarar asi:
    // public float area(){
    //float area=base*altura;
    //System.out.print("El area es "+ area);
    //}
    public float perimetro(){//guarda el perimetro en una variable local p, lo muestra y lo devuelve
        float p=base*2+altura*2;
        System.out.println("El perimetro es "+(p));
        return p;
        //tb puedo poner el return asi:
        //return (base*2+altura*2);
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
