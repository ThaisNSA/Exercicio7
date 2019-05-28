
package Atividade3;

public class AlunoPosGraduado extends Aluno{
    private MateriasPosGraduacao soliMateriaPosGrad;
   
    MateriasPosGraduacao getSoliMateriaPosGrad(){ return this.soliMateriaPosGrad;}
    void setSoliMateriaPosGrad(MateriasPosGraduacao smpg){ 
        this.soliMateriaPosGrad=smpg;
    }
    
    
     public AlunoPosGraduado(String n,MateriasPosGraduacao smpg){
        super(n);
        setSoliMateriaPosGrad(smpg);
    }
}
