
package Atividade2;

public class ProfessorHorista extends Professor {
    private double salarioHora;
    private int horaAula;
    
    public double getSalarioHora(){ 
        return this.salarioHora;
    }
    public int getHoraAula(){ 
        return this.horaAula;
    }
    
    public void setSalarioHora(double sh){ 
        this.salarioHora=sh;
    }
    public void setHoraAula(int ha){ 
        this.horaAula=ha;
    }
    
    double calcularSalario(){
        
        return this.horaAula*this.salarioHora;
    }
public ProfessorHorista(String n, String m, int i, double sh, int ha){
    super(n,m,i);
    setSalarioHora(sh);
    setHoraAula(ha);
}
}
