# [Gold I] Idempotent Functions - 8364

[문제 링크](https://www.acmicpc.net/problem/8364)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 64, 정답: 37, 맞힌 사람: 33, 정답 비율: 61.111%

### 분류

수학, 조합론

### 문제 설명

<p>You are given a positive integer <em>n</em>. By <em>A</em>&nbsp;we mean the set {1, 2, 3, ..., <em>n</em>}. Function <em>f</em> : <em>A</em>&nbsp;&rarr; <em>A</em>&nbsp;is called a&nbsp;<i>permutation</i>&nbsp;if it is injective (for distinct arguments returns distinct values). Function&nbsp;<em>f</em> : <em>A</em>&nbsp;&rarr; <em>A</em>&nbsp;is called&nbsp;<i>idempotent</i>&nbsp;if for every&nbsp;<em>i</em>&nbsp;&isin; <em>A</em>&nbsp;holds <em>f</em>(<em>f</em>(<em>i</em>)) = <em>f</em>(<em>i</em>).</p>

<p>You are given a function&nbsp;<em>f</em> : <em>A</em>&nbsp;&rarr; <em>A</em>. How many pairs of functions (<em>g</em>, <em>h</em>)&nbsp;satisfy following conditions:</p>

<ul>
	<li><em>g</em> : <em>A</em>&nbsp;&rarr; <em>A</em> is a permutation,</li>
	<li><em>h</em> : <em>A</em>&nbsp;&rarr; <em>A</em>&nbsp;is idempotent,</li>
	<li>for every <em>i</em>&nbsp;&isin; <em>A</em>&nbsp;holds <em>f</em>(<em>i</em>) = <em>h</em>(<em>g</em>(<em>i</em>))?</li>
</ul>

<p>Write a program which:</p>

<ul>
	<li>reads number <em>n</em>&nbsp;and description of function <em>f</em>&nbsp;from the standard input ,</li>
	<li>determines the number of pairs of functions (<em>g</em>, <em>h</em>)&nbsp;satisfying the requirement described above,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>In the first line of input there is one integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 200 000). Second line contains a description of function <em>f</em>&nbsp;: <em>f</em>(<em>i</em>)&nbsp;(1 &le; <em>f</em>(<em>i</em>) &le; <em>n</em>) for <em>i</em> = 1, ..., <em>n</em>, separated with single spaces.</p>

### 출력

<p>In the first line of output there should be a single integer: the remainder of the division by 1 000 000 007&nbsp;of the number of different pairs of functions (<em>g</em>, <em>h</em>)&nbsp;satisfying the requirement.</p>