# [Silver III] Elevador - 13662

[문제 링크](https://www.acmicpc.net/problem/13662)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 18, 맞힌 사람: 17, 정답 비율: 37.778%

### 분류

기하학

### 문제 설명

<p>A FCC (F&aacute;brica de Cilindros de Carbono) fabrica v&aacute;rios tipos de cilindros de carbono. A FCC est&aacute; instalada no d&eacute;cimo andar de um pr&eacute;dio, e utiliza os v&aacute;rios elevadores do pr&eacute;dio para transportar os cilindros. Por quest&atilde;o de seguran&ccedil;a, os cilindros devem ser transportados na posi&ccedil;&atilde;o vertical; como s&atilde;o pesados, no m&aacute;ximo dois cilindros podem ser transportados em uma &uacute;nica viagem de elevador. Os elevadores t&ecirc;m formato de paralelep&iacute;pedo e sempre t&ecirc;m altura maior que a altura dos cilindros.<br />
<br />
Para minimizar o n&uacute;mero de viagens de elevador para transportar os cilindros, a FCC quer, sempre que poss&iacute;vel, colocar dois cilindros no elevador. A figura abaixo ilustra, esquematicamente (vista superior), um caso em que isto &eacute; poss&iacute;vel (a), e um caso em que isto n&atilde;o &eacute; poss&iacute;vel (b):</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13662.%E2%80%85Elevador/9de22af1.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13662/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%206.27.01.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:141px; width:328px" /></p>

<p>Como existe uma quantidade muito grande de elevadores e de tipos de cilindros, a FCC quer que voc&ecirc; escreva um programa que, dadas as dimens&otilde;es do elevador e dos dois cilindros, determine se &eacute; poss&iacute;vel colocar os dois cilindros no elevador.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira e &uacute;nica linha de cada caso de teste cont&eacute;m quatro n&uacute;meros inteiros L, C, R<sub>1</sub> e R<sub>2</sub>, separados por espa&ccedil;os em branco, indicando respectivamente a largura do elevador (1 &le; L &le; 100), o comprimento do elevador (1 &le; C &le; 100), e os raios dos cilindros (1 &le; R<sub>1</sub>, R<sub>2</sub> &le; 100).</p>

<p>O &uacute;ltimo caso de teste &eacute; seguido por uma linha que cont&eacute;m quatro zeros separados por espa&ccedil;os em branco.</p>

### 출력

<p>Para cada caso de teste, o seu programa deve imprimir uma &uacute;nica linha com um &uacute;nico caractere: &lsquo;S&rsquo; se for poss&iacute;vel colocar os dois cilindros no elevador e &lsquo;N&rsquo; caso contr&aacute;rio.</p>