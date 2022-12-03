/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ict_batch2;



/**
 *
 * @author lalsu
 */
public class ICT_batch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //nonitbatch students = new nonitbatch("computer",150);
        itbatch students1 = new itbatch("computer",150);
        System.out.println("The students department is"+ students1.department + "total no of students is" + students1.strength );
        {
        students1.out();
                      
    }
    teamtigers stu = new teamtigers("nonit",5);
   System.out.println("The students department is"+ stu.department + "total no of students is" + stu.strength );{
        stu.out();
    }
   icognitomasters st = new icognitomasters("nonit",6);
        System.out.println("The students department is"+ st.department + "total no of students is" + st.strength );{
        st.out();
    }   
    }}
    

