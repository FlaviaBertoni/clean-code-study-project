package br.com.cleancode.capitulo2;

/**
 * Distinções significativas
 *  
 * Nomes sequencias (a1 .. aN) não dizem nada.
 * 
 * Adicionar o tipo da variável no nome é redundante, exemplo: nome e nomeString, Customer e CustomerObject.
 * 
 * Palavras comuns confundem, qual a diferença de: moneyAmount de money, customerInfo de customer,
 * accountData de account. 
 * 
 * [!] O que a informação a mais diz, agrega significado, diferencia algo realmente? [!]
 */
public class Exercicio3Refactor {

  public static void copyChars(char source[], char destination[]) {
    for (int i = 0; i < source.length; i++) {
      destination[i] = source[i];
    }
  }
  
}