package br.com.cleancode.capitulo2;

import java.util.Date;

/**
 * Nomes pronunciáveis são importantes para facilitar a comunicação.
 * 
 * A variável genymdhms é difícil de falar "gen ipslon eme dê agá eme esse" e entender o significado
 * (generation date, year, month, day, hour, minute e second).
 * 
 * [!] Se pessoas novas precisam pedir para explicar o significado dos nomes é um forte indício que
 * são nomes de baixa qualidade, seria mais simples e barato usar palavras que já existem na língua [!]
 */
public class Exercicio4Refactor {

  class Customer {
    Date generationTimestamp;
    Date modificationTimestamp;
    final String recordId = "102";
  } 
  
}