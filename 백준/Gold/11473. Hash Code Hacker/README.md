# [Gold III] Hash Code Hacker - 11473

[문제 링크](https://www.acmicpc.net/problem/11473)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 62, 정답: 46, 맞힌 사람: 44, 정답 비율: 73.333%

### 분류

해 구성하기

### 문제 설명

<p>According to Java standard library documentation, the hash code of String is computed as</p>

<pre>
s[0]*31 ^ (n -1) + s[1]*31 ^ (n -2) + ... + s[n -1]</pre>

<p>Here <code>s[i]</code> is the i-th character of the string, <code>n</code> is the length of the string, and <code>^</code> indicates exponentiation. Computation uses signed 32-bit integers in two&rsquo;s complement form.</p>

<p>Heather is going to hack the servers of Not Entirely Evil Recording Company (NEERC). To perform an attack she needs k distinct query strings that have equal hash codes. Unfortunately, NEERC servers accept query string containing lower- and uppercase English letters only.</p>

<p>Heather hired you to write a program that generates such query strings for her.</p>

### 입력

<p>The single line of the input file contains integer k &mdash; the number of required query strings to generate (2 &le; k &le; 1000).</p>

### 출력

<p>Output k lines. Each line should contain a single query string. Each query string should be non-empty and its length should not exceed 1000 characters. Query string should contain only lower- and uppercase English letters. All query strings should be distinct and should have equal hash codes.</p>