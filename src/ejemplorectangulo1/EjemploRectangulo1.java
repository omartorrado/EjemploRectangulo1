/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplorectangulo1;

import javax.swing.JOptionPane;

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
        System.out.println(rec2.toString());//toString es un metodo de la superclase object
        float res =rec2.perimetro();//guardamos el return de perimetro en la variable res, se imprime pq el system.out ya esta en el metodo
        System.out.print(res+"\n");//print sin salto de linea que imprime el valor de res y luego hace el salto de lines con el \n
        
        Rectangulo rec3= new Rectangulo(20,10);
        System.out.println(rec3.perimetro());//hace la llamada a perimetro y luego imprime el return de perimetro, por eso lo pone 2 veces
        
        Rectangulo rec4= new Rectangulo(Float.parseFloat(JOptionPane.showInputDialog("Introduce la base")),Float.parseFloat(JOptionPane.showInputDialog("Introduce la altura")));
        //System.out.println("Este rectangulo de base "+rec4.get_base()+" y altura "+rec4.get_altura()+"\n"+rec4.area()+"\n"+rec4.perimetro()); //primero imprime las System.out de area() y perimetro() y despues esta linea con los returns de dichos metodos
        //Si el metodo no tiene un return no deja meterlo en el print
        System.out.println("En este rectangulo de base "+rec4.get_base()+" y altura "+rec4.get_altura());
        rec4.area();
        rec4.perimetro();
    }
    
}
