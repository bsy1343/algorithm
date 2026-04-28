# [Platinum V] Ataque Fulminante - 13669

[문제 링크](https://www.acmicpc.net/problem/13669)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 2, 맞힌 사람: 2, 정답 비율: 11.111%

### 분류

기하학, 많은 조건 분기, 도형에서의 불 연산

### 문제 설명

<p>Desde que o Rei da Nlog&ocirc;nia construiu, d&eacute;cadas atr&aacute;s, um enorme muro de prote&ccedil;&atilde;o ao redor de todo o reino, os seus habitantes vivem em seguran&ccedil;a. O muro &eacute; imponente, extremamente refor&ccedil;ado, e tem o formato de um c&iacute;rculo que envolve todos os dom&iacute;nios do Rei.</p>

<p>No entanto, h&aacute; algumas semanas os habitantes da Nlog&ocirc;nia est&atilde;o apreensivos. H&aacute; boatos de que cientistas da Quadrad&ocirc;nia, um povo b&aacute;rbaro que habita as vizinhan&ccedil;as da Nlog&ocirc;nia, desenvolveram uma arma mortal, capaz de pulverizar tudo que esteja em sua mirada.</p>

<p>A nova arma &eacute; um canh&atilde;o que emite um feixe de pr&oacute;tons que se espalha com &acirc;ngulo<em>&nbsp;&oslash;</em>&nbsp;a partir da boca do canh&atilde;o. A dire&ccedil;&atilde;o do tiro &eacute; indicada por um &acirc;ngulo&nbsp;<em>alpha</em>, medido a partir do eixo x, no sentido anti-hor&aacute;rio. A figura abaixo ilustra (a) um exemplo de ataque, (b) o que restaria da Nlog&ocirc;nia e (c) a &aacute;rea que seria destru&iacute;da.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13669/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%206.40.40.png" style="height:216px; width:585px" /></p>

<p>Dados a coordenada do canh&atilde;o, a dire&ccedil;&atilde;o do tiro e o &acirc;ngulo de espalhamento do feixe de pr&oacute;tons, bem como a coordenada do centro e o valor do raio do muro de prote&ccedil;&atilde;o, voc&ecirc; deve escrever um programa para calcular a &aacute;rea da Nlog&ocirc;nia que ser&aacute; destru&iacute;da.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. Cada caso de teste &eacute; composto por duas linhas. A primeira linha cont&eacute;m tr&ecirc;s n&uacute;meros inteiros X, Y , R, com (X, Y ) representando as coordenadas do centro do c&iacute;rculo do muro de prote&ccedil;&atilde;o (0 &le; X &le; 1000 e 0 &le; Y &le; 1000), e R o seu raio (1&le;R&le;100). A segunda linha cont&eacute;m quatro n&uacute;meros inteiros P , Q, A e T , com (P, Q) representando as coordenadas da localiza&ccedil;&atilde;o do canh&atilde;o (0&le;P&le;1000 e 0&le;Q&le;1000), A representando a dire&ccedil;&atilde;o, em graus, do tiro (0&le;A&le;359), e T representa o &acirc;ngulo de espalhamento, tamb&eacute;m em graus (1&le;T&le;179). O &acirc;ngulo A &eacute; medido a partir do eixo x no sentido anti-hor&aacute;rio, e o canh&atilde;o est&aacute; sempre fora dos dom&iacute;nios da Nlog&ocirc;nia, ou seja, a dist&acirc;ncia entre (X, Y ) e (P, Q) &eacute; maior do que R.</p>

<p>O final da entrada &eacute; indicado por uma linha que cont&eacute;m tr&ecirc;s zeros separados por espa&ccedil;os em branco.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha, contendo um n&uacute;mero real, escrito com precis&atilde;o de uma casa decimal, indicando a &aacute;rea da Nlog&ocirc;nia que seria destru&iacute;da pelo ataque.</p>