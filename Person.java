/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creditcardassignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manskers
 */
public class Person {
    private String personName;
    private double totalInterest = 0;
    private List <Wallet> wallets = new ArrayList<>();

    @Override
    public String toString() {
        return "\nPerson: "+ personName + "\nInterest Owed: " + totalInterest + "\n" + wallets+"\n";
    }

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public List <Wallet> getWallets() {
        return wallets;
    }

    public void setWallets(List <Wallet> wallets) {
        this.wallets = wallets;
    }
    public void addWallet(Wallet wallet){
       wallets.add(wallet);
    }
    public void setTotalInterest(){
    for(Wallet w: wallets){
    totalInterest = totalInterest + w.getTotalInterest();
    }
    }
    public double getTotalInterest(){
    return this.totalInterest;
    }
    
    
}
