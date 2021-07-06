/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdallah_work_education;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 *
 * @author 1
 */
public class SerratedDisk {  
    private int size;
    private int numberOfPins;
    protected int total =106 ;
    final  int final_value = 50000;
    
   
    
//    public SerratedDisk(int diskSize,int noPins){ //paramaterized constructor that takes values from user 
//        this.size =diskSize;    int diskSize,int noPins
//        this.numberOfPins =noPins;
//        }
    public SerratedDisk(){   //normal instractor have initial value for attributes
           size = 10;
           numberOfPins = 20 ;
           
        }
    public void Spin(){
        System.out.println("Size of Disk = : "+size);
        System.out.println("Pins of Disk = : "+numberOfPins);      
        System.out.println("Pins of Disk = : "+total);
        System.out.println("final  = : "+final_value);
        
    }
    
    public void setSize(int incomSize){
        this.size = incomSize ;    
    }
    
    public int getSize(){
        return size;    
    }
    
    public void setNumberOfPins(int incomPins){
        this.numberOfPins = incomPins ;    
    }
        
    public int getNumberOfPins(){
        return numberOfPins ;    
    }
    
    class MyInnerClass{
        public void welcome(){
            
            System.out.println("welcome to normal inner class");
        } 
    }
    static class  MyInnerClassStatic{
        
        int x = 6000;
        static int y = 6000;
        public void welcome(){
            
            System.out.println("welcome to static inner class");
        } 
    }
}

