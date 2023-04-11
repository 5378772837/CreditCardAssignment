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
public class Wallet {
    String walletName;
    double totalInterest=0;
    List <CreditCard> creditCards = new ArrayList<>();

    public String getWalletName() {
        //getter
        return walletName;
    }

    public void setWalletName(String walletName) {
        //setter
        this.walletName = walletName;
        
    }

    public Wallet(String walletName) {
        //constructor
        this.walletName = walletName;
    }
        public List<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
    public void addCard(CreditCard creditCard){
        creditCards.add(creditCard);
    }
    public void settotalInterest(){
    for(CreditCard c: creditCards){
        totalInterest = totalInterest+c.getInterestCharge();
    }
    }
    public double getTotalInterest(){
    return totalInterest;
    }
        @Override
    public String toString() {
    return "\nWallet: " + walletName + "\nWallet Interest: $" + totalInterest + "0\n" + creditCards+"\n";
    }
}
