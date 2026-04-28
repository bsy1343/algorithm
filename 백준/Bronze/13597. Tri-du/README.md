# [Bronze IV] Tri-du - 13597

[문제 링크](https://www.acmicpc.net/problem/13597)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 3522, 정답: 3180, 맞힌 사람: 2998, 정답 비율: 90.711%

### 분류

구현

### 문제 설명

<p>Tri-du &eacute; um jogo de cartas derivado do popular jogo de Truco. O jogo utiliza um baralho normal de 52 cartas, com treze cartas de cada naipe, mas os naipes s&atilde;o ignorados. Apenas o valor das cartas,considerados como inteiros de 1 a 13, s&atilde;o utilizados.</p>

<p>No jogo, cada jogador recebe tr&ecirc;s cartas. As regras s&atilde;o simples:</p>

<ul>
	<li>Um trio (tr&ecirc;s cartas de mesmo valor) ganha de uma dupla (duas cartas de mesmo valor).</li>
	<li>Um trio formado por cartas de maior valor ganha de um trio formado por cartas de menor valor.</li>
	<li>Uma dupla formada por cartas de maior valor ganha de uma dupla formada por cartas de menor valor.</li>
</ul>

<p>Note que o jogo pode n&atilde;o ter ganhador em muitas situa&ccedil;&otilde;es; nesses casos, as cartas distribu&iacute;das s&atilde;o devolvidas ao baralho, que &eacute; embaralhado e uma nova partida &eacute; iniciada</p>

<p>Um jogador j&aacute; recebeu duas das cartas que deve receber, e conhece seus valores. Sua tarefa &eacute; escrever um programa para determinar qual o valor da terceira carta que maximiza a probabilidade de esse jogador ganhar o jogo.</p>

### 입력

<p>A entrada consiste de uma &acute;unica linha que cont&eacute;m dois inteiros, A (1 &le; A &le; 13) e B (1 &le; B &le; 13) indicando os valores das duas primeiras cartas recebidas.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando o valor da carta que maximiza a probabilidade de o jogador ganhar a partida.</p>