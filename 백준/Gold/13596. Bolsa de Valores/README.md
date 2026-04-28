# [Gold IV] Bolsa de Valores - 13596

[문제 링크](https://www.acmicpc.net/problem/13596)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 11, 정답 비율: 73.333%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Um investidor principiante deseja aprender a investir na bolsa de valores. Como ele n&atilde;o tem experi&ecirc;ncia, selecionou uma &uacute;nica empresa, e acompanhou os valores di&aacute;rios das a&ccedil;&otilde;es dessa empresa, durante N dias. Ficou curioso quanto teria ganhado se tivesse investido nesse per&iacute;odo em que acompanhou os valores. Na verdade, o investidor &eacute; milion&aacute;rio e tem muito dinheiro, suficiente para comprar qualquer quantidade de a&ccedil;&otilde;es da empresa. Entretanto, como &eacute; um investidor cuidadoso, decidiu que nunca teria mais do que uma a&ccedil;&atilde;o da empresa.</p>

<p>Como sempre h&aacute; intermedi&aacute;rios, a corretora de valores cobra uma taxa fixa de C reais a cada compra de uma a&ccedil;&atilde;o da empresa.</p>

<p>Voc&ecirc; deve calcular qual o lucro m&aacute;ximo que o investidor poderia ter auferido, investindo durante alguns dos N dias, podendo inclusive decidir n&atilde;o investir.</p>

### 입력

<p>A primeira linha cont&eacute;m dois inteiros, N e C (1 &le; N &le; 2 &times; 10<sup>5</sup> e 0 &le; C &le; 30).</p>

<p>A segunda linha cont&eacute;m as N cota&ccedil;&otilde;es P<sub>1</sub>, P<sub>2</sub>, . . . , P<sub>N</sub> , dos dias 1, 2, . . . , N, respectivamente. Cada cota&ccedil;&atilde;o P<sub>i</sub> satisfaz as desigualdades 1 &le; P<sub>i</sub> &le; 1000.</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando o lucro m&aacute;ximo do investidor, em reais.</p>