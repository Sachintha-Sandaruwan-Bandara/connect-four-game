package lk.ijse.dep.service;
/*
    @author Sachi_S_Bandara
    @created 10/04/2023  - 8:10 AM
*/
public interface BoardUI {
    public void update(int col, boolean isHuman);
    public void notifyWinner(Winner winner);
}
