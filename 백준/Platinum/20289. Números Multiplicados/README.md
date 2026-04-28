# [Platinum IV] Números Multiplicados - 20289

[문제 링크](https://www.acmicpc.net/problem/20289)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 36, 정답: 24, 맞힌 사람: 17, 정답 비율: 65.385%

### 분류

수학, 정수론, 소인수분해

### 문제 설명

<p>Eugênio é um brilhante matemático que se diverte multiplicando números.</p>

<p>Certa vez, ele encontrou M pedaços de papel, numerados de 1 a M, cada um com um vértice desenhado. Chamaremos tais vértices de M-vértices. Cada um desses vértices estava rotulado com um primo distinto. Além disso, os primos estavam ordenados: Se chamarmos o rótulo do vértice no i-ésimo pedaço de papel de pi , então p<sub>i</sub> &lt; p<sub>j</sub> para todo par i &lt; j.</p>

<p>Após encontrar os pedaços de papel, Eugênio decidiu desenhar N outros vértices, que chamaremos de N-vértices, e adicionar arestas entre os M-vértices e os N-vértices. Ele tomou o cuidado de nunca ligar um M-vértice com um M-vértice, nem um N-vértice com um N-vértice, mas não se preocupou com o número de arestas desenhadas entre dois vértices. Assim, ele obteve um multigrafo bipartido.</p>

<p>Como o principal interesse de Eugênio é multiplicar números, ele decidiu rotular cada N-vértice com a multiplicação de todos os M-vértices conectados a ele. Se um M-vértice estiver conectado a um N-vértice por várias arestas, o rótulo dele será multiplicado várias vezes (igual ao número de arestas que os conecta) no processo de formar o rótulo do N-vértice.</p>

<p>Cada N-vértice i acabou rotulado com um número c<sub>i</sub>. Formalmente, podemos escrever a seguinte fórmula para c<sub>i</sub>:&nbsp;\[c_i = \prod_{(j,i) \in E}{p_j}\text{,}\]&nbsp;onde E é o multiconjunto de arestas (cada elemento de E é um par da forma (m, n) com 1 &le; m &le; M e 1 &le; n &le; N). Depois de construir os rótulos dos N-vértices, Eugênio foi comprar um lanche, que consistiu de um toro e um café. Ao saborear o toro, Eugênio acidentalmente derramou o seu café, tornando os rótulos p<sub>1</sub>, . . . , p<sub>M</sub> dos M-vértices ilegíveis.</p>

<p>Você pode ajudá-lo a recuperar os números primos ordenados destruídos pelo café?</p>

### 입력

<p>A primeira linha contém três inteiros M, N e K, o número de M-vértices, o número de N-vértices e o número de arestas distintas. Tais valores satisfazem 1 &le; M, N &lt; 10<sup>3</sup> e 1 &le; K &lt; 10<sup>4</sup>.</p>

<p>A próxima linha contém N números c<sub>i</sub>, os rótulos dos N-vértices. Tais valores satisfazem 1 &lt; c<sub>i</sub> &lt; 10<sup>15</sup>.</p>

<p>Finalmente, há K linhas, cada uma contendo três números m, n e d, representando que há d arestas entre o M-vértice m e o N-vértice n. Tais números satisfazem 1 &le; m &le; M, 1 &le; n &le; N e 1 &le; d &le; 50.</p>

<p>&Eacute; garantido que todos os vértices (tanto M-vértices quanto N-vértices) têm grau pelo menos um. Em outras palavras, todo vértice tem pelo menos uma aresta conectada a ele.</p>

### 출력

<p>Imprima uma única linha com M números ordenados, os primos rótulos dos M-vértices de índices 1, . . . , M que fizeram Eugênio perder o sono.</p>