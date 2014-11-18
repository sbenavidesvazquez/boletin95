
package boletin95;

import java.util.Scanner;


public class Serie {
    int nf;
    
    public Serie(){
        
    }
    
    public void cantNumeros(){
        Scanner dato=new Scanner(System.in);
       nf=dato.nextInt();
        
    }
    
    public void Serie1(){
        
        for(int i=1;i<=nf;i++){ 

            System.out.println(i*2);
        } 
    }
    
    public void serie2(){
      String serie2="";
        
        for (int i=1;i<=nf;i++){
            if(i%2==0){
                System.out.println(i);
            }
            if(i%2!=0){
            System.out.println(i*(-1));
            }
        }
    }
    
    public void serie3(){
        
        long a=1, b=1, c=0;
        
        for(int i=1;i<=nf;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            
        }

            
    }
    
    
}
