
package Atividade2;

public class Professor {
   
    private String nome;
    private String matricula;
    private int idade;
    
   public String getNome(){ 
        return this.nome;
    }
   public String getMatricula(){ 
        return this.matricula;
    }
   public int getIdade(){ 
       return this.idade;
   }
   
   public void setNome(String n){ 
        this.nome=n;
    }
   public void setMatricula(String m){ 
       this.matricula=m;
   }
   public void setIdade(int i){ 
       this.idade=i;
   } 
public Professor(String n, String m, int i){
    setNome(n);
    setMatricula(m);
    setIdade(i);
}
}
