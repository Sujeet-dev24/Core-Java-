public class HollowRec {

    public static void hallow_rectangle(int tRows, int tCols){

        // Outer loop
        for(int i= 1;i<=tRows;i++){
            //inner columns
            for(int j=1; j<=tCols;j++){
                //cell - (i,j)
                if(i == 1 || i== tRows || j==1 || j==tCols){
                    //boundary Cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
               System.out.println();
        }

    }
   public static void main(String [] args)
        {
            hallow_rectangle(5, 6);
        }
}
