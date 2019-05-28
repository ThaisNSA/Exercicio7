package Atividade1;

public class Fornecedor extends Pessoa {
    
    private double valorCredito;
    private double valorDivida;
    
    public double getValorCredito(){
        return valorCredito;
    }
    public double getValorDivida(){
        return valorDivida;
    }
    
    public void setValorCredito(double vc){
        this.valorCredito=vc;
    }
    public void setValorDivida(double vd){
        this.valorDivida=vd;
    }

public Fornecedor(String n, String end, String tel, double vc, double vd){
    super(n, end, tel);
    setValorCredito(vc);
    setValorDivida(vd);
}
 
public double obterSaldo(){
    return getValorCredito() - getValorDivida();
}
public void mostrar(){
    super.mostrar();
    System.out.println(getValorCredito());
    System.out.println(getValorDivida());
    
}
}
