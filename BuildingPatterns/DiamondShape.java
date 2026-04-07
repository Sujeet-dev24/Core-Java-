public class DiamondShape {
     
    public static void diamond_shape(int n){

        //1st half

        for(int i=1; i<=n;i++){
       // Loop for printing spaces 
       for(int j= 1; j<=(n-i); j++){

        System.out.print(" ");
       }
       //loop for printing stars
       for(int j=1; j<=(2*i-1);j++){

        System.out.print("*");

       }
       System.out.println();

        }
        //2nd half 
        for(int i=n;i>=1;i--){
              // Loop for printing spaces 
       for(int j= 1; j<=(n-i); j++){

        System.out.print(" ");
       }
       //loop for printing stars
       for(int j=1; j<=(2*i-1);j++){

        System.out.print("*");

       }
       System.out.println();

        }

    }
    public static void main(String[] args) {
        
        diamond_shape(4);
    }
}
