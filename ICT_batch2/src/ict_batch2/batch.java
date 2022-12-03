/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ict_batch2;

/**
 *
 * @author lalsu
 */
public class batch {
    String department;
    int strength;
    void out() {
            System.out.println("good");
}
}
 class itbatch extends  batch {
    itbatch(String department ,int strength){
        super.department=department;
        super.strength=strength;
    }
    public void out(){
            System.out.println("Fast learners"); 
    }
 }
     class nonitbatch extends  batch {
         String department;
    int strength;
    nonitbatch(){
            this.department=department;
            this.strength=strength;
    }
     
    nonitbatch(String department ,int strength){
        super.department=department;
        super.strength=strength;
    }
   public void out(){
            System.out.println("Trying to understand from basics"); 
    }}
      class teamtigers extends  nonitbatch {
    teamtigers(String department ,int strength){
        super.department=department;
        super.strength=strength;
    }
    public void out(){
            System.out.println("started using slack"); 
    }}
        class icognitomasters extends  nonitbatch {
    icognitomasters(String department ,int strength){
        super.department=department;
        super.strength=strength;
    }
    public void out(){
            System.out.println("google meet"); 
    }
}
      
