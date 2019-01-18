// Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//

public class ChessTable {

    public static void main(String[] args) {

        int tableLength = 8;

        for (int row = 0; row < tableLength; row++){
            for (int col = 0; col < tableLength; col++){
                if (row % 2 == 1 && col % 2 == 1){
                    System.out.print("%");
                } else if (row % 2 == 0 && col % 2 == 0){
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
