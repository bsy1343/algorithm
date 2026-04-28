# [Silver II] Piscina - 13697

[문제 링크](https://www.acmicpc.net/problem/13697)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 6, 맞힌 사람: 6, 정답 비율: 75.000%

### 분류

그리디 알고리즘, 기하학

### 문제 설명

<p>O Centro Comunit&aacute;rio decidiu construir uma nova piscina, em tempo para o ver&atilde;o do ano que vem. A nova piscina ser&aacute; retangular, com dimens&otilde;es X por Y e profundidade Z. A piscina ser&aacute; recoberta com um novo tipo de azulejos cer&acirc;micos, de alta tecnologia, que &eacute; produzido em tr&ecirc;s tamanhos distintos: 5 &times; 5, 15 &times; 15 e 30 &times; 30 (em cent&iacute;metros). Cada azulejo desses tamanhos custa 2 centavos, 15 centavos e 50 centavos, respectivamente. Os azulejos s&atilde;o de alta qualidade, feitos com um material que n&atilde;o pode ser cortado (ou seja, os azulejos devem ser utilizados inteiros).</p>

<p>A &uacute;nica loja local que vende esse tipo de azulejo tem em estoque uma certa quantidade de azulejos de cada tamanho. Voc&ecirc; deve escrever um programa que determine se o estoque de azulejos dispon&iacute;vel na loja &eacute; suficiente para azulejar toda a piscina. Se o estoque for suficiente, seu programa deve determinar tamb&eacute;m o n&uacute;mero de azulejos de cada tamanho que s&atilde;o necess&aacute;rios para que o custo de azulejar a piscina seja o menor poss&iacute;vel.</p>

<p>Os azulejos devem ser usados para recobrir completamente toda a superf&iacute;cie da piscina, sem deixar qualquer espa&ccedil;o sem azulejos, e sem deixar sobras de azulejos transpassando as bordas da piscina.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. Cada caso de teste &eacute; composto por duas linhas. A primeira linha cont&eacute;m tr&ecirc;s n&uacute;meros reais X, Y e Z, representando as dimens&otilde;es e a profundidade da piscina, em metros, com precis&atilde;o de uma casa decimal (0 &lt; X, Y &le; 50.0 e 0 &lt; Z &le; 2.0). A segunda linha cont&eacute;m tr&ecirc;s n&uacute;meros inteiros P, M e G, representando a quantidade dispon&iacute;vel de azulejos de tamanho pequeno, m&eacute;dio e grande (0 &le; P, M, G &le; 2000000), respectivamente. O final da entrada &eacute; indicado por X = Y = Z = 0.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve produzir uma linha de sa&iacute;da. Se ́e poss&iacute;vel recobrir completamente a piscina com o estoque dispon&iacute;vel, imprima uma linha com tr&ecirc;s inteiros descrevendo respectivamente as quantidades de azulejos pequenos, m&eacute;dios e grandes para recobrir toda a piscina, com o menor custo poss&iacute;vel. Caso contr&aacute;rio, imprima uma linha contendo a palavra &lsquo;impossivel&rsquo; (note a aus&ecirc;ncia de acentua&ccedil;&atilde;o).</p>