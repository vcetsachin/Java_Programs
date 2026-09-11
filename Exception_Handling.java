import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


//You practice topic to topic code write..dont write all code once you write all code onetime gives the code error

public class Exception_Handling {

    public void Filemanager() throws FileNotFoundException{
       FileReader file = new FileReader("abstrations.java");
    }  
    public static void main(String[] args){

//_________________________Used try catch handler (In java there are the 5 type of exceptions).________________
        
        // try{
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the divident number: ");
        // int num = sc.nextInt();
        // System.out.print("Enter the divisor number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Answer: "+num/num1);
        // }
        // catch(Exception e){
        //     System.out.println("ERror is: "+e.getMessage());
        // }


               //________________________________________Used finally handler.______________________

        // try{
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the divident number: ");
        // int num = sc.nextInt();
        // System.out.print("Enter the divisor number: ");
        // int num1 = sc.nextInt();
        // System.out.println("Answer: "+num/num1);
        // }
        // catch(Exception e){
        //     System.out.println("ERror is: "+e.getMessage());
        // }
        // finally{
        //     System.out.println("Thank you.... sir for visiting....");
        // }                 
        
        
            //_________________________________Used Throw and Throws.________________________________________

    //     int Total_ammount = 5000;                        
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter the withdrawal ammount: ");  
    //     double ammount = sc.nextDouble();

    //     if (Total_ammount<ammount) {
    //         throw new IllegalArgumentException("Please enter the correct ammount.");
    //     } 
    //     else{
    //         System.out.println("Congratulation.. "+ammount+" is withdrawal successfully..");
    //     }
    //     System.out.println("Sachin");                   
    
    

           //_______________Throws Exception handler above side make the Throws handler method.____________________

          try{
            Exception_Handling h1 = new Exception_Handling();
            h1.Filemanager();
            System.out.println("The file is available in that project.");
          }     
          
          catch(FileNotFoundException e){
            System.out.println("Erorr is: "+e.getMessage());
          }

                    
    }
}