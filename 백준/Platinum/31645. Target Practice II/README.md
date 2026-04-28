# [Platinum III] Target Practice II - 31645

[문제 링크](https://www.acmicpc.net/problem/31645)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 24, 맞힌 사람: 23, 정답 비율: 43.396%

### 분류

그리디 알고리즘, 매개 변수 탐색

### 문제 설명

<p><strong>Note: The large size of integers involved in this problem may require the use of 64-bit integer data types (e.g., a &quot;long long&quot; in C/C++).</strong></p>

<p>The Paris Moolympics are coming up and Farmer John is training his team of cows in archery! He has set up the following exercise on the 2D coordinate plane.</p>

<p>There are $N (1 \leq N \leq 4 \cdot 10^4)$ axis-aligned rectangular targets and $4N$ cows. Every cow must be assigned to a different target vertex. At moment $i$, for $1 \leq i \leq N$:</p>

<ol>
	<li>Target $i$ appears.</li>
	<li>The $4$ cows assigned to its vertices shoot at them.</li>
	<li>If a cow&#39;s shot passes through the interior of the target before it hits the assigned vertex or misses, the cows <strong>fail</strong> the exercise.</li>
	<li>The target disappears to make space for the next one.</li>
</ol>

<p>Each cow is located on the $y$-axis $(x = 0)$, and each target is a rectangle where target $i$ has its lower left coordinate at $(X_1, y_1^{(i)})$ and its upper right coordinate at $(x_2^{(i)}, y_2^{(i)})$. The coordinates also satisfy $1 \leq X_1 &lt; x_2^{(i)}\leq 10^9$ and $1 \leq y_1^{(i)} &lt; y_2^{(i)} \leq 10^9$ (Note: $X_1$ is the same for every target).</p>

<p>In addition, each cow has a &quot;focus&quot; angle they are working on. Therefore, they will turn at a specific angle when shooting. Given that their shot travels in a straight line from their position towards their assigned vertex, the trajectory of cow $i$&#39;s arrow can be described by $s_i$ $(0 &lt; |s_i| &lt; 10^9)$, the slope of the trajectory.</p>

<p>So that he can carefully examine the cows&#39; technique, Farmer John wants to minimize the distance between the furthest cows. If Farmer John were to optimally assign each cow to a target vertex and place them on the $y$-axis, can you help him determine what the minimum distance between the furthest cows would be or if the cows will always fail the exercise?</p>

<p>Each input contains $T$ ($1 \leq T \leq 10$) independent test cases. The sum of $N$ across all test cases is guaranteed to not exceed $4\cdot 10^4$.</p>

### 입력

<p>The first line contains $T$ ($1 \leq T \leq 10$), the number of independent test cases. Each test case is described as follows:</p>

<p>The first line of each test case contains two integers, $N$ and $X_1$, the number of targets and the left-most $x$-coordinate of the targets respectively.</p>

<p>This is followed by $N$ lines with the $i$-th line consisting of three integers, $y_1^{(i)}$, $y_2^{(i)}$, and $x_2^{(i)}$, the lower $y$-coordinate, the upper $y$-coordinate, and the right $x$-coordinate of the $i$-th target respectively.</p>

<p>The last line consists of $4N$ integers, $s_1, s_2, \dots, s_{4N}$ where $s_i$ denotes the slope of cow $i$&#39;s shot trajectory.</p>

### 출력

<p>The minimum possible distance between the furthest cows or $-1$ if the cows will always fail the exercise.</p>