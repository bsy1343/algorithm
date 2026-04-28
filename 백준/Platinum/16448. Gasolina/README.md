# [Platinum II] Gasolina - 16448

[문제 링크](https://www.acmicpc.net/problem/16448)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 22, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

이분 탐색, 최대 유량, 그래프 이론

### 문제 설명

<p>Terminada a greve dos caminhoneiros, voc&ecirc; e os demais especialistas em log&iacute;stica da Nlog&ocirc;nia agora t&ecirc;m a tarefa de planejar o reabastecimento dos postos da cidade. Para isso, foram coletadas informa&ccedil;&otilde;es sobre os estoques das R refinarias e sobre as demandas dos P postos de gasolina. Al&eacute;m disso, h&aacute; restri&ccedil;&otilde;es contratuais que fazem com que algumas refinarias n&atilde;o possam atender alguns postos; quando uma refinaria pode fornecer a um posto, sabe-se o menor tempo de percurso para transportar o combust&iacute;vel de um lugar ao outro.</p>

<p>A tarefa dos especialistas &eacute; minimizar o tempo de abastecimento de todos os postos, satisfazendo completamente suas demandas. As refinarias t&ecirc;m uma quantidade suficientemente grande de caminh&otilde;es, de modo que &eacute; poss&iacute;vel supor que cada caminh&atilde;o precisar&aacute; fazer no m&aacute;ximo uma viagem, de uma refinaria para um posto de gasolina. A capacidade de cada caminh&atilde;o &eacute; maior do que a demanda de qualquer posto, mas pode ser necess&aacute;rio usar mais de uma refinaria para atender a demanda de um posto.</p>

<p>Seu programa deve encontrar o tempo m&iacute;nimo no qual &eacute; poss&iacute;vel abastecer totalmente todos os postos, respeitando os estoques das refinarias.</p>

### 입력

<p>A primeira linha da entrada cont&eacute;m tr&ecirc;s inteiros, P, R e C, respectivamente o n&uacute;mero de postos, o n&uacute;mero de refinarias e o n&uacute;mero de pares de refinaria e posto cujo tempo de percurso ser&aacute; dado (1 &le; P, R &le; 1000 e 1 &le; C &le; 20000). A segunda linha cont&eacute;m P inteiros D<sub>i</sub> (1 &le; D<sub>i</sub> &le; 10<sup>4</sup>), representando as demandas, em litros de gasolina, dos postos i = 1, 2, . . . , P, nessa ordem. A terceira linha cont&eacute;m R inteiros E<sub>i</sub> (1 &le; E<sub>i</sub> &le; 10<sup>4</sup>), representando os estoques, em litros de gasolina, das refinarias i = 1, 2, . . . , R, nessa ordem. Finalmente, as &uacute;ltimas C linhas descrevem tempos de percurso, em minutos, entre postos e refinarias. Cada uma dessas linhas cont&eacute;m tr&ecirc;s inteiros, I, J e T (1 &le; I &le; P e 1 &le; J &le; R e 1 &le; T &le; 10<sup>6</sup>), onde I &eacute; a identifica&ccedil;&atilde;o de um posto, J &eacute; a identifica&ccedil;&atilde;o de uma refinaria e T &eacute; o tempo do percurso de um caminh&atilde;o da refinaria J ao posto I. N&atilde;o haver&aacute; pares (J, I) repetidos. Nem todos os pares s&atilde;o informados; caso um par n&atilde;o seja informado, h&aacute; restri&ccedil;&otilde;es contratuais que impedem a refinaria de atender o posto.</p>

### 출력

<p>Imprima um inteiro T que indica o tempo m&iacute;nimo em minutos para que todas os postos sejam completamente abastecidos. Caso isso n&atilde;o seja poss&iacute;vel, imprima &minus;1.</p>