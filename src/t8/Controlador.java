
package t8;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Controlador implements ActionListener {
    private Vista2 vista2;
    private Modelo2 modelo2;
   private int pre;
    private String fecha;
    public Controlador(Modelo2 modelo2, Vista2 vista2) {
        this.modelo2 = modelo2;
        this.vista2 = vista2;
        this.vista2.c1.addActionListener(this);
        this.vista2.c2.addActionListener(this);
        this.vista2.b3.addActionListener(this);
        this.vista2.c9.addActionListener(this);
        this.vista2.b1.addActionListener(this);
        this.vista2.b2.addActionListener(this);
        this.vista2.b4.addActionListener(this);
        this.vista2.c4.addActionListener(this);
        this.vista2.c5.addActionListener(this);//Lavado Basico
        this.vista2.c6.addActionListener(this);//Lavado Especial
        this.vista2.c7.addActionListener(this);//Desinfeccion Basica
        this.vista2.c8.addActionListener(this);//Desinfeccion Avanzada
        this.vista2.c10.addActionListener(this);//Combo 2
        this.vista2.c11.addActionListener(this);//Combo 3
        this.vista2.c12.addActionListener(this);
        this.vista2.c13.addActionListener(this);
        this.vista2.c14.addActionListener(this);
        this.vista2.c15.addActionListener(this);
        this.vista2.c16.addActionListener(this);
        this.vista2.c17.addActionListener(this);
        this.vista2.c18.addActionListener(this);
        this.vista2.c19.addActionListener(this);
}
    public void iniciarVista() {
     vista2.setTitle("Centro de lavado de autos la Estrella");

     vista2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     vista2.setVisible(true);



}
    
    public void actionPerformed(ActionEvent evento) {
        if(vista2.c1.isSelected()){
      
                    vista2.l2.setVisible(true);
                    vista2.c4.setVisible(true);
                    vista2.c5.setVisible(true);
                    vista2.c6.setVisible(true);
                    vista2.c7.setVisible(true);
                    vista2.c8.setVisible(true);
                    
            
        }
        else{
                     vista2.l2.setVisible(false);
                    vista2.c4.setVisible(false);
                    vista2.c5.setVisible(false);
                    vista2.c6.setVisible(false);
                    vista2.c7.setVisible(false);
                    vista2.c8.setVisible(false);
                            }
       
        if(vista2.c2.isSelected()){
                    vista2.l7.setVisible(true);         
                    vista2.c12.setVisible(true);
                    vista2.c13.setVisible(true);
                    vista2.c14.setVisible(true);
                    vista2.c15.setVisible(true);
                    vista2.c16.setVisible(true);
                    
            
        }
        else{
                    vista2.l7.setVisible(false);    
                    vista2.c12.setVisible(false);
                    vista2.c13.setVisible(false);
                    vista2.c14.setVisible(false);
                    vista2.c15.setVisible(false);
                    vista2.c16.setVisible(false);
        }
         if(vista2.c4.isSelected()){
                     
                  vista2.c9.setVisible(true);
                  vista2.c10.setVisible(true);
                  vista2.c11.setVisible(true);
                  
                  
        }
         else{
                  vista2.c9.setVisible(false);
                  vista2.c10.setVisible(false);
                  vista2.c11.setVisible(false);
         }
         if(vista2.c12.isSelected()){
                     
                  vista2.c17.setVisible(true);
                  vista2.c18.setVisible(true);
                  vista2.c19.setVisible(true);
                  
                  
        }
         else{
                  vista2.c17.setVisible(false);
                  vista2.c18.setVisible(false);
                  vista2.c19.setVisible(false);
         }
         if(vista2.c5== evento.getSource()){
            vista2.t1.setText(modelo2.getLavadoB());
             vista2.t2.setText(modelo2.getCostoLB());
         }
          if(vista2.c13== evento.getSource()){
            vista2.t1.setText(modelo2.getLavadoB());
             vista2.t2.setText(modelo2.getCostoFLB());
         }
         if(vista2.c6== evento.getSource()){
            vista2.t1.setText(modelo2.getLavadoE());
              vista2.t2.setText(modelo2.getCostoLE());
         }
         if(vista2.c14== evento.getSource()){
            vista2.t1.setText(modelo2.getLavadoE());
              vista2.t2.setText(modelo2.getCostoFLE());
         }
         if(vista2.c7== evento.getSource()){
            vista2.t1.setText(modelo2.getDesinfeccionB());
            vista2.t2.setText(modelo2.getCostoDB());
             
         }
         if(vista2.c15== evento.getSource()){
            vista2.t1.setText(modelo2.getDesinfeccionB());
              vista2.t2.setText(modelo2.getCostoFD());
         }
         if(vista2.c8== evento.getSource()){
            vista2.t1.setText(modelo2.getDesinfeccionA());
              vista2.t2.setText(modelo2.getCostoDA());
         }
         if(vista2.c16== evento.getSource()){
            vista2.t1.setText(modelo2.getDesinfeccionA());
             vista2.t2.setText(modelo2.getCostoFD2());
         }
         
         if(vista2.c9== evento.getSource()){
            vista2.t1.setText(modelo2.getCombo1());
             vista2.t2.setText(modelo2.getCostoCB1());
         }
        
         
          if(vista2.c10== evento.getSource()){
            vista2.t1.setText(modelo2.getCombo2());
             vista2.t2.setText(modelo2.getCostoCB2());
         }
          if(vista2.c11== evento.getSource()){
            vista2.t1.setText(modelo2.getCombo3());
              vista2.t2.setText(modelo2.getCostoCB3());
         }
         if(vista2.b1==evento.getSource()){
             vista2.t1.setText(null);
             vista2.t2.setText(null);
         }
          if(vista2.c17== evento.getSource()){
            vista2.t1.setText(modelo2.getCombo1());
             vista2.t2.setText(modelo2.getCostoFB1());
             
         }
          if(vista2.c18== evento.getSource()){
            vista2.t1.setText(modelo2.getCombo2());
              vista2.t2.setText(modelo2.getCostoFB2());
         }
          if(vista2.c19== evento.getSource()){
            vista2.t1.setText(modelo2.getCombo3());
               vista2.t2.setText(modelo2.getCostoFB3());
         }
         
               
          if(vista2.b2== evento.getSource()){
               
            pre=Integer.parseInt(vista2.t2.getText());
            modelo2.setPre(pre);
            modelo2.sumaCamioneta();
           
            
            vista2.t2.setText(Integer.toString(modelo2.getResultado()));
           
               }
           if(vista2.b3== evento.getSource()){
               fecha = JOptionPane.showInputDialog("Coloque rango de fecha",fecha);
               vista2.t3.setText(fecha);
               
               
           }
           if(vista2.b4==evento.getSource()){
               vista2.t3.setText(null);
           }
         
        
     
         

    }
}
