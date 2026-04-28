# [Gold I] Type Two de Bruijn Sequences - 8338

[문제 링크](https://www.acmicpc.net/problem/8338)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 15, 맞힌 사람: 14, 정답 비율: 43.750%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>A word s&nbsp;composed of (2<sup>n</sup> + n - 1)&nbsp;characters&nbsp;<code>0</code>&nbsp;and&nbsp;<code>1</code>&nbsp;is called a de Bruijn sequence of order n&nbsp;if every n-character word composed of zeroes and ones is its subword - that is a fragment of consecutive characters - of s. An example of a de Bruijn sequence of order 3 is&nbsp;<code>0001011100</code>.</p>

<p>A type two de Bruijn sequence of order n&nbsp;is such a word <strong>s</strong>&nbsp;<b>of arbitrary length</b>&nbsp;that each n-character word composed of zeroes and ones is a subsequence - that is a fragment of&nbsp;<b>not necessarily</b>&nbsp;consecutive characters - of s. An example of a type two de Bruijn sequence of order 3 is&nbsp;<code>00101101</code>. As far as we know, Nicolaas Govert de Bruijn did not invent such sequences, but their definition is similar to the previous one, isn&#39;t it?</p>

<p>Let us consider a word s&nbsp;composed only of zeroes and ones. How many digits (<code>0</code>&nbsp;or&nbsp;<code>1</code>, of course) have to be added at the end of s&nbsp;for the word to become a type two de Bruijn sequence of order n?</p>

### 입력

<p>The first line of the standard input contains two integers m&nbsp;and n&nbsp;(1 &le; m, n &le; 1,000,000), separated by a single space. The second line contains an m-character word s&nbsp;composed only of digits&nbsp;<code>0</code>&nbsp;and&nbsp;<code>1</code>&nbsp;that does not contain any spaces.</p>

### 출력

<p>The first and only line of the standard output should contain a single non-negative integer, denoting the minimal number of digits that need to be added at the end of the word s&nbsp;for it to become a t.t.d.B.s. of order n.</p>

### 힌트

<p>After adding the characters&nbsp;<code>01</code>&nbsp;we obtain the following t.t.d.B.s. of order 3:&nbsp;<code>0010101</code>.</p>