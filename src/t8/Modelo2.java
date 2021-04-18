/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t8;

/**
 *
 * @author José Miguel Tuzzo R
 */
public class Modelo2 {
   private String combo1;
   private String combo2;
   private String combo3;
   private String lavadoB;
   private String lavadoE;
   private String desinfeccionB;
   private String desinfeccionA;
   private String costoCB1,costoFB1;
   private String costoCB2,costoFB2;
   private String costoCB3,costoFB3;
   private String costoLB,costoFLB;
   private String costoLE,costoFLE;
   private String costoDB,costoFD;
   private String costoDA,costoFD2;
   private int pre ;
   private int sum;
   private int resultado;


    public String getCombo1() {
         combo1=" Lavado, polichado y desengrasante por debajo";
        return combo1;
    }
    public String getCostoCB1() {
        costoCB1="20000";
        return costoCB1;
    }
    public String getCostoFB1() {
        costoFB1="30200";
        return costoFB1;
    }
    public String getCombo2() {
          combo2=" Combo 1 + grafitado de chasis.";
        return combo2;
    }
    public String getCostoCB2() {
        costoCB2="25000";
        return costoCB2;
    }
    public String getCostoFB2() {
        costoFB2="32000";
        return costoFB2;
    }
    public String getCombo3() {
        combo3=" Combo 2 + tapicería (desmontado de sillas para un aseo más profundo).";
        return combo3;
    }
    public String getCostoCB3() {
        costoCB3="30000";
        return costoCB3;
    }
    public String getCostoFB3() {
        costoFB3="34000";
        return costoFB3;
    }
    public String getLavadoB() {
         lavadoB=" Depende del tipo de auto existe una tarifa. Incluye lavado exterior, lavado interior y aspirada.";
        return lavadoB;
    }
    public String getCostoLB() {
        costoLB="19000";
        return costoLB;
    }
    public String getCostoFLB() {
        costoFLB="23400";
        return costoFLB;
    }
    public String getLavadoE() {
        lavadoE=" Incluye lavado básico más polichado con maquina y las mejores ceras de calidad.";
        return lavadoE;
    }
    public String getCostoLE() {
        costoLE="21000";
        return costoLE;
    }
    public String getCostoFLE() {
        costoFLE="25500";
        return costoFLE;
    }
    public String getDesinfeccionB() {
        desinfeccionB=" Con maquina generadora de ozono.";
        return desinfeccionB;
    }
    public String getCostoDB() {
        costoDB="24000";
        return costoDB;
    }
    public String getCostoFD() {
        costoFD="26000";
        return costoFD;
    }
    public String getDesinfeccionA() {
        desinfeccionA=" Además de la desinfección básica, limpieza interior con máquina de vapor.";
        return desinfeccionA;
    }
    public String getCostoDA() {
        costoDA="29500";
        return costoDA;
    }
    public String getCostoFD2() {
        costoFD2="32000";
        return costoFD2;
    }    
    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }
    public void sumaCamioneta(){
        sum = pre + 5000;
        resultado= sum;
    }

    public int getResultado() {
        return resultado;
    }
    

    



   

   


}