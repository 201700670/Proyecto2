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
public class NodoUsuario  {
    String obcui,obnom, obcorreo, obusu, obcontra;
    NodoUsuario siguiente, anterior;
    ListaEquipos listadoequipos;
    public NodoUsuario(String cui,String nombre,String correo, String usuario, String contrasena, ListaEquipos listado) {
        this(cui,nombre,correo, usuario, contrasena,listado,null,null);
    }
    public NodoUsuario(String cui,String nombre,String correo, String usuario, String contrasena,ListaEquipos listado ,NodoUsuario s, NodoUsuario a){
        ////NO SE SI PONERLE EL IF DE LA COMPARACIÓN DE LOS USUARIOS CON EL USUARIO ACTUAL
        obcui=cui;
        obnom=nombre;
        obcorreo=correo;
        obusu=usuario;
        obcontra=contrasena;
        listadoequipos=listado;
        siguiente=s;
        anterior=a;
    }
}    
    


