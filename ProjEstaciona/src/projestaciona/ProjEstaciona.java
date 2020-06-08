
package projestaciona;

import javax.swing.JOptionPane;

public class ProjEstaciona {

    public static void main(String[] args) {
       
    
        
        
        
        Estaciona dados = new Estaciona();
        
        dados.setNomeDono(JOptionPane.showInputDialog("Digite o nome do cliente: "));
       dados.setModelo(JOptionPane.showInputDialog("Digite o modelo do carro: "));
       dados.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro: "));
       dados.setCor(JOptionPane.showInputDialog("Digite a cor do carro: "));
       
       dados.setHrEntrada(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de entrada do cliente: ")));
       dados.setMinEntrada(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de entrada do cliente: ")));
       dados.setHrSaida(Double.parseDouble(JOptionPane.showInputDialog("Digite a hora de saida do cliente: ")));
       dados.setMinSaida(Double.parseDouble(JOptionPane.showInputDialog("Digite o minuto de saida do cliente: ")));
       
      
        dados.cadastro(dados.getNomeDono(), dados.getModelo(), dados.getPlaca(), dados.getCor());
        dados.calculo_tempo(dados.getHrEntrada(), dados.getHrSaida(), dados.getMinEntrada(), dados.getMinSaida(), dados.getTempo() );
        
        dados.calculo_preco(dados.getPreco(),dados.getTempo());
        dados.imprimir_nota();
        
                
  
    
    
    
     
    
    
        
        
        
        
        
        
        
    }
    
}
