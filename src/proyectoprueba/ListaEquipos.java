/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import java.awt.BorderLayout;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrea Palomo
 */
public class ListaEquipos {

    public static String obcodigo, nombre_equipo, mundiales_ganados;
    private NodoEquipos inicio, fin;
    public static boolean comprobando=false;
    public static String Globalidequipos;
    public ListaEquipos() {
        inicio = null;
        fin = null;
    }

    //cuando está vacía
    public boolean vacia() {
        return inicio == null;
    }

    // método agregar al inicio
    public void insertarinicio(String codigo,String nombrequipo,String mundiales,ListaJugadores listo) {
//        buscarrepetidos(codigo);
        if (!vacia()) {
//            if(comprobando==false){
            inicio = new NodoEquipos(codigo, nombrequipo, mundiales,listo, inicio, null);
            inicio.siguiente.anterior = inicio;
//            }
        } else {
//            if(comprobando==false){
            inicio = fin = new NodoEquipos(codigo, nombrequipo, mundiales,listo);
//            }
        }
    }

    public boolean buscarrepetidos(String codigo) {
        NodoEquipos aux = inicio;
        String dato = "";
        while (aux != null) {
            if (aux.codigo.equals(codigo)) {
                JOptionPane.showMessageDialog(null, "YA EXISTE UN EQUIPO CON ESE NOMBRE", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            aux = aux.siguiente;
            
        }
        return comprobando;
    }

    public void mostrar() {
        if (!vacia()) {
            String datos = "<=>";
            NodoEquipos aux = inicio;
            while (aux != null) {
                datos = datos + "[" + aux.codigo + "," + aux.nombrequipo + "," + aux.mundiales + "]<=>";
                aux = aux.siguiente;
            }
            System.out.println(datos);
        }
    }
   
    
    public String itemsdeequipos(JComboBox idequipos){
            String datos = "";
            NodoEquipos aux = inicio;
            while (aux != null) {
                datos =aux.codigo;
                Globalidequipos=datos;
                idequipos.addItem(datos);
//                System.out.println(Globalidequipos);
                aux = aux.siguiente;
            }
        return datos;
    }
    
    public boolean buscarsiexistenlistas(String codigo) {
        NodoEquipos aux = inicio;
        String dato = "";
        boolean probando=false;
        while (aux != null) {
            if (aux.codigo.equals(codigo)&& aux.listitajugadoresinterna.busquedaequiposjugadores(codigo)) {
                dato = "[" + aux.codigo + "," + aux.nombrequipo + "," + aux.mundiales +","+ListaJugadores.mostrarenequipos+ "]";
                System.out.println(dato);
                probando=true;
            }
            aux = aux.siguiente;
        }
        return probando;
    }
    
    public boolean creanodosiexiste(String codigo) {
        NodoEquipos aux = inicio;
        String dato = "";
        boolean probando=false;
        while (aux != null) {
            if (aux.codigo.equals(codigo)) {
                dato = "[" + aux.codigo + "," + aux.nombrequipo + "," + aux.mundiales +","+ListaJugadores.mostrarenequipos+ "]";
                System.out.println(dato);
                probando=true;
            }
            aux = aux.siguiente;
        }
        return probando;
    }
    
    public String buscareditar(String codigo, String nombrequipo, String mundiales) {
        NodoEquipos aux = inicio;
        String dato = "";
        while (aux != null) {
            if (aux.codigo.equals(obcodigo)) {
                aux.codigo = codigo;
                aux.nombrequipo = nombrequipo;
                aux.mundiales = mundiales;
                dato = "[" + aux.codigo + "," + aux.nombrequipo + "," + aux.mundiales + "]";
                System.out.println(dato);
                mostrar();
            }
            aux = aux.siguiente;
        }
        return dato;
    }

    public String buscareditarbuscar(String codigo, String nombrequipo, String mundiales) {
        NodoEquipos aux = inicio;
        String dato = "";
        while (aux != null) {
            if (aux.codigo.equals(codigo)) {
                JOptionPane.showMessageDialog(null, "EL EQUIPO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                codigo = aux.codigo;
                nombrequipo = aux.nombrequipo;
                mundiales = aux.mundiales;
                dato = "[" + aux.codigo + "," + aux.nombrequipo + "," + aux.mundiales + "]";
                obcodigo = aux.codigo;
                nombre_equipo = aux.nombrequipo;
                mundiales_ganados = aux.mundiales;
//                System.out.println(dato);

            }
            aux = aux.siguiente;
        }
        return dato;
    }

    public String eliminar(String codigo, String nombrequipo, String mundiales) {
        NodoEquipos aux = inicio;
        NodoEquipos atras = null;
        String dato = "";
        while (aux != null) {
            if (aux.codigo.equals(obcodigo)) {
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
    public String filastabla(JTable tablaequipos){
        String [] encabezado={ "Código","Nombre de Equipo", "Mundiales ganados"};
        DefaultTableModel creaciontabla=new DefaultTableModel(null,encabezado);
            String datos = "";
            NodoEquipos aux = inicio;
            while (aux != null) {
                
                String[]equipos={aux.codigo,aux.nombrequipo,aux.mundiales};
                creaciontabla.addRow(equipos);
                
//                System.out.println(Globalidequipos);
                aux = aux.siguiente;
            }
            tablaequipos.setModel(creaciontabla);
        return datos;
    }
}
