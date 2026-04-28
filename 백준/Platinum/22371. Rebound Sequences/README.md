# [Platinum III] Rebound Sequences - 22371

[문제 링크](https://www.acmicpc.net/problem/22371)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 4, 정답: 4, 맞힌 사람: 4, 정답 비율: 100.000%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>An integer sequence $a$ is <strong>rebound sequence</strong> if there are three integers $i$, $j$, $k$ ($1 \le i &lt; j &lt; k \le N$) satisfying $a_i &gt; a_k &gt; a_j$. You are given an integer sequence $s$. Your task is to count the number of rebound sequences that can be obtained by permuting the elements of $s$.</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<blockquote>
<p>$N$</p>

<p>$s_1$ $s_2$ $\dots$ $s_N$</p>
</blockquote>

<p>The first line contains a single integer $N$ ($1 \le N \le 200$). The second line contains $N$ integers $s_i$ ($1 \le s_i \le N$), which is the $i$-th element of $s$.</p>

### 출력

<p>Output the number of rebound sequences that can be obtained by permuting the elements of $s$ modulo $10^9 + 7$.</p>