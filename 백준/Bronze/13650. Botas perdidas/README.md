# [Bronze I] Botas perdidas - 13650

[문제 링크](https://www.acmicpc.net/problem/13650)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 153, 정답: 111, 맞힌 사람: 90, 정답 비율: 72.581%

### 분류

구현, 자료 구조

### 문제 설명

<p>A divis&atilde;o de Suprimentos de Botas e Cal&ccedil;ados do Ex&eacute;rcito comprou um grande n&uacute;mero de pares de botas de v&aacute;rios tamanhos para seus soldados. No entanto, por uma falha de empacotamento da f&aacute;brica contratada, nem todas as caixas entregues continham um par de botas correto, com duas botas do mesmo tamanho, uma para cada p&eacute;. O sargento mandou que os recrutas retirassem todas as botas de todas as caixas para reembal&aacute;-las, desta vez corretamente.<br />
<br />
Quando o sargento descobriu que voc&ecirc; sabia programar, ele solicitou com a gentileza habitual que voc&ecirc; escrevesse um programa que, dada a lista contendo a descri&ccedil;&atilde;o de cada bota entregue, determina quantos pares corretos de botas poder&atilde;o ser formados no total.</p>

### 입력

<p>A entrada &eacute; composta por diversos casos de teste e termina com final de arquivo (EOF). A primeira linha de um caso de teste cont&eacute;m um inteiro N (2 &le; N &le; 10<sup>4</sup>), N &eacute; par, indicando o n&uacute;mero de botas individuais entregues. Cada uma das N linhas seguintes descreve uma bota, contendo um n&uacute;mero inteiro M (30 &le; M &le; 60) e uma letra L, separados por uma espa&ccedil;o em branco. M indica o n&uacute;mero da bota e L indica o p&eacute; da bota: L = &#39;D&#39; indica que a bota &eacute; para o p&eacute; direito, L = &#39;E&#39; indica que a bota &eacute; para o p&eacute; esquerdo.</p>

### 출력

<p>Para cada caso de teste imprima uma linha contendo um &uacute;nico n&uacute;mero inteiro indicando o n&uacute;mero total de pares corretos que podem ser formados.</p>