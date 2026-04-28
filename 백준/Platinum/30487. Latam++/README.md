# [Platinum II] Latam++ - 30487

[문제 링크](https://www.acmicpc.net/problem/30487)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 57, 정답: 21, 맞힌 사람: 21, 정답 비율: 41.176%

### 분류

이분 탐색, 많은 조건 분기

### 문제 설명

<p>The world does not have enough programming languages yet. To help with that, the Internal Committee for the Perfection of C (ICPC) is planning to build a brand new programming language: <code>Latam++</code>.</p>

<p>In <code>Latam++</code>, a variable name consists exclusively of one or more lowercase letters of the English alphabet. A valid expression is a &ldquo;well-formed&rdquo; string, expressing how to combine variables by using the four arithmetic binary operators &ldquo;<code>+</code>&rdquo;, &ldquo;<code>-</code>&rdquo;, &ldquo;<code>*</code>&rdquo; and &ldquo;<code>/</code>&rdquo;, possibly with parentheses.</p>

<p>Formally, valid expressions are exactly those strings that can be produced by the following rules.</p>

<ul>
	<li>A variable name is a valid expression.</li>
	<li>Surrounding any valid expression in parentheses produces another valid expression.</li>
	<li>If A and B are valid expressions, then the concatenation AcB is a valid expression, where c is any of the four arithmetic binary operators &ldquo;<code>+</code>&rdquo;, &ldquo;<code>-</code>&rdquo;, &ldquo;<code>*</code>&rdquo; and &ldquo;<code>/</code>&rdquo;.</li>
</ul>

<p>Thus, the following are all valid expressions:</p>

<ul>
	<li><code>a+b</code></li>
	<li><code>a+b*(c+b)</code></li>
	<li><code>atoms+boots*(charly+bob)</code></li>
	<li><code>(((a)))*(bbasdsaqwe/a/a/a)</code></li>
</ul>

<p>On the contrary, the following are not valid expressions:</p>

<ul>
	<li><code>a+</code></li>
	<li><code>a+b(c+b)</code></li>
	<li><code>atoms+boots*((charly+bob)</code></li>
	<li><code>((()))*(bbasdsaqwe/a/a/a)</code></li>
</ul>

<p>The language is far from complete, and it will likely take ICPC decades of debates until the first version of <code>Latam++</code> is released. Meanwhile, we will focus only on a specific and very special feature of its compiler, called Automatic Valid Substring Expression Counting (AVSEC).</p>

<p>AVSEC is an extremely useful feature, where the compiler reports the total number of substrings of a given string that are valid expressions. Your task is to implement AVSEC.</p>

<p>For counting purposes, two substrings are considered different if they start or end at different indexes, even if the corresponding strings are identical (that is, they are the same sequence of characters).</p>

### 입력

<p>The input consists of a single line that contains a string S (1 &le; |S| &le; 2 &times; 10<sup>5</sup>), which is made up of lowercase letters, opening or closing parenthesis, and the four characters &ldquo;<code>+</code>&rdquo;, &ldquo;<code>-</code>&rdquo;, &ldquo;<code>*</code>&rdquo; and &ldquo;<code>/</code>&rdquo;.</p>

### 출력

<p>Output a single line with an integer indicating the number of substrings of S that are valid expressions.</p>