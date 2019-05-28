
package Atividade3;

public class AlunoEspecial  extends AlunoGraduando{
    private MateriasPosGraduacao soliMateriaPosGrad;
    
    public void setSoliMateriaPosGrad(MateriasPosGraduacao smpg){ 
        this.soliMateriaPosGrad=smpg;
    }
    public MateriasPosGraduacao getSoliMateriaPosGrad(){ 
        return this.soliMateriaPosGrad;
    }
    public AlunoEspecial(String n,MateriaGraduacao smg, MateriasPosGraduacao smpg){
        super(n,smg);
        setSoliMateriaPosGrad(smpg);
    }
}
    

