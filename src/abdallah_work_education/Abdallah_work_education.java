/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdallah_work_education;

import java.util.ArrayList;

/**
 *
 * @author 1
 */
public class Abdallah_work_education {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int exHandle = 5;
        System.out.println("hello abdallah");
        SerratedDisk newDisk = new SerratedDisk();
        SerratedDisk newDisk2 = new SerratedDisk();
        newDisk.setSize(100);
        newDisk.setNumberOfPins(500);
        newDisk.Spin();
        System.out.println(" new object");
        newDisk2.Spin();
        int x = newDisk2.getNumberOfPins();
        System.out.println(" x = " + x);

        newDisk2.setSize(200);
        newDisk2.setNumberOfPins(1000);
        System.out.println(" new object 222 ");
        newDisk2.Spin();
        int y = newDisk2.getNumberOfPins();
        System.out.println(" y = " + y); 
        System.out.println(" motor class ");
        motor m = new motor();
        m.moto();
        m.Spin();
        m.total =51;
        
        System.out.println(" total = " + m.total);
        steer st = new steer() {
            @Override
            public void play() {
                System.out.println(" start to play");
            }
        };
        st.play();
        newDisk2.Spin();
         int xx =5;
        try{
           int data = xx/0;
        
        }catch(ArithmeticException e){
            
            System.out.println("e");
        }
        finally{
            System.out.println("byebye");
        
        }
        
        int[] arr;
        arr = new int[3];
        arr[0]=10;
        arr[1]=20;
        for(int i : arr){System.out.println("array = "+i);
        
        }
    ArrayList cars = new ArrayList();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.add(1);
    cars.set(1, 150);
    cars.remove(2);
    System.out.println("cars" + cars);
    for(Object o:cars){
            System.out.println("car = " + o);

    
    }
    
    String s1="abda";
    String s3="abd";
    String s2 = new  String("Abd");
    System.out.println("value = " + s1);
    int x_1 = 100;
    int y_1 = 20;
    int z_1 = x_1<y_1?15:25;
    System.out.println("z =  " + z_1);
    abdallah_thread th = new abdallah_thread();
    th.start();
    
    System.out.println(" test normal inner classes ");
    
    SerratedDisk inner = new SerratedDisk();
    SerratedDisk.MyInnerClass normal_inner = inner.new MyInnerClass();
    normal_inner.welcome();

    System.out.println(" test static inner classes ");
    SerratedDisk.MyInnerClassStatic static_inner = new SerratedDisk.MyInnerClassStatic();
    static_inner.welcome();
    



    }
    
    
}
