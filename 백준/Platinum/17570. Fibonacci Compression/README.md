# [Platinum V] Fibonacci Compression - 17570

[문제 링크](https://www.acmicpc.net/problem/17570)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 26, 맞힌 사람: 25, 정답 비율: 65.789%

### 분류

자료 구조, 세그먼트 트리, 집합과 맵

### 문제 설명

<p>Fibonacci compression is a new type of fault-tolerant compression based on Fibonacci numbers. Symbols are constructed according to the rule that no code word may have two consecutive &ldquo;1&rdquo; bits at any place other than the end, where they are mandatory. In practice this means that, for each compressed symbol bit-length i where i &ge; 2, there are Fibonacci(i &minus; 1) compressed symbols of that length.</p>

<p>For example, the shortest 14 Fibonacci code words are as follows:</p>

<pre>
11       011      0011    1011
00011    10011    01011   000011
100011   010011   001011  101011
0000011  1000011  ...</pre>

<p>Compressing a string using Fibonacci compression works by replacing the most frequent characters with the shortest codes. Given one such string s, find the length of each of its prefixes when compressed as small as possible according to this system.</p>

### 입력

<ul>
	<li>One line containing the length of the string to compress, n (1 &le; n &le; 10<sup>5</sup>).</li>
	<li>One line containing the string s as a sequence of n integers s<sub>i</sub> (0 &le; s<sub>i</sub>&nbsp;&le; 10<sup>6</sup>).</li>
</ul>

### 출력

<p>Output |s| lines, where the ith line is the compressed length of the first i characters of s, in bits.</p>