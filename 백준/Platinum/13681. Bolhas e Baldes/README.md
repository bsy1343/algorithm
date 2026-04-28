# [Platinum V] Bolhas e Baldes - 13681

[문제 링크](https://www.acmicpc.net/problem/13681)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 45, 맞힌 사람: 39, 정답 비율: 95.122%

### 분류

자료 구조, 정렬, 세그먼트 트리, 게임 이론

### 문제 설명

<p>Andrea, Carlos e Marcelo s&atilde;o muito amigos e passam todos os finais de semana &agrave; beira da piscina. Enquanto Andrea se bronzeia ao sol, os dois ficam jogando Bolhas. Andrea, uma cientista da computa&ccedil;&atilde;o muito esperta, j&aacute; disse a eles que n&atilde;o entende por que passam tanto tempo jogando um jogo t&atilde;o prim&aacute;rio.</p>

<p>Usando o computador port&aacute;til dela, os dois geram um inteiro aleat&oacute;rio N e uma seq&uuml;&ecirc;ncia de inteiros, tamb&eacute;m aleat&oacute;ria, que &eacute; uma permuta&ccedil;&atilde;o de&nbsp;1, 2, . . . ,N.</p>

<p>O jogo ent&atilde;o come&ccedil;a, cada jogador faz um movimento, e a jogada passa para o outro jogador. Marcelo &eacute; sempre o primeiro a come&ccedil;ar a jogar.</p>

<p>Um movimento de um jogador consiste na escolha de um par de elementos consecutivos da seq&uuml;&ecirc;ncia que estejam fora de ordem e em inverter a ordem dos dois elementos. Por exemplo, dada a seq&uuml;&ecirc;ncia 1, 5, 3, 4, 2, o jogador pode inverter as posi&ccedil;&otilde;es de 5 e 3 ou de 4 e 2, mas n&atilde;o pode inverter as posi&ccedil;&otilde;es de 3 e 4, nem de 5 e 2. Continuando com o exemplo, se o jogador decide inverter as posi&ccedil;&otilde;es de 5 e 3 ent&atilde;o a nova seq&uuml;&ecirc;ncia ser&aacute; 1, 3, 5, 4, 2.</p>

<p>Mais cedo ou mais tarde, a seq&uuml;&ecirc;ncia ficar&aacute; ordenada. Perde o jogador impossibilitado de fazer um movimento.</p>

<p>Andrea, com algum desd&eacute;m, sempre diz que seria mais simples jogar cara ou coroa, com o mesmo efeito. Sua miss&atilde;o, caso decida aceit&aacute;-la, &eacute; determinar quem ganha o jogo, dada a seq&uuml;&ecirc;ncia inicial.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. Os dados de cada caso de teste est&atilde;o numa &uacute;nica linha, e s&atilde;o inteiros separados por um espa&ccedil;o em branco. Cada linha cont&eacute;m um inteiroN&nbsp;(2 &le; N &le; 10<sup>5</sup>), seguido da seq&uuml;&ecirc;ncia inicial&nbsp;P&nbsp;= (X<sub>1</sub>, X<sub>2</sub>, ...,X<sub>N</sub>) de N inteiros distintos dois a dois, onde1 &le; X<sub>i</sub>&nbsp;&le; N&nbsp;para&nbsp;1 &le; i &le; N.</p>

<p>O final da entrada &eacute; indicado por uma linha que cont&eacute;m apenas o n&uacute;mero zero.</p>

### 출력

<p><span style="font-size:14px"><span style="color:#454545"><span style="font-family:Ubuntu,sans-serif"><span style="background-color:#ffffff">Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha, com o nome do vencedor, igual a&nbsp;</span></span></span></span><span style="font-family:courier">Carlos</span><span style="font-size:14px"><span style="color:#454545"><span style="font-family:Ubuntu,sans-serif"><span style="background-color:#ffffff">ou&nbsp;</span></span></span></span><span style="font-family:courier">Marcelo</span><span style="font-size:14px"><span style="color:#454545"><span style="font-family:Ubuntu,sans-serif"><span style="background-color:#ffffff">., sem espa&ccedil;os em branco.</span></span></span></span></p>