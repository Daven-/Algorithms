/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicConnectivity;

/**
 *
 * @author Daven
 */
public class UF {
    int count = 0;
    // initialize N sites with integer names (0 to N-1)
    public UF(int N){
        
    }
    
    // add connection between p and q
    public void union(int p, int q){
        count++; // should count components not individual connections - move asap
        
        // decrease number of components - 
        // p and q should not be in a component already (else count++) or different components for union to work
        count--; 
    }
    
    // component identifier  for p
    public int find(int p){
        // code
        return p;
    }
    
    // return true if p and q are in the same component 
    public boolean connected(int p, int q){
        
        return true;
    }
    
    // number of components 
    public int count(){
        return count;
    }
}
