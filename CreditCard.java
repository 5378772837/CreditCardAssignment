/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creditcardassignment;

/**
 *
 * @author Manskers
 */
public class CreditCard {
    private String cardName;
    private double cardBalance;
    private double interestRate = 0.0;
    private double interestCharge = 0.0;
    private double totalBalance = 0.0;

        
    public CreditCard(String cardName, double cardBalance, double interestRate) {
        this.cardBalance = cardBalance;
        this.cardName = cardName;
    }
    public double getCardBalance() {
        return cardBalance;
    }

    public void setCardBalance(double cardBalance) {
        this.cardBalance = cardBalance;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getInterestCharge() {
        return interestCharge;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public void setInterestCharge(){
    this.interestCharge = this.getCardBalance()*this.interestRate;
    }
     @Override
    public String toString() {
        return "\n"+cardName + "\nCard Balance: $" + cardBalance + "0\nInterest Charge: $" + interestCharge +"0";
    }
}