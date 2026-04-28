# [Platinum V] Unique Solution - 19722

[문제 링크](https://www.acmicpc.net/problem/19722)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 99, 정답: 25, 맞힌 사람: 23, 정답 비율: 34.328%

### 분류

수학, 해 구성하기

### 문제 설명

<p>Professor is preparing a task for higher math students.</p>

<p>The task is the following. The students are given $n$ integers $x_1, x_2, \ldots, x_n$, and an integer $m$ ($1 \le m &lt; 2^n$).</p>

<p>The student must choose $n$ integers $a_1, a_2, \ldots, a_n$, each either $-1$, $0$, or $1$, at least one non-zero value be chosen. The chosen integers must satisfy the condition that $a_1x_1+a_2x_2+\ldots+a_nx_n$ is divisible by $m$.</p>

<p>The professor has decided that the answer to the task should be some given array of integers $a_1, a_2, \ldots, a_n$ ($-1 \le a_i \le 1$, at least one of them is not equal to $0$). To make his job of checking students&#39; solutions easier, he wants to choose such integers $x_1, x_2, \ldots, x_n$ and an integer $m$, that his array $a_1, a_2, \ldots, a_n$ is the only possible solution. Unfortunately it is not possible, because the array $-a_1, -a_2, \ldots, -a_n$ is always a solution too.</p>

<p>So the professor relaxes his requirements, and wants the only two solutions be $a_1, a_2, \ldots, a_n$ and $-a_1, -a_2, \ldots, -a_n$.&nbsp;</p>

<p>Help him choose integers $x_1, x_2, \ldots, x_n$ and an integer $m$.</p>

### 입력

<p>The first line of input contains an integer $n$ ($1 \leq n \leq 30$).</p>

<p>The next line contains $n$ integers $a_1, a_2, \ldots, a_n$ ($-1 \leq a_i \leq 1$). At least one of $a_i$ is not equal to $0$.</p>

### 출력

<p>The first line of output must contain and integer $m$ ($1 \le m &lt; 2^n$).</p>

<p>The next line must contain $n$ integers $x_1, x_2, \ldots, x_n$ ($-2^{30} &lt; x_i &lt; 2^{30}$).</p>

<p>If there are several possible answers, output any of them.</p>

<p>It is known that the answer always exists.</p>

### 힌트

<p>In the given example the students must choose $a_1$ and $a_2$ so that $a_1 + 4a_2$ is divisible by $3$. There are two possible solutions:&nbsp;</p>

<ul>
	<li>$a_1 = 1$, $a_1 = -1$ ($a_1 + 4a_2 = 1 - 4 = -3$, divisible by $3$) and&nbsp;</li>
	<li>$a_1 = -1$, $a_2 = 1$ ($a_1 + 4a_2 = -1 + 4 = 3$, divisible by $3$).</li>
</ul>

<p>Professor&#39;s requirements are met.</p>