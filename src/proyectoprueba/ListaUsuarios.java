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
public class ListaUsuarios {
    private NodoUsuario inicio, fin;
    public ListaUsuarios(){
        inicio=null;
        fin=null;
    }
    //cuando está vacía
    public boolean vacia(){
        return inicio==null;
    }
    // método agregar al inicio
    public void insertarinicio(String el){
        if(!vacia()){
            inicio=new NodoUsuario(el, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoUsuario(el);
        }
    }
    public void mostrar(){
        if(!vacia()){
            String datos="<=>";
            NodoUsuario aux=inicio;
            while(aux!=null){
                datos=datos+"["+aux.nomusuario+"]<=>";
                aux=aux.siguiente;
            }
            System.out.println(datos);
        }
    }
}
