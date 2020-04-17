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
public class Estoque{
  String nomeProduto = "";
  double  preco = 0.;        
  int quantidade =0; 
  
  public void adicionarProduto(int iten){
      quantidade +=iten;
     
  
  } 
  
  public void removerProduto(int iten){
      quantidade -=iten;
  
  
  }
  
  public double totalEmEstoq(){
      
      return quantidade*preco;
  
  
  }
  
  @Override
  public String toString(){
       
      return nomeProduto
             + String.format(": %.2f",preco)
             + " unidades:"+quantidade
             + " Total:"
             + String.format("%.2f",totalEmEstoq());
 
 }
}   
