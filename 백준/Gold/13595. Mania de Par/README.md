# [Gold II] Mania de Par - 13595

[문제 링크](https://www.acmicpc.net/problem/13595)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 58, 맞힌 사람: 30, 정답 비율: 33.333%

### 분류

그래프 이론, 최단 경로, 데이크스트라, 홀짝성

### 문제 설명

<p>Patr&iacute;cia &eacute; uma &oacute;tima desenvolvedora de software. No entanto, como quase toda pessoa brilhante, ela tem algumas manias estranhas, e uma delas &eacute; que tudo que ela faz tem que ser em n&uacute;mero par. Muitas vezes essa mania n&atilde;o atrapalha, apesar de causar estranhamento nos outros. Alguns exemplos: ela tem que fazer diariamente um n&uacute;mero par de refei&ccedil;&otilde;es; no caf&eacute; da manh&atilde; toma duas x&iacute;caras de caf&eacute;, duas torradas e duas fatias de queijo; sempre que vai ao cinema compra dois bilhetes de entrada (felizmente sempre tem um amigo ou amiga lhe acompanhando); e toma dois banhos por dia (ou quatro, ou seis...).</p>

<p>Mas algumas vezes essa mania de Patr&iacute;cia atrapalha. Por exemplo, ningu&eacute;m gosta de viajar de carro com ela, pois se no trajeto ela tem que pagar ped&aacute;gios, o n&uacute;mero de ped&aacute;gios que ela paga tem que ser par.</p>

<p>Patr&iacute;cia mora em um pa&iacute;s em que todas as estradas s&atilde;o bidirecionais e t&ecirc;m exatamente um ped&aacute;gio. Ela precisa ir visitar um cliente em uma outra cidade, e deseja calcular o m&iacute;nimo valor total de ped&aacute;gios que ela tem que pagar, para ir da sua cidade &agrave; cidade do cliente, obedecendo &agrave; sua estranha mania de que o n&uacute;mero de ped&aacute;gios pagos tem que ser par.</p>

### 입력

<p>A entrada consiste de diversas linhas. A primeira linha cont&eacute;m 2 inteiros C e V, o n&uacute;mero total de cidades e o n&uacute;mero de estradas (2 &le; C &le; 10<sup>4 </sup>e 0 &le; V &le; 50000). As cidades s&atilde;o identificadas por inteiros de 1 a C. Cada estrada liga duas cidades distintas, e h&aacute; no m&aacute;ximo uma estrada entre cada par de cidades. Cada uma das V linhas seguintes cont&eacute;m tr&ecirc;s inteiros C<sub>1</sub>, C<sub>2</sub> e G, indicando que o valor do ped&aacute;gio da estrada que liga as cidades C<sub>1</sub> e C<sub>2</sub> &eacute; G (1 &le; C<sub>1</sub>, C<sub>2</sub> &le; C e 1 &le; G &le; 10<sup>4</sup>). Patr&iacute;cia est&aacute; atualmente na cidade 1 e a cidade do cliente &eacute; C.</p>

### 출력

<p>Uma &uacute;nica linha deve ser impressa, contendo um &uacute;nico inteiro, o custo total de ped&aacute;gios para Patr&iacute;cia ir da cidade 1 &agrave; cidade C, pagando um n&uacute;mero par de ped&aacute;gios, ou, se isso n&atilde;o for poss&iacute;vel, o valor &minus;1.</p>