# [Gold IV] O Salão do Clube - 13679

[문제 링크](https://www.acmicpc.net/problem/13679)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 12, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

정렬, 두 포인터

### 문제 설명

<p>O Clube Recreativo de Tingu&aacute; est&aacute; construindo a sua nova sede social. Os s&oacute;cios desejam que o piso do sal&atilde;o da sede seja de t&aacute;buas de madeira, pois consideram que este &eacute; o melhor tipo de piso para os famosos bailes do clube. Uma madeireira da regi&atilde;o doou uma grande quantidade de t&aacute;buas de boa qualidade, para serem utilizadas no piso. As t&aacute;buas doadas t&ecirc;m todas a mesma largura, mas t&ecirc;m comprimentos distintos.</p>

<p>O piso do sal&atilde;o da sede social &eacute; retangular. As t&aacute;buas devem ser colocadas justapostas, sem que qualquer parte de uma t&aacute;bua seja sobreposta a outra t&aacute;bua, e devem cobrir todo o piso do sal&atilde;o. Elas devem ser dispostas alinhadas, no sentido longitudinal, e todas devem estar no mesmo sentido (ou seja, todas as t&aacute;buas devem estar paralelas, no sentido longitudinal). Al&eacute;m disso, os s&oacute;cios n&atilde;o querem muitas emendas no piso, e portanto se uma t&aacute;bua n&atilde;o &eacute; longa o bastante para cobrir a dist&atilde;ncia entre um lado e outro do sal&atilde;o, ela pode ser emendada a no m&aacute;ximo uma outra t&aacute;bua para completar a dist&acirc;ncia.</p>

<p>H&aacute; por&eacute;m uma complica&ccedil;&atilde;o adicional. O carpinteiro-chefe tem um grande respeito por todas as madeiras e prefere n&atilde;o serrar qualquer t&aacute;bua. Assim, ele deseja saber se &eacute; poss&iacute;vel forrar todo o piso com as t&aacute;buas doadas, obedecendo &agrave;s restri&ccedil;&otilde;es especificadas; caso seja poss&iacute;vel, o carpinteiro-chefe deseja ainda saber o menor n&uacute;mero de t&aacute;buas que ser&aacute; necess&aacute;rio utilizar.</p>

<p>A figura abaixo ilustra duas poss&iacute;veis maneiras de forrar o piso de um sal&atilde;o com dimens&otilde;es 4 &times; 5 metros para um conjunto de dez t&aacute;buas doadas, com 100 cm de largura, e comprimentos 1, 2, 2, 2, 2, 3, 3, 4, 4 e 5 metros.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13679.%E2%80%85O%E2%80%85Sal%C3%A3o%E2%80%85do%E2%80%85Clube/d6ea87ff.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13679/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%207.47.42.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:157px; width:330px" /></p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m dois inteiros&nbsp;M&nbsp;e&nbsp;N&nbsp;indicando as dimens&otilde;es, em metros, do sal&atilde;o (1 &le;&nbsp;N,M&nbsp;&le; 10<sup>4</sup>). A segunda linha cont&eacute;m um inteiro&nbsp;L, representando a largura das t&aacute;buas, em cent&iacute;metros(1 &le;&nbsp;L&nbsp;&le; 100). A terceira linha cont&eacute;m um inteiro,&nbsp;K, indicando o n&uacute;mero de t&aacute;buas doadas (1 &le;&nbsp;K&nbsp;&le; 10<sup>5</sup>). A quarta linha cont&eacute;m&nbsp;K&nbsp;inteiros&nbsp;X<sub>i</sub>, separados por um espa&ccedil;o, cada um representando o comprimento, em metros, de uma t&aacute;bua (1 &le;&nbsp;X<sub>i</sub>&nbsp;&le; 10<sup>4</sup>&nbsp;para&nbsp;1 &le;&nbsp;i&nbsp;&le;&nbsp;K). O final da entrada &eacute; indicado por uma linha que cont&eacute;m apenas dois zeros, separados por um espa&ccedil;o em branco. &nbsp;</p>

### 출력

<p>Para cada um dos casos de teste da entrada, seu programa deve imprimir uma &uacute;nica linha, contendo o menor n&uacute;mero de t&aacute;buas necess&aacute;rio para cobrir todo o piso do sal&atilde;o, obedecendo &agrave;s restri&ccedil;&otilde;es estabelecidas. Caso n&atilde;o seja poss&iacute;vel cobrir todo o piso do sal&atilde;o obedecendo &agrave;s restri&ccedil;&otilde;es estabelecidas, imprima uma linha com a palavra &lsquo;impossivel&rsquo; (letras min&uacute;sculas, sem acento).&nbsp;</p>