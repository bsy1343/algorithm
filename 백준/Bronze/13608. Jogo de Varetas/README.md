# [Bronze I] Jogo de Varetas - 13608

[문제 링크](https://www.acmicpc.net/problem/13608)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 100, 맞힌 사람: 86, 정답 비율: 92.473%

### 분류

구현, 그리디 알고리즘

### 문제 설명

<p>H&aacute; muitos jogos divertidos que usam pequenas varetas coloridas. A variante usada neste problema envolve a constru&ccedil;&atilde;o de ret&acirc;ngulos. O jogo consiste em, dado um conjunto de varetas de comprimentos variados, desenhar ret&acirc;ngulos no ch&atilde;o, utilizando as varetas como lados dos ret&acirc;ngulos, sendo que cada vareta pode ser utilizada em apenas um ret&acirc;ngulo, e cada lado de um ret&acirc;ngulo &eacute; formado por uma &uacute;nica vareta. Nesse jogo, duas crian&ccedil;as recebem dois conjuntos iguais de varetas. Ganha o jogo a crian&ccedil;a que desenhar o maior n&uacute;mero de ret&acirc;ngulos com o conjunto de varetas.</p>

<p>Dado um conjunto de varetas de comprimentos inteiros, voc&ecirc; deve escrever um programa para determinar o maior n&uacute;mero de ret&acirc;ngulos que &eacute; poss&iacute;vel desenhar.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m um inteiro&nbsp;N&nbsp;que indica o n&uacute;mero de diferentes comprimentos de varetas (1 &le;&nbsp;N&nbsp;&le; 1.000) no conjunto. Cada uma das&nbsp;N&nbsp;linhas seguintes cont&eacute;m dois n&uacute;meros inteiros&nbsp;C<sub>i</sub>&nbsp;e&nbsp;V<sub>i</sub>&nbsp;, representando respectivamente um comprimento (1 &le;&nbsp;C<sub>i</sub>&nbsp;&le; 10.000) e o n&uacute;mero de varetas com esse comprimento (1 &le;&nbsp;V<sub>i</sub>&nbsp;&le; 1.000). Cada comprimento de vareta aparece no m&aacute;ximo uma vez em um conjunto de teste (ou seja, os valores&nbsp;C<sub>i</sub>&nbsp;s&atilde;o distintos). O ﬁnal da entrada &eacute; indicado por&nbsp;N&nbsp;= 0.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve produzir uma &uacute;nica linha na sa&iacute;da, contendo um n&uacute;mero inteiro, indicando o n&uacute;mero m&aacute;ximo de ret&acirc;ngulos que podem ser formados com o conjunto de varetas dado.</p>