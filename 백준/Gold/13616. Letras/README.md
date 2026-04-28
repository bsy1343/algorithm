# [Gold IV] Letras - 13616

[문제 링크](https://www.acmicpc.net/problem/13616)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 11, 맞힌 사람: 9, 정답 비율: 31.034%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Os parques na Cidade da L&oacute;gica s&atilde;o reticulados de N &times; N quadrados (2 &le; N &le; 100), onde cada quadrado cont&eacute;m uma das 10 primeiras letras ASCII, abcdefghijABCDEFGHIJ, em caixa min&uacute;scula ou mai&uacute;scula. As pessoas na Cidade da L&oacute;gica t&ecirc;m orgulho de seguir apenas caminhos consistentes quando cruzam os parques. Por exemplo, se eles passam por um c min&uacute;sculo, eles n&atilde;o v&atilde;o se permitir, mais adiante, passar por um C mai&uacute;sculo. Para definir isso mais precisamente, um caminho consistente &eacute; uma sequ&ecirc;ncia de quadrados satisfazendo: quadrados consecutivos na sequ&ecirc;ncia s&atilde;o adjacentes ortogonalmente; nenhuma letra ocorre na sequ&ecirc;ncia tanto min&uacute;scula quanto mai&uacute;scula. Quer dizer, ou a letra n&atilde;o est&aacute; na sequ&ecirc;ncia, ou ela ocorre apenas em caixa min&uacute;scula, ou somente em caixa mai&uacute;scula.</p>

<pre>
DdaAaA D.....
CBAcca C.....
eEaeeE e.....
bBbabB b.bab.
DbDdDc DbD.D.
fFaAaC ....aC</pre>

<p>Voc&ecirc; deve escrever um programa para ajudar as pessoas da Cidade da L&oacute;gica a computar o comprimento do menor caminho consistente entre o quadrado de coordenadas (1, 1), no canto superior esquerdo, e o quadrado de coordenadas (N, N ), no canto inferior direito. Por exemplo, para o parque acima, o menor caminho consistente tem comprimento 13.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m um inteiro N (2 &le; N &le; 100), o tamanho do parque. As N linhas seguintes cont&ecirc;m, cada uma, uma sequ&ecirc;ncia de N letras, definindo o parque.</p>

### 출력

<p>Seu programa deve imprimir uma linha contendo um inteiro, o comprimento de um caminho consistente m&iacute;nimo. Se n&atilde;o houver um caminho consistente, imprima -1.</p>