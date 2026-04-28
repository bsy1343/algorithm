# [Platinum II] Code Names - 21183

[문제 링크](https://www.acmicpc.net/problem/21183)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 22, 맞힌 사람: 21, 정답 비율: 87.500%

### 분류

이분 매칭, 홀짝성

### 문제 설명

<p>You are given $W$, a set of $N$ words that are anagrams of each other. There are no duplicate letters in any word. A set of words $S \subseteq W$ is called &quot;swap-free&quot; if there is no way to turn a word $x \in S$ into another word $y \in S$ by swapping only a single pair of (not necessarily adjacent) letters in $x$. Find the size of the largest swap-free set $S$ chosen from the given set $W$.</p>

### 입력

<p>The first line of input contains an integer $N$ ($1 \le N \le 500$). Following that are $N$ lines each with a single word. Every word contains only lowercase English letters and no duplicate letters. All $N$ words are unique, have at least one letter, and every word is an anagram of every other word.</p>

### 출력

<p>Output the size of the largest swap-free set.</p>