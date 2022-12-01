/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bank;

/**
 *
 * @author lalsu
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          BankClass icici=new BankClass();
        icici.bank_name="ICICI Bank";
        icici.interest=7;
        icici.dispay_interest();
        BankClass iob=new BankClass();
        iob.bank_name="IOB Bank";
        iob.interest=9;
        iob.dispay_interest();
       BankClass sbi=new BankClass();
        sbi.bank_name="SBI Bank";
        sbi.interest=8;
        sbi.dispay_interest();
    }
 

}
