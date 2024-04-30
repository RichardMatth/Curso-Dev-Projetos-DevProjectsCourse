<h3>Curso de lógica: Fundação Bradesco</h3>


<h3>Estruturas de Seleção</h3>

<p>
As estruturas de seleção são usadas para que sejam estabelecidos caminhos diferentes de instruções, a serem percorridos a partir de tomadas de decisão. Justamente por isso, esses recursos podem ser chamados de estruturas de seleção ou estruturas de decisão.
</p>

<h5>Simples (if):</h5> 
<p>
 A estrutura de seleção simples faz uso da instrução SE (IF). Ela é utilizada quando queremos testar uma condição<br> antes de executarmos uma ou mais instruções.

Nessa estrutura, somente teremos uma ação SE o resultado da condição for verdadeiro. Desse modo, não há ação a ser<br> executada caso o resultado seja falso.
 se, então, fim se (usado para testar uma única condição)</p>

```
1 - verifica a condição:

2 - se a esposta for SIM:
Execurta o comando-A
Execurta o comando-B
Execurta o comando-X

3 - Se a resposta for NÃO:
Execurta o comando-B
Execurta o comando-X
(Não executa o comando-a)
```

<h5>Composta:</h5>
<p><b>SE, ENTÃO, SENÃO e FIM SE</b></p>

```
1 - Verifica a condição:

2 - Se resposta for SIM:
Executa o comando-A
Executa o comando-X
(não executa o comando-B)

3 - Se resposta for NÃO:
Executa o comando-B
Executa o comando-X
(não executa o comando-A)
```


<h5>Múltipla:</h5>
<p>
Utilizando recurso "Se" de forma encadeada (um dentro do outro)<br>
Marcadores: <b>SE, ENTÃO, SENÃO e FIM SE</b>
 <br>
Utilizando recurso "Faça Caso"<br>
Marcadores: <b>FAÇA CASO, CASO, OUTRO CASO, FIM CASO</b>
</p>

<p>
 Uso: Empregados em situações em que se faz necessário testar várias vezes a condição/variável.
</p>

```
1 - Verifica a condição 1

2 - se a resposta for sim:
Executa o comando-A
Executa o comando-X
(não executa o comando-B e comando-C)

3 - Se a reposta for não:
 
4 - Verifica a condição 2:

5 - Se a resposta for sim:
Executa o comando-B
Executa o comando-X
(não executa o comando-A e comando-C)

6 - Se a resposta for não:

7 - Verifica a condição 3:

8 - Se a resposta for sim:
Executa o comando-C
Executa o comando-X
(não executa o comando-b e comando-a)

9 - Se a resposta for não:
Executa o comando-X
(não executa o comando-a, comando-b e comando-c)

finalizaçãodo aninhamento
```

<br><h3>Exemplo de estrutura de seleção simples</h3>

```
Algoritmo situacaoAluno
var

n1, n2, media: real

nome: literal
 n1 = 0
 n2 = 0
 media = 0

INICIO
Escreva "Informe a primeira nota:"
Leia N1
Escreva "informe a segunda nota:"
Leia N2
Escreva "informe o nome do(a) aluno(a):"
Leia Nome
Media = (n1+n2) /2
Escreva nome, n1, n2, media
se media <6 então
escreva "aluno(a) reprovado(a)"  
fim se
fim
```

<p>Identificando:
SE <CONDIÇÃO> ENTÃO
	Comandos a serem executados somente se a condição for verdadeira
FIM SE
</p>



<br<br><h5>Exemplos de pseudocódigo em portugol</h5>

<b>Exemplo 1:</b>

```
Algoritmo Saque_dinheiro_caixa_eletronico
// rotina para sacar dinheiro em um caixa eletrônico
    Var
    VALOR_SAQUE, SALDO: real
    SENHA_SAQUE, NUM_AGENCIA, NUN_CONTA: inteiro
        VALOR_SAQUE = 0
        SENHA_SAQUE = 0
        NUN_CONTA = 0
Início
    Escreva "Seja bem-vindo!"
    Escreva "Informe o número da sua agência:"
    Leia NUM_AGENCIA
    Escreva "Informe o número da sua conta:"
    Leia NUN_CONTA
// após ler os dados, o sistema deverá trazer do banco de dados o valor do saldo do usuário na variável SALDO
    Escreva "Informe o valor que você do saque:"
    Leia VALOR_SAQUE
    Se VALOR_SAQUE> 0 e VALOR_SAQUE<= SALDO Então
        SALDO = SALDO - VALOR_SAQUE
        Escreva "Saque efetuado com sucesso. Seu saldo atual é R$:"
        Escreva SALDO
// após apresentar o novo saldo o sistema deve fazer a cntagem das notas e disponibilizar a quantia sacada ao usuário
        Escreva "Retire o cartão, o dinheiro e o comprovante de saque."
    Senão
        Escreva "Saldo insuficiente. Não será possível realizar a operação."
    Fim Se
Fim
```



