# [Silver II] Word Game - 32799

[문제 링크](https://www.acmicpc.net/problem/32799)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 79, 정답: 17, 맞힌 사람: 15, 정답 비율: 27.778%

### 분류

구현, 문자열, 백트래킹, 브루트포스 알고리즘

### 문제 설명

<p>On the Word Game show, Ashley has selected $n$ words and asks Brandon to combine them. Two words $s$ and $t$ can be combined if $s$ has a suffix of length $k &gt; 0$ that is a prefix of $t$. The result of combining them is a new word made of $s$ concatenated with the last $|t|-k$ letters of $t$. If there are multiple values of $k$ that are valid, any can be chosen. </p>

<p>Brandon must repeatedly take a pair of words from the list of words that can be combined, and replace them in the list with the combined word, until the list contains only a single word, and that word is as short as possible. If multiple final words of the same length are possible, Brandon must find the lexicographically first one.</p>

### 입력

<p>The first line of the input contains a single integer $n$ $(1 \le n \le 5)$, the number of words to start out with.</p>

<p>The next $n$ lines each contain a single word in lowercase letters of length at most 5.</p>

### 출력

<p>Output the lexicographically first word of minimum length Brandon can come up with. If it is not possible to come up with a single word, output $-1$.</p>