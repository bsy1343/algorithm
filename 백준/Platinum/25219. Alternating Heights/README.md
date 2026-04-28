# [Platinum V] Alternating Heights - 25219

[문제 링크](https://www.acmicpc.net/problem/25219)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 93, 정답: 33, 맞힌 사람: 32, 정답 비율: 42.667%

### 분류

방향 비순환 그래프, 그래프 이론, 그래프 탐색, 위상 정렬, 두 포인터

### 문제 설명

<p>Troy is planning to take a group photo of the students at CCO and has asked you for help.</p>

<p>There are $K$ students, numbered from $1$ to $K$. Troy has forgotten the students&#39; heights but remembers that no two students have the same height.</p>

<p>Troy has prepared a sequence $A_1, A_2, \ldots, A_N$ representing the order of students in the group photo, from left to right. It is possible for a student to appear multiple times in $A$. You aren&#39;t sure how this group photo would be taken, but you&#39;re unwilling to assume that Troy made a mistake.</p>

<p>Troy will ask you $Q$ queries of the form <code>x y</code>, which is a compact way of asking &quot;Given the sequence of students, $A_x, A_{x + 1}, \dots, A_y$, can their heights form an alternating sequence?&quot; More precisely, we denote the height of the $i^\text{th}$ student as $h[i]$. If there exists an assignment of heights $h[1], h[2], \ldots, h[K]$ such that $h[A_x] &gt; h[A_{x + 1}] &lt; h[A_{x + 2}] &gt; h[A_{x + 3}] &lt; \ldots h[A_y]$, answer <code>YES</code>; otherwise, answer <code>NO</code>.</p>

<p>Note that each of the $Q$ queries will be independent: that is, the assignment of heights for query $i$ is independent of the assignment of heights for query $j$ so long as $i \ne j$.</p>

### 입력

<p>The first line of input will contain three space-separated integers $N$, $K$, and $Q$.</p>

<p>The second line of input will contain the array $A_1, A_2, \ldots, A_N$ $(1 \le A_i \le K)$.</p>

<p>The next $Q$ lines will each contain a query of the form of two space-separated integers $x$ and $y$ $(1 \le x &lt; y \le N)$.</p>

### 출력

<p>Output $Q$ lines. On the $i^\text{th}$ line, output the answer to Troy&#39;s $i^\text{th}$ query. Note that the answer is either <code>YES</code> or <code>NO</code>.</p>

### 힌트

<p>For the first query, we will never have $h[1] &gt; h[1]$, so the answer is no.</p>

<p>For the second query, one solution to $h[1] &gt; h[2] &lt; h[3] &gt; h[1]$ is $h[1] = 160cm, h[2] = 140cm, h[3] = 180cm$. Another solution could be $h[1] = 1.55m, h[2] = 1.473m, h[3] = 1.81m$.</p>

<p>For the third query, we cannot have both $h[1] &gt; h[2]$ and $h[1] &lt; h[2]$.</p>