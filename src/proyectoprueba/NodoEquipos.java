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
public class NodoEquipos {
    String codigo,nombrequipo, mundiales;
    NodoEquipos siguiente, anterior;
    ListaJugadores jugadores;
    public NodoEquipos(String codigo,String nombrequipo,String mundiales,ListaJugadores jugadores) {
        this(codigo,nombrequipo, mundiales ,null,null,null);
    }
    public NodoEquipos(String codigos,String nombrequipos,String mundialesg,ListaJugadores jugadores, NodoEquipos s, NodoEquipos a){
        codigo=codigos;
        nombrequipo=nombrequipos;
        mundiales=mundialesg;
        this.jugadores=jugadores;
        siguiente=s;
        anterior=a;
    }
}
