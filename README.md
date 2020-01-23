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

> Se pessoas novas precisam pedir para explicar o significado dos nomes é um forte indício que são nomes de baixa qualidade, seria mais simples e barato usar palavras que já existem na língua
 
- Exercício 4:
[Original](/src/br/com/cleancode/capitulo2/Exercicio4.java) -
[Refatorado](/src/br/com/cleancode/capitulo2/Exercicio4Refactor.java)

**Use nomes passíveis de busca**

> Escrever nomes pensando em como o buscaria

- Exercício 5:
[Original](/src/br/com/cleancode/capitulo2/Exercicio5.java) -
[Refatorado](/src/br/com/cleancode/capitulo2/Exercicio5Refactor.java)

**Evite codificações**

> "Codificar informações do escopo ou tipos em nomes simplesmente adiciona uma tarefa extra de decodificação... É uma sobrecarga mental desnecessária ao tentar resolver um problema."

**Evite o mapeamento mental**

Evitar que as pessoas tenham que fazer traduções mentais de nomes escolhidos para os conhecidos.

> Usar termo de domínio do problema e da solução.

> "*Clareza é fundamental*. Os profissionais usam seus poderes para o bem e escrevem códigos que outros possam entender."

**Nomes de classes**

Classes e objetos devem ter nomes com substantivo(s), evitar palavras que podem ser tanto substantivo quanto verbo, exemplo: Manager.

**Nomes de métodos**

Devem ser verbos.

Padrão javabean `get`, `set` e `is` + valor

Usar factory methods estáticos com nomes que descrevem os pârametros quando os construtores da classe estiverem sobrecarregados. Para forçar o uso da factory deixar os contrutores correspondentes como privados.

``` 
Complex fulcrumPoint = Complex.FromRealNumber(23.0); 

// Melhor que:

Complex fulcrumPoint = new Complex(23.0);

``` 

