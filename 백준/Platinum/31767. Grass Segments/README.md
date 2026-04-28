# [Platinum I] Grass Segments - 31767

[문제 링크](https://www.acmicpc.net/problem/31767)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 115, 정답: 68, 맞힌 사람: 48, 정답 비율: 53.333%

### 분류

자료 구조, 정렬, 세그먼트 트리, 스위핑, 오프라인 쿼리, 값 / 좌표 압축

### 문제 설명

<p>Bessie is planting some grass on the positive real line. She has $N$ ($2\le N\le 2\cdot 10^5$) different cultivars of grass, and will plant the $i$th cultivar on the interval $[\ell_i, r_i]$ ($0 &lt; \ell_i &lt; r_i \leq 10^9$).</p>

<p>In addition, cultivar $i$ grows better when there is some cultivar $j$ ($j\neq i$) such that cultivar $j$ and cultivar $i$ overlap with length at least $k_i$ ($0 &lt; k_i \leq r_i - \ell_i$). Bessie wants to evaluate all of her cultivars. For each $i$, compute the number of $j\neq i$ such that $j$ and $i$ overlap with length at least $k_i$.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The next $N$ lines each contain three space-separated integers $\ell_i$, $r_i$, and $k_i$.</p>

### 출력

<p>The answers for all cultivars on separate lines.</p>