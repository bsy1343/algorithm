# [Platinum III] Ambiguous Encoding - 18216

[문제 링크](https://www.acmicpc.net/problem/18216)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 43, 맞힌 사람: 42, 정답 비율: 73.684%

### 분류

데이크스트라, 그래프 이론, 최단 경로

### 문제 설명

<p>A friend of yours is designing an encoding scheme of a set of characters into a set of variable length bit sequences. You are asked to check whether the encoding is ambiguous or not. In an encoding scheme, characters are given distinct bit sequences of possibly different lengths as their codes. A character sequence is encoded into a bit sequence which is the concatenation of the codes of the characters in the string in the order of their appearances. An encoding scheme is said to be ambiguous if there exist two different character sequences encoded into exactly the same bit sequence. Such a bit sequence is called an &ldquo;ambiguous binary sequence&rdquo;.</p>

<p>For example, encoding characters &ldquo;A&rdquo;, &ldquo;B&rdquo;, and &ldquo;C&rdquo; to 0, 01 and 10, respectively, is ambiguous. This scheme encodes two different character strings &ldquo;AC&rdquo; and &ldquo;BA&rdquo; into the same bit sequence 010.</p>

### 입력

<p>The input consists of a single test case of the following format.</p>

<pre>
n
w<sub>1</sub>
.
.
.
w<sub>n</sub></pre>

<p>Here, n is the size of the set of characters to encode (1 &le; n &le; 1000). The i-th line of the following n lines, w<sub>i</sub>, gives the bit sequence for the i-th character as a non-empty sequence of at most 16 binary digits, 0 or 1. Note that different characters are given different codes, that is, w<sub>i</sub> &ne; w<sub>j</sub> for i &ne; j.</p>

### 출력

<p>If the given encoding is ambiguous, print in a line the number of bits in the shortest ambiguous binary sequence. Output zero, otherwise.</p>