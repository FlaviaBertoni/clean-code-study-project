package br.com.cleancode.capitulo2;

public class Exercicio5 {

  //...

  int sum(int[] t) {
    int s = 0;

    for (int j=0; j<34; j++) {
      s += (t[j]*4)/5;
    }

    return s;
  }
  
  //...
}