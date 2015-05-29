/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicConnectivity;

import java.util.Random;

/**
 *
 * @author Daven
 */
public class UF {
    private int count = 0; // number of components
    private static int[] id;// access to component id (indexed sites)
    
    // initialize N sites with integer names (0 to N-1)
    public UF(int N){
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i; // index is the site id and the value is the component it is currently in! 
        }
    }
    public static void main(String[] args){
        Random r = new Random();
        int count = 0;
        UF uf = new UF(11);
      
            int p = 1;
            int q = 9;
            if(!uf.connected(p, q)){
            uf.union(p, q);
            System.out.println(p + " " + q);
            }
            
            p = 2;
            q = 9;
            if(!uf.connected(p, q)){
            uf.union(p, q);
            System.out.println(p + " " + q);
            }
            
            p = 9;
            q = 7;
            if(!uf.connected(p, q)){
            uf.union(p, q);
            System.out.println(p + " " + q);
            }
        
        for (int i = 0; i < 11; i++) {
            System.out.println(id[i]);
        }
        System.out.println(uf.count + " Components");
    }
    
    // add connection between p and q
    public void union(int p, int q){
        int pRoot = find(p); // find the components the sites are currently in
        int qRoot = find(q);
        
        if(pRoot == qRoot)
            return;// already in the same component
        
        id[pRoot] = id[qRoot]; // change to weighted tree for lg n time // this implim is no better than quick find
        
        // decrease number of components - 
        // p and q should not be in a component already (else count++) or different components for union to work
        count--; 
    }
    
    // component identifier  for p
    public int find(int p){
        // code
        while(id[p] != p){
            p = id[p];
        }
        return p;
    }
    
    // return true if p and q are in the same component 
    public boolean connected(int p, int q){
        return find(p) == find(q);
    }
    
    // number of components 
    public int count(){
        return count;
    }
}
