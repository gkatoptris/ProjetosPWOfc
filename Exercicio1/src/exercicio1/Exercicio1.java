
package exercicio1;


public class Exercicio1 {

   
    public static void main(String[] args) {
        
        Tec info = new Tec();
        Admin adm = new Admin();
        
        info.setNome("João Joaquim Pereira");
        info.setMatri(1);
        info.setIdade(21);
        info.setSalario(1000);
        info.setBonus(500);
        info.add();
        info.informacoes();
        
        
        adm.setNome("Catarina Petrovna");
        adm.setMatri(2);
        adm.setIdade(24);
        adm.setSalario(5500);
        adm.setBonus(400);
        adm.setPeriodo("noite");
        adm.add();
        adm.informacoes();
        
        
        
        
        
        
        
        
        
        
    }
    
}
