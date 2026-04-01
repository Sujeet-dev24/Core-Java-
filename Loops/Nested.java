public class Nested {

    public static void main (String [] args){

        // Nested Loop
        for( int i = 1 ; i <= 10; i++){

            for(int j = 1 ; j <= i ; j++){

                System.out.print("*");
            }
            System.out.println();

        }
        // jump statements type-->
        // break, continue
         for(int i=1; i<=10;i++){

            System.out.println(i);

            if(i>5){
                break;
            }
         }
         // Whether a number is prime or not
int p= 11;

// 2,3,4,5,.......6,7
         int i;
         for(i=2;i < p; i++){
            if(p%i==0){
                System.out.println("The number is not prime ");
                break;
            }
         }

         if(i == p){
            System.out.println("The number is prime");
         }
         // Continue 
         
         for (i = 1; i <=10; i++){

            if(i % 2==0){
                continue;
            }
            System.out.println(i);
         }
          // labels --->Outer :, inner:
           
    }
    
}
