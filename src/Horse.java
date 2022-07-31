public class Horse extends ChessPiece {
    int line, column, toLine, toColumn;
    static boolean isHorseAtack = false;

    public Horse (String color) {
        super(color);
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public String getSymbol() {
        return "H";
    }

    public static boolean isHorseAtack() {
        return isHorseAtack;
    }

    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn){
        if (line < 0 || line > 7 || column < 0 || column > 7 ||
                toLine < 0 || toLine > 7 || toColumn < 0 || toColumn > 7) {return false;}

        else if (Math.abs(toLine - line ) == 1 && Math.abs(toColumn- column) == 2) {isHorseAtack = true; return true;}
        else if (Math.abs(toLine - line ) == 2 && Math.abs(toColumn- column) == 1) {isHorseAtack = true; return true;}
        else return false;
    }
}