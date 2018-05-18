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
    String nombrejugador,camisola, posicion, titularoBanca,idequipos;
    NodoJugadores siguiente, anterior;
    public static String idEquipos;
    public NodoJugadores(String nombrejugador,String camisola,String posicion, String titularobanca, String idEquipo) {
        this(nombrejugador,camisola, posicion, titularobanca, idEquipo, null, null);
    }
    public NodoJugadores(String nombrejugador,String camisola,String posicion, String titularobanca, String idEquipo, NodoJugadores s, NodoJugadores a){
        this.nombrejugador=nombrejugador;
        this.camisola=camisola;
        this.posicion=posicion;
        this.titularoBanca=titularobanca;
        idequipos=idEquipo;
        idEquipos=idequipos;
        siguiente=s;
        anterior=a;
    }
}
