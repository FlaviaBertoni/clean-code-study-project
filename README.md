# clean-code-study-project
Projeto com o intuito de estudo para praticar os exercícios / exemplos sugeridos no livro Clean Code (Código Limpo) e fazer anotações.

## Capítulo 1 - Código Limpo

## Capítulo 2 - Nomes Significativos

**Use nomes que revelem seu propósito**

O nome de uma váriavel deve dizer seu propósito (porque ela existe)

> Se requer um comentário, então o nome não revela seu propósito
 
- Exercício 1: 
[Original](/src/br/com/cleancode/capitulo2/Exercicio1.java) -
[Refatorado](/src/br/com/cleancode/capitulo2/Exercicio1Refactor.java)

 Para entender o código do exercício 2 tenho que saber:
 
 * O que está na theList - *tabuleiro do campo minado*
 * Para que serve a posição 0 da lista - *valor do status de uma célula no tabuleiro*
 * O que significa o valor 4 - *diz se a célula está marcada com uma bandeirinha*
 * Para que eu usaria a lista retornada - *obter a lista de células que estão marcadas com a bandeirinha, para verificar se o jogador já marcou todas as bombas e ganhou, por exemplo*


> Contexto implícito dificulta o entendimento do código

- Exercício 2:
[Original](/src/br/com/cleancode/capitulo2/Exercicio2.java) -
[Refatorado](/src/br/com/cleancode/capitulo2/Exercicio2Refactor.java)


**Evite informações erradas**

Letras e nomes que podem confundir devem ser evitadas, como o número "1" e a letra "l" ou o número "0" e a letra "O" (uma solução mais simples que mudança de fonte seria simplemeste renomear as variáveis) ou palavras muito parecidas ou que tenham outros significados.

**Faça distinções significativas**
 
 Nomes sequencias (a1 .. aN) não dizem nada.
 
 Adicionar o tipo da variável no nome é redundante, exemplo: nome e nomeString, Customer e CustomerObject.
 
 Palavras comuns confundem, qual a diferença de: moneyAmount de money, customerInfo de customer, accountData de account. 
 
> A informação complementar agrega significado? Diferencia algo realmente?

- Exercício 3:
[Original](/src/br/com/cleancode/capitulo2/Exercicio3.java) -
[Refatorado](/src/br/com/cleancode/capitulo2/Exercicio3Refactor.java)

**Use nomes pronunciáveis**

 Nomes pronunciáveis são importantes para facilitar a comunicação.
 
 A variável **genymdhms** do exercicío 4 é difícil de falar *"gen ipslon eme dê agá eme esse"* e entender o significado *(generation date, year, month, day, hour, minute e second)*.

> Se pessoas novas precisam pedir para explicar o significado dos nomes é um forte indício que são nomes de baixa qualidade, seria mais simples e barato usar palavras que já existem na língua
 
- Exercício 4:
[Original](/src/br/com/cleancode/capitulo2/Exercicio4.java) -
[Refatorado](/src/br/com/cleancode/capitulo2/Exercicio4Refactor.java)

**Use nomes passíveis de busca**

> Escrever nomes pensando em como o buscaria

Se usar um número como no exemplo o "5" para os dias de trabalho na semana ao envez de WORK_DAYS_PER_WEEK, além de ser complicado saber o significado, fica difícil de encontrar no arquivo e ainda mais no projeto onde essa informação é usada claramente, o mesmo vale para letras.

- Exercício 5:
[Original](/src/br/com/cleancode/capitulo2/Exercicio5.java) -
[Refatorado](/src/br/com/cleancode/capitulo2/Exercicio5Refactor.java)