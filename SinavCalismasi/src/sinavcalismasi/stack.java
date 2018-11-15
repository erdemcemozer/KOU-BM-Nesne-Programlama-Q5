/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinavcalismasi;

import java.util.ArrayList;

/**
 *
 * @author Erdem Özer
 */
public class stack {
    int n=100;
    ArrayList <Integer> list1 = new ArrayList<>(n);
    
    stack(){
        
    }
    stack(int a){
        list1.add(a);
     
    }
    stack(stack a){
        
        this.list1=(ArrayList<Integer>)a.list1.clone();
            
        }
    public void empty(){
    if(this.list1.size()==0)
    {
        System.out.println("stack bostur");
        
    }else{
        System.out.println("stackte eleman var");
    }
    }
    public int full(){
        if(this.list1.size()==n)
        {
            System.out.println("stack doludur");
            return 1;
        }
        else
        {
            return 0;
        }
        }
    public void pop(){
        if(list1.size()>0)
            list1.remove((list1.size()-1));
        
    }
    public void push(int a){
        if(full()==0)
        {
            list1.add(a);
            
        }
        else
        {
            System.out.println("liste dolu");
        }
    }
    public int peek()
    {
        return list1.get(n-(list1.size()));
    }
    public void toString(stack a){
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("[" + list1.get(i).toString()+ "]");
           
        }
    }
    }
    



