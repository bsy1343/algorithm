# [Platinum II] K-th String - 19377

[문제 링크](https://www.acmicpc.net/problem/19377)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 16, 정답: 11, 맞힌 사람: 7, 정답 비율: 63.636%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Alice has $n \le 26$ cards, and each card is labeled with one of the first $n$ lowercase English letters. For example, if $n = 3$, Alice has three cards that are labeled &quot;<code>a</code>&#39;&#39;, &quot;<code>b</code>&#39;&#39;, and &quot;<code>c</code>&#39;&#39;. Alice constructed a string $t$ by permuting these cards. Furthermore, she considered all non-empty substrings of $t$ and sorted them lexicographically. It turned out that the $k$-th string in this sorted list of substrings was $s$. How many $t$&#39;s are possible?</p>

<p>For example, if $n = 3$ and $t = <code>cab</code>$, the sorted list is <code>a</code>, <code>ab</code>, <code>b</code>, <code>c</code>, <code>ca</code>, <code>cab</code>, and the third string in the sorted list is <code>b</code>. When $k = 3$ and $s = <code>b</code>$, there are two possibilites for $t$: <code>cab</code> and <code>bac</code>.</p>

<p>Compute the number of possible $t$&#39;s that are consistent with the given information, modulo $10^9 + 7$. Note that Alice may have made mistakes, in which case the number of possible $t$&#39;s is zero.</p>

### 입력

<p>On the first line, you are given two space-separated integers $n$ and $k$. On the next line, you are given the string $s$ ($1 \le n \le 26$, $1 \le k \le n (n + 1) / 2$). The characters in $s$ are pairwise distinct; $s$ consists of the first $n$ lowercase English letters.</p>

### 출력

<p>Print the answer on a single line.</p>