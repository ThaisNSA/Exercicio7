
package Atividade3;

public class MateriaGraduacao  extends Materias{
    private String tcc;
    
    
    public String getTcc(){
        return this.tcc;
    }
    public void setTcc(String t){ 
        this.tcc=t;
    }
    

    public MateriaGraduacao(String d, String t){
        super(d);
        setTcc(t);
    }
}
