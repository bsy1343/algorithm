# [Platinum III] September - 32007

[문제 링크](https://www.acmicpc.net/problem/32007)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 71, 정답: 34, 맞힌 사람: 33, 정답 비율: 51.562%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 트리, 깊이 우선 탐색, 강한 연결 요소

### 문제 설명

<p>The central square of Hangzhou is home to a famous ancient tree, which can be regarded as a rooted tree with $N$ nodes, indexed from $0$ to $N - 1$, with node $0$ being the root.</p>

<p>A node with no children is called a <strong>leaf node</strong>. Every time the ancient tree sheds its leaves, it selects one leaf node at that time to delete, and it may shed leaves multiple times in the same day.</p>

<p>There are $M$ volunteers (indexed from $0$ to $M - 1$) responsible for guarding the ancient tree. Each of them independently records the leaf-shedding situation of this year, using the following method:</p>

<p>Every day, collect the indices of all newly fallen leaves (i.e. the indices of the nodes which are deleted on that day), and write them down in any order after the previous fallen leaves.</p>

<p>For example: On the first day, leaves $3$ and $4$ fall, so they write down $3, 4$ or $4, 3$. On the second day, leaves $1$ and $2$ fall, so they continue to write down $1, 2$ or $2, 1$. The final record may be any of $(3, 4, 1, 2)$, $(4, 3, 1, 2)$, $(3, 4, 2, 1)$, or $(4, 3, 2, 1)$.</p>

<p>The process lasts for $K$ days, <strong>with newly fallen leaves every day</strong>, until only the root node remains.</p>

<p>While traveling, you happen to visit Hangzhou. It is now a cold winter. Looking up at the bare branches of the ancient tree, you can&#39;t help but imagine the beautiful sight of falling leaves.</p>

<p>You are very curious to know how many days you could have seen falling leaves this year, but you can only find the records of the $M$ volunteers. Try to infer the maximum possible value of $K$ from the records.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$2 &le; N &le; 10^5$.</li>
	<li>$1 &le; M &le; 5$.</li>
	<li>$\sum NM &le; 8 \times 10^5$.</li>
	<li>$F[0] = -1$. For $1 &le; i &le; N - 1$, $0 &le; F[i] &le; i - 1$.</li>
	<li>For $1 &le; i &le; M - 1$, array $S[i]$ is a permutation of $1, 2, \dots , N - 1$.</li>
	<li>It is guaranteed that $F$ describes a rooted tree with node $0$ being the root.</li>
</ul>