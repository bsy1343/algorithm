# [Silver II] Divisores - 13583

[문제 링크](https://www.acmicpc.net/problem/13583)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 49, 맞힌 사람: 48, 정답 비율: 58.537%

### 분류

브루트포스 알고리즘, 수학, 정수론, 소수 판정, 정렬

### 문제 설명

<p style="text-align:justify">Pense um n&uacute;mero positivo&nbsp;<strong>N</strong>. Agora me diga um divisor&nbsp;<strong>A</strong>&nbsp;de&nbsp;<strong>N</strong>. Agora me d&ecirc; um outro n&uacute;mero&nbsp;<strong>B</strong>que n&atilde;o seja divisor de&nbsp;<strong>N</strong>. Agora um m&uacute;ltiplo&nbsp;<strong>C</strong>. E um n&atilde;o m&uacute;ltiplo&nbsp;<strong>D</strong>. O n&uacute;mero que voc&ecirc; pensou &eacute;...</p>

<p style="text-align:justify">Parece um truque de m&aacute;gica, mas &eacute; matem&aacute;tica! Ser&aacute; que, conhecendo os n&uacute;meros&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>C</strong>&nbsp;e&nbsp;<strong>D</strong>, voc&ecirc; consegue descobrir qual era o n&uacute;mero original&nbsp;<strong>N</strong>? Note que pode existir mais de uma solu&ccedil;&atilde;o!</p>

<p style="text-align:justify">Neste problema, dados os valores de&nbsp;<strong>A</strong>,&nbsp;<strong>B</strong>,&nbsp;<strong>C</strong>&nbsp;e&nbsp;<strong>D</strong>, voc&ecirc; deve escrever um programa que determine qual o menor n&uacute;mero&nbsp;<strong>N</strong>&nbsp;que pode ter sido pensado ou concluir que n&atilde;o existe um valor poss&iacute;vel.</p>

### 입력

<p>A entrada consiste de uma &uacute;nica linha que cont&eacute;m quatro n&uacute;meros inteiros A, B, C, e D, como descrito acima</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>1 &le; A,B,C,D &le; 10<sup>9</sup></li>
</ul>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha. Caso exista pelo menos um n&uacute;mero N para os quais A, B, C e D fa&ccedil;am sentido, a linha deve conter o menor N poss&iacute;vel. Caso contr&aacute;rio, a linha deve conter -1.</p>