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
    private NodoUsuario inicio, fin;
    
    public ListaJugadores(){
        inicio=null;
        fin=null;
    }
    //cuando está vacía
    public boolean vacia(){
        return inicio==null;
    }
    // método agregar al inicio
    public void insertarinicio(String cui,String nombre,String correo, String usuario, String contrasena){
        if(!vacia()){
            inicio=new NodoUsuario(cui,nombre, correo,usuario,contrasena, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoUsuario(cui,nombre, correo,usuario,contrasena);
        }
    }
    public void mostrar(){
        if(!vacia()){
            String datos="<=>";
            NodoUsuario aux=inicio;
            while(aux!=null){
            datos=datos+"["+aux.obcui+","+aux.obnom+","+aux.obcorreo+","+aux.obusu+","+aux.obcontra+"]<=>";
            aux=aux.siguiente;
            }
            System.out.println(datos);
        }
    }
    public String buscarlogin(String usuario, String contrasena){
        NodoUsuario aux=inicio;
        String dato="";
        while(aux!=null){
            if(aux.obusu.equals(usuario) && aux.obcontra.equals(contrasena)){
                dato="["+usuario+","+contrasena+"]";
                JOptionPane.showMessageDialog(null, "BIENVENIDO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            }
            else if(!aux.obusu.equals(usuario) && aux.obcontra.equals(contrasena)){
                dato="["+usuario+","+contrasena+"]";
                JOptionPane.showMessageDialog(null, "EL USUARIO Y CONTRASEÑA NO COINCIDEN\n"
                            + "FAVOR REVISE SUS DATOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            else if(aux.obusu.equals(usuario) && !aux.obcontra.equals(contrasena)){
                dato="["+usuario+","+contrasena+"]";
                JOptionPane.showMessageDialog(null, "EL USUARIO Y CONTRASEÑA NO COINCIDEN\n"
                            + "FAVOR REVISE SUS DATOS", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            else if(!aux.obusu.equals(usuario) && !aux.obcontra.equals(contrasena)){
                dato="["+usuario+","+contrasena+"]";
                JOptionPane.showMessageDialog(null, "EL USUARIO NO EXISTE, PONERSE EN CONTACTO\n"
                            + "CON EL ADMINISTRADOR PARA SOLICITAR UN REGISTRO", "ERROR", JOptionPane.WARNING_MESSAGE);
            }
            
            aux=aux.siguiente;
        }
        return dato;
    }
}
