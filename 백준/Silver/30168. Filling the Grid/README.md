# [Silver I] Filling the Grid - 30168

[문제 링크](https://www.acmicpc.net/problem/30168)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 72, 정답: 57, 맞힌 사람: 47, 정답 비율: 78.333%

### 분류

수학, 조합론

### 문제 설명

<p>Suppose there is a $h \times w$ grid consisting of empty or full cells. Let&#39;s make some definitions:</p>

<ul>
	<li>$r_{i}$ is the number of consecutive full cells connected to the left side in the $i$-th row ($1 \le i \le h$). In particular, $r_i=0$ if the leftmost cell of the $i$-th row is empty.</li>
	<li>$c_{j}$ is the number of consecutive full cells connected to the top end in the $j$-th column ($1 \le j \le w$). In particular, $c_j=0$ if the topmost cell of the $j$-th column is empty.</li>
</ul>

<p>In other words, the $i$-th row starts exactly with $r_i$ full cells. Similarly, the $j$-th column starts exactly with $c_j$ full cells.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30168.%E2%80%85Filling%E2%80%85the%E2%80%85Grid/6760b473.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30168.%E2%80%85Filling%E2%80%85the%E2%80%85Grid/6760b473.png" data-original-src="https://upload.acmicpc.net/978d94ca-3273-409d-9ccf-2db997a47b29/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 264px; height: 200px;" /></p>

<p style="text-align: center;">These are the $r$ and $c$ values of some $3 \times 4$ grid. Black cells are full and white cells are empty.</p>

<p>You have values of $r$ and $c$. Initially, all cells are empty. Find the number of ways to fill grid cells to satisfy values of $r$ and $c$. Since the answer can be very large, find the answer modulo $1000000007\,(10^{9} + 7)$. In other words, find the remainder after division of the answer by $1000000007\,(10^{9} + 7)$.</p>

### 입력

<p>The first line contains two integers $h$ and $w$ ($1 \le h, w \le 10^{3}$) --- the height and width of the grid.</p>

<p>The second line contains $h$ integers $r_{1}, r_{2}, \ldots, r_{h}$ ($0 \le r_{i} \le w$) --- the values of $r$.</p>

<p>The third line contains $w$ integers $c_{1}, c_{2}, \ldots, c_{w}$ ($0 \le c_{j} \le h$) --- the values of $c$.</p>

### 출력

<p>Print the answer modulo $1000000007\,(10^{9} + 7)$.</p>

### 힌트

<p>In the first example, this is the other possible case.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/30168.%E2%80%85Filling%E2%80%85the%E2%80%85Grid/0458717d.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/30168.%E2%80%85Filling%E2%80%85the%E2%80%85Grid/0458717d.png" data-original-src="https://upload.acmicpc.net/2f39d50c-e58a-474c-b45e-4d48a0113c80/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 272px; height: 200px;" /></p>

<p>In the second example, it&#39;s impossible to make a grid to satisfy such $r$, $c$ values.</p>

<p>In the third example, make sure to print answer modulo $(10^9 + 7)$.</p>