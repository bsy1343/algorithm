# [Platinum V] Integral - 13643

[문제 링크](https://www.acmicpc.net/problem/13643)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

수학, 그리디 알고리즘, 정렬, 많은 조건 분기, 미적분학

### 문제 설명

<p>Dado um inteiro positivo n, denotaremos por [n] o intervalo real {x : 0 &le; x &le; n}. Uma fun&ccedil;&atilde;o f : [n] &rArr; R &eacute; parcialmente especificada, sendo fornecidos valores de f apenas em pontos de um subconjunto S de [n].</p>

<p>O conjunto S satisfaz as seguintes propriedades:</p>

<ol>
	<li>Os pontos em S s&atilde;o todos inteiros.</li>
	<li>Os extremos 0 e n de [n] est&atilde;o ambos em S.</li>
</ol>

<p>A fun&ccedil;&atilde;o f satisfaz as seguintes propriedades:</p>

<ol>
	<li>Os valores de f nos pontos inteiros de [n] s&atilde;o inteiros.</li>
	<li>Para cada ponto inteiro x em [n] \ S (ou seja, nos pontos inteiros de [n] que n&atilde;o est&atilde;o em S), a fun&ccedil;&atilde;o f &eacute; mon&oacute;tona no intervalo [x &minus; 1, x + 1]. Em outras palavras, pelo menos uma das desigualdades f(x &minus; 1) &le; f(x) &le; f(x + 1) ou f(x &minus; 1) &ge; f(x) &ge; f(x + 1) &eacute; satisfeita.</li>
	<li>Para cada ponto n&atilde;o inteiro x em [n], o valor de f(x) &eacute; dado pela interpola&ccedil;&atilde;o linear de f(&lfloor;x&rfloor;) e f(&lceil;x&rceil;), isto &eacute;, f(x) = (x &minus; &lfloor;x&rfloor;)f(&lfloor;x&rfloor;) + (&lceil;x&rceil; &minus; x)f(&lceil;x&rceil;).</li>
</ol>

<p>Temos ainda a liberdade de especificar os valores de f nos pontos inteiros de [n]\S (note no entanto que S pode conter todos os pontos inteiros de [n]). Gostar&iacute;amos de utilizar essa flexibilidade para fazer com que &nbsp;&int;<sub>n</sub><sup>0</sup> f(x)dx = y, isto &eacute;, a &aacute;rea sob f(x) entre os extremos 0 e n seja igual a y, um valor dado.</p>

<p>Seu problema ent&atilde;o &eacute; decidir se isso &eacute; poss&iacute;vel ou n&atilde;o.</p>

### 입력

<p>A primeira linha de um caso de teste cont&eacute;m tr&ecirc;s inteiros, N, M e Y , respectivamente a amplitude do intervalo, o tamanho do conjunto S e o valor de y. Cada uma das M linhas seguintes descreve a fun&ccedil;&atilde;o em um ponto de S, contendo dois inteiros X e F, representando f(X) = F. Os valores de X n&atilde;o est&atilde;o necessariamente em ordem crescente.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>1 &le; N &le; 10<sup>6</sup></li>
	<li>0 &le; X &le; N, X inteiro, &forall;X &isin; S</li>
	<li>0 &le; F &le; 10<sup>6</sup>, F inteiro</li>
	<li>0 &le; Y &le; 10<sup>9</sup>, Y inteiro</li>
	<li>&int;<sub>n</sub><sup>0</sup> f(x)dx &le; 10<sup>9</sup> para qualquer atribui&ccedil;&atilde;o de valores a f(x) para x &isin; [n] \ S satisfazendo as restri&ccedil;&otilde;es do enunciado.</li>
</ul>

### 출력

<p>Para cada caso de teste, determine se existe atribui&ccedil;&atilde;o de valores a f(x) para os pontos inteiros x &isin; [n] \ S tal que &int;<sub>n</sub><sup>0</sup> f(x)dx = y, isto &eacute;, a &aacute;rea sob f(x) entre os extremos 0 e n seja igual a y. Em caso negativo, seu programa deve imprimir uma linha contendo apenas o caractere &lsquo;N&rsquo;. Em caso afirmativo, seu programa deve imprimir uma linha contendo o caractere &lsquo;S&rsquo;, seguido dos valores de f(x) para os pontos inteiros x &isin; [n] \ S, em ordem crescente de valores de x. O caractere inicial e os valores seguintes, se houver, devem ser separados por um espa&ccedil;o em branco. Caso mais de uma solu&ccedil;&atilde;o seja poss&iacute;vel, imprima aquela que for lexicograficamente menor.</p>