package t8;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Vista2 extends JFrame{
       JPanel p1;
       JLabel l1,l2,l3, l4,l5, l6,l7;
       JTextField t1, t2, t3;
       JButton b1, b2, b3, b4;
       JCheckBox c1,c2, c4, c5, c6, c7, c8, c9, c10,c11; // Varios Checkbox funcionan como botones ya que esteticamente quedan mejor, (Presionelos las veces que quiera)
       JCheckBox c12, c13, c14, c15, c16,c17,c18,c19;
    public Vista2(){
        this.setTitle("Vehiculos");
                  this.setTitle("Centro de lavado de autos la Estrella");
                  setBounds(300, 50, 700, 600);
                  setDefaultCloseOperation(EXIT_ON_CLOSE);
                  
                  p1=new JPanel();
                  p1.setLayout(null);
                  
                  l1=new JLabel("Seleccione un tipo de produccion(Presione la casilla de lo que desea buscar)");
                  l1.setBounds(10, 20, 600, 20);
                  
                  l6=new JLabel("Presione el boton, un servicio despues de otro:");
                  l6.setBounds(360, 480, 600, 20);
                  
                  b1=new JButton("Borrar servicio");
                  b1.setBounds(220,520,140,30);
                  
                  b2=new JButton("Pulse si es Camioneta");
                  b2.setBounds(400,520,200,30);
                  
                  b4=new JButton("Borrar Fecha");
                  b4.setBounds(430,280,130,20);
                  
                  l5=new JLabel("Descripción:");
                  l5.setBounds(100, 320, 80, 20);
                  
                  t1=new JTextField();
                  t1.setBounds(90, 350, 550, 100);
             
                  c1=new JCheckBox("Servicio");
                  c1.setBounds(90, 50, 140, 20);
        
                  c4=new JCheckBox("Combos");
                  c4.setBounds(250, 50, 140, 20);
                  
                  c5=new JCheckBox("Lavado Básico");
                  c5.setBounds(250, 70, 160, 20);
                  
                  c6=new JCheckBox("Lavado especial");
                  c6.setBounds(250, 90, 160, 20);
                  
                  c7=new JCheckBox("Densifección Básica");
                  c7.setBounds(250, 110, 160, 20);
                  
                  c8=new JCheckBox("Densifección Avanzada");
                  c8.setBounds(250, 130, 160, 20);
                  
                  c2=new JCheckBox("Funcionario");
                  c2.setBounds(90, 160, 160, 20);
                  
                  c9=new JCheckBox("Combo 1");
                  c9.setBounds(450, 50, 160, 20);
                  
                  c10=new JCheckBox("Combo 2");
                  c10.setBounds(450, 90, 160, 20);
                  
                  c11=new JCheckBox("Combo 3");
                  c11.setBounds(450, 130, 160, 20);
                  
                  c12=new JCheckBox("Combos");
                  c12.setBounds(250, 160, 140, 20);
                  
                  c13=new JCheckBox("Lavado Básico");
                  c13.setBounds(250, 180, 160, 20);
                  
                  c14=new JCheckBox("Lavado especial");
                  c14.setBounds(250, 200, 160, 20);
                  
                  c15=new JCheckBox("Densifección Básica");
                  c15.setBounds(250, 220, 160, 20);
                  
                  c16=new JCheckBox("Densifección Avanzada");
                  c16.setBounds(250, 240, 160, 20);
                  
                  c17=new JCheckBox("Combo 1");
                  c17.setBounds(450, 170, 160, 20);
                  
                  c18=new JCheckBox("Combo 2");
                  c18.setBounds(450, 200, 160, 20);
                  
                  c19=new JCheckBox("Combo 3");
                  c19.setBounds(450, 235, 160, 20);
                  
                  l7= new JLabel("Servicios ofertados:");
                  l7.setBounds(50, 210, 160, 20);
                  
                  l2= new JLabel("Servicios ofertados:");
                  l2.setBounds(50, 100, 160, 20);
                  
                  b3=new JButton("Rango fecha");
                  b3.setBounds(90, 280, 140, 20);
                  
                  t2= new JTextField ("Automovil");
                  t2.setBounds(90,500,100,20);
                  
                  t3= new JTextField ();
                  t3.setBounds(270,280,130,20);
                  
                  l4=new JLabel("COSTO");
                 l4.setBounds(10, 495, 50, 30);
                  
                  
                  l7.setVisible(false);
                  l2.setVisible(false);
                  c4.setVisible(false);
                  c5.setVisible(false);
                  c6.setVisible(false);
                  c7.setVisible(false);
                  c8.setVisible(false);
                  c9.setVisible(false);
                  c10.setVisible(false);
                  c11.setVisible(false);
                  c12.setVisible(false);
                  c13.setVisible(false);
                  c14.setVisible(false);
                  c15.setVisible(false);
                  c16.setVisible(false);
                  c17.setVisible(false);
                  c18.setVisible(false);
                  c19.setVisible(false);
                  
                     add(p1);
                     p1.add(l4);
                     p1.add(t2);
                     p1.add(t3);
                     p1.add(l1);
                     p1.add(l7);
                     p1.add(l2);
                     p1.add(l6);
                     p1.add(l5);
                     p1.add(b4);
                     p1.add(b1);
                     p1.add(b2);
                     p1.add(c1);
                     p1.add(c2);
                     p1.add(b3);
                     p1.add(c4);
                     p1.add(c5);
                     p1.add(c6);
                     p1.add(c7);
                     p1.add(c8);
                     p1.add(c9);
                     p1.add(c10);
                     p1.add(c11);
                     p1.add(c12);
                     p1.add(c13);
                     p1.add(c13);
                     p1.add(c14);
                     p1.add(c15);
                     p1.add(c16);
                     p1.add(c17);
                     p1.add(c18);
                     p1.add(c19);
                     p1.add(l1);
                     p1.add(t1);
     
        this.setVisible(true);
    }
    
}
