public class Pawn extends ChessPiece {
    int line, column, toLine, toColumn;
    public static boolean pawnAttack = false;

    public Pawn (String color) {
        super(color);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getSymbol() {
        return "P";
    }

    public boolean isPawnAttack() {
        return pawnAttack;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {return false;}

        else if (color.equals("White") && (line == 1) && (toLine ==2) && (column == toColumn)) {pawnAttack = true; return true;}
        else if (color.equals("White") && (line == 1) && (toLine ==3) && (column == toColumn)) {pawnAttack = true; return true;}
        else if (color.equals("Black") && (line == 6) && (toLine ==5) && (column == toColumn)) {pawnAttack = true; return true;}
        else if (color.equals("Black") && (line == 6) && (toLine ==4) && (column == toColumn)) {pawnAttack = true; return true;}
        else if (color.equals("White") && ((toLine - line ) == 1) && (column == toColumn)) {pawnAttack = true; return true;}
        else if (color.equals("Black") && ((line - toLine ) == 1) && (column == toColumn)) {pawnAttack = true; return true;}
        else return false;

    }
}