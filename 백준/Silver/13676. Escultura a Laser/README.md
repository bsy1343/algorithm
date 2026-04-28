# [Silver IV] Escultura a Laser - 13676

[문제 링크](https://www.acmicpc.net/problem/13676)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 49, 맞힌 사람: 36, 정답 비율: 78.261%

### 분류

브루트포스 알고리즘, 자료 구조, 스택

### 문제 설명

<p>Desde a sua inven&ccedil;&atilde;o, em 1958, os raios laser t&ecirc;m sido utilizados em uma imensa variedade de aplica&ccedil;&otilde;es, como equipamentos eletr&ocirc;nicos, instrumentos cir&uacute;rgicos, armamentos, e muito mais.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13676.%E2%80%85Escultura%E2%80%85a%E2%80%85Laser/d43c2cb9.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13676.%E2%80%85Escultura%E2%80%85a%E2%80%85Laser/d43c2cb9.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13676/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%206.51.55.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:200px; width:310px" /></p>

<p>A figura acima mostra um diagrama esquem&aacute;tico de um equipamento para esculpir, com laser, um bloco de material maci&ccedil;o. Na figura vemos um emissor laser que se desloca horizontalmente para a direita e para a esquerda com velocidade constante. Quando o emissor &eacute; ligado durante o deslocamento, uma camada de espessura constante &eacute; removida do bloco, sendo vaporizada pelo laser.</p>

<p>A figura abaixo ilustra o processo de escultura a laser, mostrando um exemplo de (a) um bloco, com 5 mm de altura por 8 mm de comprimento, no in&iacute;cio do processo, (b) o formato que se deseja que o bloco esculpido tenha, e (c) a sequ&ecirc;ncia de remo&ccedil;&atilde;o das camadas do bloco durante o processo, considerando que a cada varredura uma camada de espessura de 1 mm &eacute; removida. Na primeira varredura, o peda&ccedil;o numerado como 1 &eacute; removido; na segunda varredura, o peda&ccedil;o numerado como 2 &eacute; removido, e assim por diante. Durante o processo de remo&ccedil;&atilde;o, o laser foi ligado um total de 7 vezes, uma vez para cada peda&ccedil;o de bloco removido.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13676.%E2%80%85Escultura%E2%80%85a%E2%80%85Laser/ac2b9727.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13676.%E2%80%85Escultura%E2%80%85a%E2%80%85Laser/ac2b9727.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13676/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-12%20%EC%98%A4%EC%A0%84%206.52.54.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:163px; width:617px" /></p>

<p>Escreva um programa que, dados a altura do bloco, o comprimento do bloco, e a forma final que o bloco deve ter, determine o n&uacute;mero total vezes de que o laser deve ser ligado para esculpir o bloco.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. Cada caso de teste &eacute; composto por duas linhas. A primeira linha de um caso de teste cont&eacute;m dois n&uacute;meros inteiros A e C, separados por um espa&ccedil;o em branco, indicando respectivamente a altura (1 &le; A &le; 10<sup>4</sup>) e o comprimento (1 &le; C &le; 10<sup>4</sup>) do bloco a ser esculpido, em mil&iacute;metros. A segunda linha cont&eacute;m C n&uacute;meros inteiros Xi, cada um indicando a altura final, em mil&iacute;metros, do bloco entre as posi&ccedil;&otilde;es i e i + 1 ao longo do comprimento (0 &le; X<sub>i</sub>&nbsp;&le; A, para 0 &le; i &le; C - 1). Considere que a cada varredura uma camada de espessura 1 mil&iacute;metro &eacute; removida do bloco ao longo dos pontos onde o laser est&aacute; ligado.</p>

<p>O final da entrada &eacute; indicado por uma linha que cont&eacute;m apenas dois zeros, separados por um espa&ccedil;o em branco.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve imprimir uma &uacute;nica linha, contendo um n&uacute;mero inteiro, indicando o n&uacute;mero de vezes que o laser deve ser ligado para esculpir o bloco na forma indicada.</p>