# [Platinum III] Loteria - 13606

[문제 링크](https://www.acmicpc.net/problem/13606)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 7, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

가우스 소거법, 선형대수학, 수학

### 문제 설명

<p>A loteria BWS &eacute; feita anualmente. Nela N pessoas apostam escolhendo K n&uacute;meros cada uma. De modo formal, podemos dizer que B<sub>ij</sub> &eacute; o j-&eacute;simo valor apostado pela i-&eacute;sima pessoa. Ent&atilde;o os organizadores escolhem K inteiros positivos. Os n&uacute;meros escolhidos s&atilde;o chamados de W<sub>1</sub>, W<sub>2</sub>, ..., W<sub>K</sub>.</p>

<p>Os vencedores s&atilde;o calculados da seguinte maneira:</p>

<ul>
	<li>Um subconjunto n&atilde;o vazio dos N participantes &eacute; escolhido aleatoriamente, ou seja, alguns participantes s&atilde;o escolhidos por pura sorte.</li>
	<li>Para cada pessoa neste subconjunto &eacute; calculado o valor S<sub>1</sub>, que &eacute; a soma de todos os primeiros n&uacute;meros apostados por elas, ou seja, a soma de B<sub>i1</sub>, onde i seria o &iacute;ndice de cada pessoa escolhida. Da mesma maneira os valores S<sub>2</sub>, ..., S<sub>K</sub> s&atilde;o calculados.</li>
	<li>E feito um teste de paridade entre W<sub>j</sub> e S<sub>j</sub> , ou seja, &eacute; testado se as paridades (se o n&uacute;mero &eacute; par ou &iacute;mpar) casam entre W<sub>1</sub> e S<sub>1</sub>, W<sub>2</sub> e S<sub>2</sub>, e assim por diante at&eacute; W<sub>K</sub> e S<sub>K</sub>.</li>
	<li>Se todas as paridades casam, ent&atilde;o este conjunto de pessoas &eacute; considerado vencedor!</li>
</ul>

<p>Os organizadores querem saber: &eacute; poss&iacute;vel escolher os n&uacute;meros W<sub>1</sub>, W<sub>2</sub>, ..., W<sub>K</sub> de forma que n&atilde;o exista nenhum subconjunto de participantes vencedor?</p>

### 입력

<p>A primeira linha cont&eacute;m os n&uacute;meros N (1 &le; N &le; 10<sup>4</sup>) e K (3 &le; K &le; 50), representando o n&uacute;mero de participantes e a quantidade de n&uacute;meros apostados por cada pessoa respectivamente. As pessoas apostam em inteiros maiores do que 1 e menores do que 50, inclusive. Cada uma das N linhas seguintes cont&eacute;m K n&uacute;meros, representando as apostas de cada pessoa, uma pessoa por linha.</p>

<p>&nbsp;</p>

### 출력

<p>Imprima &lsquo;S&rsquo; caso seja poss&iacute;vel ou &lsquo;N&rsquo; caso contr&aacute;rio.</p>