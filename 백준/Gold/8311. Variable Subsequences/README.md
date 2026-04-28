# [Gold III] Variable Subsequences - 8311

[문제 링크](https://www.acmicpc.net/problem/8311)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 82, 정답: 44, 맞힌 사람: 36, 정답 비율: 50.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>We are looking for&nbsp;<em>variable subsequences</em>&nbsp;of a given sequence a = (a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>). A subsequence is obtained from a sequence by removing any number of its terms (possibly 0). More formally, a subsequence of the sequence a&nbsp;is any sequence (a<sub>i<sub>1</sub></sub>, a<sub>i<sub>2</sub></sub>, ..., a<sub>i<sub>k</sub></sub>), for which 1 &le; i<sub>1</sub> &lt; i<sub>2</sub> &lt; ... &lt; i<sub>k</sub> &le; n&nbsp;A variable subsequence is a subsequence such that every two its&nbsp;<em>consecutive</em>&nbsp;terms are different. For example, the sequence (1, 3, 1, 2)&nbsp;is a variable subsequence of the sequence (1, 2, 3, 1, 3, 2, 2).</p>

<p>We would like to know how many&nbsp;<em>distinct</em>&nbsp;and&nbsp;<em>nonempty</em>&nbsp;variable subsequences of a given sequence are there. Two subsequences are considered distinct if the sets of positions in a&nbsp;corresponding to them are different. For instance, the sequence (1, 2, 3, 1, 3, 2, 2)&nbsp;contains two distinct variable subsequences of the form (1, 3, 1, 2).</p>

### 입력

<p>The first line of the standard input contains one integer n&nbsp;(2 &le; n &le; 500,000), denoting the length of the sequence a. The second line contains n&nbsp;integers a<sub>i</sub>&nbsp;(1 &le; a<sub>i</sub> &le; 500,000).</p>

### 출력

<p>Your program should write to the first and only line of the standard output a single integer: the number of nonempty variable subsequences of the input sequence modulo 10<sup>9</sup> + 7.</p>

### 힌트

<p>The considered subsequences of the sequence (1, 2, 1, 1)&nbsp;are:</p>

<ul>
	<li>(1)&nbsp;- counted three times,</li>
	<li>(2) - counted once,</li>
	<li>(1, 2)&nbsp;- counted once,</li>
	<li>(2, 1)&nbsp;- counted twice and</li>
	<li>(1, 2, 1)&nbsp;- counted twice.</li>
</ul>