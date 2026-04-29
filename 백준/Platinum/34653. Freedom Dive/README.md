# [Platinum III] Freedom Dive - 34653

[문제 링크](https://www.acmicpc.net/problem/34653)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 91, 정답: 62, 맞힌 사람: 55, 정답 비율: 67.073%

### 분류

기하학, 볼록 껍질, 이분 탐색

### 문제 설명

<p>On a scenic coastline, there are $N$ skyscrapers arranged in a line. For each building $i$ (from $1$ to $N$), we know its distance from the sea, $L_i$, and its height, $H_i$. We can model the top of each building as a point in a 2D plane at coordinates $(L_i, H_i)$. The buildings are sorted by their distance from the sea, so it's guaranteed that $L_i &lt; L_{i+1}$ for all $1 \le i &lt; N$.</p>

<p>You are a professional skydiver and have planned a spectacular dive for $Q$ different days. On the $i$-th day ($1 \le i \le Q$), you are given a planned dive location, which is a horizontal coordinate $d_i$. It is guaranteed that no building is located exactly at $d_i$.</p>

<p>To prepare for the $i$-th day's dive, you must perform the following setup:</p>

<ul>
<li>First, choose two buildings: one building $l$ located to the left of your dive location (where $L_l &lt; d_i$) and one building $r$ located to the right (where $L_r &gt; d_i$). It is guaranteed that such a pair of buildings always exists.</li>
<li>Next, connect the tops of these two buildings, i.e., points $(L_l, H_l)$ and $(L_r, H_r)$, with a straight rope.</li>
<li>Finally, you will make your jump from the point on this rope that is precisely at the horizontal coordinate $d_i$.</li>
</ul>

<p>Being a cautious professional, you want to minimize the risk associated with high altitudes. Therefore, for each dive, you must choose the pair of buildings $(l, r)$ that results in the <strong>lowest possible altitude</strong> for the rope at your jump-off coordinate $d_i$.</p>

<p>Note that the rope is an idealized line segment. It is allowed to pass through or intersect with other buildings; its path is determined only by the two chosen endpoints.</p>

<p>For each of the $Q$ planned dives, find this minimum possible altitude.</p>

### 입력

<p>The first line contains a single integer $N$ — the number of buildings.</p>

<p>The next $N$ lines describe the buildings. The $i$-th of these lines contains two integers, $L_i$ and $H_i$ — the distance from the sea and the height of the $i$-th building. It is guaranteed that $L_1 &lt; L_2 &lt; \dots &lt; L_N$.</p>

<p>The next line contains a single integer $Q$ — the number of planned diving days.</p>

<p>The next $Q$ lines describe the planned dives. The $i$-th of these lines contains a single integer $d_i$ — the horizontal coordinate for that day's dive. It is guaranteed that $d$ will not be equal to any $L_i$.</p>

### 출력

<p>For each of the $Q$ dives, output a single line containing two space-separated integers, $s$ and $t$. These two integers must represent the minimum possible starting altitude as an <strong>irreducible fraction</strong> $s/t$. If the denominator is $1$, you should still print it.</p>

### 제한

<ul>
<li>$2 \le N \le 2 \cdot 10^5$</li>
<li>$1 \le Q \le 2 \cdot 10^5$</li>
<li>$1 \le L_i, H_i \le 10^9$</li>
<li>$L_1 &lt; d_i &lt; L_N$ ($ 1 \le i \le Q$)</li>
</ul>