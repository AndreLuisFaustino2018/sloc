/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;


public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double nota3;
    double totNotas;
    double faltaPontos;
    
    public  void somarNotas(){
        this.totNotas = this.nota1+this.nota2+this.nota3;
        this.defictNotasAluno(this.totNotas);
    }
    
    public void  defictNotasAluno(double n){
        this.faltaPontos =100-n;
        
    }
    public String avaliarSituaçãoAluno(double n){
        if (n>=60){
            return "Aprovado";
        
        }
        return "Reprovado";
    }
    
    public String toString(){
        
        if (this.faltaPontos==0)
            return "Situação do Aluno:\nNome:"
                +this.nome
                +"\nTotais das Notas:"
                +String.format("%.0f",this.totNotas)
                +"\n"+avaliarSituaçãoAluno(this.totNotas);
                
        else
            return"Situação do Aluno:\nNome:"
                +this.nome
                +"\nTotais das Notas:"
                +String.format("%.0f",this.totNotas)
                +"\n"+avaliarSituaçãoAluno(this.totNotas)
                +"\nFaltaram:"
                +String.format("%.0f",this.faltaPontos);
    } 

}
