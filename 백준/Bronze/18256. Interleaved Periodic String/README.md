# [Bronze I] Interleaved Periodic String - 18256

[문제 링크](https://www.acmicpc.net/problem/18256)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 173, 정답: 85, 맞힌 사람: 70, 정답 비율: 47.619%

### 분류

문자열, 애드 혹

### 문제 설명

<p>An interleaved periodic string S can be written down using the following procedure:</p>

<ol>
	<li>Write down any two strings s<sub>1</sub> and s<sub>2</sub> of lengths p<sub>1</sub> and p<sub>2</sub> respectively. The strings must consist of only 0s and 1s, and can possibly be empty.</li>
	<li>Concatenate some copies of the string s<sub>1</sub> to obtain string S<sub>1</sub>.</li>
	<li>Concatenate some copies of the string s<sub>2</sub> to obtain string S<sub>2</sub>.</li>
	<li>Interleave the strings S<sub>1</sub> and S<sub>2</sub> to obtain S.</li>
</ol>

<p>To interleave two strings, merge their characters arbitrarily, maintaining the relative order in which they occur in both strings. For example, the strings &ldquo;101&rdquo; and &ldquo;011&rdquo; can be interleaved to get &ldquo;011011&rdquo; or &ldquo;101011&rdquo;, however they cannot be interleaved to form &ldquo;110110&rdquo;. Given S, find the minimum possible value of (p<sub>1</sub> + p<sub>2</sub>).</p>

### 입력

<p>The input consists of multiple test cases. The first line contains the number of test cases T. Each of the next T lines contain a string S consisting of only &lsquo;0&rsquo;s and &lsquo;1&rsquo;s.</p>

### 출력

<p>Output T lines, one corresponding to each test case, containing the minimum value of (p<sub>1</sub> + p<sub>2</sub>) for the corresponding test case.</p>

### 제한

<ul>
	<li>1 &le; T &le; 20</li>
	<li>1 &le; length of S &le; 16</li>
</ul>