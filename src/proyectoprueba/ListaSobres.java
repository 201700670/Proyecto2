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
public class ListaSobres {
     NodoSobres ultimo;
    public ListaSobres(){
        ultimo=null;
    }
    public boolean vacia(){
        return ultimo==null;
    }
    public ListaSobres insertar(ListaSEstampas listaaleatoria){
        NodoSobres nuevo=new NodoSobres(listaaleatoria);
        if(ultimo!=null){
            nuevo.siguiente=ultimo.siguiente;
            ultimo.siguiente=nuevo;
        }
        ultimo=nuevo;
        return this;
    }
    public void mostrarlista(){
        NodoSobres auxiliar=ultimo.siguiente;
        String datos="";
        do{
            datos=datos+"["+auxiliar.nodos+"]->";
            auxiliar=auxiliar.siguiente;
        }while(auxiliar!=ultimo.siguiente);
        System.out.println("viendolista");
        System.out.println("viendolista");
        System.out.print(datos);
    }
    
}
