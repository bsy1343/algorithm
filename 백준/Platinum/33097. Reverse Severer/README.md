# [Platinum III] Reverse Severer - 33097

[문제 링크](https://www.acmicpc.net/problem/33097)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

그리디 알고리즘, 두 포인터, 라빈–카프, 문자열, 해싱

### 문제 설명

<p>You are given a string $S$ of length $N$. There are $Q$ queries (numbered from $1$ to $Q$) that you need to answer. For query $i$, determine if a string $T_i$ of length $N$, can be obtained by performing the following algorithm from the initial string $S$.</p>

<ol>
	<li>First, split the string $S$ into one or more substrings.</li>
	<li>Reverse the order of the substrings.</li>
	<li>Concatenate the substrings into a single string.</li>
</ol>

<p>For instance, you can obtain string <code>SEVERER</code> from string <code>REVERSE</code> by splitting it into <code>R</code>, <code>E</code>, <code>VER</code>, and <code>SE</code>. After reversing the order of the substrings, your substrings will be <code>SE</code>, <code>VER</code>, <code>E</code>, and <code>R</code>. If you concatenate the substrings, then you can obtain string <code>SEVERER</code>.</p>

### 입력

<p>The first line consists of an integer $N$ ($1 ≤ N ≤ 10\, 000$).</p>

<p>The second line consists of a string $S$ of length $N$.</p>

<p>The third line consists of an integer $Q$ ($1 ≤ Q ≤ 100$)</p>

<p>Each of the next $Q$ lines consists of a string $T_i$ of length $N$.</p>

<p>All strings consist of only upper-case letters.</p>

### 출력

<p>For each query, output a single line containing a string. If string $T_i$ can be obtained from the algorithm above, output <code>YES</code>. Otherwise, output <code>NO</code>.</p>