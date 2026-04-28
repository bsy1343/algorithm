# [Platinum IV] Piecewise Linearity - 19286

[문제 링크](https://www.acmicpc.net/problem/19286)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 9, 맞힌 사람: 6, 정답 비율: 16.216%

### 분류

수학

### 문제 설명

<p>Alice is obsessed with linear functions and especially their plots that are always so mysteriously straight. Recently she found out a plot of function $f(x) = |x-1|$ that impressed her a lot: it was twice as mysterious and beautiful since it consisted not only of one straight-line segment, but of two of them!</p>

<p>Alice immediately thought of a function that is $n \geq 2$ times as mysterious as a linear function. Formally, she came up with a piecewise linear function $f(x)$, whose plot consists of $n$ straight-line segments. Function $f(x)$ is defined by $n+1$ points $P_0, P_1, \ldots, P_{n-1}, P_n$ belonging to its plot and allowing to reconstruct it in a following manner. Plot of function $f(x)$ is a polyline consisting of two rays $P_1 P_0$, $P_{n-1} P_n$ and $n-2$ line segments $P_1 P_2$, $\ldots$, $P_{n-2} P_{n-1}$. Each point $P_i$ is defined by its Cartesian coordinates $(x_i, y_i)$, which are both integers. It is guaranteed that $x_i &gt; x_{i-1}$ for all $i$ between $1$ and $n$, i.e. given polyline is a plot of some function $f(x)$. Please, refer to the Note section for more details.</p>

<p>Now Alice asks you if it is possible to express her function $f(x)$ as a linear combination of terms of form $|x - a_i|$. Formally, your task is to find out if there exist two finite sequences of <strong>real</strong>&nbsp;numbers $\lambda_1, \lambda_2, \ldots, \lambda_m$ and $a_1, a_2, \ldots, a_m$ such that the following equation holds:</p>

<p>$$f(x) = \sum\limits_{i=1}^m \lambda_i |x - a_i|$$</p>

### 입력

<p>First line of input contains an integer $n$ ($2 \leq n \leq 100\,000$), the number of segments in a polyline that is a plot of Alice function.</p>

<p>In the $i$-th of next $n+1$ lines (indexed from zero) there are two integers $x_i$, $y_i$ ($-10^6 \leq x_i, y_i \leq 10^6$), coordinates of point $P_i$.</p>

<p>It is guaranteed that $x_0 &lt; x_1 &lt; \ldots &lt; x_n$.</p>

### 출력

<p>If it is possible to express $f(x)$ as a linear combination of terms of form $|x - a_i|$, print the only word &quot;<code>Yes</code>&quot; (without quotes). Otherwise print the only word &quot;<code>No</code>&quot; (without quotes).</p>

### 힌트

<p>Pictures for the sample cases are given below:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/9f1a64ec-81c0-4a0f-b6e0-65e38d5fdbf0/-/preview/" style="width: 250px; height: 250px;" /></p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/93bdaee4-92bf-4a7e-86f3-59f52e178b3c/-/preview/" style="width: 250px; height: 250px;" /></p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f34f2680-cdad-4080-aa6c-ba3e4ee87891/-/preview/" style="width: 250px; height: 250px;" /></p>