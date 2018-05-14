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
public class ListaEquipos {
    private NodoEquipos inicio, fin;
    
    public ListaEquipos(){
        inicio=null;
        fin=null;
    }
    //cuando está vacía
    public boolean vacia(){
        return inicio==null;
    }
    // método agregar al inicio
    public void insertarinicio(String codigo,String nombrequipo,String mundiales,ListaJugadores jugador){
        if(!vacia()){
            inicio=new NodoEquipos(codigo,nombrequipo, mundiales,jugador, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoEquipos(codigo,nombrequipo, mundiales,jugador);
        }
    }
//    public void mostrar(){
//        if(!vacia()){
//            String datos="<=>";
//            NodoEquipos aux=inicio;
//            while(aux!=null){
//            datos=datos+"["+aux.obcui+","+aux.obnom+","+aux.obcorreo+","+aux.obusu+","+aux.obcontra+"]<=>";
//            aux=aux.siguiente;
//            }
//            System.out.println(datos);
//        }
//    }
//    public String buscarlogin(String usuario, String contrasena){
//        NodoEquipos aux=inicio;
//        String dato="";
//        while(aux!=null){
//            if(aux.obusu.equals(usuario) && aux.obcontra.equals(contrasena)){
//                dato="["+usuario+","+contrasena+"]";
//                JOptionPane.showMessageDialog(null, "BIENVENIDO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
//            }
//            else if(!aux.obusu.equals(usuario) && aux.obcontra.equals(contrasena)){
//                dato="["+usuario+","+contrasena+"]";
//                JOptionPane.showMessageDialog(null, "EL USUARIO Y CONTRASEÑA NO COINCIDEN\n"
//                            + "FAVOR REVISE SUS DATOS", "ERROR", JOptionPane.WARNING_MESSAGE);
//            }
//            else if(aux.obusu.equals(usuario) && !aux.obcontra.equals(contrasena)){
//                dato="["+usuario+","+contrasena+"]";
//                JOptionPane.showMessageDialog(null, "EL USUARIO Y CONTRASEÑA NO COINCIDEN\n"
//                            + "FAVOR REVISE SUS DATOS", "ERROR", JOptionPane.WARNING_MESSAGE);
//            }
//            else if(!aux.obusu.equals(usuario) && !aux.obcontra.equals(contrasena)){
//                dato="["+usuario+","+contrasena+"]";
//                JOptionPane.showMessageDialog(null, "EL USUARIO NO EXISTE, PONERSE EN CONTACTO\n"
//                            + "CON EL ADMINISTRADOR PARA SOLICITAR UN REGISTRO", "ERROR", JOptionPane.WARNING_MESSAGE);
//            }
//            
//            aux=aux.siguiente;
//        }
//        return dato;
//    }
}
