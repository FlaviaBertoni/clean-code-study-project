package br.com.cleancode.capitulo2;

import java.util.ArrayList;
import java.util.List;

/**
 * Contexto implícito, dificulta o entendimento, para entender esse código
 * tenho que saber:
 * 
 * - O que está na theList (tabuleiro do campo minado)
 * - Para que serve a posição 0 da lista (valor do status de uma célula no tabuleiro)
 * - O que significa o valor 4 (diz se a célula está marcada com uma bandeirinha)
 * - Para que eu usaria a lista retornada (obter a lista de células que estão marcadas com a bandeirinha, 
 *   para verificar se o jogador já marcou todas as bombas e ganhou, por exemplo)
 */
public class Exercicio2Refactor {

  public class Cell {

    private static final int STATUS = 0;
    private static final int FLAGGED_CELL = 4;

    public int[] cell;

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