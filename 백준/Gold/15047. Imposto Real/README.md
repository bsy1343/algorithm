# [Gold I] Imposto Real - 15047

[문제 링크](https://www.acmicpc.net/problem/15047)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 23, 정답: 22, 맞힌 사람: 22, 정답 비율: 100.000%

### 분류

깊이 우선 탐색, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>O reino de Nlog&ocirc;nia &eacute; rico, o povo &eacute; educado e feliz, mas o Rei &eacute; um tirano quando o assunto se refere a impostos. A cada final de ano, cada cidade do pa&iacute;s deve pagar uma determinada quantidade de quilos de ouro em impostos. Chegado o momento de coletar os impostos, o Rei envia sua carruagem real para recolher o ouro devido, usando as estradas do reino.</p>

<p>Cada estrada liga duas cidades diferentes e pode ser percorrida nas duas dire&ccedil;&otilde;es. A rede de estradas &eacute; tal que &eacute; poss&iacute;vel ir de qualquer cidade para qualquer outra cidade, possivelmente passando por cidades intermedi&aacute;rias, mas h&aacute; apenas um caminho entre duas cidades diferentes.</p>

<p>Em cada cidade h&aacute; um cofre real, utilizado para armazenamento de ouro de impostos. Os cofres reais s&atilde;o imensos, de forma que cada cofre tem capacidade de armazenar todo o ouro devido por todo o reino. A carruagem sai da capital, percorrendo as estradas do reino, visitando as cidades para recolher o ouro devido, podendo usar qualquer cofre real para armazenar temporariamente uma parte do imposto recolhido, se necess&aacute;rio. Ao final da coleta, todo o ouro devido por todas as cidades deve estar armazenado no cofre real da capital.</p>

<p>&Aacute;varo como &eacute; o Rei, ele contratou o seu time para, dados a quantidade de ouro a ser recolhido em cada cidade (em kg), a lista das estradas do reino, com os respectivos comprimentos (em km) e a capacidade de carga da carruagem real (em kg), determine qual &eacute; a m&iacute;nima dist&acirc;ncia que a carruagem deve percorrer para recolher todo o ouro devido.</p>

### 입력

<p>A primeira linha cont&eacute;m dois inteiros N e C indicando respectivamente o n&uacute;mero de cidades e a capacidade de carga da carruagem (2 &le; N &le; 10<sup>4</sup> e 1 &le; C &le; 100). A capital do reino &eacute; identificada pelo n&uacute;mero 1, as outras cidades s&atilde;o identificadas por inteiros de 2 a N. A segunda linha cont&eacute;m N inteiros E<sub>i</sub> representando a quantidade de imposto devido por cada cidade i (0 &le; E<sub>i</sub> &le; 100 para 1 &le; i &le; N). Cada uma das linhas seguintes cont&eacute;m tr&ecirc;s inteiros A, B e C, indicando que uma estrada liga a cidade A e a cidade B (1 &le; A, B &le; N) e tem comprimento C (1 &le; C &le; 100).</p>

### 출력

<p>Seu programa deve produzir uma &uacute;nica linha com um inteiro representando a menor dist&acirc;ncia que a carruagem real deve percorrer para recolher todo o imposto devido, em km.</p>