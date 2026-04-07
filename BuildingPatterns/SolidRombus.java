public class SolidRombus {

    public static void solid_rombus(int n){

        for(int i=1; i<=n ; i++){
            // Loop for spaces
            for(int j=1;j<=(n-i);j++){

                System.out.print(" ");
            }
            // Loop for printing stars 
            for(int j=1;j<=n;j++){

                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        solid_rombus(5);
    }
    
}
/*This is the final output you get:-

    *****
   *****
  *****
 *****
*****

*/