# [Silver III] Cryptogram Cracking Club - 34467

[문제 링크](https://www.acmicpc.net/problem/34467)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 40, 정답: 22, 맞힌 사람: 21, 정답 비율: 56.757%

### 분류

문자열, 브루트포스 알고리즘, 수학

### 문제 설명

<p>Cyrene, the captain of the Cryptogram Cracking Club (CCC), came across a concerningly long cipher. Conveniently, this cipher is composed of lower-case characters (<code>a-z</code>). Comfortingly, the cipher is composed of a pattern that repeats infinitely.</p>

<p>Cyrene wishes to locate the $c$-th character of the cipher. To make your job easier, the CCC members have extracted the repeated pattern and compressed it using the Run-Length Encoding (RLE) algorithm, which replaces consecutive repeated characters with a single occurrence of the character followed by a count of how many times it was repeated. For example, for the pattern <code>aaaabccdddd</code>, the RLE algorithm outputs <code>a4b1c2d4</code>.</p>

<p>You are given the output of the RLE algorithm for a certain pattern. Can you determine the $c$-th character of the long cipher that is formed by repeating this pattern infinitely?</p>

### 입력

<p>The first line of input will consist of a string $S$, representing a pattern produced by the RLE algorithm. The length of $S$ will be at least $2$ and at most $2 \cdot 10^5$. Additionally, all numbers appearing in $S$ are between $1$ and $10^{12}$.</p>

<p>The next line of input contains a single integer $c$ ($0 ≤ c ≤ 10^{12}), representing the index of the character you wish to locate, starting from index $0$.</p>

### 출력

<p>Output the $c$-th character of the long cipher.</p>