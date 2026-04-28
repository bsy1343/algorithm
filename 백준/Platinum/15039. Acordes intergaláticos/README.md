# [Platinum III] Acordes intergaláticos - 15039

[문제 링크](https://www.acmicpc.net/problem/15039)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 58, 정답: 26, 맞힌 사람: 24, 정답 비율: 53.333%

### 분류

자료 구조, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>A maratona de composi&ccedil;&atilde;o de sonatas para piano intergal&aacute;tico est&aacute;&nbsp;tentando dificultar a vida dos competidores, pois cada vez mais seres de intelig&ecirc;ncia superior est&atilde;o participando. O piano &eacute;&nbsp;composto de N teclas, numeradas de 0 a N &minus; 1. O sistema tonal intergal&aacute;tico possui 9 notas musicais, com valores de 0 a 8. Inicialmente todas as teclas do piano est&atilde;o associadas &agrave;&nbsp;mesma nota 1. O competidor vai tocar uma sequ&ecirc;ncia de acordes. Cada acorde intergal&aacute;tico &eacute;&nbsp;composto por duas teclas distintas, a e b, 0 &le; a &lt; b &lt; N. Quando o acorde &eacute;&nbsp;tocado, o piano vai emitir a nota mais frequente, f, entre todas as teclas do intervalo [a, b]. Se houver mais de uma nota mais frequente, ele emite a maior delas. Imediatamente ap&acute;os emitir a nota, o piano muda a nota associada a todas as teclas do intervalo [a, b]. A nova nota associada &agrave;&nbsp;tecla k, a &le; k &le; b, ser&aacute;&nbsp;a anterior mais f, m&oacute;dulo 9.</p>

<p>Por exemplo, se em determinado momento as notas associadas a um piano de N = 15 teclas s&atilde;o</p>

<table class="table table-bordered" style="width:100%">
	<tbody>
		<tr>
			<th>teclas</th>
			<td>0</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
			<td>10</td>
			<td>11</td>
			<td>12</td>
			<td>13</td>
			<td>14</td>
		</tr>
		<tr>
			<th>notas</th>
			<td>2</td>
			<td>2</td>
			<td>1</td>
			<td><u>4</u></td>
			<td><u>5</u></td>
			<td><u>4</u></td>
			<td><u>3</u></td>
			<td><u>4</u></td>
			<td><u>8</u></td>
			<td><u>0</u></td>
			<td>1</td>
			<td>6</td>
			<td>2</td>
			<td>0</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>e o acorde [3, 9] &eacute;&nbsp;tocado, ent&atilde;o a nota mais frequente ser&aacute;&nbsp;4 e as novas notas ap&oacute;s o acorde ser&atilde;o:</p>

<table class="table table-bordered" style="width:100%">
	<tbody>
		<tr>
			<th>teclas</th>
			<td>0</td>
			<td>1</td>
			<td>2</td>
			<td>3</td>
			<td>4</td>
			<td>5</td>
			<td>6</td>
			<td>7</td>
			<td>8</td>
			<td>9</td>
			<td>10</td>
			<td>11</td>
			<td>12</td>
			<td>13</td>
			<td>14</td>
		</tr>
		<tr>
			<th>notas</th>
			<td>2</td>
			<td>2</td>
			<td>1</td>
			<td>8</td>
			<td>0</td>
			<td>8</td>
			<td>7</td>
			<td>8</td>
			<td>3</td>
			<td>4</td>
			<td>1</td>
			<td>6</td>
			<td>2</td>
			<td>0</td>
			<td>1</td>
		</tr>
	</tbody>
</table>

<p>Dada a sequ&ecirc;ncia de Q acordes, seu programa deve imprimir as notas que estar&atilde;o associadas &agrave;s teclas do piano ap&oacute;s todos os acordes da sequ&ecirc;ncia terem sido tocados.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros, N (2 &le; N &le; 100000), e Q (1 &le; Q &le; 100000), respectivamente o n&uacute;mero de teclas do piano intergal&aacute;tico e a quantidade de acordes. As Q linhas seguintes cont&ecirc;m, cada uma, dois inteiros A e B, (0 &le; A &lt; B &lt; N), representando um acorde.</p>

### 출력

<p>Seu programa deve imprimir N inteiros, um por linha, representando as notas associadas &agrave;s teclas do piano, ap&oacute;s todos os acordes terem sido tocados.</p>