public class Bishop extends ChessPiece {
    int line, column, toLine, toColumn;
    static boolean bishopAttack = false;

    public Bishop (String color) {
        super(color);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getSymbol() {
        return "B";
    }

    public boolean isBishopAttack() {
        return bishopAttack;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {return false;}

        else if ((Math.abs(toLine - line ) ==  Math.abs(toColumn- column) &&
                ((toLine - line) != 0) && (toColumn - column) != 0)) {bishopAttack = true; return true;}
        else return false;

    }
}