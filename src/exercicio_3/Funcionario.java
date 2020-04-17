/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

/**
 *
 * @author Andre Faustino
 */
public class Funcionario {
    String nome;
    double salarioBruto;
    double imposto;
    
    
    public double  salarioLiquido(){
       
        double salarioLquido = this.salarioBruto-(this.salarioBruto*(this.imposto/100));
        return salarioLquido;
    }
    
    public void incrementarSalário(double poncentagen){
        this.salarioBruto = this.salarioBruto+(this.salarioBruto*(poncentagen/100));
    
    
    }
    
    
    public String  toString(){
        
        return "Funcionário:"+this.nome+" " +String.format("%.2f",salarioLiquido());
    } 
}
