# [Platinum IV] Robot Instructions - 24618

[문제 링크](https://www.acmicpc.net/problem/24618)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 1024 MB

### 통계

제출: 548, 정답: 193, 맞힌 사람: 154, 정답 비율: 35.000%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 중간에서 만나기

### 문제 설명

<p>Bessie is learning how to control a robot she has recently received as a gift.</p>

<p>The robot begins at point $(0, 0)$ on the coordinate plane and Bessie wants the robot to end at point $(x_g, y_g)$. Bessie initially has a list of $N$ ($1\le N\le 40$) instructions to give to the robot, the $i$-th of which will move the robot $x_i$ units right and $y_i$ units up (or left or down when $x_i$ and $y_i$ are negative, respectively).</p>

<p>For each $K$ from $1$ to $N$, help Bessie count the number of ways she can select $K$ instructions from the original $N$ such that after the $K$ instructions are executed, the robot will end at point $(x_g, y_g)$.</p>

### 입력

<p>The first line contains $N$. The next line contains $x_g$ and $y_g$, each in the range $-10^9 \ldots 10^9$. The final $N$ lines describe the instructions. Each line has two integers $x_i$ and $y_i$, also in the range $-10^9 \ldots 10^9$.</p>

<p>It is guaranteed that $(x_g,y_g)\neq (0,0)$ and $(x_i,y_i)\neq (0,0)$ for all $i$.</p>

### 출력

<p>Print $N$ lines, the number of ways Bessie can select $K$ instructions from the original $N$ for each $K$ from $1$ to $N$.</p>

### 힌트

<p>In this example, there are six ways Bessie can select the instructions:</p>

<pre>
(-2,0) (3,0) (4,0) (0,10) (0,-10) (0,10) (1 2 3 5 6 7)
(-2,0) (3,0) (4,0) (0,10) (1 2 3 5)
(-2,0) (3,0) (4,0) (0,10) (1 2 3 7)
(5,0) (0,10) (0,-10) (0,10) (4 5 6 7)
(5,0) (0,10) (4 5)
(5,0) (0,10) (4 7)
</pre>

<p>For the first way, the robot&#39;s path looks as follows:</p>

<pre>
(0,0) -&gt; (-2,0) -&gt; (1,0) -&gt; (5,0) -&gt; (5,10) -&gt; (5,0) -&gt; (5,10)
</pre>