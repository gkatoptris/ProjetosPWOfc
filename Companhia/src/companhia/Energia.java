
package companhia;

import javax.swing.JOptionPane;


public class Energia {
    
    double leitAnterior, leitAtual;
    double tusd, te, icms, gasto, partetotal, total;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPartetotal() {
        return partetotal;
    }

    public void setPartetotal(double partetotal) {
        this.partetotal = partetotal;
    }

    public double getGasto() {
        return gasto;
    }

    public void setGasto(double gasto) {
        this.gasto = gasto;
    }

    public double getLeitAnterior() {
        return leitAnterior;
    }

    public void setLeitAnterior(double leitAnterior) {
        this.leitAnterior = leitAnterior;
    }

    public double getLeitAtual() {
        return leitAtual;
    }

    public void setLeitAtual(double leitAtual) {
        this.leitAtual = leitAtual;
    }

    public double getTusd() {
        return tusd;
    }

    public void setTusd(double tusd) {
        this.tusd = tusd;
    }

    public double getTe() {
        return te;
    }

    public void setTe(double te) {
        this.te = te;
    }

    public double getIcms() {
        return icms;
    }

    public void setIcms(double icms) {
        this.icms = icms;
    }
    
    
    public double VerificaLeitura(double leitAtual, double leitAnterior, double gasto){
        
         this.gasto = leitAtual - leitAnterior;
        
        return gasto;        
    }
    
    public double CalculoSB(double tusd, double te, double icms, double gasto, double partetotal){
       
        tusd= gasto * 0.30;
        
        te= gasto * 0.29;   
        
        icms= (tusd+te)*0.25;
        this.partetotal= tusd + te + icms;  
        
        return partetotal;
    }
    
    public double CalculoCB( double gasto, double partetotal, double total){
        
        double bandeira;
        
        if (gasto<=100){
            bandeira=0;
        } else if(gasto>=101 && gasto<=150) {
            bandeira= 0.013;            
        } else if (gasto>=150 && gasto<=200){
            bandeira= 0.042;
        } else{
            bandeira= 0.06;
        }
        
        
        
        double calculoband= (gasto * bandeira) *0.25 + (gasto*bandeira);
        
        
       this.total= calculoband+partetotal;       
               
        return total;        
    }
    
    public void ImprimeNota(){
        System.out.println(total);
         JOptionPane.showMessageDialog(null, "Leitura anterior: " + getLeitAnterior()+ "\n"
            + "Leitura Atual : " + getLeitAtual() + "\n" 
            + "Gasto de energia: " + getGasto() + " kw" +"\n"
            + "Preço total: " + getTotal()+ "reais");    
        
        
        
        
        
    }
    
    
    
    
}
