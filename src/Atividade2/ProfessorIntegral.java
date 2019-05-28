
package Atividade2;

public class ProfessorIntegral extends Professor{
    private double salario;
    
    double getSalario(){ 
        return this.salario;
    }
 
    void setSalario(double s){ 
        this.salario=s;
    }
    
public ProfessorIntegral(String n, String m, int i, double s){
    super(n,m,i);
    setSalario(s);
}    
}
