# [Gold I] Xoracle - 35181

[문제 링크](https://www.acmicpc.net/problem/35181)

### 성능 요약

시간 제한: 7 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 46, 정답: 24, 맞힌 사람: 11, 정답 비율: 39.286%

### 분류

브루트포스 알고리즘, 비트마스킹, 애드 혹, 트리

### 문제 설명

<p>Long ago, in the heart of the Xordic countries, there was a brave soldier named Ronni. Ronni was known for their courage and sharp mind, often solving puzzles that baffled even the wisest sages. One day, Ronni was summoned to the ancient forest where a mystical tree stood. This tree was no ordinary tree --- it was entirely invisible, with its nodes and branches hidden from mortal eyes. On each node of the tree sits an ancient spirit, and the degree of each node held the key to understanding the tree's structure.</p>

<p>The kingdom's oracle, known as the <strong>Xoracle</strong>, was a powerful entity that could only answer one type of query:</p>

<blockquote>
<p>"Tell me the bitwise XOR of the degrees of node A and node B".</p>
</blockquote>

<p>Armed with this cryptic knowledge, Ronni had to deduce the degree of all $N$ nodes in the tree in order to conquer the ancient spirits, and to reveal the tree's secrets. However, the Xoracle would only answer up to $Q$ queries before sealing its wisdom forever.</p>

<p>Ronni's task is to determine the degrees of all nodes in the invisible tree using the Xoracle's responses. The tree, with $N$ nodes and $N-1$ edges, is connected, meaning there is a path between any pair of nodes. The degree of a node is the number of edges connected to it. By strategically choosing pairs of nodes and interpreting the bitwise XOR of their degrees, Ronni aimed to reconstruct the degrees of all nodes in the tree.</p>

### 입력



### 출력



### 제한

<ul>
<li>$2 \leq N \leq 10^5$.</li>
<li>The tree is constructed so that, regardless of which queries are asked, there is exactly one degree sequence consistent with the answers.</li>
</ul>

### 힌트

<p>The hidden tree in sample 1 is illustrated below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35181.%E2%80%85Xoracle/b0f0a94c.png" data-original-src="https://boja.mercury.kr/assets/problem/35181-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 246px; height: 256px;"></p>

<p>Then, the interaction in sample interaction 1 is as follows:</p>

<ul>
<li>First the numbers N and Q are given.</li>
<li>Then a query for node 2 and 4 is made, giving the result 0.</li>
<li>Then a query for node 4 and 1 is made, giving the result 2.</li>
<li>Then a query for node 3 and 3 is made, giving the result 0.</li>
<li>At last, the program answers that the degrees of the tree are <code>1, 3, 1, 1</code>, which is correct.</li>
</ul>

<p>(Note that the degrees can be given in any order.)</p>

<p>It may or may not be possible to conclude the correct answer using the queries given in the example.</p>

<p>For sample 2, the hidden tree is illustrated below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35181.%E2%80%85Xoracle/aaf45449.png" data-original-src="https://boja.mercury.kr/assets/problem/35181-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 279px; height: 254px;"></p>

<p>It may or may not be possible to conclude the correct answer using the queries in either of the sample interactions.</p>