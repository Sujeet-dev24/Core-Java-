public class CharacterPatttern {

    public static void main(String[] args) {
        int n = 6;
        for(int i = 1; i<=n ; i++){

            for(int c=1 ;c<=i;c++){

                System.out.print((char)(c+64)+ "");
            }
            System.out.println();
        }
    }
    
}
