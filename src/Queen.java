public class Queen extends ChessPiece {
    int line, column, toLine, toColumn;

    public boolean isQueenCanAttack() {
        return queenCanAttack;
    }

    static boolean queenCanAttack = false;

    public Queen (String color) {
        super(color);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getSymbol() {
        return "Q";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {return false;}

        else if ((Math.abs(toLine - line ) ==  Math.abs(toColumn- column) &&
                ((toLine - line) != 0) && (toColumn - column) != 0)) {queenCanAttack = true; return true;}
        else if ((Math.abs(toLine - line ) != 0) && ((toColumn - column) == 0)) {queenCanAttack = true; return true;}
        else if ((Math.abs(toColumn - column) != 0) && ((toLine - line) == 0)) {queenCanAttack = true; return true;}
        else return false;

    }
}