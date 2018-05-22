/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static proyectoprueba.ListaEquipos.Globalidequipos;

/**
 *
 * @author Andrea Palomo
 */
public class ListaSEstampas {

    ListaSobres listitassobres = new ListaSobres();
    protected NodoSEstampas inicio, fin;
    public static int tamano;

    public ListaSEstampas() {
        inicio = null;
        fin = null;
        this.tamano = 0;
        
    }

    public void agregaralinicio(String nombj, String nombe, int raro, String ruta) {
        inicio = new NodoSEstampas(nombj, nombe, raro, ruta, inicio);
        if (fin == null) {
            fin = inicio;
        }
        this.tamano++;
    }

    public String mostrarLista() {
        NodoSEstampas recorrer = inicio;
        String dato = "";
        while (recorrer != null) {
            dato = "[" + recorrer.nombrejugador + "," + recorrer.nombrequipo + "," + recorrer.rareza + "," + recorrer.rutaimagen + "]=>";
            System.out.print(dato);
            recorrer = recorrer.siguiente;
        }
        System.out.println();
        return dato;
    }

    public String varioslabels(int estampastam, JLabel estampa) {
        ImageIcon imagen;
        JLabel tomar;
        String datos = "";
        NodoSEstampas aux = inicio;
        int tamanodato = 0;
        while (aux != null) {
            tamanodato++;
            
            if (tamanodato == estampastam) {
                datos = aux.rutaimagen;
                System.out.println(datos);
                estampa.setIcon(new ImageIcon(datos));
            }
            aux = aux.siguiente;
            
        }if (estampastam > tamano) {
                JOptionPane.showMessageDialog(null, "YA NO HAY MÁS JUGADORES", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
        return datos;
    }

    public boolean vacia() {//si está vacioa
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void tamano() {
        System.out.println(this.tamano);
    }

    public void aleatorio() {
        int valorDado = (int) Math.floor(Math.random() * 7 + 1);
        System.out.println("valor aleatorio " + valorDado);
        if (tamano != 0) {
            String str = "";
            NodoSEstampas recorrer = inicio;
            for (int i = 0; i < this.tamano; i++) {
//                System.out.println(this.tamano);
                if (this.tamano > valorDado || this.tamano == valorDado) {
                    str = str + "[" + recorrer.nombrejugador + "," + recorrer.nombrequipo + "," + recorrer.rareza + "," + recorrer.rutaimagen + "]=>";
//                listitassobres.insertar(str);
//                listitassobres.mostrarlista();
                    recorrer = recorrer.siguiente;
                }

            }
            if (!str.equals("")) {
                System.out.println("holamundo" + str);
//                listitassobres.insertar(str);
            }

        }
    }
}
