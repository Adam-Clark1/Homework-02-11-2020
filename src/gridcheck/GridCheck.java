package gridcheck;
import java.util.Scanner;



public class GridCheck {

    static int  coord1;
    static int coord2;
    
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        
        while (valid == false){
            try{
        String[][] board = new String [10] [10];
        for (int i = 0; i < 10; i++){
            for (int j = 0; j<10; j++){
                board[i][j] = "[  ]";
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        System.out.println("Pick 2 co-ordenated type one then press enter then pick the other. 1-10. X first Y second.");
        coord1 = input.nextInt();
        coord2 = input.nextInt();
            }catch (Exception error) {
                System.out.println("Exception occurred:  " + error);
                input.next();
            }
        
        
        if ((coord1 <11 && coord2 < 11)&&(coord1 > 0 && coord2 > 0)){
            System.out.println("Correct");
            valid = true;
        }else{
            if(coord1 >10 || coord2 > 10 || coord1 < 1 || coord2 <1){
                System.out.println("Incorrect");
                valid = true;
            }
        }

    }
    
}
    }



