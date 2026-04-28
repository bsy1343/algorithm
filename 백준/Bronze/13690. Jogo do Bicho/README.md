# [Bronze II] Jogo do Bicho - 13690

[문제 링크](https://www.acmicpc.net/problem/13690)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 158, 정답: 110, 맞힌 사람: 77, 정답 비율: 65.254%

### 분류

수학, 구현, 사칙연산

### 문제 설명

<p>Em um pa&iacute;s muito distante, as pessoas s&atilde;o viciadas em um jogo de apostas bastante simples. O jogo &eacute; baseado em n&uacute;meros e &eacute; chamado jogo do bicho. O nome do jogo deriva do fato que os n&uacute;meros s&atilde;o divididos em 25 grupos, dependendo do valor dos dois &uacute;ltimos d&iacute;gitos (dezenas e unidades), e cada grupo recebe o nome de um animal. Cada grupo &eacute; associado a um animal da seguinte forma: o primeiro grupo (burro) consiste nos n&uacute;meros 01, 02, 03 e 04; o segundo grupo (&aacute;guia) &eacute; composto dos n&uacute;meros 05, 06, 07 e 08; e assim em diante, at&eacute; o ultimo grupo contendo os n&uacute;meros 97, 98, 99 e 00.</p>

<p>As regras do jogo s&atilde;o simples. No momento da aposta, o jogador decide o valor da aposta V e um n&uacute;mero N (0 &le; N &le; 1000000). Todos os dias, na pra&ccedil;a principal da cidade, um n&uacute;mero M &eacute; sorteado (0 &le; M &le; 1000000). O pr&ecirc;mio de cada apostador &eacute; calculado da seguinte forma:</p>

<ul>
	<li>Se M e N t&ecirc;m os mesmos quatro &uacute;ltimos d&iacute;gitos (milhar, centena, dezena e unidade), o apostador recebe V &times; 3000 (por exemplo, N = 99301 e M = 19301);</li>
	<li>Se M e N t&ecirc;m os mesmos tr&ecirc;s &uacute;ltimos d&iacute;gitos (centena, dezena e unidade), o apostador recebe V &times; 500 (por exemplo, N = 38944 e M = 83944);</li>
	<li>Se M e N t&ecirc;m os mesmos dois &uacute;ltimos d&iacute;gitos (dezena e unidades), o apostador recebe V &times; 50 (por exemplo, N = 111 e M = 552211);</li>
	<li>Se M e N t&ecirc;m os dois &uacute;ltimos d&iacute;gitos no mesmo grupo, correspondendo ao mesmo animal, o apostador recebe V &times; 16 (por exemplo, N = 82197 and M = 337600);</li>
	<li>Se nenhum dos casos acima ocorrer, o apostador n&atilde;o recebe nada.</li>
</ul>

<p>Obviamente, o pr&ecirc;mio dado a cada apostador &eacute; o m&aacute;ximo poss&iacute;vel de acordo com as regras acima. No entanto, n&atilde;o &eacute; poss&iacute;vel acumular pr&ecirc;mios, de forma que apenas um dos crit&eacute;rios acima deve ser aplicado no c&aacute;lculo do pr&ecirc;mio. Se um n&uacute;mero N ou M com menos de quatro d&iacute;gitos for apostado ou sorteado, assuma que d&iacute;gitos 0 devem ser adicionados na frente do numero para que se torne de quatro d&iacute;gitos; por exemplo, 17 corresponde a 0017.</p>

<p>Dado o valor apostado, o n&uacute;mero escolhido pelo apostador, e o n&uacute;mero sorteado, seu programa deve calcular qual o pr&ecirc;mio que o apostador deve receber.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. Cada caso consiste em apenas uma linha, contendo um n&uacute;mero real V e dois inteiros N e M, representando respectivamente o valor da aposta com duas casas decimais (0.01 &le; V &le; 1000.00), o n&uacute;mero escolhido para a aposta (0 &le; N &le; 1000000) e o n&uacute;mero sorteado (0 &le; M &le; 1000000). O final da entrada &eacute; indicado por uma linha contendo V = M = N = 0.</p>

### 출력

<p>Para cada um dos casos de teste seu programa deve imprimir uma linha contendo um n&uacute;mero real, com duas casas decimais, representando o valor do pr&ecirc;mio correspondente &agrave; aposta dada.</p>