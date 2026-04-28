# [Silver V] Periodic Strings - 13748

[문제 링크](https://www.acmicpc.net/problem/13748)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 109, 정답: 80, 맞힌 사람: 76, 정답 비율: 76.000%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>Define a $k$<em>-periodic string</em> as follows:</p>

<blockquote>
<p>A string $s$ is $k$-periodic if $|s|$, the length of the string, is a multiple of $k$ and, if you chop the string up into $|s|/k$ substrings of length $k$, then each of those substrings (except the first) is the same as the previous substring, but with its last character moved to the front.</p>
</blockquote>

<p>For example, the following string is $3$-periodic:</p>

<p style="text-align: center;"><code>abccabbcaabc</code></p>

<p>The above string breaks up into substrings <code>abc</code>, <code>cab</code>, <code>bca</code>, and <code>abc</code>, and each substring (except the first) is a rotation of the previous substring (<code>abc</code> $\rightarrow$ <code>cab</code>, <code>cab</code> $\rightarrow$ <code>bca</code>, <code>bca</code> $\rightarrow$ <code>abc</code>).</p>

<p>Given a string, determine the smallest $k$ for which the string is $k$-periodic.</p>

### 입력

<p>Input will be a single line containing a string $s$, ($1 \leq |s| \leq 100$), consisting only of lower-case letters.</p>

### 출력

<p>Print a single line containing an integer denoting the smallest value of $k$ for which the input string is $k$-periodic.</p>