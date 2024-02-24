### Olá! Bem-vindo(a), espero que o conteúdo presente aqui <br> possa ajudar a todos que estão buscando desenvolver habilidades em Git.

## Conceitos de Git:
<ul>
  <li>Branch: São ramificações criadas para que as alterações futuras não atrapalhem o desenvolvimento.</li>
  <li>Commit: É a ação de salvar as mudanças feitas no código.</li>
  <li>Push: Atualiza seu repositório remoto (GitHub) com as mudanças salvas no ultimo commit.</li>
  <li>Pull: Atualiza seu repositório local com o repositório remoto.</li>
  <li>Merge: Cria um novo commit na branch escolhida.</li>
  <li>Rebase: Junta os commits na branch escolhida, porém, sem precisar de um novo commit. Os commits continuam lineares, porém, a linha temporal não é mantida.</li>
  <li>Stash: Guarda modificações (wip) para continuar a trabalhar.</li>
  <li>Tags: Cria tags com nome e anotações do estado atual do projeto.</li>
  <li>Revert: Apaga modificações de um commit quando necessário, não perde do histórico as mudanças feitas.</li>
</ul>


## Principais comandos Git
<p>Clone um repositório para sua máquina(PC):</p>

```
Git clone <URL do repositório>
```
<br>

<p>Inicializa um repositório vazio:</p>

```
Git init
```
<br>

<p>Adiciona os arquivos modificados para a área de "espera", para realizar um commit:</p>

```
Git add <nome do arquivo>
```
<br>

<p>Mostra as modificações pendentes:</p>

```
Git status
```
<br>

<p>Salva as modificações feitas:</p>

```
Git commit -m "título do commit"
```
<br>

<p>Modifica o nome da branch atual:</p>

```
Git branch -m "novo nome"
```
<br>

<p>Conecta o git local com seu repositório:</p>

```
Git remote add origin <link do repositório git>
```
<br>

<p>Envia as mudanças para o repositório remoto:</p>

```
Git push origin main
```
<br>

<p>Cria uma nova branch e "entra nela":</p>

```
Git checkout -b "nome da branch"
```
<br>

<p>Realiza o merge entre a branch que o usuário está com a branch escolhida:</p>

```
Git merge <nome da branch>
```
<br>

<p>Realiza o rebase entre o branch que o usuário está e o branch escolhido:</p>

```
Git rebase <nome da branch>
```
<br>

<p>Cria atalhos para os comandos:</p>

```
Git config --alias.<atalho> <comando>
```
<br>

<p>Cria uma tag:</p>

```
Git tag -a 1.0.0 -m "versão 1 finalizada"
```
<br>

<p>Faz um revert:</p>

```
Git revert <hash do commit>
```
<br>

<p>Apaga tags ou branchs:</p>

```
git push origin --delete <nome da tag ou Branch>
```
<br>

<p>Restaura um arquivo que está na fase de <strong>Modified</strong>, antes da área de <strong>Staged</strong>:</p>

```
Git restore <nome do arquivo>
```
<br>

<p>restaura um arquivo que está na fase de <strong>Staged</strong> para a fase de <strong>Modified</strong></p>

```
Git restore --staged <nome do arquivo>
```



