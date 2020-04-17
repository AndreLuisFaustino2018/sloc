/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_3;

import java.util.Locale;
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
        
        Funcionario f = new Funcionario();
        
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Nome funcionario:");
        f.nome = ler.nextLine();
        
        System.out.print("Salario bruto:");
        f.salarioBruto = ler.nextDouble();
        
        System.out.print("Imposto:");
        f.imposto = ler.nextDouble();
        
        
        System.out.println(f);
        
        System.out.print("Deseja passar quantos % de aumento:");
        
        f.incrementarSalário(ler.nextDouble());
        System.out.print("Atualização Salarial: ");
        System.out.println(f);
         
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
