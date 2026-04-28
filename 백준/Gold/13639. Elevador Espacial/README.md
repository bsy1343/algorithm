# [Gold III] Elevador Espacial - 13639

[문제 링크](https://www.acmicpc.net/problem/13639)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 6, 정답 비율: 42.857%

### 분류

다이나믹 프로그래밍, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>A China est&aacute; construindo um elevador espacial, que permitir&aacute; o lan&ccedil;amento de sondas e sat&eacute;lites a um custo muito mais baixo, viabilizando n&atilde;o s&oacute; projetos de pesquisa cient&iacute;fica como o turismo espacial.</p>

<p>No entanto, os chineses s&atilde;o muito supersticiosos, e por isso t&ecirc;m um cuidado muito especial com a numera&ccedil;&atilde;o dos andares do elevador: eles n&atilde;o usam nenhum n&uacute;mero que contenha o d&iacute;gito &ldquo;4&rdquo; ou a sequ&ecirc;ncia de d&iacute;gitos &ldquo;13&rdquo;. Assim, eles n&atilde;o usam o andar 4, nem o andar 13, nem o andar 134, nem o andar 113, mas usam o andar 103. Assim, os primeiros andares s&atilde;o numerados 1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 15, 16, . . .</p>

<p>Como o elevador espacial tem muitos andares, e eles precisam numerar todos os andares do elevador, os chineses pediram que voc&ecirc; escrevesse um programa que, dado o andar, indica o n&uacute;mero que deve ser atribu&iacute;do a ele.</p>

### 입력

<p>Cada caso de teste consiste de uma &uacute;nica linha, contendo um inteiro N que indica o andar cujo n&uacute;mero deve ser determinado.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>1 &le; N &le; 10<sup>18</sup></li>
</ul>

### 출력

<p>Para cada caso de teste, imprima uma linha contendo um &uacute;nico n&uacute;mero inteiro indicando o n&uacute;mero atribu&iacute;do ao N-&eacute;simo andar.</p>