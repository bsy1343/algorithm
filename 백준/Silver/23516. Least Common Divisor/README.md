# [Silver V] Least Common Divisor - 23516

[문제 링크](https://www.acmicpc.net/problem/23516)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 132, 정답: 82, 맞힌 사람: 59, 정답 비율: 59.596%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>A <em>divisor</em> of string $A$ is a string $D$ which can be repeated an integer number of times to obtain $A$. For example, divisors of string &quot;<code>aaaa</code>&quot; are strings &quot;<code>a</code>&quot;, &quot;<code>aa</code>&quot;, and &quot;<code>aaaa</code>&quot;, and divisors of string &quot;<code>ababab</code>&quot; are strings &quot;<code>ab</code>&quot; and &quot;<code>ababab</code>&quot;.</p>

<p>Consider two strings $S$ and $T$. Find the shortest of strings which are simultaneously divisors of $S$ and divisors of $T$, or determine that there are no such strings.</p>

### 입력

<p>The first line contains string $S$, and the second line contains string $T$. Each of these strings has length from $1$ to $50$ characters, inclusive, and consists only of lowercase English letters.</p>

### 출력

<p>Print the least common divisor of strings $S$ and $T$, or the string &quot;<code>No solution</code>&quot; in case the least common divisor does not exist.</p>