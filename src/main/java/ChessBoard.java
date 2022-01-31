import java.util.Scanner;

public class ChessBoard {
    StringBuilder line = new StringBuilder();
    public String createChessBoard(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j)% 2 == 0) {
                    line.append("  ");
                } else {
                    line.append(" * ");
                }
            }
            line.append('\n');
        }

        return line.toString();
    }
    public static void main(String[] args) {
    ChessBoard chessBoard=new ChessBoard();
    Scanner sc=new Scanner(System.in);
    int width=sc.nextInt();
    int height=sc.nextInt();
    System.out.println(chessBoard.createChessBoard(width,height));
    }
}