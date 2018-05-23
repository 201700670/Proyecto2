/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoprueba;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Andrea Palomo
 */
public class ListaAlbum extends JFrame {
    private JButton principal;
    protected NodoAlbum inicio, fin;
    public static int tamano;

    private JLabel botones[];
    private Container contenedor;
    private GridLayout cuadricula1;
    private GridLayout cuadicula2;
    
     ImageIcon imagen;  
    public ListaAlbum() {
        inicio = null;
        fin = null;
        this.tamano = 0;
       
    }
    
    public void agregaralinicio(String ruta) {
        if (RegistroU.listitausuario.buscarverdad(ProyectoPrueba.usuarioactual)) {
        inicio = new NodoAlbum(ruta, inicio);
        if (fin == null) {
            fin = inicio;
        }
        this.tamano++;
        }
    }

    public String mostrarLista() {
        NodoAlbum recorrer = inicio;
        String dato = "";
//        if (ListaUsuarios.llave) {
        while (recorrer != null) {
            dato = "[" + recorrer.rutaimagen + "]=>";
            System.out.print(dato);
            recorrer = recorrer.siguiente;
        }
//        }
        System.out.println();
        return dato;
    }
    public void getLabels() {
        setTitle("MI ALBUM PRIVADO");
        this.setBackground(Color.yellow);
        cuadricula1= new GridLayout(4, 4, 5, 5);
        cuadicula2= new GridLayout(3, 2);
        contenedor= getContentPane();
        contenedor.setBackground(Color.red);
        setLayout(cuadricula1);
        botones=new JLabel[tamano];
        principal = new JButton("Principal");
        principal.setSize(200, 50);
        principal.setBounds(10, 10, 130, 30);
        ImageIcon imagen;
        if (tamano != 0) {
        String datos = "";
        String area = "";
        NodoAlbum aux = inicio;
        
        int tamanodato = 0;
        for (int i = 0; i < this.tamano; i++) {
            tamanodato++;
            datos = aux.rutaimagen;
            botones[i]=new JLabel();
            botones[i].setIcon(new ImageIcon(datos) );
            add(botones[i]);
            aux = aux.siguiente;
        }
        setSize(600,550);
        setVisible(true);
        }
    }
    
//   
}
