package lk.ijse.dep.service;
/*
    @author Sachi_S_Bandara
    @created 10/04/2023  - 10:30 AM
*/
public class HumanPlayer extends Player {

    public HumanPlayer(Board board) {
        super(board);
    }

    @Override
    public void movePiece(int col) {

        if(board.isLegalMove(col)){
            board.updateMove(col,Piece.BLUE);
            board.getBoardUI().update(col,true);
            Winner winner =board.findWinner();
            if(board.findWinner().getWinningPiece()==Piece.BLUE){
                board.getBoardUI().notifyWinner(winner);
            } else if (!board.existLegalMoves()) {
                board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
            }
        }
    }
}
