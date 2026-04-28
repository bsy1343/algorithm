# [Silver V] Intersections - 24064

[문제 링크](https://www.acmicpc.net/problem/24064)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 114, 정답: 58, 맞힌 사람: 49, 정답 비율: 50.515%

### 분류

수학, 기하학

### 문제 설명

<p>You are given the following&nbsp;two functions.&nbsp;($\mathbb{N}_0$ denotes the set of non-negative integers.)</p>

<p>$$f(x)= \begin{cases} 0,&nbsp;&amp; \mbox{if } x &lt; 0 \\ x - 2k, &amp; \mbox{if } 2k \le x &lt; 2k+1 \, (k \in \mathbb{N}_0) \\ -x + 2(k+1)&nbsp;&amp; \mbox{if } 2k + 1 \le x &lt; 2k+2 \,&nbsp;(k \in \mathbb{N}_0) \end{cases}$$</p>

<p>$$g(x)&nbsp;= {x \over a}$$</p>

<p>How many intersections between the graphs of&nbsp;$y=f(x)$ and&nbsp;$y=g(x)$ exist on&nbsp;the XY-plane?</p>

### 입력

<p>The first and only line of the input contains a single integer $a$.</p>

### 출력

<p>Print the number of intersections between&nbsp;the graphs of $y = f(x)$ and $y = g(x)$.&nbsp;If there are infinitely many intersections, print <code>INF</code>.</p>

### 제한

<ul>
	<li>$\left\vert a \right\vert \le 10^9$; $a \ne 0$</li>
	<li>$a$ is an integer.</li>
</ul>