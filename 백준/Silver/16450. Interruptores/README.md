# [Silver IV] Interruptores - 16450

[문제 링크](https://www.acmicpc.net/problem/16450)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 46, 맞힌 사람: 34, 정답 비율: 75.556%

### 분류

비트마스킹, 구현, 시뮬레이션

### 문제 설명

<p>No painel de controle de um grande anfiteatro existem N interruptores, numerados de 1 a N, que controlam as M l&acirc;mpadas do local, numeradas de 1 a M. Note que o n&uacute;mero de interruptores e l&acirc;mpadas n&atilde;o &eacute; necessariamente o mesmo e isso acontece porque cada interruptor est&aacute; associado a um conjunto de l&acirc;mpadas e n&atilde;o apenas a uma l&acirc;mpada. Quando um interruptor &eacute; acionado, o estado de cada uma das l&acirc;mpadas associadas a ele &eacute; invertido. Quer dizer, aquelas apagadas acendem e as acesas se apagam.</p>

<p>Algumas l&acirc;mpadas est&atilde;o acesas inicialmente e o zelador do anfiteatro precisa apagar todas as l&acirc;mpadas. Ele come&ccedil;ou tentando acionar interruptores aleatoriamente mas, como n&atilde;o estava conseguindo apagar todas as l&acirc;mpadas ao mesmo tempo, decidiu seguir uma seguinte estrat&eacute;gia fixa. Ele vai acionar os interruptores na sequ&ecirc;ncia 1, 2, 3, . . . , N, 1, 2, 3, . . . ou seja, toda vez ap&oacute;s acionar o interruptor de n&uacute;mero N, ele recome&ccedil;a a sequ&ecirc;ncia a partir do interruptor 1. Ele pretende acionar interruptores, seguindo essa estrat&eacute;gia, at&eacute; que todas as l&acirc;mpadas estejam apagadas ao mesmo tempo (momento em que ele para de acionar os interruptores). Ser&aacute; que essa estrat&eacute;gia vai funcionar?</p>

<p>Neste problema, dadas as l&acirc;mpadas acesas inicialmente e dados os conjuntos de l&acirc;mpadas que est&atilde;o associados a cada interruptor, seu programa deve computar o n&uacute;mero de vezes que o zelador vai acionar os interruptores. Caso a estrat&eacute;gia do zelador nunca apague todas as l&acirc;mpadas ao mesmo tempo, seu programa deve imprimir &minus;1.</p>

### 입력

<p>A primeira linha cont&eacute;m dois inteiros N e M (1 &le; N, M &le; 1000) representando, respectivamente, o n&uacute;mero de interruptores e o n&uacute;mero de l&acirc;mpadas. A segunda linha cont&eacute;m um inteiro L (1 &le; L &le; M) seguido por L inteiros distintos X<sub>i</sub> (1 &le; X<sub>i</sub> &le; M), representando as l&acirc;mpadas acesas inicialmente. Cada uma das N linhas seguintes cont&eacute;m um inteiro K<sub>i</sub> (1 &le; K<sub>i</sub> &le; M) seguido por K<sub>i</sub> inteiros distintos Y<sub>i</sub> (1 &le; Y<sub>i</sub> &le; M), representando as l&acirc;mpadas associadas ao interruptor i (1 &le; i &le; N).</p>

### 출력

<p>Se programa deve produzir uma &uacute;nica linha contendo um inteiro representando o n&uacute;mero de vezes que o zelador vai acionar os interruptores, seguindo a estrat&eacute;gia descrita, at&eacute; todas as l&acirc;mpadas estarem apagadas ao mesmo tempo. Caso isso nunca v&aacute; acontecer, imprima &minus;1.</p>