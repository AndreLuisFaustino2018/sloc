/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_5;

import java.util.Scanner;

/**
 *
 * @author Andre Faustino
 */
public class Aplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
       ContaBancaria  c;
       System.out.print("Numero da conta:"); 
       String nunConta =ler.nextLine();
       
       System.out.print("Titular:");
       String titular = ler.nextLine();
       
       
       System.out.println("Deseja fazer um depóito inicial:[S/N]");
       c = new ContaBancaria(nunConta,titular);
       if ( ler.nextLine().toUpperCase().equals("S")){
           
            System.out.print("Valor:");
            Double depozitoInicial = ler.nextDouble(); 
            
            c.depozitar(depozitoInicial);
       
       }
       
       
       System.out.printf("Dados da conta: Numero:%s,Titular:%s,Balanço:%.2f\n",c.getNunConta(),c.getTitular(),c.getSaldo());
      
       System.out.print("Entre com o valor para depózito:");
       c.depozitar(ler.nextDouble());
       System.out.printf("Dados da conta: Numero:%s,Titular:%s,Balanço:%.2f\n",c.getNunConta(),c.getTitular(),c.getSaldo());
       
       System.out.println("Entre com o valor de saque");
       c.sacar(ler.nextDouble());
       System.out.printf("Dados da conta: Numero:%s,Titular:%s,Balanço:%.2f",c.getNunConta(),c.getTitular(),c.getSaldo());
    }
    
}
