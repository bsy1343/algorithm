# [Platinum IV] Finding Suspicious Proteins - 32565

[문제 링크](https://www.acmicpc.net/problem/32565)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Little Claire studies proteins, which are sequences of amino acids. There are 20 amino acids from which proteins are built. While amino acids all have proper names, such as <em>alanine</em> or <em>glycine</em>, they are often denoted by single letters, so that proteins can be seen as sequences of different lengths, such as <code>DTASDAAAAAALTAABAAAAAKLTABBAAAAAAATAA</code>, <code>TIFLQQQQQQQQQQQ</code> or even maybe <code>RICKRQLL</code>.</p>

<p>Comparing two proteins can be difficult, because they may contain active sites, which determine their function in a cell, and less important parts of the sequence. Recent advances in artificial neural networks made it possible to train a network that, given a protein, outputs a sequence of $l$ numbers, where each number roughly corresponds to a feature of a protein that correlates with its possible functions in a cell. Such a sequence is called an <em>embedding</em>.</p>

<p>Claire is particularly interested in <em>suspicious</em> proteins, those which are really different from others. For this purpose, she considers the so-called <em>Manhattan distance</em> between embeddings of proteins. For two protein embeddings $p$ and $q$ of length $l$, the distance $\mathcal{D}(p, q)$ is computed as follows: \begin{equation*} \mathcal{D}(p, q) = \sum_{i=1}^l |p_i - q_i|, \end{equation*} where $p_i$ is the $i$-th element of the embedding $p$.</p>

<p>Claire wants to find $k$ suspicious proteins in the given list of $n$ proteins. As a baseline for her studies, Claire wants to use the following greedy algorithm:</p>

<ul>
	<li>Find a protein $p^{(1)}$ which is the most distant from the first protein in the list.</li>
	<li>The second protein, $p^{(2)}$, is chosen as the most distant protein from $p^{(1)}$.</li>
	<li>The third one, $p^{(3)}$, is chosen so that $\min\{\mathcal{D}(p^{(1)}, p^{(3)}), \mathcal{D}(p^{(2)}, p^{(3)})\}$ is maximum possible. That is, it must be far away from <em>both</em> previously chosen proteins.</li>
	<li>All subsequent proteins $p^{(i)}$, $4 \le i \le k$, are chosen in a similar way: the minimum of the distances to all the previously chosen proteins should be maximum possible.</li>
</ul>

<p>Note that, in the case of ties, the first matching protein in the list must be chosen.</p>

<p>Claire's implementation works nicely for small numbers $n$ and $k$, but becomes too slow as they increase. You must find a way to optimise this.</p>

### 입력

<p>The first line contains three numbers $n$ $(3 \le n \le 10^4)$, $l$ $(1 \le l \le 100)$ and $k$ $(2 \le k \le \min\{n, 256\})$: the overall number of proteins, the length of each protein embedding, and the number of proteins to choose.</p>

<p>Each of the following $n$ lines starts with a protein identifier, which is a sequence of at least one and most ten capital letters and/or numbers. Then, separated by whitespace, come $l$ single-digit integer numbers $v_{1 \ldots l}$ ($0 \le v \le 9$), which define the embedding of the protein. All protein identifiers will be different.</p>

### 출력

<p>Output the identifiers of $k$ chosen proteins, one per line, in their respective order ($p^{(1)}$ to $p^{(k)}$).</p>