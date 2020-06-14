
package companhia;

import javax.swing.JOptionPane;


public class Companhia {

   
    public static void main(String[] args) {
        
        
        Energia dados = new Energia();
        
        
          dados.setLeitAnterior(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura anterior: ")));
          dados.setLeitAtual(Double.parseDouble(JOptionPane.showInputDialog("Digite a leitura atual ")));
          
          dados.VerificaLeitura(dados.getLeitAtual(), dados.getLeitAnterior(), dados.getGasto());
          dados.CalculoSB(dados.getTusd(), dados.getTe(), dados.getIcms(), dados.getGasto(), dados.getPartetotal());
          dados.CalculoCB(dados.getGasto(), dados.getPartetotal(), dados.getTotal());
          dados.ImprimeNota();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
