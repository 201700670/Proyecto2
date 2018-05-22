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
public class NodoSEstampas {
    String nombrejugador,nombrequipo,rutaimagen;
    int rareza;
    public NodoSEstampas siguiente;
    public NodoSEstampas(String nombj, String nombe, int raro, String ruta){//final
        nombrejugador=nombj;
        nombrequipo=nombe;
        rutaimagen=ruta;
        rareza=raro;
        this.siguiente=null;
    }
    public NodoSEstampas(String nombj, String nombe, int raro, String ruta, NodoSEstampas n){//inicio
        nombrejugador=nombj;
        nombrequipo=nombe;
        rutaimagen=ruta;
        rareza=raro;
        siguiente=n;
    }
}
