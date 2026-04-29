# [Silver V] Prefix and Suffix Can Be the Same - 35098

[문제 링크](https://www.acmicpc.net/problem/35098)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 70, 정답: 63, 맞힌 사람: 55, 정답 비율: 91.667%

### 분류

구현, 문자열

### 문제 설명

<p>In this problem, a prefix of a string means a consecutive substring starting from its first character. For example, the prefixes of the string <code>icpc</code> are <code>i</code>, <code>ic</code>, <code>icp</code>, and <code>icpc</code>. Similarly, a suffix of a string means a consecutive substring ending at its last character. For example, the suffixes of the string <code>icpc</code> are <code>icpc</code>, <code>cpc</code>, <code>pc</code>, and <code>c</code>.</p>

<p>Given a string $s$, find the shortest string other than $s$ itself having $s$ as both its prefix and its suffix. It can be proven that such a string is unique.</p>

### 입력

<p>The input consists of at most $50$ test cases, each in the following format.</p>

<blockquote>
<p>$n$</p>

<p>$s$</p>
</blockquote>

<p>The first line contains an integer $n$ between $1$ and $50$, inclusive. The second line contains a string $s$ of length $n$, consisting of English lowercase letters.</p>

<p>The end of the input is indicated by a line consisting only of a zero.</p>

### 출력

<p>For each test case, output in a line the shortest string other than s having s as both its prefix and its suffix.</p>