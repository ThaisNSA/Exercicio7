
package Atividade3;

public class AlunoGraduando  extends Aluno{
    private MateriaGraduacao soliMateriaGrad;
    
    public MateriaGraduacao getSoliMateriaGrad(){ 
        return this.soliMateriaGrad;
    }

   public void setSoliMateriaGrad(MateriaGraduacao smg){ 
       this.soliMateriaGrad=smg;
   }
   

  public AlunoGraduando(String n,MateriaGraduacao smg){
        super(n);
        setSoliMateriaGrad(smg);
    }  
}