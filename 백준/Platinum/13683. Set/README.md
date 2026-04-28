# [Platinum III] Set - 13683

[문제 링크](https://www.acmicpc.net/problem/13683)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 5, 맞힌 사람: 3, 정답 비율: 30.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Set &eacute; um jogo jogado com um baralho no qual cada carta pode ter uma, duas ou tr&ecirc;s figuras. Todas as figuras em uma carta s&atilde;o iguais, e podem ser c&iacute;rculos, quadrados ou tri&acirc;ngulos.</p>

<p>Um set &eacute; um conjunto de tr&ecirc;s cartas em que, para cada caracter&iacute;stica (n&uacute;mero e figura), ou as tr&ecirc;s cartas s&atilde;o iguais, ou as tr&ecirc;s cartas s&atilde;o diferentes. Por exemplo, na figura abaixo, (a) &eacute; um set v&aacute;lido, j&aacute; que todas as cartas t&ecirc;m o mesmo tipo de figura e todas elas t&ecirc;m n&uacute;meros diferentes de figuras.</p>

<p>Em (b), tanto as figuras quanto os numeros s&atilde;o diferentes para cada carta. Por outro lado, (c) n&atilde;o &eacute; um set, j&aacute; que as duas ultimas cartas t&ecirc;m a mesma figura, mas esta &eacute; diferente da figura da primeira carta.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13683.%E2%80%85Set/32365052.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13683/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%207.55.16.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:149px; width:350px" /></p>

<p>O objetivo do jogo &eacute; formar o maior n&uacute;mero de sets com as cartas que est&atilde;o na mesa; cada vez que um set &eacute; formado, as tr&ecirc;s cartas correspondentes s&atilde;o removidas de jogo.</p>

<p>Quando h&aacute; poucas cartas na mesa, &eacute; f&aacute;cil determinar o maior n&uacute;mero de sets que podem ser formados; no entanto, quando h&aacute; muitas cartas h&aacute; muitas combina&ccedil;&otilde;es poss&iacute;veis. Seu colega quer treinar para o campeonato mundial de Set, e por isso pediu que voc&ecirc; fizesse um programa que calcula o maior n&uacute;mero de sets que podem ser formados com um determinado conjunto de cartas.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de cada caso de teste cont&eacute;m um inteiro N (3 &le; N &le; 3 &times; 10<sup>4</sup>), indicando o n&uacute;mero de cartas na mesa; cada uma das N linhas seguintes cont&eacute;m a descri&ccedil;&atilde;o de uma carta.</p>

<p>A descri&ccedil;&atilde;o de uma carta &eacute; dada por duas palavras separadas por um espa&ccedil;o; a primeira, &ldquo;um&rdquo;, &ldquo;dois&rdquo; ou &ldquo;tres&rdquo;, indica quantas figuras aquela carta possui. A segunda, &ldquo;circulo&rdquo; (ou &ldquo;circulos&rdquo;), &ldquo;quadrado&rdquo; (ou &ldquo;quadrados&rdquo;) ou &ldquo;triangulo&rdquo; (ou &ldquo;triangulos&rdquo;) indica qual tipo de figura est&aacute; naquela carta.</p>

<p>O final da entrada &eacute; indicado por uma linha contendo um zero.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha na sa&iacute;da, contendo um n&uacute;mero inteiro, indicando o maior n&uacute;mero de sets que podem ser formados com as cartas dadas.</p>