# [Platinum V] Combate ao câncer - 13642

[문제 링크](https://www.acmicpc.net/problem/13642)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

트리, 트리 동형 사상

### 문제 설명

<p>Pesquisadores da Funda&ccedil;&atilde;o Contra o C&acirc;ncer (FCC) anunciaram uma descoberta revolucion&aacute;ria na Qu&iacute;mica: eles descobriram como fazer &aacute;tomos de carbono ligarem-se a qualquer quantidade de outros &aacute;tomos de carbono, possibilitando a cria&ccedil;&atilde;o de mol&eacute;culas muito mais complexas do que as formadas pelo carbono tetravalente. Segundo a FCC, isso permitir&aacute; o desenvolvimento de novas drogas que poder&atilde;o ser cruciais no combate ao c&acirc;ncer.</p>

<p>Atualmente, a FCC s&oacute; consegue sintetizar mol&eacute;culas com liga&ccedil;&otilde;es simples entre os &aacute;tomos de carbono e que n&atilde;o cont&ecirc;m ciclos em suas estruturas: por exemplo, a FCC consegue sintetizar as mol&eacute;culas (a), (b) e (c) abaixo, mas n&atilde;o a mol&eacute;cula (d).</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13642.%E2%80%85Combate%E2%80%85ao%E2%80%85c%C3%A2ncer/2964c2c5.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13642.%E2%80%85Combate%E2%80%85ao%E2%80%85c%C3%A2ncer/2964c2c5.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13642/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%209.28.41.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:109px; width:615px" /></p>

<p>Devido &agrave; agita&ccedil;&atilde;o t&eacute;rmica, uma mesma mol&eacute;cula pode assumir v&aacute;rios formatos. Duas mol&eacute;culas s&atilde;o equivalentes se for poss&iacute;vel mover os &aacute;tomos de uma das mol&eacute;culas, sem romper nenhuma das liga&ccedil;&otilde;es existentes nem criar novas liga&ccedil;&otilde;es qu&iacute;micas, de forma que ela fique exatamente igual &agrave; outra mol&eacute;cula. Por exemplo, na figura acima, a mol&eacute;cula (a) n&atilde;o &eacute; equivalente &agrave; mol&eacute;cula (b), mas &eacute; equivalente &agrave; mol&eacute;cula (c).</p>

<p>Voc&ecirc; deve escrever um programa que, dadas as estruturas de duas mol&eacute;culas, determina se elas s&atilde;o equivalentes.</p>

### 입력

<p>A primeira linha de um caso de teste cont&eacute;m um inteiro N indicando o n&uacute;mero de &aacute;tomos nas duas mol&eacute;culas. Os &aacute;tomos s&atilde;o identificados por n&uacute;meros inteiros de 1 a N. Cada uma das 2N &minus; 2 linhas seguintes descreve uma liga&ccedil;&atilde;o qu&iacute;mica entre dois &aacute;tomos: as primeiras N &minus; 1 linhas descrevem as liga&ccedil;&otilde;es da primeira mol&eacute;cula; as N &minus; 1 &uacute;ltimas descrevem as liga&ccedil;&otilde;es qu&iacute;micas da segunda mol&eacute;cula. Cada linha cont&eacute;m dois inteiros A e B indicando que existe uma liga&ccedil;&atilde;o qu&iacute;mica entre os &aacute;tomos A e B.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>2 &le; N &le; 10<sup>4</sup></li>
	<li>1 &le; A, B &le; N</li>
</ul>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma &uacute;nica linha, contendo um &uacute;nico caractere: S se as mol&eacute;culas s&atilde;o equivalentes ou N caso contr&aacute;rio.</p>