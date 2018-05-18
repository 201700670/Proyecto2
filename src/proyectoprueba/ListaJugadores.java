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
public class ListaJugadores {

    public static String nombre_jugador, num_camisola, posicion_campo, titularobancas, id_equipo;
    private NodoJugadores inicio, fin;

    public ListaJugadores() {
        inicio = null;
        fin = null;
    }

    //cuando está vacía
    public boolean vacia() {
        return inicio == null;
    }

    // método agregar al inicio
    public void insertarinicio(String nombrejugador, String camisola, String posicion, String titularobanca, String idEquipo) {
        if (!vacia()) {
//            if (NodoEquipos.idEquiposequipos==NodoJugadores.idEquipos) {
                inicio = new NodoJugadores(nombrejugador, camisola, posicion, titularobanca, idEquipo, inicio, null);
                inicio.siguiente.anterior = inicio;
//            }
        } else {
//            if (NodoEquipos.idEquiposequipos==NodoJugadores.idEquipos) {
                inicio = fin = new NodoJugadores(nombrejugador, camisola, posicion, titularobanca, idEquipo);
//            }
        }
    }

    public void mostrar() {
        if (!vacia()) {
            String datos = "<=>";
            NodoJugadores aux = inicio;
            while (aux != null) {
                datos = datos + "[" + aux.nombrejugador + "," + aux.camisola + "," + aux.posicion + "," + aux.titularoBanca + "," + aux.idequipos + "]<=>";
                aux = aux.siguiente;
            }
            System.out.println(datos);
        }
    }

   

    public String buscareditar(String nombrejugador, String camisola, String posicion, String titularobanca, String idEquipo) {
        NodoJugadores aux = inicio;
        String dato = "";
        while (aux != null) {
            if (aux.camisola.equals(num_camisola)) {
                aux.nombrejugador = nombrejugador;
                aux.camisola = camisola;
                aux.posicion = posicion;
                aux.titularoBanca = titularobanca;
                aux.idequipos = idEquipo;
                dato = "[" + aux.nombrejugador + "," + aux.camisola + "," + aux.posicion + "," + aux.titularoBanca + "," + aux.idequipos + "]";
                System.out.println(dato);
                mostrar();
            }
            aux = aux.siguiente;
        }
        return dato;
    }

    public String buscareditarbuscar(String nombrejugador, String camisola, String posicion, String titularobanca, String idEquipo) {
        NodoJugadores aux = inicio;
        String dato = "";
        while (aux != null) {
            if (aux.camisola.equals(camisola)) {
                JOptionPane.showMessageDialog(null, "EL JUGADOR EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                nombrejugador = aux.nombrejugador;
                camisola = aux.camisola;
                posicion = aux.posicion;
                titularobanca = aux.titularoBanca;
                idEquipo = aux.idequipos;
                dato = "[" + aux.nombrejugador + "," + aux.camisola + "," + aux.posicion + "," + aux.titularoBanca + "," + aux.idequipos + "]";
                nombre_jugador = aux.nombrejugador;
                num_camisola = aux.camisola;
                posicion_campo = aux.posicion;
                titularobancas = aux.titularoBanca;
                id_equipo = aux.idequipos;
//                System.out.println(dato);

            }
            aux = aux.siguiente;
        }
        return dato;
    }

    public String eliminar(String nombrejugador, String camisola, String posicion, String titularobanca, String idEquipo) {
        NodoJugadores aux = inicio;
        NodoJugadores atras = null;
        String dato = "";
        while (aux != null) {
            if (aux.camisola.equals(num_camisola)) {
                if (aux == inicio) {
                    try {
                        inicio = inicio.siguiente;
                        inicio.anterior = null;
                    } catch (Exception e) {
                    }
                } else {
                    try {
                        atras.siguiente = aux.siguiente;
                        aux.siguiente.anterior = aux.anterior;
                    } catch (Exception e) {
                    }
                }
//                dato="["+aux.obcui+","+aux.obnom+","+aux.obcorreo+","+aux.obusu+","+aux.obcontra+"]";
//                System.out.println(dato);
//                mostrar();
            }
            atras = aux;
            aux = aux.siguiente;
        }
        return dato;
    }
}
