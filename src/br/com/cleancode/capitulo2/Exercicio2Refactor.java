package br.com.cleancode.capitulo2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2Refactor {

  public class Cell {

    private static final int STATUS = 0;
    private static final int FLAGGED_CELL = 4;

    int[] cell;

    public Boolean isFlagged() {
      return this.getStatus() == FLAGGED_CELL;
    }

    private int getStatus() {
      return this.cell[STATUS];
    }
  }

  List<Cell> gameBoard;

  public List<Cell> getFlaggedCells() {
    final List<Cell> flaggedCells = new ArrayList<Cell>();

    for (final Cell cell : gameBoard)
      if (cell.isFlagged()) 
        flaggedCells.add(cell);
    
    return flaggedCells;
  }
}