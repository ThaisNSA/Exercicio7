
package Atividade3;

public class MateriasPosGraduacao  extends Materias{
        private String pesquisa;
    
     String getPesquisa(){ 
         return this.pesquisa;
     }
    
    void setPesquisa(String p){ 
        this.pesquisa=p;
    }
   public MateriasPosGraduacao(String d, String p){
        super(d);
        setPesquisa(p);
}
}