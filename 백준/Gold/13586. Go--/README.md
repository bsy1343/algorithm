# [Gold V] Go-- - 13586

[문제 링크](https://www.acmicpc.net/problem/13586)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 43, 맞힌 사람: 38, 정답 비율: 97.436%

### 분류

브루트포스 알고리즘, 누적 합

### 문제 설명

<p style="text-align:justify">Go-- &eacute; at&eacute; parecido com o tradicional jogo de Go, mas &eacute; bem mais f&aacute;cil! Ele &eacute; jogado em um tabuleiro quadrado de dimens&atilde;o&nbsp;<strong>N</strong>, inicialmente vazio, no qual dois jogadores, um jogando com as pedras pretas e o outro com as brancas, se alternam colocando uma pedra por vez dentro de qualquer c&eacute;lula que ainda n&atilde;o esteja ocupada. A partida termina depois que cada jogador colocou&nbsp;<strong>P</strong>&nbsp;pedras no tabuleiro. Considere todas as poss&iacute;veis sub-&aacute;reas quadradas de dimens&atilde;o de 1 a&nbsp;<strong>N</strong>. Uma sub-&aacute;rea pertence ao jogador que joga com as pedras pretas se ela cont&eacute;m pelo menos uma pedra preta e nenhuma pedra branca. Da mesma forma, uma sub-&aacute;rea quadrada pertence ao jogador que joga com as pedras brancas se cont&eacute;m ao menos uma pedra branca e nenhuma pedra preta. Note que as &aacute;reas que n&atilde;o contenham nenhuma pedra, ou que contenham tanto pedras pretas quanto brancas, n&atilde;o pertencem a nenhum jogador.</p>

<p style="text-align:justify"><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13586/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%205.55.43.png" style="height:131px; width:130px" /></p>

<p style="text-align:justify">Neste problema, dada a posi&ccedil;&atilde;o final do tabuleiro, seu programa deve computar quantas sub-&aacute;reas quadradas pertencem a cada jogador, para descobrir quem ganhou a partida. Na figura, as pretas possuem 12 sub-&aacute;reas (cinco de dimens&atilde;o 1, seis de dimens&atilde;o 2 e uma de dimens&atilde;o 3). As brancas, que perderam a partida, possuem apenas 10.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros N e P, representando, respectivamente, a dimens&atilde;o do tabuleiro e o n&uacute;mero de pedras que cada jogador coloca. Cada uma das P linhas seguintes cont&eacute;m dois inteiros L e C definindo as coordenadas (linha, coluna) das pedras pretas. Depois, cada uma das pr&oacute;ximas P linhas cont&eacute;m dois inteiros L e C definindo as coordenadas (linha, coluna) das pedras brancas. Todas as pedras s&atilde;o colocadas em c&eacute;lulas distintas.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>2 &le; N &le; 500</li>
	<li>2 &le; P &le; 500</li>
	<li>P &le; N/2</li>
	<li>0 &le; L,C &le; N</li>
</ul>

### 출력

<p>Imprima uma linha contendo dois inteiros separados por um espa&ccedil;o: quantas &aacute;reas distintas pertencentes &agrave;s pretas e &agrave;s brancas.</p>