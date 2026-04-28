# [Gold III] Guess the Array - 24844

[문제 링크](https://www.acmicpc.net/problem/24844)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 47, 정답: 27, 맞힌 사람: 26, 정답 비율: 57.778%

### 분류

해 구성하기, 누적 합, 비둘기집 원리

### 문제 설명

<p>This is an interactive problem. Your program will interact with the jury program using standard input and output.</p>

<p>Alice and Bob have decided to play a game called &quot;Guess the Array&quot;. The rules of the game are very simple: Alice has an array of $n$ integers, and Bob has to guess this array by making no more than $n$ queries about the sums on the segments.</p>

<p>In one move Bob can make one of two types of queries to Alice:</p>

<ol>
	<li>&quot;<code>? l r</code>&quot; to find out the sum of numbers on the segment of the array from the $l$-th to the $r$-th element inclusive;</li>
	<li>&quot;<code>!</code>&quot; to tell Alice that he is ready to give the answer. After this query Alice expects $n$ integers from Bob: the initial array.</li>
</ol>

<p>For each first type query, Alice tells Bob the sum of the numbers in the requested segment. But to make it harder to guess, after each query Alice makes one segment <em>blocked</em>. In further queries, Bob cannot ask for the sum of the numbers on the blocked segments.</p>

<p>Help Bob guess Alice&#39;s array by making no more than $n$ first type queries.</p>

### 입력



### 출력

