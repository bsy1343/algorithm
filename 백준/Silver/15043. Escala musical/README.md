# [Silver IV] Escala musical - 15043

[문제 링크](https://www.acmicpc.net/problem/15043)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 36, 정답: 26, 맞힌 사람: 20, 정답 비율: 66.667%

### 분류

구현, 자료 구조, 브루트포스 알고리즘, 집합과 맵

### 문제 설명

<p>As notas musicais s&atilde;o as unidades mais b&aacute;sicas da composi&cedil;c&atilde;o musical no ocidente. Muitas pessoas acreditam que existem apenas 7 notas musicais:</p>

<p style="text-align:center"><strong>d&oacute; r&eacute; mi f&aacute; sol l&aacute; si</strong></p>

<p>Chamaremos essas notas de notas elementares. Na verdade, existem notas al&eacute;m destas acima, normalmente identificadas pelo nome de uma das notas acima seguido do s&iacute;mbolo sustenido (#):</p>

<p style="text-align:center"><strong>d&oacute; d&oacute;# r&eacute; r&eacute;# mi f&aacute; f&aacute;# sol sol# l&aacute; l&aacute;# si</strong></p>

<p>Assim, existem 12 notas musicais b&aacute;sicas distintas. Entretanto, a rigor, esta sequ&ecirc;ncia &eacute; infinita e peri&oacute;dica: ap&oacute;s um &ldquo;si&rdquo; existe um outro &ldquo;d&oacute;&rdquo;, e a sequ&ecirc;ncia se repete novamente.</p>

<p>As notas elementares s&atilde;o mais conhecidas, por estarem em um tom musical conhecido como &ldquo;d&oacute; maior&rdquo;. Em qualquer tom &ldquo;maior&rdquo;, as dist&acirc;ncias entre as poss&iacute;veis notas seguem um padr&atilde;o. No tom &ldquo;d&oacute; maior&rdquo;, por exemplo:</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<th>Nota</th>
			<td>d&oacute;</td>
			<td>r&eacute;</td>
			<td>mi</td>
			<td>f&aacute;</td>
			<td>sol</td>
			<td>l&aacute;</td>
			<td>si</td>
		</tr>
		<tr>
			<th>Intervalo para a pr&oacute;xima nota</th>
			<td>2</td>
			<td>2</td>
			<td>1</td>
			<td>2</td>
			<td>2</td>
			<td>2</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>Note que eu poderia usar qualquer &ldquo;d&oacute;&rdquo; na escala de &ldquo;d&oacute; maior&rdquo;, pois a nota seguinte ao &ldquo;si&rdquo; ser&aacute;, novamente, um &ldquo;d&oacute;&rdquo;. O mesmo vale para as demais notas. Um outro exemplo de notas em um determinado tom maior seria a escala de &ldquo;d&oacute;# maior&rdquo;:</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<th>Nota</th>
			<td>d&oacute;#</td>
			<td>r&eacute;#</td>
			<td>f&aacute;</td>
			<td>f&aacute;#</td>
			<td>sol#</td>
			<td>l&aacute;#</td>
			<td>d&oacute;</td>
		</tr>
		<tr>
			<th>Intervalo para a pr&oacute;xima nota</th>
			<td>2</td>
			<td>2</td>
			<td>1</td>
			<td>2</td>
			<td>2</td>
			<td>2</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>Guilherme est&aacute; aprendendo a tocar um teclado com 61 teclas, numeradas de 1 a 61. Assim, a nota 1 corresponde a um &ldquo;d&oacute;&rdquo;, a nota 2 corresponde a um &ldquo;d&oacute; #&rdquo; e assim por diante, at&eacute; chegar nas notas 60 (um &ldquo;si&rdquo;) e 61 (um &ldquo;d&oacute;&rdquo;).</p>

<p>Acredita-se que as m&uacute;sicas com as melhores melodias s&atilde;o aquelas que est&atilde;o em algum tom maior, ou seja, m&uacute;sicas em que todas as notas pertencem &agrave; escala de algum tom maior. Enquanto pratica no teclado, Guilherme usa um aparelho que grava todas as notas tocadas durante a m&uacute;sica. Para ajud&aacute;-lo a melhorar sua t&eacute;cnica voc&ecirc; decidiu criar um programa capaz de avaliar as m&uacute;sicas gravadas por ele e determinar se elas est&atilde;o em algum tom maior ou n&atilde;o.</p>

### 입력

<p>A primeira linha da entrada ter&aacute; um n&uacute;mero inteiro N, com 1 &le; N &le; 10<sup>5</sup>, correspondente ao n&uacute;mero de notas musicais da m&uacute;sica. Em seguida, ser&atilde;o fornecidos N n&uacute;meros, um por linha, todos entre 1 e 61, inclusive, correspondendo &agrave;s notas musicais.</p>

### 출력

<p>Seu programa deve verificar se a m&uacute;sica est&aacute; em algum tom maior. Em caso afirmativo, seu programa deve imprimir uma &uacute;nica linha com o tom maior (sem acentos) em que a m&uacute;sica est&aacute;. Caso contr&aacute;rio, seu programa deve imprimir uma linha contendo a palavra desafinado. Caso a m&uacute;sica possa estar em mais de um tom maior imprima aquele relativo a menor nota musical b&aacute;sica, sendo que &ldquo;do&rdquo; &lt; &ldquo;do#&rdquo; &lt; &ldquo;re&rdquo;, . . .</p>