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
public class NodoJugadores {
    String codigo,nombrequipo, mundiales;
    NodoJugadores siguiente, anterior;
    public NodoJugadores(String codigo,String nombrequipo,String mundiales) {
        this(codigo,nombrequipo, mundiales ,null,null);
    }
    public NodoJugadores(String codigos,String nombrequipos,String mundialesg, NodoJugadores s, NodoJugadores a){
        codigo=codigos;
        nombrequipo=nombrequipos;
        mundiales=mundialesg;
        siguiente=s;
        anterior=a;
    }
}
