# [Gold III] Foco - 13654

[문제 링크](https://www.acmicpc.net/problem/13654)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 39, 정답: 20, 맞힌 사람: 16, 정답 비율: 51.613%

### 분류

자료 구조, 그리디 알고리즘, 우선순위 큐, 정렬

### 문제 설명

<p>Daniel esta fazendo um curso de Vis&atilde;o Computacional e decidiu reproduzir um trabalho muito interessante visto em aula: ele tirou varias fotos de uma mesma cena, variando apenas o foco, para depois combina-las em uma unica imagem onde todos os objetos da cena est&atilde;o n&iacute;tidos simultaneamente. Para tal, ele precisa que cada objeto apareca n&iacute;tido em ao menos uma foto.</p>

<p>Daniel sabe que, para cada objeto, existe um intervalo fechado de planos de foco no qual aquele objeto est&aacute; contido. Por exemplo, na figura abaixo, (i), (ii) e (iii) s&atilde;o tr&ecirc;s fotos da mesma cena, cada uma tirada com um foco diferente; (iv) &eacute; a imagem combinada gerada por Daniel.</p>

<p><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13654/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%206.09.29.png" style="height:135px; width:482px" /></p>

<p>Como o cart&atilde;o de memoria de sua c&acirc;mera &eacute; pequeno, ele pediu sua ajuda para, dados os intervalos de foco de todos os objetos da cena que pretende fotografar, determinar o numero m&iacute;nimo de fotos que ele deve tirar para que seja poss&iacute;vel deixar cada objeto n&iacute;tido em pelo menos uma foto.</p>

### 입력

<p>A entrada &eacute; composta por diversos casos de teste. A primeira linha de cada caso de teste cont&eacute;m um inteiro N (1 &le; N &le; 10<sup>6</sup>) indicando o n&uacute;mero de objetos na cena. Cada uma das N linhas seguintes cont&eacute;m dois inteiros A e B (1 &le; A &le; B &le; 10<sup>9</sup>) indicando os extremos do intervalo de foco de cada objeto.</p>

### 출력

<p>Para cada caso de teste, imprima uma linha contendo um inteiro indicando o menor n&uacute;mero de fotos que Daniel deve tirar.</p>