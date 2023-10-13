package lk.ijse.dep.service;
/*
    @author Sachi_S_Bandara
    @created 10/04/2023  - 9:20 AM
*/
public interface Board {
    public int NUM_OF_ROWS=5;
    public int NUM_OF_COLS=6;

    public BoardUI getBoardUI();
    public int findNextAvailableSpot(int col);
    public boolean isLegalMove(int col);
    public boolean existLegalMoves();
    public void updateMove(int col, Piece move);

    void updateMove(int col, int row, Piece move);

    public Winner findWinner();
}