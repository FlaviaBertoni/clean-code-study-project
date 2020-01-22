package br.com.cleancode.capitulo2;

public class Exercicio3Refactor {

  public static void copyChars(char source[], char destination[]) {
    for (int i = 0; i < source.length; i++) {
      destination[i] = source[i];
    }
  }
  
}