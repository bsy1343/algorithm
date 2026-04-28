# [Silver III] Estacionamento - 13653

[문제 링크](https://www.acmicpc.net/problem/13653)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 27, 맞힌 사람: 22, 정답 비율: 62.857%

### 분류

브루트포스 알고리즘, 구현, 시뮬레이션

### 문제 설명

<p>Um estacionamento utiliza um terreno em que os ve&iacute;culos t&ecirc;m que ser guardados em fila &uacute;nica, um atr&aacute;s do outro. A tarifa tem o valor fixo de R\$ 10,00 por veiculo estacionado, cobrada na entrada, independente de seu porte e tempo de perman&ecirc;ncia. Como o estacionamento &eacute; muito concorrido, nem todos os ve&iacute;culos que chegam ao estacionamento conseguem lugar para estacionar.<br />
<br />
Quando um ve&iacute;culo chega ao estacionamento, o atendente primeiro determina se h&aacute; vaga para esse ve&iacute;culo. Para isso, ele percorre a p&eacute; o estacionamento, do in&iacute;cio ao fim, procurando um espa&ccedil;o que esteja vago e tenha comprimento maior ou igual ao comprimento do ve&iacute;culo. Para economizar seu tempo e energia, o atendente escolhe o primeiro espa&ccedil;o adequado que encontrar; isto &eacute;, o espa&ccedil;o mais pr&oacute;ximo do in&iacute;cio.<br />
<br />
Uma vez encontrada a vaga para o ve&iacute;culo, o atendente volta para a entrada do estacionamento, pega o ve&iacute;culo e o estaciona no come&ccedil;o do espa&ccedil;o encontrado. Se o atendente n&atilde;o encontrar um espa&ccedil;o adequado, o ve&iacute;culo n&atilde;o entra no estacionamento e a tarifa n&atilde;o &eacute; cobrada. Depois de estacionado, o ve&iacute;culo n&atilde;o &eacute; movido at&eacute; o momento em que sai do estacionamento.<br />
<br />
O dono do estacionamento est&aacute; preocupado em saber se os atendentes t&ecirc;m cobrado corretamente a tarifa dos ve&iacute;culos estacionados e pediu para voc&ecirc; escrever um programa que, dada a lista de chegadas e sa&iacute;das de ve&iacute;culos no estacionamento, determina o faturamento total esperado.</p>

### 입력

<p>A entrada &eacute; composta por diversos casos de teste. A primeira linha de um caso de teste cont&eacute;m dois n&uacute;meros inteiros C (1 &le; C &le; 1000) e N (1 &le; N &le; 10000) que indicam respectivamente o comprimento em metros do estacionamento e o n&uacute;mero total de eventos ocorridos (chegadas e sa&iacute;das de ve&iacute;culos). Cada uma das N linhas seguintes descreve uma chegada ou sa&iacute;da. Para uma chegada de ve&iacute;culo, a linha cont&eacute;m a letra &#39;C&#39;, seguida de dois inteiros P (1000 &le; P &le; 9999) e Q (1 &le; Q &le; 1000), todos separados por um espa&ccedil;o em branco. P indica a placa do ve&iacute;culo e Q o seu comprimento. Para uma sa&iacute;da de ve&iacute;culo, a linha cont&eacute;m a letra &#39;S&#39; seguida de um inteiro P , separados por um espa&ccedil;o em branco, onde P indica a placa do ve&iacute;culo. As a&ccedil;&otilde;es s&atilde;o dadas na ordem cronol&oacute;gica, ou seja, na ordem em que acontecem.</p>

<p>No in&iacute;cio de cada caso de teste o estacionamento est&aacute; vazio. No arquivo de entrada, um ve&iacute;culo sai do estacionamento somente se est&aacute; realmente estacionado, e a placa de um ve&iacute;culo que chega ao estacionamento nunca &eacute; igual a placa de um ve&iacute;culo j&aacute; estacionado.</p>

### 출력

<p>Para cada caso de teste seu programa deve imprimir uma linha contendo um n&uacute;mero inteiro representando o faturamento do estacionamento, em reais.</p>