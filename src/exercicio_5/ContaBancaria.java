/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_5;

public class ContaBancaria {
    private String nunConta;
    private String titular;
    private Double dp;
    private Double taxa =5.00;
    private Double saldo = 0.;

    public ContaBancaria(String nunConta, String titular,Double dp ) {
        this.nunConta = nunConta;
        this.titular = titular;
        this.dp = dp;
    }
    
    public ContaBancaria(String nunConta, String titular) {
        this.nunConta = nunConta;
        this.titular = titular;
        
    }
    
    
    public String getNunConta() {
        return nunConta;
    }

   

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public void depozitar(Double vl){
        this.saldo += vl;
    }
    
    public void sacar(Double vl){
        if (this.saldo >=vl+this.taxa){
            this.saldo -=vl+this.taxa;
            System.out.println("Saque realizado com sucesso\n");
            System.out.printf("Valor do Saque:%.2f\n",vl);
            System.out.printf("Valor taxa de saque:%.2f\n",this.taxa);
        }else    
           System.out.println("Saldo insuficiente");    
        
        
    }      
    
    
    
    
    
            
}
