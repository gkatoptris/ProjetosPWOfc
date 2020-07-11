
package exercicio1;


public class Tec extends Assisten{

    private double bonus;
    
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double add(){
        this.salario = this.salario + this.bonus;
        return this.salario;
    }
    
    @Override
    public void informacoes(){
        System.out.println("Sobre o assistente Tecnico:\n"                  
                + "\n"+"N° Matrícula: " + getMatri()
                + ""+"Nome:" + getNome()
                + "\n"+"Idade: " + getIdade()
                + "\n"+ "Salário:" + getSalario());
    }
    
    
}