/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrea Palomo
 */
public class ListaEstampas {

    public static String nj, ne, rutas;
    public static int raros;
    NodoEstampas inicio, fin;
    int contador;
    public ListaEstampas() {
        inicio =null;
        fin = null;

    }

    public boolean vacia() {
        return inicio == null;
    }

    public void ingreso(String nombj, String nombe,int raro,String ruta) {
        NodoEstampas nuevo = new NodoEstampas();
        nuevo.nombrejugador=nombj;
        nuevo.nombrequipo=nombe;
        nuevo.rareza=raro;
        nuevo.rutaimagen=ruta;
        if (inicio==null) {
            inicio = nuevo;
            inicio.siguiente = inicio;
            nuevo.anterior = fin;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            nuevo.siguiente = inicio;
            nuevo.anterior = fin;
            fin = nuevo;
            inicio.anterior = fin;
        }
    }

    public void mostrar() {
            NodoEstampas aux= new NodoEstampas();
            String datos = "<=>";
            aux = inicio;
            do{
                datos=datos+"["+aux.nombrejugador+ "," + aux.nombrequipo + "," + aux.rareza + "," + aux.rutaimagen + "]<=>";
                
                aux = aux.siguiente;
            }while (aux != inicio);
            System.out.println(datos);
    }

    public String buscar(String nombj, String nombe, int raro, String ruta) {
        NodoEstampas aux = inicio;
        String dato = "";
        do {
            if (aux.nombrejugador.equals(nombj)) {
                JOptionPane.showMessageDialog(null, "EL EQUIPO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                nombj = aux.nombrejugador;
                nombe = aux.nombrequipo;
                raro = aux.rareza;
                ruta = aux.rutaimagen;
                dato = "[" + aux.nombrejugador + "," + aux.nombrequipo + "," + aux.rareza + "," + aux.rutaimagen + "]";
                nj = aux.nombrejugador;
                ne = aux.nombrequipo;
                raros = aux.rareza;
                rutas = aux.rutaimagen;

            }
            aux = aux.siguiente;
        }while (aux != inicio);
        return dato;
    }

    public String modificar(String nombj, String nombe, int raro, String ruta) {
        NodoEstampas aux = inicio;
        String dato = "";
         do{
            if (aux.nombrejugador.equals(nj)) {
                aux.nombrejugador = nombj;
                aux.nombrequipo = nombe;
                aux.rareza = raro;
                aux.rutaimagen = ruta;
                dato = "[" + aux.nombrejugador + "," + aux.nombrequipo + "," + aux.rareza + "," + aux.rutaimagen + "]";
                System.out.println(dato);
            }
            aux = aux.siguiente;
        }while (aux != inicio);
        return dato;
    }

    public void eliminar(String nombj) {
        NodoEstampas actual = inicio;
        NodoEstampas anterior = fin;
        do {
            if (actual.nombrejugador.equals(nombj)) {
                if (actual == inicio) {
                    inicio = inicio.siguiente;
                    fin.siguiente = inicio;
                    inicio.anterior = fin;
                } else if(actual==fin){
                    fin=anterior;
                    inicio.anterior=fin;
                    fin.siguiente=inicio;
                }else{
                    anterior.siguiente=actual.siguiente;
                    actual.siguiente.anterior=anterior;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        }while (actual != inicio);
    }
}
