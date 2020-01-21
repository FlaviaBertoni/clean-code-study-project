package br.com.cleancode.capitulo2;

public class Exercicio3 {

  public static void copyChars(char a1[], char a2[]) {
    for (int i = 0; i < a1.length; i++) {
      a2[i] = a1[i];
    }
  }
}