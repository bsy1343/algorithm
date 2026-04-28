# [Bronze III] Finding Maximal Non-Trivial Monotones - 26201

[문제 링크](https://www.acmicpc.net/problem/26201)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 221, 정답: 173, 맞힌 사람: 152, 정답 비율: 77.949%

### 분류

구현, 문자열

### 문제 설명

<p>In this problem we will be dealing with character sequences, often called <em>strings</em>. A sequence is <em>non-trivial</em> if it contains at least two elements.</p>

<p>Given a sequence $s$, we say that a chunk $s_i , \dots , s_j$ is <em>monotone</em> if all its characters are equal, and we say that it is <em>maximal</em> if this chunk cannot be extended to left or right without losing the monotonicity.</p>

<p>Given a sequence composed only of characters &ldquo;<code>a</code>&rdquo; and &ldquo;<code>b</code>&rdquo;, determine how many characters &ldquo;<code>a</code>&rdquo; occur in non-trivial maximal monotone chunks.</p>

### 입력

<p>The input consists of two lines. The first line contains a single integer $N$, where $1 &le; N &le; 10^5$. The second line contains a string with exactly $N$ characters, composed only of the characters &ldquo;<code>a</code>&rdquo; and &ldquo;<code>b</code>&rdquo;.</p>

### 출력

<p>Print a single line containing an integer representing the total number of times the character &ldquo;<code>a</code>&rdquo; occurs in non-trivial maximal monotone chunks.</p>