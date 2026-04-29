# [Gold II] AND and/or OR - 35175

[문제 링크](https://www.acmicpc.net/problem/35175)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 19, 정답: 16, 맞힌 사람: 13, 정답 비율: 92.857%

### 분류

비트마스킹, 애드 혹

### 문제 설명

<p>Suppose you have a non-negative integer $x$. You can do two types of operations:</p>

<ol>
<li>$x := x \textrm{ AND } 2x$;</li>
<li>$x := x \textrm{ OR } 2x$;</li>
</ol>

<p>where \textrm{AND} and \textrm{OR} are the bitwise AND and bitwise OR operations, respectively.</p>

<p>You are given three integers $N$, $A$, and $B$.</p>

<p>If the value of $x$ is initially $N$, is there any sequence of operations that consists of <strong>exactly</strong> $A$ operations of type 1 and <strong>exactly</strong> $B$ operations of type 2, such that the final value of $x$ is $N \cdot 2^k$ for some non-negative integer $k$?</p>

### 입력

<p>Input consists of three integers $N$, $A$, and $B$ ($1 \leq N \leq 10^{18}$, $0 \leq A, B \leq 10^{18}$, $A + B \geq 1$).</p>

### 출력

<p>Output a single line containing <code>YES</code> if it is possible to make the final value of $x$ equal to $N \cdot 2^k$ where $k$ is a non-negative integer, or <code>NO</code> otherwise.</p>