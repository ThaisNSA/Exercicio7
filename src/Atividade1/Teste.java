
package Atividade1;

public class Teste {
     public static void main(String[]args){
        Pessoa p = new Pessoa("thais","rua a 24","12456789");
        Empregado e = new Empregado("alfa","parque central 1","345678901","1313",2000.0,12.0);
        Fornecedor f = new Fornecedor("wolf","rua black 34","234567890",950.0,45.0);
        
        
        System.out.println(f.obterSaldo());
        System.out.println(e.calcularSalario());
    }
}
