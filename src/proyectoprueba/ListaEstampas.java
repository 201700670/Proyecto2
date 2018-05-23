/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Andrea Palomo
 */
public class ListaEstampas {

    public static ListaSEstampas listitasimpleestampas = new ListaSEstampas();
    public static String nj, ne, rutas;
    public static int raros;
    NodoEstampas inicio, fin;
    int contador;

    public ListaEstampas() {
        inicio = null;
        fin = null;
        contador = 0;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void ingreso(String nombj, String nombe, int raro, String ruta) {
        NodoEstampas nuevo = new NodoEstampas();
        nuevo.nombrejugador = nombj;
        nuevo.nombrequipo = nombe;
        nuevo.rareza = raro;
        nuevo.rutaimagen = ruta;
        listitasimpleestampas.agregaralinicio(nombj, nombe, raro, ruta);
        System.out.println("esto es una lista simple");
        listitasimpleestampas.mostrarLista();
        listitasimpleestampas.tamano();
        listitasimpleestampas.aleatorio();
        if (inicio == null) {
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
        contador++;
        System.out.println(contador + "contador");
    }

    public void mostrar() {
        NodoEstampas aux = new NodoEstampas();
        String datos = "<=>";
        aux = inicio;
        do {
            try{
            datos = datos + "[" + aux.nombrejugador + "," + aux.nombrequipo + "," + aux.rareza + "," + aux.rutaimagen + "]<=>";
            aux = aux.siguiente;
            } catch (Exception e) {
                    }
        } while (aux != inicio);
        System.out.println(datos);

    }

    public String buscar(String nombj, String nombe, int raro, String ruta) {
        NodoEstampas aux = inicio;
        String dato = "";
        do {
            try{
            if (aux.nombrejugador.equals(nombj)) {
                JOptionPane.showMessageDialog(null, "LA ESTAMPA EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                nombj = aux.nombrejugador;
                nombe = aux.nombrequipo;
                raro = aux.rareza;
                ruta = aux.rutaimagen;
                dato = "[" + aux.nombrejugador + "," + aux.nombrequipo + "," + aux.rareza + "," + aux.rutaimagen + "]";
                nj = aux.nombrejugador;
                ne = aux.nombrequipo;
                raros = aux.rareza;
                rutas = aux.rutaimagen;

            }else if(!aux.nombrejugador.equals(nombj)){
                JOptionPane.showMessageDialog(null, "LA ESTAMPA NO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
            aux = aux.siguiente;
            } catch (Exception e) {
                    }
        } while (aux != inicio);
        return dato;
    }

    public String modificar(String nombj, String nombe, int raro, String ruta) {
        NodoEstampas aux = inicio;
        String dato = "";
        do {
            if (aux.nombrejugador.equals(nj)) {
                aux.nombrejugador = nombj;
                aux.nombrequipo = nombe;
                aux.rareza = raro;
                aux.rutaimagen = ruta;
                dato = "[" + aux.nombrejugador + "," + aux.nombrequipo + "," + aux.rareza + "," + aux.rutaimagen + "]";
                System.out.println(dato);
            }
            aux = aux.siguiente;
        } while (aux != inicio);
        return dato;
    }

    public void eliminar(String nombj, String nombe, int raro, String ruta) {
        NodoEstampas actual = inicio;
        NodoEstampas anterior = fin;
        do {
            if (actual.nombrejugador.equals(nombj)) {
                if (actual == inicio) {
                    inicio = inicio.siguiente;
                    fin.siguiente = inicio;
                    inicio.anterior = fin;
                    
                } else if (actual == fin) {
                    fin = anterior;
                    try {
                        inicio.anterior = fin;
                        fin.siguiente = inicio;
                    } catch (Exception e) {
                    }
                } else if (actual != inicio) {
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }
                if(contador==1){
                inicio.siguiente=null;
                inicio=inicio.siguiente;
            }
            }
            anterior = actual;
            
            System.out.println(contador + "contador");
            
            actual = actual.siguiente;
        } while (actual != inicio);
        
    contador--;
    }

    public String labelsiguiente(int estampastam, JLabel estampa, JTextArea imprimir) {
        ImageIcon imagen;
        JLabel tomar;
        String datos = "";
        String area="";
        NodoEstampas aux = inicio;
        int tamanodato = 0;
        do {
            tamanodato++;
            
            if (tamanodato == estampastam) {
                datos = aux.rutaimagen;
                area="Nombre de jugador: "+aux.nombrejugador+"\n"+ "Nombre del equipo: "+ aux.nombrequipo+"\n";
                imprimir.append(area);
//                System.out.println(datos);
                estampa.setIcon(new ImageIcon(datos));
            }
            aux = aux.siguiente;
        } while (aux != inicio);
//        System.out.println(tamanodato+"TAMAÑOINTERNO");
        if (estampastam >= contador) {
            JOptionPane.showMessageDialog(null, "YA NO HAY MÁS JUGADORES", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
        if (estampastam ==0) {
            tamanodato=1;
            JOptionPane.showMessageDialog(null, "YA NO HAY MÁS JUGADORES", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
        }
        return datos;
    }
}
