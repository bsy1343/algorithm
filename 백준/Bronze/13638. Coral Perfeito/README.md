# [Bronze I] Coral Perfeito - 13638

[문제 링크](https://www.acmicpc.net/problem/13638)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 63, 맞힌 사람: 60, 정답 비율: 68.182%

### 분류

수학, 구현, 그리디 알고리즘, 사칙연산

### 문제 설명

<p>A Maestrina do coral est&aacute; planejando o espet&aacute;culo que apresentar&aacute; na famosa Semana Brasileira de Corais. Ela pensou em preparar uma nova m&uacute;sica, definida da seguinte maneira:</p>

<ul>
	<li>cada um dos integrantes do coral inicia cantando uma nota, e somente muda de nota quando determinado pela Maestrina;</li>
	<li>ao final de cada compasso, a Maestrina determina que exatamente dois integrantes alterem a nota que cantam: um integrante passa a cantar a nota imediatamente acima da nota que cantava, e o outro integrante passa a cantar a nota imediatamente abaixo da nota que cantava;</li>
	<li>a m&uacute;sica termina ao final do primeiro compasso em que todos os integrantes do coral cantam a mesma nota.</li>
</ul>

<p>A Maestrina j&aacute; tem v&aacute;rias ideias de como distribuir as notas no in&iacute;cio da m&uacute;sica entre os integrantes do coral, de forma a criar o efeito desejado. No entanto, ela est&aacute; preocupada em saber se, dada uma distribui&ccedil;&atilde;o de notas entre os integrantes, &eacute; poss&iacute;vel chegar ao final da m&uacute;sica da forma desejada (todos cantando a mesma nota) e, caso seja poss&iacute;vel, qual o n&uacute;mero m&iacute;nimo de compassos da m&uacute;sica. Voc&ecirc; pode ajud&aacute;-la?</p>

### 입력

<p>A primeira linha de um caso de teste cont&eacute;m um inteiro N indicando o n&uacute;mero de integrantes do coral. As notas ser&atilde;o indicadas por n&uacute;meros inteiros. A segunda linha cont&eacute;m N n&uacute;meros inteiros, indicando as notas iniciais que cada integrante deve cantar. As notas s&atilde;o dadas em ordem n&atilde;o decrescente de altura.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>2 &le; N &le; 10<sup>4</sup></li>
	<li>&minus;10<sup>5</sup> &le; notai &le; 10<sup>5</sup> para 0 &le; i &le; N &minus; 1</li>
	<li>nota<sub>i</sub> &le; nota<sub>i+1</sub> para 0 &le; i &le; N &minus; 2</li>
</ul>

### 출력

<p>Para cada caso de teste imprima uma linha contendo um &uacute;nico n&uacute;mero inteiro indicando o n&uacute;mero m&iacute;nimo de compassos que a m&uacute;sica ter&aacute;. Se n&atilde;o &eacute; poss&iacute;vel terminar a m&uacute;sica com todos os integrantes cantando a mesma nota, imprima o valor &minus;1.</p>