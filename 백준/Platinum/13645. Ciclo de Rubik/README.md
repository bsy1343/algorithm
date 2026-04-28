# [Platinum IV] Ciclo de Rubik - 13645

[문제 링크](https://www.acmicpc.net/problem/13645)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 18, 맞힌 사람: 13, 정답 비율: 86.667%

### 분류

수학, 구현, 시뮬레이션

### 문제 설명

<p>Provavelmente todos conhecem o Cubo de Rubik, um passatempo 3-D desafiador, que tem cada uma das seis faces cobertas com nove etiquetas, cada etiqueta de uma cor (azul, amarelo, laranja, branco, verde e vermelho). No estado inicial, todas as nove etiquetas de uma face t&ecirc;m a mesma cor. Um mecanismo engenhoso permite que cada face seja rotacionada independentemente, fazendo com que as cores das etiquetas nas faces possam ser misturadas.</p>

<p>Cada uma das faces do Cubo de Rubik &eacute; denotada por uma letra: F, B, U, D, L, e R, como ilustrado na figura abaixo.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13645/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%209.38.48.png" style="height:207px; width:219px" /></p>

<p>A rota&ccedil;&atilde;o de uma face &eacute; denominada de um movimento. Para descrever os movimentos utilizamos as letras identificadoras das faces:</p>

<ul>
	<li>uma letra mai&uacute;scula representa um giro de 90<sup>o</sup> no sentido hor&aacute;rio da face correspondente;</li>
	<li>uma letra min&uacute;scula representa um giro de 90<sup>o</sup> no sentido anti-hor&aacute;rio da face correspondente.</li>
</ul>

<p>Por exemplo, F representa um giro de 90<sup>o</sup> no sentido hor&aacute;rio da face F; r representa um giro de 90<sup>o</sup> no sentido anti-hor&aacute;rio da face R. Uma sequ&ecirc;ncia de movimentos &eacute; denotada por uma sequ&ecirc;ncia de letras identificadoras de faces. Assim, rDF representa um giro de 90<sup>o</sup> no sentido anti-hor&aacute;rio da face R, seguido de um giro de 90<sup>o</sup> no sentido hor&aacute;rio da face D, seguido de um giro de 90<sup>o</sup> no sentido hor&aacute;rio da face F.</p>

<p>Uma propriedade interessante do Cubo de Rubik &eacute; que qualquer sequ&ecirc;ncia de movimentos, se aplicada repetidas vezes, faz com que o cubo retorne ao estado original (estado que tinha antes da primeira aplica&ccedil;&atilde;o da sequ&ecirc;ncia). Por exemplo, ap&oacute;s quatro aplica&ccedil;&otilde;es da sequ&ecirc;ncia B o cubo retorna ao estado original.</p>

<p>Voc&ecirc; deve escrever um programa que, dada uma sequ&ecirc;ncia de movimentos, determine o menor n&uacute;mero de aplica&ccedil;&otilde;es completas dessa sequ&ecirc;ncia para que o cubo retorne ao seu estado original.</p>

### 입력

<p>Cada caso de teste &eacute; descrito em uma &uacute;nica linha, que cont&eacute;m a sequ&ecirc;ncia de movimentos.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>Cada sequ&ecirc;ncia tem no m&iacute;nimo um movimento e no m&aacute;ximo 80 movimentos.</li>
</ul>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma &uacute;nica linha, contendo um &uacute;nico inteiro, indicando o menor n&uacute;mero de aplica&ccedil;&otilde;es completas da sequ&ecirc;ncia para que o cubo retorne ao seu estado original.</p>