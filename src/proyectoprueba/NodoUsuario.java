/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

/**
 *
 * @author Andrea Palomo
 */
public class NodoUsuario  {
    String nomusuario;
    NodoUsuario siguiente, anterior;
    public NodoUsuario(String el) {
        this(el,null,null);
    }
    public NodoUsuario(String el, NodoUsuario s, NodoUsuario a){
        ////NO SE SI PONERLE EL IF DE LA COMPARACIÓN DE LOS USUARIOS CON EL USUARIO ACTUAL
        nomusuario=ProyectoPrueba.usuarioactual;
        nomusuario=el;
        siguiente=s;
        anterior=a;
    }
}    
    


