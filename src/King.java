public class King extends ChessPiece {
    int line, column, toLine, toColumn;

    public King (String color) {
        super(color);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getSymbol() {
        return "K";
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {return false;}

        else if ((Math.abs(toLine - line ) == 1) && (Math.abs(toColumn - column) == 0)) {return true;}
        else if ((Math.abs(toLine - line ) == 0) && (Math.abs(toColumn - column) == 1)) {return true;}
        else if ((Math.abs(toLine - line ) == 1) && (Math.abs(toColumn - column) == 1)) {return true;}
        else return false;
    }
    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        if (Horse.isHorseAtack== true || Pawn.pawnAttack == true || Bishop.bishopAttack == true ||
                Queen.queenCanAttack == true || Rook.rookCanAttack == true) {return false;}
        else return true;
    }

//    public boolean isUnderAttack(ChessBoard board, int line, int column) {
//        return false;
//    }

}