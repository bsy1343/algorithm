# [Bronze III] Divisão da Nlogõnia - 13684

[문제 링크](https://www.acmicpc.net/problem/13684)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 327, 정답: 278, 맞힌 사람: 255, 정답 비율: 86.441%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>Depois de s&eacute;culos de escaramu&ccedil;as entre os quatro povos habitantes da Nlog&ocirc;nia, e de dezenas de anos de negocia&ccedil;&otilde;es envolvendo diplomatas, pol&iacute;ticos e as for&ccedil;as armadas de todas as partes interessadas, com a intermedia&ccedil;&atilde;o da ONU, OTAN, G7 e SBC, foi finalmente decidida e aceita por todos a maneira de dividir o pa&iacute;s em quatro territ&oacute;rios independentes.</p>

<p>Ficou decidido que um ponto, denominado ponto divisor, cujas coordenadas foram estabelecidas nas negocia&ccedil;&otilde;es, definiria a divis&atilde;o do pa&iacute;s, da seguinte maneira. Duas linhas, ambas contendo o ponto divisor, uma na dire&ccedil;&atilde;o norte-sul e uma na dire&ccedil;&atilde;o leste-oeste, seriam tra&ccedil;adas no mapa, dividindo o pa&iacute;s em quatro novos pa&iacute;ses. Iniciando no quadrante mais ao norte e mais ao oeste, em sentido hor&aacute;rio, os novos pa&iacute;ses seriam chamados de Nlog&ocirc;nia do Noroeste, Nlog&ocirc;nia do Nordeste, Nlog&ocirc;nia do Sudeste e Nlog&ocirc;nia do Sudoeste.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/13684.%E2%80%85Divis%C3%A3o%E2%80%85da%E2%80%85Nlog%C3%B5nia/34751541.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13684/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%207.56.54.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:237px; width:356px" /></p>

<p>A ONU determinou que fosse disponibilizada uma p&aacute;gina na Internet para que os habitantes pudessem consultar em qual dos novos pa&iacute;ses suas resid&ecirc;ncias est&atilde;o, e voc&ecirc; foi contratado para ajudar a implementar o sistema.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m um inteiro&nbsp;K&nbsp;indicando o n&uacute;mero de consultas que ser&atilde;o realizadas (0 &lt;&nbsp;K&nbsp;&le; 10<sup>3</sup>). A segunda linha de um caso de teste cont&eacute;m dois n&uacute;meros inteiros&nbsp;N&nbsp;e&nbsp;Mrepresentando as coordenadas do ponto divisor (-10<sup>4</sup>&nbsp;&lt;&nbsp;N,&nbsp;M&nbsp;&lt; 10<sup>4</sup>). Cada uma das K linhas seguintes cont&eacute;m dois inteiros&nbsp;X&nbsp;e&nbsp;Y&nbsp;representando as coordenadas de uma resid&ecirc;ncia (-10<sup>4</sup>&nbsp;&le;&nbsp;X,&nbsp;Y&nbsp;&le; 10<sup>4</sup>).Em todas as coordenadas dadas, o primeiro valor&nbsp; corresponde &agrave; dire&ccedil;&atilde;o leste-oeste, e o segundo valor corresponde &agrave; dire&ccedil;&atilde;o norte-sul.</p>

<p>O final da entrada &eacute; indicado por uma linha que cont&eacute;m apenas o n&uacute;mero zero.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma linha contendo:</p>

<ul>
	<li>a palavra divisa se a resid&ecirc;ncia encontra-se em cima de uma das linhas divis&oacute;rias (norte-sul ou leste-oeste);</li>
	<li>NO se a resid&ecirc;ncia encontra-se na Nlog&ocirc;nia do Noroeste;</li>
	<li>NE se a resid&ecirc;ncia encontra-se na Nlog&ocirc;nia do Nordeste;</li>
	<li>SE se a resid&ecirc;ncia encontra-se na Nlog&ocirc;nia do Sudeste;</li>
	<li>SO se a resid&ecirc;ncia encontra-se na Nlog&ocirc;nia do Sudoeste.</li>
</ul>