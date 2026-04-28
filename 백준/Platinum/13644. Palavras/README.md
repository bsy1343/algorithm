# [Platinum V] Palavras - 13644

[문제 링크](https://www.acmicpc.net/problem/13644)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 6, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Dados dois conjuntos de palavras formadas por zeros e uns, voc&ecirc; deve escrever um programa para determinar se existem concatena&ccedil;&otilde;es de palavras de cada um dos conjuntos que gerem uma mesma palavra. Por exemplo, se um conjunto A cont&eacute;m as palavras 010 e 11 e outro conjunto B cont&eacute;m as palavras 0 e 101, ent&atilde;o a palavra 01011010 pode ser formada tanto por contatena&ccedil;&otilde;es de palavras de A como por contatena&ccedil;&otilde;es de palavras de B:</p>

<pre style="text-align:center">
010 &middot; 11 &middot; 010 = 01011010 = 0 &middot; 101 &middot; 101 &middot; 0</pre>

### 입력

<p>A primeira linha de um caso de teste cont&eacute;m dois inteiros, N<sub>1</sub> e N<sub>2</sub>, que indicam respectivamente o n&uacute;mero de palavras do primeiro e do segundo conjunto de palavras. Cada uma das N<sub>1</sub> linhas seguintes cont&eacute;m uma palavra do primeiro conjunto. Cada uma das N<sub>2</sub> linhas seguintes cont&eacute;m uma palavra do segundo conjunto.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>1 &le; N<sub>1</sub>, N<sub>2</sub> &le; 20</li>
	<li>cada palavra tem no m&iacute;nimo um caractere e no m&aacute;ximo 40 caracteres, todos zeros e uns.</li>
</ul>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma &uacute;nica linha, contendo um &uacute;nico caractere. Se for possivel encontrar uma concatena&ccedil;&atilde;o de uma ou mais palavras do primeiro conjunto que seja igual a uma concatena&ccedil;&atilde;o de uma ou mais palavras do segundo conjunto ent&atilde;o o caractere deve ser S, caso contr&aacute;rio deve ser N.</p>