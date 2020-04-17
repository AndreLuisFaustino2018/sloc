/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_4;

import java.util.Scanner;
public class Aplication {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        Aluno aluno = new Aluno();
        
        System.out.print("Nome do Aluno:");
        aluno.nome = ler.nextLine();
        
        System.out.print("Nota 1° trimestre:");
        aluno.nota1 = ler.nextDouble();
       
        System.out.print("Nota 2° trimestre:");
        aluno.nota2 = ler.nextDouble();
        
        System.out.print("Nota 3° trimestre:");
        aluno.nota3 = ler.nextDouble();
        
        aluno.somarNotas();
        System.out.println(" ");
        System.out.println(aluno);
        
        
        
    }
    
}
