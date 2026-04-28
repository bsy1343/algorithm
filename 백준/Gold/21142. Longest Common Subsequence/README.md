# [Gold I] Longest Common Subsequence - 21142

[문제 링크](https://www.acmicpc.net/problem/21142)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 69, 맞힌 사람: 58, 정답 비율: 72.500%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>You are given $n$ strings, each a permutation of the first $k$ upper-case letters of the alphabet.</p>

<p>String $s$ is a <em>subsequence</em> of string $t$ if and only if it is possible to delete some (possibly zero) characters from the string $t$ to get the string $s$.</p>

<p>Compute the length of the longest common <em>subsequence</em> of all $n$ strings.</p>

### 입력

<p>The first line of input contains two integers $n$ ($1 \le n \le 10^5$) and $k$ ($1 \le k \le 26$), where $n$ is the number of strings, and the strings are all permutations of the first $k$ upper-case letters of the alphabet.</p>

<p>Each of the next $n$ lines contains a single string $t$. It is guaranteed that every $t$ contains each of the first $k$ upper-case letters of the alphabet exactly once.</p>

### 출력

<p>Output a single integer, the length of the longest subsequence that appears in all $n$ strings.</p>