# [Silver II] Cubos Coloridos - 13693

[문제 링크](https://www.acmicpc.net/problem/13693)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 27, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

애드 혹, 구현, 정렬

### 문제 설명

<p>Crian&ccedil;as adoram brincar com pequenos cubos. Elas passam horas criando &lsquo;casas&rsquo;, &lsquo;pr&eacute;dios&rsquo;, etc. O irm&atilde;ozinho de Tomaz acabou de ganhar um conjunto de blocos coloridos no seu anivers&aacute;rio. Cada face de cada cubo &eacute; de uma cor.</p>

<p>Como Tomaz &eacute; uma crian&ccedil;a muito anal&iacute;tica, ele decidiu descobrir quantos &ldquo;tipos&rdquo; diferentes de cubos o seu irm&atilde;ozinho ganhou. Voc&ecirc; pode ajuda-lo? Dois cubos s&atilde;o considerados do mesmo tipo se for poss&iacute;vel rotacionar um deles de forma que as cores nas faces respectivas dos dois blocos sejam iguais.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha do caso de teste cont&eacute;m um inteiro N especificando o n&uacute;mero de cubos no conjunto (1 &le; N &le; 1000). As pr&oacute;ximas 3 x N linhas descrevem os cubos do conjunto. Na descri&ccedil;&atilde;o as cores ser&atilde;o identificadas pelos n&uacute;meros de 0 a 9. A descri&ccedil;&atilde;o de cada cubo ser&aacute; dada em tr&ecirc;s linhas mostrando as cores das seis faces do cubo &ldquo;aberto&rdquo;, no formato dado no exemplo abaixo. No exemplo abaixo, as faces do cubo tem cores de 1 a 6, a face com cor 1 est&aacute; no lado oposto da face com a cor 3, e a face com cor 2 &eacute; vizinha das faces 1, 3, 4 e 6, e est&aacute; no lado oposto da face com cor 5.</p>

<p>1<br />
2 4 5 6<br />
3</p>

<p>O final da entrada &eacute; indicado por N = 0.</p>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma linha contendo um &uacute;nico inteiro, correspondente ao numero de tipos de cubos no conjunto dado.</p>