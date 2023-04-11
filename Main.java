/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creditcardassignment;
/*Visa gets 10%
MC gets 5% interest
Discover gets 1% interest
Each Card Type can have multiple cards and there can be multiple Wallets for a Person.
NOTE: SIMPLE INTEREST for this test case (means 1 month of interest, if the interest rate is 10% and the
amount is 100.00 – interest in this case would be 10.00)
Here are the test Cases -
 1 person has 1 wallet and 3 cards (1 Visa, 1 MC, 1 Discover) – Each Card has a balance of $100 –
calculate the total interest (simple interest) for this person and per card.
 1 person has 2 wallets Wallet 1 has a Visa and Discover , wallet 2 a MC - each card has $100 balance -
calculate the total interest(simple interest) for this person and interest per wallet
 2 people have 1 wallet each, person 1 has 1 wallet with 3 cards (1 MC, 1 Visa, 1 Discover), person 2 has
1 wallet with 2 cards (1 Visa, 1 MC) all cards in all wallets for both people have a $100 balance -
calculate the total interest(simple interest) for each person and interest per wallet
Please be prepared to discuss your solution on the basis of SOLID programming principles
You must post your example on https://github.com/<Your name here>
Let me know if you have any questions. Thanks again for your interest in Clearent*/

/**
 *
 * @author Manskers
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*1 person has 1 wallet and 3 cards (1 Visa, 1 MC, 1 Discover) – 
        Each Card has a balance of $100 – calculate the total interest (simple interest) 
        for this person and per card.*/
        //Create the person
        Person steve = new Person("Steve");
            //create the wallet
            Wallet sWallet = new Wallet("Steve's Wallet");
            //add wallet to person
            steve.addWallet(sWallet);
            
                //create the cards
                Mastercard sMastercard = new Mastercard("Steve's Mastercard",100);
                Visa sVisa = new Visa("Steve's Visa",100);
                Discover sDiscover = new Discover("Steve's Discover",100);
                
                //add cards to wallet
                sWallet.addCard(sMastercard);
                sWallet.addCard(sVisa);
                sWallet.addCard(sDiscover);
                
                //setting total interest for wallet
                sWallet.settotalInterest();
                
                //setting total interest for person
                steve.setTotalInterest();

            
        /* 1 person has 2 wallets Wallet 1 has a Visa and Discover , 
        wallet 2 a MC - each card has $100 balance - calculate the total interest(simple interest) 
        for this person and interest per wallet*/
        
        //create the person
        Person john = new Person("John");
            //create wallet 1
            Wallet jWallet1 = new Wallet("John's Wallet 1");
            //add wallet 1 to person
            john.addWallet(jWallet1);
                //create cards
                Visa jVisa = new Visa("John's Visa",100);
                Discover jDiscover = new Discover("John's Discover",100);
                //add cards to the wallet
                jWallet1.addCard(jVisa);
                jWallet1.addCard(jDiscover);
                
                //setting total interest for wallet
                jWallet1.settotalInterest();
                
            //create wallet 2
            Wallet jWallet2 = new Wallet("John's Wallet 2");
            
            //add wallet to person
            john.addWallet(jWallet2);
                //create card
                Mastercard jMastercard = new Mastercard("John's Mastercard",100);
                //add card to wallet
                jWallet2.addCard(jMastercard);
                                //setting total interest for wallet
                jWallet2.settotalInterest();
                
                //setting total interest for person
                john.setTotalInterest();
                
        /* 2 people have 1 wallet each, 
                
        person 1 has 1 wallet with 3 cards (1 MC, 1 Visa, 1 Discover), 
        person 2 has 1 wallet with 2 cards (1 Visa, 1 MC) all cards in all wallets for both people have 
        a $100 balance - calculate the total interest(simple interest) for each person and interest per wallet*/
        
        //create person
        Person allen = new Person ("Allen");
        
            //create wallet
            Wallet aWallet = new Wallet("Allen's Wallet");
            
            //add wallet to person
            allen.addWallet(aWallet);
            
                //create cards
                Mastercard aMastercard = new Mastercard("Allen's Mastercard",100);
                Visa aVisa = new Visa("Allen's Visa",100);
                Discover aDiscover = new Discover("Allen's Discover",100);
                
                //add cards to wallet
                aWallet.addCard(aMastercard);
                aWallet.addCard(aVisa);
                aWallet.addCard(aDiscover);
                                //setting total interest for wallet
                aWallet.settotalInterest();
                
                //setting total interest for person
                allen.setTotalInterest();
                
        //create person
        Person rick = new Person ("Rick");
        
            //create wallet
            Wallet rWallet = new Wallet("Rick's Wallet");
            
            //add wallet to person
            rick.addWallet(rWallet);
            
                //create cards
                Mastercard rMastercard = new Mastercard("Rick's Mastercard",100);
                Visa rVisa = new Visa("Rick's Visa",100);
                
                //add card to wallet
                rWallet.addCard(rMastercard);
                rWallet.addCard(rVisa);
                
                //setting total interest for wallet
                rWallet.settotalInterest();
                
                //setting total interest for person
                rick.setTotalInterest();
                
                System.out.println("Name: "+steve.getPersonName()+"\nTotal Interest: $"+steve.getTotalInterest()+"0");
                System.out.println("\n"+steve.getWallets());
                System.out.println("\nName: "+john.getPersonName()+"\nTotal Interest: $"+john.getTotalInterest()+"0");
                System.out.println("\n"+john.getWallets());
                System.out.println("\nName: "+allen.getPersonName()+"\nTotal Interest: $"+allen.getTotalInterest()+"0");
                System.out.println("\n"+allen.getWallets());
                System.out.println("\nName: "+rick.getPersonName()+"\nTotal Interest: $"+rick.getTotalInterest()+"0");
                System.out.println("\n"+rick.getWallets());
                
        
    }
    
}
