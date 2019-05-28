package Atividade1;

public class Empregado extends Pessoa{
    
    private String codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public String getCodigoSetor(){
        return codigoSetor;
    }
    public double getSalarioBase(){
        return salarioBase;
    }
    public double getImposto(){
        return imposto;
    }
    public void setCodigoSetor(String cs){
        this.codigoSetor=cs;
    }
    public void setSalarioBase(double sb){
        this.salarioBase=sb;
    }
    public void setImposto(double i){
        this.imposto=i;
    }
    
public Empregado(String n, String end, String tel, String cs, double sb, double i){
    super(n,end,tel);
    setCodigoSetor(cs);
    setSalarioBase(sb);
    setImposto(i);
}

public double calcularSalario(){
    return this.salarioBase-(this.salarioBase*(this.imposto/100));
}   

}
