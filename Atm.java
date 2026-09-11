import java.io.*;
import java.util.*;
 

class Atm
{
  public static void main (String []args)
  
 {


  Scanner s =  new Scanner(System.in);

  int  balance =  10000;
  String  select = "";
 

 while(!select.equals("No"))
 {
  
   System.out.println("Enter the widthdrawel amount : ");
   int amount =  s.nextInt();
 
    if (amount<=balance)
      {
      System.out.println("Withdrawel Sucessfull");
      balance =  balance- amount ;
      System.out.println("Remaining Amount is :" +balance);

      }
     else
      {
      
      System.out.println("Insufficent balance");

       }
    
      System.out.println(" Do you want to continue: ") ; 
      select = s.next();

  }

  
      System.out.println(" Thank you for using the Atm:") ; 

 
}
}
