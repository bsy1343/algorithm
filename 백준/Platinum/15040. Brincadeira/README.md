# [Platinum V] Brincadeira - 15040

[문제 링크](https://www.acmicpc.net/problem/15040)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 12, 맞힌 사람: 12, 정답 비율: 60.000%

### 분류

애드 혹, 비트마스킹, 브루트포스 알고리즘, 구현, 비둘기집 원리, 누적 합, 시뮬레이션

### 문제 설명

<p>Um Registrador de Deslocamento &eacute;&nbsp;um circuito que desloca de uma posi&ccedil;&atilde;o os elementos de um vetor de bits. O registrador de deslocamento tem uma entrada (um bit) e uma sa&iacute;da (tamb&eacute;m um bit), e &eacute; comandado por um pulso de rel&oacute;gio. Quando o pulso ocorre, o bit de entrada se transforma no bit mais significativo do vetor, o bit menos significativo &eacute;&nbsp;jogado na sa&iacute;da do registrador, e todos os outros bits s&atilde;o deslocados de uma posić&atilde;o em dire&ccedil;&atilde;o ao bit menos significativo do vetor (em dire&ccedil;&atilde;o &agrave; sa&iacute;da).</p>

<p>Um Registrador de Deslocamento com Retroalimenta&ccedil;&atilde;o Linear (em ingl&ecirc;s, LFSR) &eacute;&nbsp;um registrador de deslocamento no qual o bit de entrada &eacute;&nbsp;determinado pelo valor do ou-exclusivo de alguns dos bits do registrador antes do pulso de rel&oacute;gio. Os bits que s&atilde;o utilizados na retroalimenta&ccedil;&atilde;o do registrador s&atilde;o chamados de torneiras. A figura abaixo mostra um LFSR de 8 bits, com tr&ecirc;s torneiras (bits 0, 3 e 5).</p>

<table class="table" style="width:100%">
	<tbody>
		<tr>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/53afe325.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/53afe325.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15040/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:89px; width:290px" /></td>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/b0a5dbb0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/b0a5dbb0.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15040/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:89px; width:282px" /></td>
		</tr>
		<tr>
			<td style="width: 50%; text-align: center;">estado inicial</td>
			<td style="width: 50%; text-align: center;">estado ap&oacute;s um pulso</td>
		</tr>
		<tr>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/f33f89ed.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/f33f89ed.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15040/3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:90px; width:289px" /></td>
			<td style="width: 50%; text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/99d0bd46.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15040.%E2%80%85Brincadeira/99d0bd46.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15040/4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:87px; width:283px" /></td>
		</tr>
		<tr>
			<td style="width: 50%; text-align: center;">estado ap&oacute;s dois pulsos</td>
			<td style="width: 50%; text-align: center;">estado ap&oacute;s tr&ecirc;s pulsos</td>
		</tr>
	</tbody>
</table>

<p>Durante uma competi&ccedil;&atilde;ao de programa&ccedil;&atilde;o, enquanto aguardam a divulga&ccedil;&atilde;o do resultado final, Ricardo e Cl&aacute;udio se divertem com um LFSR que encontraram no local.</p>

<p>Eles usam o LFSR para gerar uma sequ&ecirc;ncia infinita de n&uacute;meros. Para gerar tal sequ&ecirc;ncia, antes de cada pulso do rel&oacute;gio, os bits do registrador s&atilde;o convertidos para decimal. Assim, para um LFSR como o da figura os primeiros elementos da sequ&ecirc;ncia s&atilde;o: A<sub>0</sub> = 169 (10101001), A<sub>1</sub> = 212 (11010100), A<sub>2</sub> = 106 (01101010), A<sub>3</sub> = 53 (00110101) e A<sub>4</sub> = 26 (00011010). Note que o valor dos bits antes do primeiro pulso &eacute;&nbsp;o primeiro elemento da sequ&ecirc;ncia.</p>

<p>Em cada rodada da brincadeira um deles fala dois n&uacute;meros inteiros, X e Y . Da&iacute;&nbsp;em diante o outro deve encontrar uma subsequ&ecirc;ncia cont&iacute;gua, de tamanho maior ou igual a Y , dos elementos da sequ&ecirc;ncia gerada pelo LFSR, de modo que a soma dos elementos da subsequ&ecirc;ncia cont&iacute;gua seja divis&iacute;vel por X.</p>

<p>De alguma forma os dois s&atilde;o capazes de se divertir com isso e encontrar as respostas mesmo sem a ajuda de um computador. E voc&ecirc;, dada a descri&ccedil;&atilde;o de um LSFR e dois inteiros X e Y , &eacute;&nbsp;capaz de encontrar uma subsequ&ecirc;ncia v&aacute;lida (ou informar caso n&atilde;o exista uma)?</p>

### 입력

<p>A primeira linha cont&eacute;m cinco n&uacute;meros inteiros N, T, A<sub>0</sub>, X e Y . O inteiro N representa o n&uacute;mero de bits (2 &le; N &le; 30), T &eacute;&nbsp;o n&uacute;mero de torneiras (1 &le; T &le; N), A0 &eacute;&nbsp;a representa&ccedil;&atilde;o decimal do estado inicial do LFSR, X o valor pelo qual a soma da subsequ&ecirc;ncia cont&iacute;gua deve ser divis&iacute;vel (1 &le; X &le; 10<sup>6</sup>) e Y &eacute;&nbsp;a quantidade m&iacute;nima de elementos na subsequ&ecirc;ncia cont&iacute;gua desejada (1 &le; Y &le; 10<sup>6</sup>). Os bits s&atilde;o identificados por inteiros de 0 (bit menos significativo) a N &minus;1 (bit mais significativo). A segunda linha&nbsp;cont&eacute;m T inteiros, separados por espa&ccedil;os, representando os identificadores dos bits que s&atilde;o torneiras, em ordem crescente. O bit 0 sempre &eacute;&nbsp;uma torneira.</p>

### 출력

<p>Seu programa deve imprimir, em uma &uacute;nica linha, dois inteiros I e F, representando os &iacute;ndices do primeiro e do &uacute;ltimo elementos da subsequ&ecirc;ncia cont&iacute;gua escolhida. Caso n&atilde;o exista uma solu&ccedil;&atilde;o imprima a palavra impossivel. Caso exista mais de uma solu&ccedil;&atilde;o poss&iacute;vel escolha aquela que minimiza o valor de F. Se mesmo assim houver mais de uma possibilidade opte por aquela que minimiza o valor de I.</p>