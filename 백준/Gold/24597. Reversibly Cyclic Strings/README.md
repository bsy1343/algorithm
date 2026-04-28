# [Gold IV] Reversibly Cyclic Strings - 24597

[문제 링크](https://www.acmicpc.net/problem/24597)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 168, 정답: 93, 맞힌 사람: 78, 정답 비율: 56.934%

### 분류

문자열, 애드 혹, 집합과 맵

### 문제 설명

<p>A string $t$ is a <em>Cyclic Substring</em> of a string $s$ if there is some rotation of $s$ such that $t$ is a substring of that rotation of $s$.</p>

<p>For example, if $s$ is <code>fatcat</code>, then <code>atc</code> and <code>atf</code> are both <em>Cyclic Substrings</em> of $s$. However, <code>act</code> is not a <em>Cyclic Substring</em> of $s$.</p>

<p>A string $s$ is <em>Internally Reversibly Cyclic</em> if, for every proper substring $t$ of $s$, the reverse of $t$ is a <em>Cyclic Substring</em> of $s$.</p>

<p>Given a string, determine if it is <em>Internally Reversibly Cyclic</em>.</p>

### 입력

<p>The single line of input contains a string $s$ ($1 \le |s| \le 1{,}000$, $s \in \{\texttt{a}-\texttt{z}\}^*$)</p>

### 출력

<p>Output a single integer, which is $1$ if $s$ is <em>Internally Reversibly Cyclic</em>, $0$ otherwise.</p>