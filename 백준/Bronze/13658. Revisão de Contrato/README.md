# [Bronze II] Revisão de Contrato - 13658

[문제 링크](https://www.acmicpc.net/problem/13658)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 179, 정답: 134, 맞힌 사람: 119, 정답 비율: 73.913%

### 분류

구현, 문자열

### 문제 설명

<p>Durante anos, todos os contratos da Associa&ccedil;&atilde;o de Contratos da Modernol&acirc;ndia (ACM) foram datilografados em uma velha m&aacute;quina de datilografia.<br />
<br />
Recentemente Sr. Miranda, um dos contadores da ACM, percebeu que a m&aacute;quina apresentava falha em um, e apenas um, dos d&iacute;gitos num&eacute;ricos. Mais especificamente, o d&iacute;gito falho, quando datilografado, n&atilde;o &eacute; impresso na folha, como se a tecla correspondente n&atilde;o tivesse sido pressionada. Ele percebeu que isso poderia ter alterado os valores num&eacute;ricos representados nos contratos e, preocupado com a contabilidade, quer saber, a partir dos valores originais negociados nos contratos, que ele mantinha em anota&ccedil;&otilde;es manuscritas, quais os valores de fato representados nos contratos. Por exemplo, se a m&aacute;quina apresenta falha no d&iacute;gito 5, o valor 1500 seria datilografado no contrato como 100, pois o 5 n&atilde;o seria impresso. Note que o Sr. Miranda quer saber o valor num&eacute;rico representado no contrato, ou seja, nessa mesma m&aacute;quina, o n&uacute;mero 5000 corresponde ao valor num&eacute;rico 0, e n&atilde;o 000 (como ele de fato aparece impresso).</p>

### 입력

<p>A entrada consiste de diversos casos de teste, cada um em uma linha. Cada linha cont&eacute;m dois inteiros D e N (1 &le; D &le; 9, 1 &le; N &lt; 10<sup>100</sup>), representando, respectivamente, o d&iacute;gito que est&aacute; apresentando problema na m&aacute;quina e o n&uacute;mero que foi negociado originalmente no contrato (que podem ser grande, pois Modernol&acirc;ndia tem sido acometida por hiperinfla&ccedil;&atilde;o nas &uacute;ltimas d&eacute;cadas).</p>

<p>O ultimo caso de teste &eacute; seguido por uma linha que cont&eacute;m apenas dois zeros separados por espa&ccedil;os em branco.</p>

### 출력

<p>Para cada caso de teste da entrada o seu programa deve imprimir uma linha contendo um &uacute;nico inteiro V, o valor num&eacute;rico representado de fato no contrato.</p>