package br.com.cleancode.capitulo2;

import java.util.ArrayList;
import java.util.List;

public class Exercicio2 {

  List<int[]> theList;

  public List<int[]> getThem() {
    final List<int[]> list1 = new ArrayList<int[]>();
    for (final int[] x : theList)
      if (x[0] == 4)
        list1.add(x);
    return list1;
  }
}