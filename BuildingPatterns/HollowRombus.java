public class HollowRombus {

    public static void hollow_rombus(int n){

        for(int i= 1; i<=n;i++){
      // loop for spaces
      for(int j=1;j<=(n-i); j++){
        System.out.print(" ");
      }
      //loop to print stars
      for(int j =1;j<=n;j++){
       
        if( i==1 || i==n || j==1 || j==n){
             System.out.print("*");
        }else{
            System.err.print(" ");
        }
      }
      System.out.println();

        }
    }
    public static void main(String[] args){
        hollow_rombus(5);
    }
}
