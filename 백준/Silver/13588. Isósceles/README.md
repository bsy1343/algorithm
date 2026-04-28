# [Silver I] Isósceles - 13588

[문제 링크](https://www.acmicpc.net/problem/13588)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 38, 맞힌 사람: 36, 정답 비율: 76.596%

### 분류

구현

### 문제 설명

<p>Os irm&atilde;os S&eacute;rgio e Luiz estavam brincando com cubinhos de madeira e queriam construir um muro, que acabou ficando incompleto, com as colunas tendo diferentes alturas, como nessa figura.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13588.%E2%80%85Is%C3%B3sceles/d5e765ae.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13588.%E2%80%85Is%C3%B3sceles/d5e765ae.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13588/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%206.04.52.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:350px" /></p>

<p>Eles decidiram agora que a brincadeira seria retirar cubinhos, sempre de cima para baixo nas colunas, de maneira que no final restasse apenas um tri&acirc;ngulo is&oacute;sceles de cubinhos. Eles podem apenas retirar cubinhos do muro, sem recolocar em outra coluna, e os tri&acirc;ngulos t&ecirc;m que ser completos. A figura abaixo ilustra os cinco primeiros tri&acirc;ngulos is&oacute;sceles de cubinhos, do tipo que eles querem, com alturas 1, 2, 3, 4 e 5 respectivamente.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13588.%E2%80%85Is%C3%B3sceles/0159d837.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13588.%E2%80%85Is%C3%B3sceles/0159d837.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13588/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%206.04.57.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:68px; width:340px" /></p>

<p>Dada a sequ&ecirc;ncia de alturas das colunas do muro, seu programa deve ajudar S&eacute;rgio e Luiz a descobrir qual &eacute; a altura m&aacute;xima que o tri&acirc;ngulo poderia ter ao final. No muro da primeira figura, com 30 colunas de cubinhos, o tri&acirc;ngulo mais alto poss&iacute;vel teria altura igual a sete.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m um inteiro N, representando o n&uacute;mero de colunas do muro. A segunda linha cont&eacute;m N inteiros A<sub>i</sub>, indicando as alturas de cada coluna.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>1 &le; N &le; 50000</li>
	<li>1 &le; A<sub>i</sub> &le; N</li>
</ul>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro H, representando a altura m&aacute;xima que um tri&acirc;ngulo poderia ter ao final.</p>