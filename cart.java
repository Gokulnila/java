import java.io.*;
import java.util.*;

 class cart
 
  {
  public static void main (String []args)
    { 
     
     Scanner s = new Scanner (System.in);
     System.out.print("  Enter the number of product:");
     int product = s.nextInt();
     
    int total = 0;
    for(int a=1; a<=product;a++)
     {
         System.out.print("  Enter the number of product "+a+":");
          int price = s.nextInt();
           total+= price;
      
      }
      s.close();
    System.out.println("  The total value is :"+total);
 if (total>=1000)
    {
      System.out.println("  The discount is applicable to you");

    }
else 
   {
     System.out.println("  Not applicable ");

    }


     }




   }

