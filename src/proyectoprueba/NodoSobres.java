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
public class NodoSobres {
    ListaSEstampas listainterna;
    String nodos;
    NodoSobres siguiente;
    public NodoSobres(ListaSEstampas listaaleatoria){
        listainterna=listaaleatoria;
        siguiente=this;
    }
}
