package loopstatement;
    // syntax   for(initilize;condition;inc/dec)
//              {statements;   }
public class For {   //Addition of from to from.
         public void addof(int start,int ends){
             int sum=5;
             for (int i=start;i<=ends;i++)
             {
                 sum=sum+i;
             }
             System.out.println("Addition of " +start+ " to " +ends + " is "+ sum);
         }

         public static void main(StringMethods[] args)
         {
           /// int i,sum;
            ///for( i=1,sum=0; i <= 50 ;  ++i )
                ///sum=sum + i;
           /// System.out.println("The sum of first 50 numbers is: " +sum) ;
            For For1=new For();
            For1.addof(5,15);
            For1.addof(25,35);
            For1.addof(50,60);
            For1.addof(1,50);
         }


         }
           /* for (byte b=2; b<=20;b+=2){
                System.out.println(b);      //Print EVEN no.from 2--20.
            }*/
 /* for (int i=1;i<=30;i+=2){
      System.out.println(i);                 //ODD no.from 1 to 30.
  }

        }
        /*{for (byte b=10;b>=0;b--)
        {
            System.out.println(b); //10-9-8-7-6-5...0
        }
        }*/
                      //Sum of first 50 No.





