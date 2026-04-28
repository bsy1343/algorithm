# [Platinum V] New Maths - 21184

[문제 링크](https://www.acmicpc.net/problem/21184)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 37, 정답: 28, 맞힌 사람: 27, 정답 비율: 75.000%

### 분류

수학, 백트래킹

### 문제 설명

<p>&quot;Drat!&quot; cursed Charles. &nbsp;&quot;This stupid carry bar is not working in my Engine! &nbsp;I just tried to calculate the square of a number, but it&#39;s wrong; all of the carries are lost.&quot;</p>

<p>&quot;Hmm,&quot; mused Ada, &quot;arithmetic without carries! &nbsp;I wonder if I can figure out what your original input was, based on the result I see on the Engine.&quot;</p>

<p><em>Carryless addition</em>, denoted by $\oplus$, is the same as normal addition, except any carries are ignored (in base $10$). Thus, $37 \oplus 48$ is $75$, not $85$.</p>

<p><em>Carryless multiplication</em>, denoted by $\otimes$, is performed using the schoolboy algorithm for multiplication, column by column, but the intermediate additions are calculated using <em>carryless addition</em>. More formally, Let $a_m a_{m-1} \ldots a_1 a_0$ be the digits of $a$, where $a_0$ is its least significant digit. Similarly define $b_n b_{n-1} \ldots b_1 b_0$ be the digits of $b$. The digits of $c = a \otimes b$ are given by the following equation: \[ c_k = \left( a_0 b_k \oplus a_1 b_{k-1} \oplus \cdots \oplus a_{k-1} b_1 \oplus a_k b_0 \right) \bmod{10}, \] where any $a_i$ or $b_j$ is considered zero if $i &gt; m$ or $j &gt; n$. For example, $9 \otimes 1\,234$ is $9\,876$, $90 \otimes 1\,234$ is $98\,760$, and $99 \otimes 1\,234$ is $97\,536$.</p>

<p>Given $N$, find the smallest positive integer $a$ such that $a \otimes a = N$.</p>

### 입력

<p>The input consists of a single line with a positive integer $N$, with at most $25$ digits and no leading zeros.</p>

### 출력

<p>Print, on a single line, the least positive number $a$ such that $a \otimes a = N$. If there is no such $a$, print &#39;<code>-1</code>&#39; instead.</p>