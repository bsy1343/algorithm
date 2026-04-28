# [Gold IV] Is Bigger Smarter? - 4430

[문제 링크](https://www.acmicpc.net/problem/4430)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 312, 정답: 87, 맞힌 사람: 51, 정답 비율: 26.154%

### 분류

다이나믹 프로그래밍, 정렬

### 문제 설명

<p>Some people think that the bigger an elephant is, the smarter it is. To disprove this, you want to take the data on a collection of elephants and put as large a subset of this data as possible into a sequence so that the weights are increasing, but the IQ&#39;s are decreasing.</p>

### 입력

<p>The input will consist of data for a bunch of elephants, one elephant per line, terminated by the end-of-file. The data for a particular elephant will consist of a pair of integers: the first representing its size in kilograms and the second representing its IQ in hundredths of IQ points. Both integers are between 1 and 10000. The data will contain information for at most 1000 elephants. Two elephants may have the same weight, the same IQ, or even the same weight and IQ.</p>

### 출력

<p>Say that the numbers on the i-th data line are&nbsp;<code>W[i]</code>&nbsp;and&nbsp;<code>S[i]</code>. Your program should output a sequence of lines of data; the first line should contain a number&nbsp;<code>n</code>; the remaining&nbsp;<code>n</code>&nbsp;lines should each contain a single positive integer (each one representing an elephant). If these&nbsp;<code>n</code>&nbsp;integers are&nbsp;<code>a[1]</code>,&nbsp;<code>a[2]</code>,...,&nbsp;<code>a[n]</code>&nbsp;then it must be the case that</p>

<pre>
W[a[1]] &lt; W[a[2]] &lt; ... &lt; W[a[n]]
</pre>

<p>and</p>

<pre>
S[a[1]] &gt; S[a[2]] &gt; ... &gt; S[a[n]]
</pre>

<p>In order for the answer to be correct,&nbsp;<code>n</code>&nbsp;should be as large as possible. All inequalities are strict: weights must be strictly increasing, and IQs must be strictly decreasing. There may be many correct outputs for a given input, your program only needs to find one.</p>