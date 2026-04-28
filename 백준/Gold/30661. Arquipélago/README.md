# [Gold III] Arquipélago - 30661

[문제 링크](https://www.acmicpc.net/problem/30661)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 10, 맞힌 사람: 5, 정답 비율: 38.462%

### 분류

백트래킹, 구현, 재귀

### 문제 설명

<p>Voc&ecirc; foi encarregado de dispor os navios da frota naval do seu pa&iacute;s para proteger um arquip&eacute;lago. O mapa do arquip&eacute;lago &eacute; dividido em quadrantes e cada quadrante de &aacute;gua precisa ser vigiado por pelo menos um navio.</p>

<p>As condi&ccedil;&otilde;es para a distribui&ccedil;&atilde;o dos navios s&atilde;o as seguintes:</p>

<ul>
	<li>Cada navio consegue monitorar os quadrantes nas dire&ccedil;&otilde;es horizontal e vertical do quadrante do navio, a n&atilde;o ser que sua vis&atilde;o seja bloqueada por um quadrante de terra.</li>
	<li>Navios somente podem ser colocados em quadrantes de &aacute;gua.</li>
	<li>Alguns quadrantes de terra s&atilde;o portos e possuem necessidades especiais, devendo ser guardados por uma certa quantidade de navios em quadrantes adjacentes a eles, a norte, sul, leste ou oeste.</li>
	<li>A fim de evitar fogo amigo, navios n&atilde;o podem ser capazes de vigiar quadrantes de &aacute;gua contendo outro navio da sua frota.</li>
</ul>

<p>Encontre uma disposi&ccedil;&atilde;o de navios que satisfa&ccedil;a as restri&ccedil;&otilde;es, se poss&iacute;vel.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A descri&ccedil;&atilde;o de cada caso de teste come&ccedil;a com uma linha contendo dois inteiros 1 &le; n &le; 8 e 1 &le; m &le; 8 separados por um espa&ccedil;o, onde n representa o n&uacute;mero de linhas do mapa e m o n&uacute;mero de colunas.</p>

<p>Em seguida, seguem n linhas contendo m caracteres cada que descrevem o mapa do arquip&eacute;lago. O caracter &lsquo;.&rsquo; (ponto) marca um quadrante de &aacute;gua. Quadrantes de terra s&atilde;o representados pelo caracter &lsquo;X&rsquo;. Portos, que devem ter uma quantidade espec&iacute;fica de navios ancorados em suas adjac&ecirc;ncias, s&atilde;o representados por um n&uacute;mero entre 0 e 4 cujo valor &eacute; exatamente a quantidade de navios que devem estar nas adjac&ecirc;ncias.</p>

<p>Uma linha com os inteiros n = m = 0 marca o final da entrada e n&atilde;o deve ser tratada.</p>

### 출력

<p>Para cada caso de teste, caso seja poss&iacute;vel encontrar uma configura&ccedil;&atilde;o satisfazendo as restri&ccedil;&otilde;es acima, seu programa deve imprimir na sa&iacute;da padr&atilde;o uma c&oacute;pia do mapa dado como entrada onde os quadrantes onde ficar&atilde;o os navios est&atilde;o marcados pelo caracter &lsquo;N&rsquo;. Caso contr&aacute;rio, uma &uacute;nica linha contendo &ldquo;IMPOSSIVEL&rdquo; deve ser impressa.</p>

<p>Caso exista mais de uma solu&ccedil;&atilde;o vi&aacute;vel, qualquer uma delas ser&aacute; aceita.</p>