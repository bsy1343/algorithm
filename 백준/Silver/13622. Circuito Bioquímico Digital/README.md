# [Silver V] Circuito Bioquímico Digital - 13622

[문제 링크](https://www.acmicpc.net/problem/13622)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 44, 정답: 37, 맞힌 사람: 36, 정답 비율: 83.721%

### 분류

구현

### 문제 설명

<p>Um circuito bioqu&iacute;mico digital (CBD) &eacute; um artefato composto de um conjunto de&nbsp;<em>pontos de processamento</em>. Cada ponto de processamento &eacute; constitu&iacute;do por um min&uacute;sculo recept&aacute;culo para reagentes bioqu&iacute;micos, feito de um substrato biol&oacute;gico que se comporta como um microcircuito eletr&ocirc;nico digital. Dependendo do estado da rea&ccedil;&atilde;o no recept&aacute;culo, o substrato gera dois n&iacute;veis de voltagem. Um leitor acoplado ao CBD &eacute; capaz de realizar a leitura de todos os pontos de processamento de um CDB num dado instante, interpretando os dois n&iacute;veis de voltagem como 0 ou 1.</p>

<p>Um experimento com o CBD &eacute; realizado da seguinte maneira. Os pontos de processamento s&atilde;o carregados com as subst&acirc;ncias de interesse e reagentes apropriados e, a cada intervalo fixo de tempo (tipicamente alguns milissegundos), os pontos de processamento s&atilde;o lidos. Assim, o experimento resulta em uma sequ&ecirc;ncia de conjuntos (vetores) de bits, cada vetor correspondendo a uma medi&ccedil;&atilde;o do CBD.</p>

<p>Uma sequ&ecirc;ncia ininterrupta de bits 1 de um mesmo ponto de processamento ao longo do tempo &eacute; denominada de palito. O comprimento de um palito &eacute; o n&uacute;mero de bits 1 que o comp&otilde;e (note que o comprimento dos palitos de um experimento pode variar entre um e o n&uacute;mero de medi&ccedil;&otilde;es efetuadas). Uma caracter&iacute;stica importante de um experimento com o CBD &eacute; a quantidade e o comprimento dos palitos gerados. A figura abaixo mostra o resultado de um experimento realizado com um CBD de seis pontos de processamento, em que foram efetuadas quatro medi&ccedil;&otilde;es, contendo tr&ecirc;s palitos de comprimento um, um palito de comprimento dois e um palito de comprimento quatro.</p>

<p><code>0 1 0 1 1 0 </code></p>

<p><code>0 0 0 1 0 0 </code></p>

<p><code>0 1 0 1 0 1 </code></p>

<p><code>0 1 0 1 0 0</code></p>

<p>Voc&ecirc; foi contratado para escrever um programa que determine, dado o resultado de um experimento, quantos palitos de comprimento igual ou maior do que um certo valor foram gerados.</p>

### 입력

<p>A entrada cont&eacute;m v&aacute;rios casos de teste. A primeira linha de um caso de teste cont&eacute;m tr&ecirc;s inteiros P, N e C que indicam respectivamente o n&uacute;mero de pontos de processamento (1 &le; P &le; 1000), o n&uacute;mero de medi&ccedil;&otilde;es efetuadas (1 &le; N &le; 1000) e o comprimento m&iacute;nimo de palitos de interesse (1 &le; C &le; N). Cada uma das pr&oacute;ximas N linhas cont&eacute;m sequ&ecirc;ncias de P d&iacute;gitos {0, 1}, separados por um espa&ccedil;o em branco. O final da entrada &eacute; indicado por P = N = C = 0.</p>

### 출력

<p>Para cada caso de teste da entrada seu programa deve produzir uma &uacute;nica linha da sa&iacute;da, contendo o n&uacute;mero de palitos de comprimento maior ou igual a&nbsp;C&nbsp;produzidos pelo experimento.</p>