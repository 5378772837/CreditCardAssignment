/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creditcardassignment;

/**
 *
 * @author Manskers
 */
public class Mastercard extends CreditCard{
    private static final double interestRate = 0.05;

        
    public Mastercard(String cardName, double cardBalance) {
        super(cardName,cardBalance,interestRate);
        this.setInterestCharge();
        
        
}
}