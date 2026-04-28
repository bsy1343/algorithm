# [Platinum II] Remove the Tree - 19010

[문제 링크](https://www.acmicpc.net/problem/19010)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 18, 정답: 12, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

다이나믹 프로그래밍, 트리, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>You are given an unweighted tree with $n$ vertices, numbered by integers from $1$ to $n$. Let us define the <em>remove</em>&nbsp;operation as follows:</p>

<ol>
	<li>choose an arbitrary path in the current graph (a path with only one vertex is valid),</li>
	<li>remove all vertices along this path, and all edges incident to them.</li>
</ol>

<p>Calculate the minimum number of such operations to remove all <strong>edges</strong>. Note that it is allowed to leave some vertices not removed.</p>

### 입력

<p>The first line contains one integer $n$ ($2 \le n \le 2 \cdot 10^5$), the number of vertices in the tree.</p>

<p>The $i$-th of the next $n - 1$ lines contains integers $a_i$ and $b_i$ ($1 \le a_i, b_i \le n$, $a_i \ne b_i$), the numbers of vertices connected by edge $i$.</p>

<p>It is guaranteed that the given graph is a tree.</p>

### 출력

<p>Output one integer: the minimum number of remove operations.</p>

### 힌트

<p>The third example corresponds to the following image:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19010.%E2%80%85Remove%E2%80%85the%E2%80%85Tree/01325429.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19010.%E2%80%85Remove%E2%80%85the%E2%80%85Tree/01325429.png" data-original-src="https://upload.acmicpc.net/8765c20b-dfc2-455a-ae70-6fd6386f06c3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 470px;" /></p>