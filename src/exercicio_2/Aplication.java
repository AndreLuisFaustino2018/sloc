/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_2;

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
        Estoque e = new Estoque();
        System.out.println("Entre com os dados do produto");
       
        System.out.println("Nome:" );
        e.nomeProduto =ler.nextLine();
        
        System.out.println("Preço:");
        e.preco=ler.nextDouble();
        
        System.out.println("Qantidade:");
        e.quantidade=ler.nextInt();
        
        System.out.println(e);
        
        System.out.println("Entre com a quantidade de produtos para adicionar no estoque\n");
        e.adicionarProduto(ler.nextInt());
        System.out.println(e);
    
        System.out.println("Entre com a quantidade de produtos para retirada no estoque\n");
        e.removerProduto(ler.nextInt());
        System.out.println(e);
    }
    
}
