<h3>Curso de lógica: Fundação Bradesco</h3>


<h3>Estruturas de Seleção</h3>

<p>
As estruturas de seleção são usadas para que sejam estabelecidos caminhos diferentes de instruções, a serem percorridos a partir de tomadas de decisão. Justamente por isso, esses recursos podem ser chamados de estruturas de seleção ou estruturas de decisão.
</p>

<h5>Simples (if):</h5> <b>se, então, fim se (usado para testar uma única condição)</b>

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

<h5>Composta:</h5><p>SE, ENTÃO, SENÃO e FIM SE</p>

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

<b><font Color="red">Uso: Empregados em situações em que se faz necessário testar várias vezes a condição/variável.</font></b>

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



<h5>Exemplos de pseudocódigo em portugol</h5>

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



