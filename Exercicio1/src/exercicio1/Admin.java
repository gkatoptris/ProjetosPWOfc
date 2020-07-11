
package exercicio1;

public class Admin extends Assisten{

    
    private double bonus;
    private String periodo;

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }        
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }    
    public double add(){
        if ("noite".equals(periodo)) {
            this.salario = this.salario + this.bonus;            
        }else{
            this.salario = this.salario;
        }   
            return this.salario;
    }
    
    @Override
    public void informacoes(){
        System.out.println("\n" + "Sobre o assistente administrativo:" + "\n"                  
                + "\n"+ "Nome: " + getNome()
                + "\n"+ "N° Matricula: " + getMatri()
                + "\n"+ "Idade: " + getIdade()
                + "\n"+ "Periodo de trabalho: " + getPeriodo()
                + "\n"+ "Salário: " + getSalario());
    }
    
    
}
