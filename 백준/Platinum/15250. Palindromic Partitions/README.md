# [Platinum III] Palindromic Partitions - 15250

[문제 링크](https://www.acmicpc.net/problem/15250)

### 성능 요약

시간 제한: 10 초, 메모리 제한: 128 MB

### 통계

제출: 234, 정답: 104, 맞힌 사람: 91, 정답 비율: 50.556%

### 분류

그리디 알고리즘, 문자열, 해싱, 접미사 배열과 LCP 배열

### 문제 설명

<p>A partition of a string s is a set of one or more non-overlapping non-empty substrings of s (call them a<sub>1</sub>, a<sub>2</sub>, a<sub>3</sub>, . . . , a<sub>d</sub>), such that s is their concatenation: s = a<sub>1</sub> +a<sub>2</sub> +a<sub>3</sub> +. . .+a<sub>d</sub>. We call these substrings &quot;chunks&quot; and define the length of such a partition to be the number of chunks, d.</p>

<p>We can represent the partition of a string by writing each chunk in parentheses. For example, the string &quot;<code>decode</code>&quot; can be partitioned as <code>(d)(ec)(ode)</code> or <code>(d)(e)(c)(od)(e)</code> or <code>(decod)(e)</code> or <code>(decode)</code> or <code>(de)(code)</code> or a number of other ways.</p>

<p>A partition is palindromic if its chunks form a palindrome when we consider each chunk as an atomic unit. For example, the only palindromic partitions of &quot;<code>decode</code>&quot; are <code>(de)(co)(de)</code> and <code>(decode)</code>. This also illustrates that every word has a trivial palindromic partition of length one.</p>

<p>Your task is to compute the maximal possible number of chunks in palindromic partition.</p>

### 입력

<p>The input starts with the number of test cases t in the first line. The following t lines describe individual test cases consisting of a single word s, containing only lowercase letters of the English alphabet. There are no spaces in the input.</p>

### 출력

<p>For every testcase output a single number: the length of the longest palindromic partition of the input word s.</p>

### 제한

<p>Let us denote the length of the input string s with n.</p>

<ul>
	<li>1 &le; t &le; 10</li>
	<li>1 &le; n &le; 10<sup>6</sup></li>
</ul>