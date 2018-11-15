/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinavcalismasi;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Erdem Özer
 */
public class SinavCalismasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* int i;
        int sayi=40;
        while(sayi>=0){
             System.out.println("sayi: " +sayi);
            sayi=sayi-10;
        }
        //----------------------------------------------------------------------
        double sayi2=0.3;
        for(i=0;i<6;i++)
            
              {
            System.out.println("sayi2: "+sayi2);
            sayi2 = sayi2 * (-2);
        }
        //----------------------------------------------------------------------
        int x = 3;
        int y;
        int z;
        y = 50/x%9;
        if((x>y)||(y%2!=0)&&(y>5))
        
                z=y%x;
        else
            z=0;
        if(!(x<4&&y>8))
            x=3+2*x;
        System.out.println(x );
        System.out.println(y);
            System.out.println(z);
            //------------------------------------------------------------------
        int a;
        int b;
        int c;
        //runtime errora bak
        String stuff="";
        String Stuff="sayar";
        System.out.println("a" + '\n' + Stuff);
        // faktöriyel sorusuna bak kesin
        /* int fakt(n){
        if(n==1)
            return 1;
        else int 
        s= fakt(n)*(n-1); 
        //----------------------------------------------------------------------
        double d=5/2;
        System.out.println(d);
        
        int n=3;
        for (int j = 0; j < n; j+=2) {
            System.out.println(j);
            System.out.println(n);
         
        }
        //----------------------------------------------------------------------*/
        ArrayList <Integer> list1 = new ArrayList<>();
        stack a = new stack();
        a.push(1);
        a.push(2);
        
        stack b= new stack(a);
        a.toString(a);
        a.pop();
        a.toString(a);
        a.pop();
        a.toString(a);
        a.pop();
        a.toString(a);
        a.push(3);
        a.toString(a);
        a.empty();
        b.toString(b);
        a.full();
        System.out.println("a stackinin icerigi: ");
        a.toString(a);
        System.out.println("b stackinin icerigi: ");
        b.toString(b);
    }
    
    }
    

