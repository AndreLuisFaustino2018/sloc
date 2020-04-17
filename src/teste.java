
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andre Faustino
 */
public class teste {
    public static void main(String [] args){
        ArrayList lista = new ArrayList();
        
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        
        Iterator <String>iter =lista.iterator();
        
        
        while(iter.hasNext()){
            
            System.out.println("Nomes"+iter.next());
        
        
        }
        
        
        
        
    
    }
}
