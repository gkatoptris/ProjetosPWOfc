
package projestaciona;

import javax.swing.JOptionPane;


public class Estaciona {
    
    public double HrEntrada, HrSaida, preco, MinEntrada, MinSaida, tempo;
    public String modelo, placa, cor, nomeDono;
    public boolean cadastrado;

    public double getHrEntrada() {
        return HrEntrada;
    }

    public void setHrEntrada(double HrEntrada) {
        this.HrEntrada = HrEntrada;
    }
    
    public double getMinEntrada() {
        return MinEntrada;
    }
    
   public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setMinEntrada(double MinEntrada) {
        this.MinEntrada = MinEntrada;
    }

    public double getHrSaida() {
        return HrSaida;
    }

    public void setHrSaida(double HrSaida) {
        this.HrSaida = HrSaida;
    }
    
    public double getMinSaida() {
        return MinSaida;
    }

    public void setMinSaida(double MinSaida) {
        this.MinSaida = MinSaida;
    }

    

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
     public boolean getCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }
    
    
    public boolean cadastro(String nomeDono, String modelo,String placa, String cor){
        return this.cadastrado; 
    }
    
    public double calculo_tempo(double HrEntrada, double HrSaida, double MinEntrada, double MinSaida, double tempo){
         
       
        double convert_e= HrEntrada + MinEntrada/60;
        double convert_s= HrSaida + MinSaida/60;
        
        this.tempo = Math.ceil(convert_s - convert_e);  
       
        
        System.out.println(this.tempo);
        
        return tempo;                           
        
    }
    
    public void calculo_preco(double preco, double tempo){
        
        
        System.out.println(this.tempo); 
        
       this.preco= tempo * 4; 
        
          
    }
    
    public void imprimir_nota(){
         JOptionPane.showMessageDialog(null, "Nome do cliente: " + getNomeDono()+ "\n"
            + "Modelo: " + getModelo() + "\n" 
            + "Placa do carro: " + getPlaca() + "\n"
            + "Cor do carro: " + getCor() + "\n"
            + "Hora de entrada: " + getHrEntrada() + "\n"
            + "Minuto da entrada:  " + getMinEntrada() + "\n"
            + "Hora de saida: " + getHrSaida() + "\n"
            + "Minuto da saida:  " + getMinSaida() + "\n"
                 
            + "Total de horas: "+ getTempo() + "\n"
            + "Total a pagar: " + this.preco);    
    }
    
    
    
    
    

    
    
    
           
    
    
    
    
    
    
}
