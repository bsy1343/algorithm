# [Gold III] Cartões - 13637

[문제 링크](https://www.acmicpc.net/problem/13637)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 9, 맞힌 사람: 9, 정답 비율: 28.125%

### 분류

다이나믹 프로그래밍, 게임 이론

### 문제 설명

<p>Dois jogadores, Alberto e Wanderley, disputam um jogo. Um conjunto com um n&uacute;mero par de cart&otilde;es contendo n&uacute;meros inteiros &eacute; disposto sobre uma mesa, um ao lado do outro, formando uma sequ&ecirc;ncia. Alberto come&ccedil;a, e pode pegar um dos dois cart&otilde;es das pontas. Wanderley ent&atilde;o pode pegar um dos dois cart&otilde;es das pontas e novamente Alberto pode pegar um cart&atilde;o das pontas, e assim por diante, at&eacute; Wanderley pegar o &uacute;ltimo cart&atilde;o.</p>

<p>Alberto, o primeiro a jogar, tem como objetivo maximizar o n&uacute;mero total de pontos que ele consegue, somando os valores dos cart&otilde;es escolhidos. Wanderley, o segundo jogador, quer atrapalhar o Alberto e fazer com que ele consiga o menor n&uacute;mero de pontos poss&iacute;vel. Em suma, ambos querem fazer o melhor poss&iacute;vel, Alberto querendo maximizar sua soma e Wanderley querendo minimizar a soma de Alberto.</p>

<p>Voc&ecirc; deve escrever um programa que, dada a sequ&ecirc;ncia de cart&otilde;es, determine o maior n&uacute;mero de pontos que Alberto consegue obter.</p>

### 입력

<p>Cada caso de teste &eacute; descrito em duas linhas. A primeira linha cont&eacute;m um inteiro, N, que indica o n&uacute;mero de cart&otilde;es sobre a mesa. A segunda cont&eacute;m N inteiros, que descrevem a sequ&ecirc;ncia de cart&otilde;es.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>2 &le; N &le; 10<sup>4</sup></li>
	<li>N &eacute; par</li>
	<li>cada um dos N inteiros pode ser representado com 32 bits.</li>
</ul>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma &uacute;nica linha, contendo um &uacute;nico inteiro, o maior n&uacute;mero de pontos que Alberto consegue obter.</p>