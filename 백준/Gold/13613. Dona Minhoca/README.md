# [Gold II] Dona Minhoca - 13613

[문제 링크](https://www.acmicpc.net/problem/13613)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 6, 맞힌 사람: 6, 정답 비율: 54.545%

### 분류

깊이 우선 탐색, 데이크스트라, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>Dona Minhoca fica furiosa quando ouve as pessoas dizerem que minhocas s&atilde;o bichos pal&iacute;ndromes, nos quais n&atilde;o &eacute; poss&iacute;vel distinguir a cabe&ccedil;a do rabo. Que inf&acirc;mia!</p>

<p>Dona Minhoca vive em uma linda caverna, composta de sal&otilde;es e t&uacute;neis. Cada t&uacute;nel liga dois sal&otilde;es distintos e pode ser usado nas duas dire&ccedil;&otilde;es. Um &ldquo;ciclo&rdquo; na caverna &eacute; uma sequ&ecirc;ncia de sal&otilde;es s<sub>1</sub>, s<sub>2</sub>, . . . , s<sub>n</sub>, s<sub>n+1</sub> = s<sub>1</sub> , tais que s<sub>i</sub> &ne; s<sub>i+1</sub> e (s<sub>i</sub>, s<sub>i+1</sub>) &eacute; um t&uacute;nel, para 1 &le; i &le; n. A caverna de Dona Minhoca pode conter ciclos, mas cada sal&atilde;o faz parte de no m&aacute;ximo um ciclo da caverna. Os t&uacute;neis e sal&otilde;es s&atilde;o estreitos, de forma que se uma parte do corpo de Dona Minhoca ocupa um t&uacute;nel ou sal&atilde;o, n&atilde;o h&aacute; espa&ccedil;o para Dona Minhoca entrar novamente por esse t&uacute;nel ou sal&atilde;o.</p>

<p>Alguns sal&otilde;es da caverna t&ecirc;m acesso a partir da superf&iacute;cie. Dona Minhoca tem um mapa que descreve a caverna, informando para cada t&uacute;nel o seu comprimento e quais dois sal&otilde;es o t&uacute;nel liga. Dona Minhoca tamb&eacute;m &eacute; vaidosa e conhece o seu pr&oacute;prio comprimento.</p>

<p>Dona Minhoca quer saber, para os sal&otilde;es que t&ecirc;m acesso &agrave; superf&iacute;cie, se &eacute; poss&iacute;vel entrar na caverna pelo sal&atilde;o, percorrer a menor dist&acirc;ncia poss&iacute;vel dentro da caverna, e sair novamente pelo mesmo sal&atilde;o que entrou, sempre andando para a frente, sem nunca dar marcha-a-r&eacute;. Voc&ecirc; pode ajud&aacute;-la?</p>

### 입력

<p>A primeira linha cont&eacute;m dois inteiros S (2 &le; S &le; 10<sup>4</sup> ) e T (1 &le; T &le; 2S) representando respectivamente o n&uacute;mero de sal&otilde;es e o n&uacute;mero de t&uacute;neis da caverna. Os sal&otilde;es s&atilde;o identificados por inteiros de 1 a S. Cada uma das T linhas seguintes descreve um t&uacute;nel e cont&eacute;m tr&ecirc;s inteiros A, B e C (1 &le; A &lt; B &le; S; 1 &le; C &le; 100), onde A e B representam os sal&otilde;es ligados pelo t&uacute;nel, e C representa o comprimento do t&uacute;nel. Um sal&atilde;o &eacute; ligado por t&uacute;neis a no m&aacute;ximo outros 100 sal&otilde;es e cada dois sal&otilde;es s&atilde;o ligados por no m&aacute;ximo um t&uacute;nel. A pr&oacute;xima linha cont&eacute;m um inteiro Q (1 &le; Q &le; 100), que indica o n&uacute;mero de consultas. Cada uma das Q linhas seguintes descreve uma consulta, e cont&eacute;m dois inteiros X (1 &le; X &le; S) e M (1 &le; M &le; 10<sup>5</sup> ), que indicam respectivamente o sal&atilde;o pelo qual Dona Minhoca quer entrar e o comprimento de Dona Minhoca.</p>

### 출력

<p>Para cada consulta da entrada seu programa deve produzir apenas uma linha, contendo apenas um n&uacute;mero inteiro, o comprimento do percurso m&iacute;nimo que Dona Minhoca deve percorrer dentro da caverna para entrar e sair pelo sal&atilde;o indicado na consulta, sem dar marcha-a-r&eacute;. Se n&atilde;o for poss&iacute;vel para Dona Minhoca entrar e sair sem dar marcha-a-r&eacute;, a linha deve conter o valor &minus;1.</p>