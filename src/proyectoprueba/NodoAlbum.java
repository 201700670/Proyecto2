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
public class NodoAlbum {
    String rutaimagen;
    public NodoAlbum siguiente;
    public NodoAlbum(String ruta){//final
        rutaimagen=ruta;
        this.siguiente=null;
    }
    public NodoAlbum(String ruta, NodoAlbum n){//inicio
        rutaimagen=ruta;
        siguiente=n;
    }
}
