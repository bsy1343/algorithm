# [Platinum I] Lazy Printing - 28051

[문제 링크](https://www.acmicpc.net/problem/28051)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 120, 정답: 50, 맞힌 사람: 41, 정답 비율: 45.556%

### 분류

그리디 알고리즘, 문자열, 이분 탐색, 해싱, KMP

### 문제 설명

<p>Vin&iacute;cius has an interesting typing machine. The machine accepts instructions consisting of a non-empty string $s$ and a positive integer $n$. For each such instruction, the machine prints $n$ characters: the $i$-th ($0$-based) printed character equals $s_r$, where $r$ is the remainder after dividing $i$ by the length of $s$ and $s_r$ denotes the $r$-th ($0$-based) character of $s$. For instance, with the sequence of instructions:</p>

<ol>
	<li>$s =$ &ldquo;<code>ab</code>&rdquo;, $n = 4$</li>
	<li>$s =$ &ldquo;<code>cd</code>&rdquo;, $n = 3$</li>
	<li>$s =$ &ldquo;<code>xx</code>&rdquo;, $n = 2$</li>
</ol>

<p>the machine will print &ldquo;<code>ababcdcxx</code>&rdquo;.</p>

<p>Vin&iacute;cius is lazy, so he only gives strings of length at most $D$ to the machine in each instruction. Since he is very lazy, he also wants to use as few instructions as possible. Given a string $T$ and the integer $D$, help Vin&iacute;cius find the minimum number of instructions he needs in order to print $T$ using the machine.</p>

### 입력

<p>The input consists of a single line that contains a string $T$ of lowercase letters followed by the integer $D$ ($1 &le; D &le; |T| &le; 2 \times 10^5$), as described in the statement.</p>

### 출력

<p>Output a single line with an integer indicating the minimum number of instructions Vin&iacute;cius needs.</p>