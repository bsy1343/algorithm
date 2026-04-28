# [Gold III] Hipercampo - 15046

[문제 링크](https://www.acmicpc.net/problem/15046)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 41, 정답: 34, 맞힌 사람: 20, 정답 비율: 86.957%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>S&atilde;o dadas duas &acirc;ncoras, dois pontos A = (X<sub>A</sub>, 0) e B = (X<sub>B</sub>, 0), formando um segmento horizontal, tal que 0 &lt; X<sub>A</sub> &lt; X<sub>B</sub>, e um conjunto P de N pontos da forma (X, Y), tal que X &gt; 0 e Y &gt; 0. A figura mais &agrave; esquerda exemplifica uma poss&iacute;vel entrada.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15046/1.png" style="height:163px; width:592px" /></p>

<p>Para &ldquo;ligar&rdquo; um ponto v &isin; P precisamos desenhar os dois segmentos de reta (v, A) e (v, B). Queremos ligar v&aacute;rios pontos, mas de modo que os segmentos se interceptem apenas nas &acirc;ncoras. Por exemplo, a figura do meio mostra dois pontos, 1 e 4, que n&atilde;o podem estar ligados ao mesmo tempo, pois haveria interse&ccedil;&atilde;o dos segmentos fora das &acirc;ncoras. A figura mais &agrave; direita mostra que &eacute; poss&iacute;vel ligar pelo menos 3 pontos, 8, 5 e 3, com interse&ccedil;&atilde;o apenas nas &acirc;ncoras.</p>

<p>Seu programa deve computar o n&uacute;mero m&aacute;ximo de pontos que &eacute; poss&iacute;vel ligar com interse&ccedil;&atilde;o de segmentos apenas nas &acirc;ncoras.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m tr&ecirc;s inteiros, N (1 &le; N &le; 100), X<sub>A</sub> e X<sub>B</sub> (0 &lt; X<sub>A</sub> &lt; X<sub>B</sub> &le; 10<sup>4</sup>), representando, respectivamente, o n&uacute;mero de pontos no conjunto P e as abscissas das &acirc;ncoras A e B. As N linhas seguintes cont&ecirc;m, cada uma, dois inteiros X<sub>i</sub> e Y<sub>i</sub> (0 &lt; X<sub>i</sub>, Y<sub>i</sub> &le; 10<sup>4</sup>), representando as coordenadas dos pontos, para 1 &le; i &le; N. N&atilde;o h&aacute; pontos coincidentes e n&atilde;o h&aacute; dois pontos u e v distintos tais que {A, u, v} ou {B, u, v} sejam colineares.</p>

### 출력

<p>Seu programa deve imprimir uma linha contendo um inteiro, representando o n&uacute;mero m&aacute;ximo de pontos de P que podem ser ligados com interse&ccedil;&atilde;o de segmentos apenas nas &acirc;ncoras.</p>