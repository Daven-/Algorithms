/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daven
 */
public class Counter {
    int tally;
    String id;
    public Counter(String id){
        this.tally = 0;
        this.id = id;
    }
    public void increment(){
        this.tally++;
    }
    public int tally(){
        return tally;
    }
    public String toString(){
        return "ID: "+id+" Tally: "+tally;
    }
}
