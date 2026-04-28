# [Gold IV] Baralho Embaralhado - 13611

[문제 링크](https://www.acmicpc.net/problem/13611)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 45, 맞힌 사람: 32, 정답 비율: 94.118%

### 분류

수학, 정수론, 순열 사이클 분할

### 문제 설명

<p>Um baralho cont&eacute;m um n&uacute;mero par 2n de cartas a<sub>1</sub>, a<sub>2</sub>,..., a<sub>2n</sub>, todas distintas (a<sub>1</sub> &lt; a<sub>2</sub> ... &lt; a<sub>2n</sub>). O baralho encontra-se perfeitamente ordenado, ou seja, a primeira carta &eacute; a<sub>1</sub>, a segunda carta &eacute; a<sub>2</sub>, e assim por diante, at&eacute; a &uacute;ltima carta, que &eacute; a<sub>2n</sub>.</p>

<p>Um croupier ent&atilde;o executa repetidamente um procedimento de embaralhar, que consiste de dois passos:</p>

<ol>
	<li>O baralho &eacute; divido ao meio;</li>
	<li>As cartas das duas metades s&atilde;o ent&atilde;o intercaladas, de maneira que se a sequ&ecirc;ncia de cartas do baralho no in&iacute;cio do passo 1 &eacute; x<sub>1</sub>, x<sub>2</sub>, ..., x<sub>2n</sub>, ent&atilde;o ao final do passo 2 a sequ&ecirc;ncia de cartas se torna x<sub>n+1</sub>, x<sub>1</sub>, x<sub>n+2</sub>, x<sub>2</sub>,..., x<sub>2n</sub>, x<sub>n</sub>.</li>
</ol>

<p>Dado o n&uacute;mero de cartas do baralho, escreva um programa que determine quantas vezes o procedimento de embaralhar descrito acima deve ser re petido de forma que o baralho volte a ficar ordenado.</p>

### 입력

<p>A &uacute;nica linha da entrada cont&eacute;m um inteiro par P (2 &le; P &le; 2 x 10<sup>5</sup> ), indicando o n&uacute;mero de cartas do baralho (note que o valor P corresponde ao valor 2n na descri&ccedil;&atilde;o acima).</p>

<p>&nbsp;</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha contendo um &uacute;nico inteiro, o n&uacute;mero m&iacute;nimo de vezes que o processo de embaralhamento deve ser repetido para que o baralho fique novamente ordenado.</p>