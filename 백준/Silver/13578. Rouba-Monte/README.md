# [Silver I] Rouba-Monte - 13578

[문제 링크](https://www.acmicpc.net/problem/13578)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 14, 맞힌 사람: 13, 정답 비율: 76.471%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Um dos jogos de cartas mais divertidos para crian&ccedil;as pequenas, pela simplicidade, &eacute; Rouba- Monte. O jogo utiliza um ou mais baralhos normais e tem regras muito simples. Cartas s&atilde;o disting&uuml;idas apenas pelo valor (&aacute;s, dois, tr&ecirc;s, . . .), ou seja, os naipes das cartas n&atilde;o s&atilde;o considerados (por exemplo, &aacute;s de paus e &aacute;s de ouro t&ecirc;m o mesmo valor).</p>

<p>Inicialmente as cartas s&atilde;o embaralhadas e colocadas em uma pilha na mesa de jogo, chamada de pilha de compra, com face voltada para baixo. Durante o jogo, cada jogador mant&eacute;m um&nbsp;<em>monte</em>&nbsp;de cartas, com face voltada para cima; em um dado momento o monte de um jogador pode conter zero ou mais cartas. No in&iacute;cio do jogo, todos os montes dos jogadores t&ecirc;m zero cartas. Ao lado da pilha de compras encontra-se uma &aacute;rea denomindada de&nbsp;<em>&aacute;rea de descarte</em>, inicialmente vazia, e todas as cartas colocadas na &aacute;rea de descarte s&atilde;o colocadas lado a lado com a face para cima (ou seja, n&atilde;o s&atilde;o empilhadas).</p>

<p>Os jogadores, dispostos em um c&iacute;rculo ao redor da mesa de jogo, jogam em sequ&ecirc;ncia, em sentido hor&aacute;rio. As jogadas prosseguem da seguinte forma:</p>

<ul>
	<li>O jogador que tem a vez de jogar retira a carta de cima da pilha de compras e a mostra aos outros jogadores; vamos chamar essa carta de&nbsp;<em>carta da vez</em>.</li>
	<li>Se a carta da vez for igual a alguma carta presente na &aacute;rea de descarte, o jogador retira essa carta da &aacute;rea de descarte colocando-a, juntamente com a carta da vez, no topo de seu monte, com as faces voltada para cima, e continua a jogada (ou seja, retira outra carta da pilha de compras e repete o processo).</li>
	<li>Se a carta da vez for igual &agrave; carta de cima de um monte de um outro jogador, o jogador &quot;rouba&quot; esse monte, empilhando-o em seu pr&oacute;prio monte, coloca a carta da vez no topo do seu monte, face para cima, e continua a jogada.</li>
	<li>Se a carta da vez for igual &agrave; carta no topo de seu pr&oacute;prio monte, o jogador coloca a carta da vez no topo de seu pr&oacute;prio monte, com a face para cima, e continua a jogada.</li>
	<li>Se a carta da vez for diferente das cartas da &aacute;rea de descarte e das cartas nos topos dos montes, o jogador a coloca na &aacute;rea de descarte, face para cima, e a jogada se encerra (ou seja, o pr&oacute;ximo jogador efetua a sua jogada). Note que esse &eacute; o &uacute;nico caso em que o jogador n&atilde;o continua a jogada.</li>
</ul>

<p>O jogo termina quando n&atilde;o h&aacute; mais cartas na pilha de compras. O jogador que tiver o maior monte (o monte contendo o maior n&uacute;mero de cartas) ganha o jogo. Se houver empate, todos os jogadores com o monte contendo o maior n&uacute;mero de cartas ganham o jogo.</p>

### 입력

<p>A entrada &eacute; composta de v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m dois inteiros&nbsp;N&nbsp;e&nbsp;J, representando respectivamente o n&uacute;mero de cartas no baralho&nbsp;(2 &le; N &le; 10.000)&nbsp;e o n&uacute;mero de jogadores&nbsp;(2 &le; J &le; 20 e J &le; N). As cartas do baralho s&atilde;o representadas por n&uacute;meros inteiros de&nbsp;1&nbsp;a&nbsp;13e os jogadores s&atilde;o identificados por inteiros de&nbsp;1&nbsp;a&nbsp;J. O primeiro jogador a jogar &eacute; o de n&uacute;mero&nbsp;1, seguido no jogador de n&uacute;mero&nbsp;2, . . ., seguido pelo jogador de n&uacute;mero&nbsp;J, seguido pelo jogador de n&uacute;mero&nbsp;1, seguido do jogador de n&uacute;mero&nbsp;2, e assim por diante enquanto houver cartas na pilha de compras. A segunda linha de um caso de teste cont&eacute;m&nbsp;N&nbsp;inteiros entre&nbsp;1&nbsp;e&nbsp;13, separados por um espa&ccedil;o em branco, representando as cartas na pilha de compras. As cartas s&atilde;o retiradas da pilha de compras na ordem em que aparecem na entrada. O final da entrada &eacute; indicado por uma linha com&nbsp;N = J = 0.</p>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma linha, contendo o n&uacute;mero de cartas do monte do jogador ou jogadores que ganharam a partida, seguido de um espa&ccedil;o em branco, seguido do(s) identificador(es) dos jogadores que ganharam a partida. Se h&aacute; mais de um jogador vencedor imprima os identificadores dos jogadores em ordem crescente, separados por um espa&ccedil;o em branco.</p>