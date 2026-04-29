# [Silver IV] Ordinal Number - 32904

[문제 링크](https://www.acmicpc.net/problem/32904)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 67, 정답: 57, 맞힌 사람: 42, 정답 비율: 82.353%

### 분류

문자열, 수학, 애드 혹

### 문제 설명

<p><em>Ordinal numbers</em> are an extension of the set of nonnegative integers. For each nonnegative integer $x$, we will establish the corresponding ordinal number $f (x)$. The first few ordinal numbers can be defined as follows.</p>

<ul>
	<li>Zero corresponds to an empty set: $f(0) = $<code>{}</code>.</li>
	<li>One corresponds to the set containing the set $f (0)$ as an element: $f(1) = $<code>{</code>$f(0)$<code>}</code>$ = $<code>{{}}</code>.</li>
	<li>Two corresponds to the set containing the sets $f (0)$ and $f (1)$ as elements: $f(2) = $<code>{</code>$f(0), f(1)$<code>}</code>$ = $<code>{{},{{}}}</code>.</li>
	<li>And so on: each positive integer $k$ corresponds to the set containing all the previous ordinal numbers as elements. The formula is: $f(k) = $<code>{</code>$f(0), f(1), \ldots , f(k - 1)$<code>}</code>.</li>
</ul>

<p>Next, we can similarly define ordinal numbers that don't correspond to integers. Alas, we won't need them in this problem.</p>

<p>You are given a string describing an ordinal number corresponding to a nonnegative integer $n$. Find $n$.</p>

### 입력

<p>The first line contains the description of an ordinal number corresponding to a certain nonnegative integer $n$ ($0 \le n \le 15$). It consists of the characters "<code>{</code>", "<code>,</code>", and "<code>}</code>".</p>

<p>In the description of each set, each element appears exactly once. However, as a set does not change if we change the order of elements, this order can be arbitrary.</p>

### 출력

<p>Print the integer $n$ corresponding to the given ordinal number.</p>