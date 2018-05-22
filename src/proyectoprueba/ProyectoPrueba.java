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

    public static String usuarioactual;

    public static void main(String[] args) {
        // TODO code application logic here

        RegistroU.listitausuario.insertarinicio("3609787380108", "vgdep@hotmail.com", "vgdep", "Administrador", "201700670", RegistroEquipos.listitaequipos);
//        Login obj= new Login();
//        obj.setVisible(true);
        FrameAdministrador obj = new FrameAdministrador();
        obj.setVisible(true);

    }

}
