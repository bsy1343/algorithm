# [Gold II] Permutations - 8342

[문제 링크](https://www.acmicpc.net/problem/8342)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 13, 맞힌 사람: 13, 정답 비율: 27.660%

### 분류

애드 혹, 많은 조건 분기, 수학

### 문제 설명

<p>A permutation<sup>1</sup>&nbsp;p&nbsp;of a set m&nbsp;is called an involution if p(p(i)) = i&nbsp;for each i&nbsp;&isin;&nbsp;M.</p>

<p>By a bracket expression of length 2n&nbsp;we mean a word of length 2n&nbsp;consisting only of the characters &#39;<tt>(</tt>&#39; and &#39;<tt>)</tt>&#39;. A bracket expression is called&nbsp;<i>correct</i>&nbsp;if the number of opening brackets in the expression equals the number of closing brackets and in every prefix of the expression the number of the characters &#39;<tt>(</tt>&#39; is no less than the number of characters &#39;<tt>)</tt>&#39;.</p>

<p>We say that a permutation p&nbsp;of length 2n&nbsp;<i>encodes</i>&nbsp;a bracket expression of length 2n, if opening brackets of the expression (from left to right) are located at positions p(1), p(2), ..., p(n), and closing brackets - also from left to right - at positions p(n+1), p(n+2), ..., p(2n). In particular, in such a case both p(1) &lt; p(2) &lt; ... &lt; p(n)&nbsp;and p(n+1) &lt; p(n+2) &lt; ... &lt; p(2n)&nbsp;hold.</p>

<p>The values of a permutation p&nbsp;for several arguments are known. It should be determined in how many ways the remaining values of&nbsp;p&nbsp;can be determined in such a way that it is an involution and it encodes a correct bracket expression.</p>

<p><sup>1</sup>. A permutation of a set M = {1, 2, 3, ..., m}&nbsp;is any one-to-one function p : M&nbsp;&rarr; M.</p>

### 입력

<p>The first line of the standard input contains two integers n&nbsp;and k&nbsp;(1 &le; n &le; 1,000,000, 1 &le; k &le; 2n) separated by a single space. Each of the following k&nbsp;lines contains one pair of space-separated integers; the i<sup>th</sup>&nbsp;of these lines contains numbers a<sub>i</sub>&nbsp;and b<sub>i</sub>&nbsp;(1 &le; a<sub>i</sub>, b<sub>i</sub> &le; 2n), meaning that p(a<sub>i</sub>) = b<sub>i</sub>. All values a<sub>i</sub>&nbsp;are distinct and all values b<sub>i</sub>&nbsp;are distinct.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer: the number of permutations of the set {1, 2, 3, ..., 2n}&nbsp;that: are involutions, encode some correct bracket expression, and for which p(a<sub>i</sub>) = b<sub>i</sub>&nbsp;holds for each 1 &le; i &le; k.</p>

### 힌트

<p>The only permutation that complies with requirements of the task is &lt;1, 2, 4, 3, 5, 6&gt;, and it encodes the following bracket expression:&nbsp;<tt>(()())</tt>.</p>