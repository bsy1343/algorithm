# [Bronze III] Contest Struggles - 21339

[문제 링크](https://www.acmicpc.net/problem/21339)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 560, 정답: 348, 맞힌 사람: 317, 정답 비율: 61.315%

### 분류

수학, 사칙연산

### 문제 설명

<p>Lotte is competing in a programming contest. Her team has already solved $k$ out of the $n$ problems in the problem set, but as the problems become harder, she begins to lose focus and her mind starts to wander.</p>

<p>She recalls hearing the judges talk about the difficulty of the problems, which they rate on an integer scale from $0$ to $100$, inclusive. In fact, one of the judges said that &quot;<em>the problem set has never been so tough, the average difficulty of the problems in the problem set is $d$!</em>&quot;</p>

<p>She starts thinking about the problems her team has solved so far, and comes up with an estimate $s$ for their average difficulty. In hope of gaining some motivation, Lotte wonders if she can use this information to determine the average difficulty of the remaining problems.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with two integers $n$ and $k$ ($2\leq n\leq 10^6$, $0 &lt; k &lt; n$), the total number of problems and the number of problems Lotte&#39;s team has solved so far.</li>
	<li>One line with two integers $d$ and $s$ ($0\leq d,s \leq 100$), the average difficulty of all the problems and Lotte&#39;s estimate of the average difficulty of the problems her team has solved.</li>
</ul>

### 출력

<p>Assuming Lotte&#39;s estimate is correct, output the average difficulty of the unsolved problems, or &quot;<code>impossible</code>&quot; if the average difficulty does not exist. Your answer should have an absolute or relative error of at most $10^{-6}$.</p>