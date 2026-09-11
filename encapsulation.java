public class encapsulation {
   private String accountHolder;
   private int bankBalance;

   //we make theseeter and the getter for access the private variable

   public void setAccountHolder(String accountHolder1){
    this.accountHolder = accountHolder1;
   }

   public String getAccountHolder(){
    return accountHolder;
   // System.out.println("Holder Name: "+accountHolder);
   }

   public void setBalance(int bankBalance1){
   if(bankBalance1 >= 0){
     this.bankBalance = bankBalance1;
   }
   else{
    System.out.println("The negative balance is not allowed..");
   }
   }
 
   public int getBalance(){
    return bankBalance;
   // System.out.println("Account Balance: "+ bankBalance);
   }
   
    public static void main(String[] args) {
        encapsulation e1 = new encapsulation();
        e1.setAccountHolder("Sachin");
        e1.setBalance(200000);

        e1.getAccountHolder();
        e1.getBalance();
    }
}
