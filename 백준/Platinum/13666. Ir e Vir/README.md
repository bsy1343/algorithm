# [Platinum IV] Ir e Vir - 13666

[문제 링크](https://www.acmicpc.net/problem/13666)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 58, 정답: 51, 맞힌 사람: 44, 정답 비율: 86.275%

### 분류

그래프 이론, 강한 연결 요소

### 문제 설명

<p>Numa certa cidade h&aacute; N intersec&ccedil;&otilde;es ligadas por ruas de m&atilde;o &uacute;nica e ruas com m&atilde;o dupla de direc&atilde;o. &Eacute; uma cidade moderna, de forma que muitas ruas atravessam t&uacute;neis ou t&ecirc;m viadutos. Evidentemente &eacute; necess&aacute;rio que se possa viajar entre quaisquer duas intersec&ccedil;&otilde;es, isto &eacute;, dadas duas intersec&ccedil;&otilde;es V e W, deve ser poss&iacute;vel viajar de V para W e de W para V.</p>

<p>Sua tarefa &eacute; escrever um programa que leia a descri&ccedil;&atilde;o do sistema de tr&aacute;fego de uma cidade e determine se o requisito de conexidade &eacute; satisfeito ou n&atilde;o.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m dois n&uacute;meros inteiros N e M, separados por um espa&ccedil;o em branco, indicando respectivamente o n&uacute;mero de intersec&ccedil;&otilde;es (2 &le; N &le; 2000) e o n&uacute;mero de ruas (2 &le; M &le; N(N&minus;1)/2). O caso de teste tem ainda mais M linhas, que cont&ecirc;m, cada uma, uma descri&ccedil;&atilde;o de cada uma das M ruas. A descri&ccedil;&atilde;o consiste de tr&ecirc;s inteiros V, W e P, separados por um espa&ccedil;o em branco, onde V e W s&atilde;o identificadores distintos de intersec&ccedil;&otilde;es (1 &le; V, W &le; N , V &ne; W ) e P pode ser 1 ou 2; se P = 1 ent&atilde;o a rua &eacute; de m&atilde;o &uacute;nica, e vai de V para W; se P = 2 ent&atilde;o a rua &eacute; de m&atilde;o dupla, liga V e W. N&atilde;o existe duas ruas ligando as mesmas intersec&ccedil;&otilde;es.</p>

<p>O ultimo caso de teste &eacute; seguido por uma linha que cont&eacute;m apenas dois n&uacute;meros zero separados por um espa&ccedil;o em branco.</p>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma linha contendo um inteiro G, onde G &eacute; igual a 1 se o requisito de conexidade est&aacute; satisfeito, ou G &eacute; igual a 0, caso contr&aacute;rio.</p>