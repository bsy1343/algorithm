# [Gold IV] Balancing Bacteria - 31560

[문제 링크](https://www.acmicpc.net/problem/31560)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 276, 정답: 131, 맞힌 사람: 111, 정답 비율: 54.412%

### 분류

수학, 그리디 알고리즘

### 문제 설명

<p>Farmer John has $N$ ($1\le N\le 2\cdot 10^5$) patches of grass in a line, where patch $i$ has a level of bacteria that differs by $a_i$ from that of healthy grass ($-10^{15}\le a_i \le 10^{15}$). For example, if $a_i = -3$, then patch $i$ has a level of bacteria 3 lower than normal, and would need exactly 3 additional units of bacteria added to raise it to the point where it is considered healthy.</p>

<p>Farmer John wants to ensure every patch of grass is corrected to have a healthy level of bacteria. Conveniently, he owns two brands of pesticide that he can spray on his field, one that adds bacteria and one that removes bacteria. When Farmer John sprays either type of pesticide, he stands in patch $N$ (the rightmost patch) and selects a power level $L$ for his sprayer ($1 \leq L \leq N$).</p>

<p>The sprayer has the most impact on patches near Farmer John, with diminishing effect farther away. If Farmer John chooses the pesticide that adds bacteria, then $L$ units of bacteria will be added to patch $N$, $L-1$ units to patch $N-1$, $L-2$ units to patch $N-2$, and so on. Patches $1 \ldots N-L$ will receive no bacteria, since the sprayer isn&#39;t set to a level powerful enough to reach them. Similarly, if Farmer John chooses the pesticide that removes bacteria, then $L$ units of bacteria will be removed from patch $N$, $L-1$ units will be removed from patch $N-1$, and so on. Again, patches $1 \ldots N-L$ will be unaffected.</p>

<p>Find the minimum number of times Farmer John has to apply his sprayer such that every patch of grass has the recommended value of bacteria for healthy grass. It is guaranteed that the answer is at most $10^9$.</p>

<p><strong>Note that the large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a &quot;long long&quot; in C/C++).</strong></p>

### 입력

<p>The first line contains $N$.</p>

<p>The second line contains $N$ integers $a_1\dots a_N$, the initial bacteria levels of each patch of grass.</p>

### 출력

<p>The minimum number of applications necessary to make every patch of grass have the recommended value of bacteria for healthy grass.</p>