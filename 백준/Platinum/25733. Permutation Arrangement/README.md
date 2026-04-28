# [Platinum II] Permutation Arrangement - 25733

[문제 링크](https://www.acmicpc.net/problem/25733)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 152, 정답: 61, 맞힌 사람: 47, 정답 비율: 49.474%

### 분류

그리디 알고리즘, 애드 혹, 백트래킹

### 문제 설명

<p>You are given an array $a$ of length $N$. Each element of $a$ is either -1 or an integer between $1$ and $N$. Each number between $1$ and $N$ appears at most once in $a$. Also, no two adjacent elements of $a$ have a difference of $1$.</p>

<p>You are to find the lexicographically smallest permutation $p$ of $\{1,2,\cdots ,N\}$ satisfying the following.</p>

<ul>
	<li>If $a_i\neq -1$, then $a_i=p_i$ ($1\leq i\leq N$)</li>
	<li>$|p_i-p_{i+1}|\neq 1$ ($1\leq i\leq N-1$)</li>
</ul>

### 입력

<p>The first line contains one integer, $N$.</p>

<p>The second line contains space-separated $N$ integers &mdash; elements of the array $a$.</p>

### 출력

<p>If there is no permutation $p$ satisfying the condition, then output a single integer $-1$.</p>

<p>Otherwise, output the lexicographically smallest permutation $p$.</p>

### 제한

<ul>
	<li>$1\leq N\leq 200,000$</li>
	<li>$1\le a_i\le N$ or $a_i=-1$ ($1\leq i\leq N$)</li>
	<li>$a_i\neq a_j$ or $a_i=-1$ ($1\leq i&lt;j\leq N$)</li>
	<li>$|a_i-a_{i+1}|\neq 1$ ($1\leq i\leq N-1$)</li>
</ul>