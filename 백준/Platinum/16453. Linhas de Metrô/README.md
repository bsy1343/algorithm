# [Platinum III] Linhas de Metrô - 16453

[문제 링크](https://www.acmicpc.net/problem/16453)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 31, 맞힌 사람: 29, 정답 비율: 78.378%

### 분류

자료 구조, 트리, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 최소 공통 조상, Heavy-light 분할

### 문제 설명

<p>O sistema de metr&ocirc; de uma grande cidade &eacute; formado por um conjunto de esta&ccedil;&otilde;es e por t&uacute;neis que ligam alguns pares de esta&ccedil;&otilde;es. O sistema foi desenhado de forma que existe exatamente uma sequ&ecirc;ncia de t&uacute;neis ligando qualquer par de esta&ccedil;&otilde;es. As esta&ccedil;&otilde;es nas quais apenas um t&uacute;nel chega s&atilde;o chamadas de terminais. H&aacute; v&aacute;rias linhas de trens que fazem viagens de ida e volta entre duas esta&ccedil;&otilde;es terminais, transitando pelo caminho &uacute;nico entre elas. A popula&ccedil;&atilde;o est&aacute; reclamando das linhas atuais e, por isso, o prefeito ordenou uma reformula&ccedil;&atilde;o total das linhas. Como o sistema possui muitas esta&ccedil;&otilde;es, n&oacute;s precisamos ajudar os engenheiros que est&atilde;o tentando decidir quais pares de terminais passar&atilde;o a definir uma linha.</p>

<p>A figura ilustra um sistema onde as esta&ccedil;&otilde;es terminais s&atilde;o mostradas como c&iacute;rculos preenchidos e as n&atilde;o-terminais s&atilde;o mostradas como c&iacute;rculos vazios. Na parte esquerda, veja que se o par (A,B) definir uma linha e o par (C,D) definir outra, elas n&atilde;o ter&atilde;o qualquer esta&ccedil;&atilde;o em comum. Mas, na parte direita, podemos ver que se os pares (E,F) e (G,H) definirem duas linhas, elas ter&atilde;o duas esta&ccedil;&otilde;es em comum.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16453.%E2%80%85Linhas%E2%80%85de%E2%80%85Metr%C3%B4/4497a682.png" data-original-src="https://upload.acmicpc.net/71c8cc1f-916d-468d-baa7-215e8d014406/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 524px; height: 197px;" /></p>

<p>Dada a descri&ccedil;&atilde;o do sistema de t&uacute;neis e uma sequ&ecirc;ncia de Q consultas constitu&iacute;das de dois pares de terminais, seu programa deve computar, para cada consulta, quantas esta&ccedil;&otilde;es em comum as linhas definidas pelos dois pares teriam.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m dois inteiros N (5 &le; N &le; 10<sup>5</sup>) e Q (1 &le; Q &le; 20000), representando respectivamente o n&uacute;mero de esta&ccedil;&otilde;es e o n&uacute;mero de consultas. As esta&ccedil;&otilde;es s&atilde;o numeradas de 1 at&eacute; N. Cada uma das N &minus;1 linhas seguintes cont&eacute;m dois inteiros distintos U e V , 1 &le; U, V &le; N, indicando que existe um t&uacute;nel entre as esta&ccedil;&otilde;es U e V . Cada uma das Q linhas seguintes cont&eacute;m quatro inteiros distintos A, B, C e D (1 &le; A, B, C, D &le; N), representando uma consulta: as duas linhas de trem s&atilde;o definidas pelos pares (A, B) e (C, D).</p>

### 출력

<p>Para cada consulta, seu programa deve imprimir uma linha contendo um inteiro representando quantas esta&ccedil;&otilde;es em comum teriam as duas linhas de trem definidas pela consulta.</p>