/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ict_nonit;

/**
 *
 * @author lalsu
 */
public class Non_it {
       String team_leader;
    int members ;
    
   public void performance()
    {
        System.out.println("good");
    }
}
    class tigers extends Non_it{
        tigers(String team_leader,int members)
        {
        
                super.team_leader=team_leader;
                super.members=members;
        }   
      
                  public void performance()
    {
        System.out.println("outstading");
    }
   }
         class lacksquad extends Non_it {
        lacksquad(String team_leader,int members)
        {
        
                super.team_leader=team_leader;
                super.members=members;
        } 
                   public void performance()
    {
        System.out.println("outstading");
    }
         }
          
    
    

