# [Platinum IV] Spanning Trees - 19370

[문제 링크](https://www.acmicpc.net/problem/19370)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 20, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

해 구성하기

### 문제 설명

<p>Consider a complete graph with $N$ vertices. Find $K$ spanning trees that are edge-disjoint.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19370.%E2%80%85Spanning%E2%80%85Trees/6382ecc3.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19370.%E2%80%85Spanning%E2%80%85Trees/6382ecc3.png" data-original-src="https://upload.acmicpc.net/53119c9c-a1e6-4f1e-8bbc-3c7a767f1fce/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19370.%E2%80%85Spanning%E2%80%85Trees/6963dd71.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19370.%E2%80%85Spanning%E2%80%85Trees/6963dd71.png" data-original-src="https://upload.acmicpc.net/8dba9376-df62-4a87-9c10-87317533401b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19370.%E2%80%85Spanning%E2%80%85Trees/248968fa.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/19370.%E2%80%85Spanning%E2%80%85Trees/248968fa.png" data-original-src="https://upload.acmicpc.net/863c1141-47e7-4b0b-9d58-6aaf58638554/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>The leftmost figure above shows a complete graph with four vertices. The two figures to the right are two edge-disjoint spanning trees of this graph.</p>

### 입력

<p>You are given two integers $N$ and $K$ on a single line ($2 \le N \le 10^4$, $1 \le K \le 100$).</p>

### 출력

<p>If there is no tuple of $K$ spanning trees that satisfies the conditions, print $-1$.</p>

<p>Otherwise, print $K$ spanning trees. Each spanning tree must be printed on $N - 1$ lines. The $i$-th line must contain two space-separated integers: the two endpoints of the $i$-th edge. The vertices are numbered $1$ through $N$. You may print an empty line between consecutive trees.</p>