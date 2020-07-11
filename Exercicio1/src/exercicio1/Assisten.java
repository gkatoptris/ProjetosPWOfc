
package exercicio1;


public class Assisten extends Funcionario {

        public void informacoes(){
            System.out.println("Sobre o assistente técnico:\n"                  
                    + "\n"+ "Nome: " + getNome()
                    + "\n"+ "N° Matricula" + getMatri()
                    + "\n"+ "Idade: " + getIdade()
                    + "\n"+"Salário:" + getSalario());
        }
}