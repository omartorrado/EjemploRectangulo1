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
public class EjemploRectangulo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos objeto rectangulo
        Rectangulo rec1= new Rectangulo(5.5f,10);//la f es para que coja los numeros
        //como float en lugar de doubles (f->float, l->long, ...)
        rec1.ver();//mostrar base y altura
        rec1.area();//mostrar area 
        rec1.set_base(25);//cambiamos la base a 25
        rec1.area();//mostramos nueva area
        rec1.set_altura(5);//cambiamos la altura a 5, aki no hace falta la f pq pasa de int a float, que esta mas arrriba en la jerarquia
        rec1.ver();
        rec1.set_base(rec1.get_altura());//cambiamos la base para que valga lo mismo que la altura
        rec1.ver();
        
        Rectangulo rec2=new Rectangulo();//creamos un nuevo rectangulo con valores por defecto(0,0)
        rec2.ver();
        rec2.set_base(14.2f);//asignamos nuevo valor a la base
        rec2.set_altura(6.9f);//asignamos nuevo valor a la altura
        rec2.ver();
        rec2.area();
    }
    
}
