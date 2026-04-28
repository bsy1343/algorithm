# [Platinum II] Interatividade - 20284

[문제 링크](https://www.acmicpc.net/problem/20284)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Um dia, Alice desafiou Beto com o problema interativo de programação descrito a seguir.</p>

<hr />
<p>Você tem uma árvore (um grafo acíclico conexo). Cada nó da árvore tem exatamente um pai, com exceção do nó raiz, que não tem pai. Um nó que não é pai de nenhum outro nó é uma folha. Você conhece a estrutura da árvore, porque sabe qual é o pai de cada nó que não é a raiz.</p>

<p>Cada nó contém um valor inteiro. Um nó que não é folha contém a soma dos valores dos seus filhos diretos. Portanto, todos os valores da árvore são determinados pelos valores contidos nas folhas.</p>

<p>A figura abaixo mostra um exemplo. As folhas estão marcadas como cinza, enquanto os outros nós são brancos. Cada nó mostra o valor contido nele.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/20284.%E2%80%85Interatividade/484d5578.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/20284.%E2%80%85Interatividade/484d5578.png" data-original-src="https://upload.acmicpc.net/d22943f4-c007-4b90-9371-e0b7dba28541/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 402px; height: 321px;" /></p>

<p>Inicialmente, você não sabe o valor de nenhum nó da árvore, mas pode consultá-los um por um. Sua tarefa é determinar o valor de cada nó da árvore, usando o mínimo de consultas possível.</p>

<hr />
<p>Beto resolveu este problema facilmente. Então, para dificultar as coisas, Alice perguntou para ele: &ldquo;dada a estrutura da árvore, quantas formas diferentes de solucionar este problema existem?&rdquo; Isto é, quantos conjuntos mínimos de consultas existem que lhe permitam determinar os valores armazenados em cada nó da árvore? (Dois conjuntos de consultas são considerados diferentes se e somente se existe um nó consultado em apenas um dos dois conjuntos.)</p>

### 입력

<p>A árvore tem N nós no total. Cada nó é identificado por um inteiro entre 1 e N, onde o nó 1 é a raiz.</p>

<p>A entrada consiste de duas linhas. A primeira linha contém apenas o inteiro N.</p>

<p>A segunda linha contém N &minus;1 inteiros P<sub>1</sub>, P<sub>2</sub>, . . . , P<sub>N&minus;1</sub>, separados por um espaço, onde P<sub>i</sub> é o pai do nó i + 1, para i = 1, 2, . . . , N &minus; 1.</p>

### 출력

<p>A saída consiste de uma única linha, que deve conter o número de soluções mínimas diferentes para o problema enfrentado por Beto. Como esse número pode ser muito grande, sua resposta deverá ser calculada módulo 1000000007 (10<sup>9</sup> + 7).</p>

### 제한

<ul>
	<li>2 &le; N &le; 10<sup>5</sup>.</li>
	<li>1 &le; P<sub>i</sub> &le; N, para i = 1, 2, . . . , N &minus; 1.</li>
</ul>