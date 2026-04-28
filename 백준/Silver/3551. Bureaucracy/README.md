# [Silver I] Bureaucracy - 3551

[문제 링크](https://www.acmicpc.net/problem/3551)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 108, 정답: 58, 맞힌 사람: 43, 정답 비율: 56.579%

### 분류

구현, 그래프 이론

### 문제 설명

<p>Long ago, in a kingdom far, far away the king decided to keep a record of all laws of his kingdom. From that moment whenever a new law was passed, a corresponding record was added to the law archive.</p>

<p>Many centuries later lawyers discovered that there were only two types of laws in the kingdom:</p>

<ul>
	<li><em>direct law</em>, that states a new norm;</li>
	<li><em>canceling law</em>, that cancels one of the previous laws.</li>
</ul>

<p>The law is considered <em>active</em> if and only if there is no active law that cancels it.</p>

<p>You are to write program that finds out which laws are still active.</p>

### 입력

<p>The first line of the input file contains an integer number $n$ ($1\le n\le 100\,000$) --- the number of passed laws.</p>

<p>The following $n$ lines describe one law each. Each description has one of the following formats:</p>

<ul>
	<li><code>declare</code>, meaning that a direct law was passed.</li>
	<li><code>cancel</code> $i$, where $i$ is the number of law being cancelled by&nbsp; this one.</li>
</ul>

<p>The laws are numbered from one.</p>

### 출력

<p>The first line of the output file must contain the number of active laws. Following lines must contain numbers of these laws listed in increasing order.</p>