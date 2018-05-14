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
public class ProyectoPrueba {

    public static void main(String[] args) {
        // TODO code application logic here
        RegistroU.listitausuario.insertarinicio("3609787380108", "vgdep@hotmail.com", "vgdep", "Andrea", "201700670");
//        Login obj= new Login();
//        obj.setVisible(true);
        FrameAdministrador obj = new FrameAdministrador();
        obj.setVisible(true);
    }

}
