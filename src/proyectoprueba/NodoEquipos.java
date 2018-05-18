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
    String nombrequipo, mundiales;
    String codigo;
    NodoEquipos siguiente, anterior;
    public static String idEquiposequipos;
    ListaJugadores listitajugadoresinterna;
    public NodoEquipos(String codigo,String nombrequipo,String mundiales,ListaJugadores listitainternajugadores) {
        this(codigo,nombrequipo, mundiales,listitainternajugadores,null,null);
    }
    public NodoEquipos(String codigos,String nombrequipos,String mundialesg,ListaJugadores listitainternajugadores, NodoEquipos s, NodoEquipos a){
        codigo=codigos;
        nombrequipo=nombrequipos;
        mundiales=mundialesg;
        idEquiposequipos=codigo;
        listitajugadoresinterna=listitainternajugadores;
        siguiente=s;
        anterior=a;
    }
}
