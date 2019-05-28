package Atividade1;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;
   
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getTelefone(){
        return telefone;
    }
    
    public void setNome(String n){
        this.nome=n;
    }
    public void setEndereco(String end){
        this.endereco=end;
    }
    public void setTelefone(String tel){
        this.telefone=tel;
    }
    public Pessoa(String n, String end, String tel){
        setNome(n);
        setEndereco(end);
        setTelefone(tel);
        
    }
    public void mostrar(){
        System.out.println(getNome());
        System.out.println(getEndereco());
        System.out.println(getTelefone());
    }
}

