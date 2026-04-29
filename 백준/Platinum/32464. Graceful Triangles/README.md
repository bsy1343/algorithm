# [Platinum IV] Graceful Triangles - 32464

[문제 링크](https://www.acmicpc.net/problem/32464)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 167, 정답: 107, 맞힌 사람: 72, 정답 비율: 69.903%

### 분류

애드 혹, 해 구성하기, 홀짝성

### 문제 설명

<p>Consider the following graph in the shape of $n$ equilateral triangles stitched together horizontally:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32464.%E2%80%85Graceful%E2%80%85Triangles/edba6cab.png" data-original-src="https://boja.mercury.kr/assets/problem/32464-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc"></p>

<p>This graph has $n+2$ vertices and $2n+1$ edges. The vertices are labeled in the order of increasing horizontal position, as in the image above.</p>

<p>In other words, the graph has $n+2$ vertices labeled from $1$ through $n+2$, and $2n+1$ edges connecting all pairs of vertices whose labels differ by at most $2$.</p>

<p>A positive integer value is assigned to each vertex. Vertex $i$ has the value of $v_i$. The value of an edge that connects vertices $i$ and $j$ is $|v_i-v_j|$. Find a way to assign values to all vertices so that for every positive integer $k$ up to $2n+1$ inclusive, exactly one edge has the value of $k$. The value of any vertex cannot exceed $10^{18}$.</p>

### 입력

<p>The first line contains $n$, a positive integer.</p>

### 출력

<p>If a solution exists for the given $n$, print the values assigned to the vertices $1,2,\ldots ,n+2$ in one line, separated by spaces. The values must be positive integers not exceeding $10^{18}$. Otherwise, print $-1$.</p>

### 제한

<ul>
	<li>$1\le n\le 200\, 000$</li>
</ul>