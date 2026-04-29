# [Gold III] Mysterious Tree - 33436

[문제 링크](https://www.acmicpc.net/problem/33436)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 79, 정답: 16, 맞힌 사람: 14, 정답 비율: 19.444%

### 분류

트리

### 문제 설명

<p><strong>This is an interactive problem.</strong></p>

<p>Randias has an unknown hidden tree with $n$ vertices. The tree is either a <strong>chain</strong> or a <strong>star</strong>. Randias now needs to determine whether the tree is a chain or a star. He can ask a question in the following form, but no more than $\lceil \frac{n}{2} \rceil + 3$ times:</p>

<ul>
	<li>Is there an edge between vertex $u$ and vertex $v$ ($1 \le u, v \le n$, $u \neq v$)?</li>
</ul>

<p>Randias needs to determine which of the two kinds the tree is. Help him to ask the questions and determine the answer.</p>

<p>A tree is called a <strong>chain</strong> if and only if there exists a permutation $p_{1}, p_{2}, \ldots, p_{n}$ such that, for every $i$ ($1 \le i &lt; n$), there is an edge $(p_{i}, p_{i + 1})$ in the tree. Here, a permutation of length $n$ is an array where each integer from $1$ to $n$ appears exactly once.</p>

<p>A tree is called a <strong>star</strong> if and only if there exists a vertex $u$ such that, for every other vertex $v$, there is an edge $(u, v)$ in the tree.</p>

<p>In this problem, the interactor is <strong>adaptive</strong>, which means that the secret tree is not fixed beforehand. Instead, the interactor can change the tree arbitrarily during the interaction. Nevertheless, at every moment, the tree will be consistent with all the answers you got.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains a single integer $t$ ($1 \leq t \leq 250$) denoting the number of test cases.</p>

<p>For each test case, the first line contains one integer $n$ ($4 \le n \le 1000$) denoting the number of vertices. It is guaranteed that the sum of $n$ over all test cases does not exceed $1000$.</p>

### 출력

