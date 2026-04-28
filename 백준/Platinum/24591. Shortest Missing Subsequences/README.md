# [Platinum V] Shortest Missing Subsequences - 24591

[문제 링크](https://www.acmicpc.net/problem/24591)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 108, 정답: 43, 맞힌 사람: 40, 정답 비율: 42.105%

### 분류

이분 탐색, 그리디 알고리즘, 문자열

### 문제 설명

<p>Given a string $s$ we say that string $t$ is a <em>Subsequence</em> of $s$ if $t$ can be obtained from $s$ by deleting zero or more characters of $s$. Note that $t$ is not necessarily a substring of $s$---that is, $t$ is not necessarily contiguous in $s$, but the characters of $t$ appear in the same order as they do in $s$.</p>

<p>For a given subset, $v$, of the lowercase English alphabet characters from <code>&#39;a&#39;</code> to <code>&#39;z&#39;</code>, we say that string $u$ is a <em>Missing Subsequence</em> of another string $s$ if $u$ is not a <em>Subsequence</em> of $s$, but all characters in $u$ and all the characters of $s$ are in the set $v$. A <em>Shortest Missing Subsequence</em> of $s$ is a <em>Missing Subsequence</em> of $s$ with the smallest length among all <em>Missing Subsequences</em> of $s$.</p>

<p>Given a set of English alphabetic characters, a target string made up of characters from that set, and a list of query strings made up of characters from that set, determine if each of the query strings is a <em>Shortest Missing Subsequence</em> of the target string.</p>

### 입력

<p>The first line of input contains a string $v$ ($1 \le |v| \le 26$) of lowercase letters, in lexicographical order. Each letter appears at most once. This is the set of alphabetic characters.</p>

<p>The next line of input contains a string $s$ ($1 \le |s| \le 10^6$, $s$ only contains letters from $v$). This is the target string to be queried.</p>

<p>The next line contains an integer $n$ ($1 \le n \le 10^6$). This is the number of queries.</p>

<p>Each of the next $n$ lines contains a string $q$ ($1 \le |q| \le 10^6$, $q$ only contains letters from $v$). These are the query strings. The sum of the lengths of all query strings will not exceed $10^6$.</p>

### 출력

<p>Output $n$ lines, one for each query. On each line, output either $1$ if the query string is a <em>Shortest Missing Subsequence</em> of the target string, or $0$ if it is not. The outputs must be in the order of the input queries.</p>