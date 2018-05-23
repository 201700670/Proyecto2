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
public class ListaUsuarios {
    public static String cuis, nombres, correos, usuariosos,contrasenas;
    public static boolean llave=false;
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
    public void insertarinicio(String cui,String nombre,String correo, String usuario, String contrasena,ListaEquipos listo){
        if(!vacia()){
            inicio=new NodoUsuario(cui,nombre, correo,usuario,contrasena,listo, inicio, null);
            inicio.siguiente.anterior=inicio;
        }else{
            inicio=fin=new NodoUsuario(cui,nombre, correo,usuario,contrasena,listo);
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
    public boolean buscarlogin(String usuario, String contrasena){
        NodoUsuario aux=inicio;
        String dato="";
        boolean comprobando=false;
        while(aux!=null){
            if(aux.obusu.equals(usuario) && aux.obcontra.equals(contrasena)){
                comprobando=true;
                dato="["+usuario+","+contrasena+"]";
                JOptionPane.showMessageDialog(null, "BIENVENIDO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(dato);
            }
            aux=aux.siguiente;
        }
        return comprobando;
    }
    public String buscareditar(String cui, String nombre, String correo, String usuario, String contrasena){
        NodoUsuario aux=inicio;
        String dato="";
        while(aux!=null){
            if(aux.obusu.equals(usuariosos)){
                aux.obcui=cui;
                aux.obnom=nombre;
                aux.obcorreo=correo;
                aux.obusu=usuario;
                aux.obcontra=contrasena;
                dato="["+aux.obcui+","+aux.obnom+","+aux.obcorreo+","+aux.obusu+","+aux.obcontra+"]";
                System.out.println(dato);
                mostrar();
            }
            aux=aux.siguiente;
        }
        return dato;
    }
    public String buscareditarbuscar(String cui, String nombre, String correo, String usuario, String contrasena){
        NodoUsuario aux=inicio;
        String dato="";
        while(aux!=null){
            if(aux.obusu.equals(usuario) ){
                JOptionPane.showMessageDialog(null, "EL USUARIO EXISTE", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                cui=aux.obcui;
                nombre=aux.obnom;
                correo=aux.obcorreo;
                usuario=aux.obusu;
                contrasena=aux.obcontra;
                dato="["+aux.obcui+","+aux.obnom+","+aux.obcorreo+","+aux.obusu+","+aux.obcontra+"]";
                cuis=aux.obcui;
                nombres=aux.obnom;
                correos=aux.obcorreo;
                usuariosos=aux.obusu;
                contrasenas=aux.obcontra;
//                System.out.println(dato);
                
            }
            aux=aux.siguiente;
        }
        return dato;
    }
    public String eliminar(String cui, String nombre, String correo, String usuario, String contrasena){
        NodoUsuario aux=inicio;
        NodoUsuario atras=null;
        String dato="";
        while(aux!=null){
            if(aux.obusu.equals(usuariosos)){
                if(aux==inicio){
                    try {
                    inicio=inicio.siguiente;
                    inicio.anterior=null;
                    } catch (Exception e) {
                    }
                }
                else{
                     try {
                    atras.siguiente=aux.siguiente;
                    aux.siguiente.anterior=aux.anterior;
                    } catch (Exception e) {
                    }
                }
                
//                dato="["+aux.obcui+","+aux.obnom+","+aux.obcorreo+","+aux.obusu+","+aux.obcontra+"]";
//                System.out.println(dato);
//                mostrar();
            }
            atras=aux;
            aux=aux.siguiente;
        }
        return dato;
    }
    public boolean buscarverdad(String usuario){
        NodoUsuario aux=inicio;
        String dato="";
        boolean comprobando=false;
        while(aux!=null){
            if(aux.obusu.equals(usuario)){
                comprobando=true;
//                dato="["+usuario+"]";
//                JOptionPane.showMessageDialog(null, "BIENVENIDO", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                System.out.println(dato);
            }
            aux=aux.siguiente;
        }
        return comprobando;
    }
}
