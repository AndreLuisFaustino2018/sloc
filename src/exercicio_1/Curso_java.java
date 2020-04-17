/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1;

import java.lang.ref.Cleaner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Andre Faustino
 */
public class Curso_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      
        Curso_java c = new Curso_java();
        c.iniciar();
    }    
    

    public void iniciar(){
        ArrayList <Pessoa> lista = new ArrayList();
        
        do {                
                int  resp =menu(); 
                if (resp != 1){
                    imprimirDados(lista);
                    calcularMediaIdadePessoa(lista);
                    calcularMediaIdadeMasculina(lista);
                    break;
                
                }
                Pessoa p = new Pessoa();
                p.setNome(lerNome());
                p.setIdade(lerIdade());
                p.setSexo(lerSexo());
                lista.add(p);
               
            } while (true);
       
    } 
    
    public int menu(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite 0 para sair");
        System.out.println("Digite 1 para continuar cadastrando");
       
        return  ler.nextInt();
    }
    
    
    public void imprimirDados(ArrayList p){      
        
        System.out.println("----------------Dados Cadastrados-------------------");
        for (Iterator <Pessoa> iterator = p.iterator(); iterator.hasNext(); ) {
            Pessoa c = iterator.next();
            
      
            System.out.println("Nome:"+c.getNome());
            System.out.println("Idade:"+c.getIdade());
            System.out.println("Sexo:"+c.getSexo());
            System.out.println("-------------------");
        } 
       
    
    
    }
    
    
    
    public String lerNome(){
       Scanner  ler = new Scanner(System.in);
       System.out.println("Digite o nome:");
       String nome = ler.nextLine();
       char caracter1 =nome.toUpperCase().charAt(0);
       nome = caracter1+nome.substring(1,nome.length()).trim();
       
       
       return nome;
    
    }
   
    public int lerIdade(){
        Scanner  ler = new Scanner(System.in);
        System.out.println("Digite a idade:");
        return ler.nextInt();
    }
    
      public char lerSexo(){
        Scanner  ler = new Scanner(System.in);
        System.out.println("Digite o sexo:");
        String l = ler.nextLine();
        char caracter1 = l.toUpperCase().trim().charAt(0);
        return caracter1;
    }
    
    
    
      public void calcularMediaIdadeMasculina(ArrayList list){
          Iterator <Pessoa> iter = list.iterator();
          double media =0.;
          int totIdade =0;
          int cont =0;
          
          while (iter.hasNext()) {
              Pessoa p = iter.next();
              
              if (p.getSexo() =='M' ){
                  cont+=1;
                  totIdade += p.getIdade();
              
              }
          }
          media =totIdade/cont;
          System.out.println("A media de idade dos homens é :"+media);
      
      }
      
      public static void calcularMediaIdadePessoa(ArrayList list){
        double media = 0.;
        int totIdade =0;
        Iterator <Pessoa>iter=list.iterator();
        
        while (iter.hasNext()) {
           
            Pessoa p = iter.next();
          
            totIdade +=p.getIdade();
            
        
        }
        media = totIdade/list.size();
        System.out.printf("A média de idades é%.0f: ",media);
        
        
    
    }
    
}
