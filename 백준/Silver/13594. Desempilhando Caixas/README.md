# [Silver IV] Desempilhando Caixas - 13594

[문제 링크](https://www.acmicpc.net/problem/13594)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 25, 맞힌 사람: 22, 정답 비율: 34.921%

### 분류

애드 혹, 구현

### 문제 설명

<p>Jo&atilde;ozinho e sua fam&iacute;lia acabaram de se mudar. Antes da mudan&ccedil;a, ele colocou todos os seus livros dentro de v&aacute;rias caixas numeradas. Para facilitar a retirada dos livros, ele fez um invent&aacute;rio, indicando em qual caixa cada livro foi colocado, e o guardou na caixa de n&uacute;mero 1.</p>

<p>Chegando no seu novo quarto, ele viu que seus pais guardaram as caixas em v&aacute;rias pilhas, arrumadas em fila, com cada pilha encostada na pilha seguinte.</p>

<p>Jo&atilde;ozinho &eacute; um garoto muito sistem&aacute;tico. Por isso, antes de abrir qualquer outra caixa, ele quer recuperar seu invent&aacute;rio. Jo&atilde;ozinho tamb&eacute;m &eacute; um garoto muito desajeitado. Para tirar uma caixa de uma pilha, ele precisa que a caixa esteja no topo da pilha e que ao menos um de seus lados, n&atilde;o importa qual, esteja livre (isto &eacute;, n&atilde;o tenham nenhuma caixa adjacente).</p>

<p>Para isso, Jo&atilde;ozinho precisa desempilhar algumas das caixas. Como o quarto dele &eacute; bem grande, ele sempre tem espa&ccedil;o para colocar as caixas retiradas em outro lugar, sem mexer nas pilhas que os pais dele montaram.</p>

<p>Para minimizar seu esfor&ccedil;o, Jo&atilde;ozinho quer que voc&ecirc; escreva um programa que, dadas as posi&ccedil;&otilde;es das caixas nas pilhas, determine quantas caixas Jo&atilde;ozinho precisa desempilhar para recuperar seu invent&aacute;rio.</p>

### 입력

<p>A entrada &eacute; composta de v&aacute;rios casos de teste. A primeira linha de cada caso de teste cont&eacute;m dois n&uacute;meros inteiros&nbsp;N&nbsp;e&nbsp;P&nbsp;, indicando, respectivamente, o n&uacute;mero de caixas e o n&uacute;mero de pilhas (1 &le;&nbsp;P&nbsp;&le;&nbsp;N&nbsp;&le; 1.000). As caixas s&atilde;o numeradas seq&uuml;encialmente de 1 a&nbsp;N.</p>

<p>Cada uma das&nbsp;P&nbsp;linhas seguintes descreve uma pilha. Cada linha cont&eacute;m um inteiro Q<sub>i</sub>, indicando quantas caixas h&aacute; na pilha i, seguido de um espa&ccedil;o em branco, seguido de uma lista de Q<sub>i</sub> n&uacute;meros, que s&atilde;o os identificadores das caixas. Os elementos da lista s&atilde;o separados por um espa&ccedil;o em branco.</p>

<p>Todas as pilhas cont&ecirc;m pelo menos uma caixa, e todas as caixas aparecem exatamente uma vez na entrada. As caixas em cada pilha s&atilde;o listadas em ordem, da base at&eacute; o topo da pilha. Todas as caixas t&ecirc;m o mesmo formato.</p>

<p>O final da entrada &eacute; indicado por&nbsp;N&nbsp;=&nbsp;P&nbsp;= 0.</p>

### 출력

<p>Para cada caso de teste da entrada, seu programa deve imprimir uma &uacute;nica linha, contendo um &uacute;nico inteiro: o n&uacute;mero m&iacute;nimo de caixas, al&eacute;m da caixa 1, que Jo&atilde;ozinho precisa desempilhar para recuperar o seu invent&aacute;rio.</p>