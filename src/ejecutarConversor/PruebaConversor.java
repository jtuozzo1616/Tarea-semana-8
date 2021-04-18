
package ejecutarConversor;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import t8.Controlador;
import t8.Modelo2;
import t8.Vista2;
public class PruebaConversor {
public static void main(String args[]) {

Modelo2 modelo = new Modelo2();
Vista2 vista = new Vista2();
Controlador controlador = new Controlador(modelo, vista);
controlador.iniciarVista();
}
}
